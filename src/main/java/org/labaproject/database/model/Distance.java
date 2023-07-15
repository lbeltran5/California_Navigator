package org.labaproject.database.model;

public class Distance {

    private int distanceId;
    private int sourceCityId;
    private int destinationCityId;
    private double distance;

    // Default constructor
    public Distance() {
    }

    // Parameterized constructor
    public Distance(int distanceId, int sourceCityId, int destinationCityId, double distance) {
        this.distanceId = distanceId;
        this.sourceCityId = sourceCityId;
        this.destinationCityId = destinationCityId;
        this.distance = distance;
    }

    // Getter and Setter methods
    public int getDistanceId() {
        return distanceId;
    }

    public void setDistanceId(int distanceId) {
        this.distanceId = distanceId;
    }

    public int getSourceCityId() {
        return sourceCityId;
    }

    public void setSourceCityId(int sourceCityId) {
        this.sourceCityId = sourceCityId;
    }

    public int getDestinationCityId() {
        return destinationCityId;
    }

    public void setDestinationCityId(int destinationCityId) {
        this.destinationCityId = destinationCityId;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    // toString method
    @Override
    public String toString() {
        return "Distance {" +
                "distanceId=" + distanceId +
                ", sourceCityId=" + sourceCityId +
                ", destinationCityId=" + destinationCityId +
                ", distance=" + distance +
                "}";
    }
}
