package org.labaproject.database.model;

public class Transportation {

    private int transportId;
    private String transportType;
    private String transportName;
    private int startCityId;
    private int endCityId;

    // Default constructor
    public Transportation() {
    }

    // Parameterized constructor
    public Transportation(int transportId, String transportType, String transportName, int startCityId, int endCityId) {
        this.transportId = transportId;
        this.transportType = transportType;
        this.transportName = transportName;
        this.startCityId = startCityId;
        this.endCityId = endCityId;
    }

    // Getter and Setter methods
    public int getTransportIdId() {
        return transportId;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public int getStartCityId() {
        return startCityId;
    }

    public void setStartCityId(int startCityId) {
        this.startCityId = startCityId;
    }

    public int getEndCityId() {
        return endCityId;
    }

    public void setEndCityId(int endCityId) {
        this.endCityId = endCityId;
    }

    // toString method
    @Override
    public String toString() {
        return "Transportation {" +
                "transportId=" + transportId +
                ", transportType=" + transportType +
                ", transportName=" + transportName +
                ", startCityId=" + startCityId +
                ", endCityId=" + endCityId +
                "}";
    }
}
