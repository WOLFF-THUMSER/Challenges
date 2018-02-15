package challenge;

/**
 * Created by Kyle Wolff on 2/15/18.
 */
public class Place {

    public enum PlaceEnum {
        CITY_STATE,
        CITY_STATE_WITH_ZIP,
        STATE,
        STATE_WITH_ZIP,
        CITY_STATE_STREET,
        CITY_STATE_STREET_WITHFULLSTATENAME,
        STATE_WITH_FULLSTATENAMEANDSPACES,
        STATE_WITH_FULLSTATENAMEZIPANDSPACES,
        CITY_STATE_STREET_WITH_ZIP,
        CITY_STATE_STREET_WITH_ZIP_WITHFULLSTATENAME,
        CITY_STATE_STREET_WITH_ZIP_WITHFULLSTATENAME_WITH_SPACEINSTATE
    }

    private String name;
    private String address;

    public Place(PlaceEnum placeEnum) {

        switch (placeEnum) {

            case CITY_STATE:
                name = "Walnut Creek";
                address = "Walnut Creek, ca, USA";
                break;
            case CITY_STATE_WITH_ZIP:
                name = "Walnut Creek name";
                address = "Walnut Creek, ca 00000, USA";
                break;
            case STATE:
                name = "Wyoming name";
                address = "Wyoming, USA";
                break;
            case STATE_WITH_ZIP:
                name = "Wyoming name";
                address = "Wyoming 11111, USA";
                break;
            case CITY_STATE_STREET:
                address = "2715 Broadway, New York, NY, USA";
                break;
            case CITY_STATE_STREET_WITHFULLSTATENAME:
                address = "2715 Broadway, New York, New York, USA";
                break;
            case STATE_WITH_FULLSTATENAMEANDSPACES:
                name = "District of Columbia name";
                address = "District of Columbia, USA";
                break;
            case STATE_WITH_FULLSTATENAMEZIPANDSPACES:
                name = "District of Columbia name";
                address = "District of Columbia 33333, USA";
                break;
            case CITY_STATE_STREET_WITH_ZIP:
                name = "";
                address = "2715 Broadway, New York, NY 10025, USA";
                break;
            case CITY_STATE_STREET_WITH_ZIP_WITHFULLSTATENAME:
                address = "3952 Adams St, Kansas City, Kansas 66103, USA";
                break;
            case CITY_STATE_STREET_WITH_ZIP_WITHFULLSTATENAME_WITH_SPACEINSTATE:
                name = "";
                address = "2715 Broadway, New York, New York 10025, USA";
                break;
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
