package org.labaproject.database.model;

public class Streets {
    private int streetId;
    private String streetName;


    // Default constructor
    public Streets() {
    }

    // Parameterized constructor
    public Streets(int streetId, String streetName) {
        this.streetId = streetId;
        this.streetName = streetName;
    }

    // Getter and Setter methods
    public int getStreetId() {
        return streetId;
    }

    public void setStreetId(int streetId) {
        this.streetId = streetId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }


    // toString method
    @Override
    public String toString() {
        return "Streets {" +
                "streetId=" + streetId +
                ", streetName=" + streetName +
                "}";
    }
}
