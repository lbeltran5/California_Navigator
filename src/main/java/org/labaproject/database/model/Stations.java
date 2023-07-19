package org.labaproject.database.model;

public class Stations {
    private int stationID;
    private String stationName;
    private int cityID;
    private double station_longitude;
    private double station_latitude;

    public Stations(int stationID, String stationName, int cityID, double station_longitude, double station_latitude) {
        this.stationID = stationID;
        this.stationName = stationName;
        this.cityID = cityID;
        this.station_longitude = station_longitude;
        this.station_latitude = station_latitude;
    }

    @Override
    public String toString() {
        return "Stations{" +
                "stationID=" + stationID +
                ", stationName='" + stationName + '\'' +
                ", cityID=" + cityID +
                ", stationLongitude=" + station_longitude +
                ", stationLatitude=" + station_latitude +
                '}';
    }

    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public double getStationLongitude() {
        return station_longitude;
    }

    public void setStationLongitude(double stationLongitude) {
        this.station_longitude = stationLongitude;
    }

    public double getStationLatitude() {
        return station_latitude;
    }

    public void setStationLatitude(double stationLatitude) {
        this.station_latitude = stationLatitude;
    }
}
