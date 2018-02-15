package challenge;

import java.util.Arrays;

/**
 * Created by Kyle Wolff on 2/15/18.
 */
public class AutoCompleteAddressSplitUtil {

    public static SplitAddress splitAddress(Place place) {
        SplitAddress splitAddress = new SplitAddress();

        if (place.getAddress() != null) {
            int statePlaceIndex;
            String[] splitAddress1 = place.getAddress().toString().trim().split(",");
            String[] splitStateZip;
            String placeName = place.getName() != null ? place.getName().toString() : "";
            switch (splitAddress1.length) {
                case 1:
                    splitAddress.setStreetAddress(placeName);
                    break;
                case 2:
                    statePlaceIndex = splitAddress1.length - 2;
                    splitStateZip = splitAddress1[statePlaceIndex].trim().split(" ");
                    splitStateSegment(splitStateZip, splitAddress);
                    splitAddress.setStreetAddress(placeName);
                    break;
                case 3:
                    splitAddress.setStreetAddress(placeName);
                    splitAddress.setCityName(StringUtils.isEmptyOrNull(splitAddress1[0]) ? "" : splitAddress1[0]);
                    statePlaceIndex = splitAddress1.length - 2;
                    splitStateZip = splitAddress1[statePlaceIndex].trim().split(" ");
                    splitStateSegment(splitStateZip, splitAddress);
                    break;
                case 4:
                    splitAddress.setStreetAddress(StringUtils.isEmptyOrNull(splitAddress1[0]) ? "" : splitAddress1[0].trim());
                    splitAddress.setCityName(splitAddress1[1].trim());
                    statePlaceIndex = splitAddress1.length - 2;
                    splitStateZip = splitAddress1[statePlaceIndex].trim().split(" ");
                    splitStateSegment(splitStateZip, splitAddress);
                    break;
                default:
                    splitAddress.setStreetAddress(placeName);
            }
        }

        return splitAddress;
    }

    private static void splitStateSegment(String[] splitStateZip, SplitAddress splitAddress) {
        String[] stateArray = new String[1];
        String[] zipArray = new String[1];
        Arrays.fill(stateArray, "");
        Arrays.fill(zipArray, "");
        for (String aSplitStateZip : splitStateZip) {
            if (aSplitStateZip.matches(".*\\d.*")) {
                zipArray[0] = aSplitStateZip.trim();
            } else {
                stateArray[0] += " " + aSplitStateZip.trim();
            }
        }

        if (stateArray[0].trim().length() > 2) {

            splitAddress.setStateName(StateConverterUtil.getStateAbbreviation(stateArray[0].trim()));
        } else {

            splitAddress.setStateName(StringUtils
                    .isEmptyOrNull(stateArray[0])
                    ? ""
                    : stateArray[0].trim());
        }
        splitAddress.setZipCode(StringUtils
                .isEmptyOrNull(zipArray[0])
                ? ""
                : zipArray[0].trim());
    }

}