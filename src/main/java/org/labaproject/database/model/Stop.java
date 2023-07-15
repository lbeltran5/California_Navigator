package org.labaproject.database.model;

public class Stop {
    private int stopId;
    private String stopName;
    private int transportId;

    // Default constructor
    public Stop() {
    }

    // Parameterized constructor
    public Stop(int stopId, String stopName, int transportId) {
        this.stopId = stopId;
        this.stopName = stopName;
        this.transportId = transportId;
    }

    // Getter and Setter methods
    public int getStopId() {
        return stopId;
    }

    public void setStopId(int stopId) {
        this.stopId = stopId;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public int getTransportIdId() {
        return transportId;
    }
    public void setTransportId(int transportId){
        this.transportId = transportId;
    }

    // toString method
    @Override
    public String toString() {
        return "Stop {" +
                "stopId=" + stopId +
                ", stopName=" + stopName +
                ", transportId=" + transportId +
                "}";
    }
}
