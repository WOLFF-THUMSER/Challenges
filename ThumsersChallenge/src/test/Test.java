package test;

import challenge.AutoCompleteAddressSplitUtil;
import challenge.Place;
import challenge.SplitAddress;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kyle Wolff on 2/15/18.
 */
@RunWith(JUnit4.class)
public class Test {

    private Place place;

    @org.junit.Test
    public void testCityState() throws Exception {
        place = new Place(Place.PlaceEnum.CITY_STATE);
        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);

        assertEquals("Walnut Creek", splitUtilOutput.getStreetAddress());
        assertEquals("Walnut Creek", splitUtilOutput.getCityName());
        assertEquals("ca", splitUtilOutput.getStateName());
        assertEquals("", splitUtilOutput.getZipCode());
    }

    @org.junit.Test
    public void testCityStateWithZip() throws Exception {
        place = new Place(Place.PlaceEnum.CITY_STATE_WITH_ZIP);

        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);

        assertEquals("Walnut Creek name", splitUtilOutput.getStreetAddress());
        assertEquals("Walnut Creek", splitUtilOutput.getCityName());
        assertEquals("ca", splitUtilOutput.getStateName());
        assertEquals("00000", splitUtilOutput.getZipCode());
    }

    @org.junit.Test
    public void testState() throws Exception {
        place = new Place(Place.PlaceEnum.STATE);

        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);
        assertEquals("WY", splitUtilOutput.getStateName());
        assertEquals("Wyoming name", splitUtilOutput.getStreetAddress());
        assertEquals("", splitUtilOutput.getCityName());
        assertEquals("", splitUtilOutput.getZipCode());
    }

    @org.junit.Test
    public void testStateWithZip() throws Exception {
        place = new Place(Place.PlaceEnum.STATE_WITH_ZIP);

        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);
        assertEquals("WY", splitUtilOutput.getStateName());
        assertEquals("Wyoming name", splitUtilOutput.getStreetAddress());
        assertEquals("", splitUtilOutput.getCityName());
        assertEquals("11111", splitUtilOutput.getZipCode());
    }


    @org.junit.Test
    public void testCityStateStreet() throws Exception {
        place = new Place(Place.PlaceEnum.CITY_STATE_STREET);
        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);

        assertEquals("2715 Broadway", splitUtilOutput.getStreetAddress());
        assertEquals("New York", splitUtilOutput.getCityName());
        assertEquals("NY", splitUtilOutput.getStateName());
        assertEquals("", splitUtilOutput.getZipCode());

    }

    @org.junit.Test
    public void testCityStateStreetWithFullStateName() throws Exception {
        place = new Place(Place.PlaceEnum.CITY_STATE_STREET_WITH_ZIP_WITHFULLSTATENAME);
        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);

        assertEquals("3952 Adams St", splitUtilOutput.getStreetAddress());
        assertEquals("Kansas City", splitUtilOutput.getCityName());
        assertEquals("KS", splitUtilOutput.getStateName());
        assertEquals("66103", splitUtilOutput.getZipCode());

    }

    @org.junit.Test
    public void testStateWithFullStateNameAndSpaces() throws Exception {
        place = new Place(Place.PlaceEnum.STATE_WITH_FULLSTATENAMEANDSPACES);

        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);

        assertEquals("District of Columbia name", splitUtilOutput.getStreetAddress());
        assertEquals("", splitUtilOutput.getCityName());
        assertEquals("DC", splitUtilOutput.getStateName());
        assertEquals("", splitUtilOutput.getZipCode());

    }

    @org.junit.Test
    public void testStateWithFullStateNameZipAndSpaces() throws Exception {
        place = new Place(Place.PlaceEnum.STATE_WITH_FULLSTATENAMEZIPANDSPACES);

        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);

        assertEquals("District of Columbia name", splitUtilOutput.getStreetAddress());
        assertEquals("", splitUtilOutput.getCityName());
        assertEquals("DC", splitUtilOutput.getStateName());
        assertEquals("33333", splitUtilOutput.getZipCode());

    }

    @org.junit.Test
    public void testCityStateStreetWithZip() throws Exception {
        place = new Place(Place.PlaceEnum.CITY_STATE_STREET_WITH_ZIP);
        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);

        assertEquals("2715 Broadway", splitUtilOutput.getStreetAddress());
        assertEquals("New York", splitUtilOutput.getCityName());
        assertEquals("NY", splitUtilOutput.getStateName());
        assertEquals("10025", splitUtilOutput.getZipCode());

    }


    @org.junit.Test
    public void testCityStateStreetWithZipWithFullStateName() throws Exception {
        place = new Place(Place.PlaceEnum.CITY_STATE_STREET_WITH_ZIP_WITHFULLSTATENAME);
        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);

        assertEquals("3952 Adams St", splitUtilOutput.getStreetAddress());
        assertEquals("Kansas City", splitUtilOutput.getCityName());
        assertEquals("KS", splitUtilOutput.getStateName());
        assertEquals("66103", splitUtilOutput.getZipCode());

    }

    @org.junit.Test
    public void testCityStateStreetWithZipWithFullStateNameWithSpaceInState() throws Exception {
        place = new Place(Place.PlaceEnum.CITY_STATE_STREET_WITH_ZIP_WITHFULLSTATENAME_WITH_SPACEINSTATE);
        SplitAddress splitUtilOutput = AutoCompleteAddressSplitUtil.splitAddress(place);

        assertEquals("2715 Broadway", splitUtilOutput.getStreetAddress());
        assertEquals("New York", splitUtilOutput.getCityName());
        assertEquals("NY", splitUtilOutput.getStateName());
        assertEquals("10025", splitUtilOutput.getZipCode());

    }


}
