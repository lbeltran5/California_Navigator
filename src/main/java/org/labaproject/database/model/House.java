package org.labaproject.database.model;

public class House {
    private int houseId;
    private String houseNumber;
    private int streetId;
    private int cityId;

    // Default constructor
    public House() {
    }

    // Parameterized constructor
    public House(int houseId, String houseNumber, int streetId, int cityId) {
        this.houseId = houseId;
        this.houseNumber = houseNumber;
        this.streetId = streetId;
        this.cityId = cityId;
    }

    // Getter and Setter methods
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getCityId() {
        return cityId;
    }

    // toString method
    @Override
    public String toString() {
        return "House {" +
                "houseId=" + houseId +
                ", houseNumber=" + houseNumber +
                ", streetId=" + streetId +
                ", cityId=" + cityId +
                "}";
    }
}
