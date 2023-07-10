package org.labaproject.database.model;

public class Cities {
    private int cityId;
    private String cityName;
    private double latitude;
    private double longitude;

    // Default constructor
    public Cities() {
    }

    // Parameterized constructor
    public Cities(int cityId, String cityName, double latitude, double longitude) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getter and Setter methods
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // toString method
    @Override
    public String toString() {
        return "City [cityId=" + cityId + ", cityName=" + cityName + ", latitude=" + latitude + ", longitude=" + longitude + "]";
    }
}
