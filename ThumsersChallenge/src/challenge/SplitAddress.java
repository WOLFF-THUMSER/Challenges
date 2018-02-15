package challenge;

/**
 * Created by Kyle Wolff on 2/15/18.
 */
public class SplitAddress {

    private String streetAddress;

    private String cityName;

    private String stateName;

    private String zipCode;

    public SplitAddress() {
        this.streetAddress = "";
        this.cityName = "";
        this.stateName = "";
        this.zipCode = "";
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
