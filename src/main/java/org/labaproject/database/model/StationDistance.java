package org.labaproject.database.model;

public class StationDistance {
    private int sd_id;
    private int station1;
    private int station2;
    private double stationDistance;

    public int getSd_id() {
        return sd_id;
    }

    public void setSd_id(int sd_id) {
        this.sd_id = sd_id;
    }

    public int getStation1() {
        return station1;
    }

    public StationDistance(int sd_id, int station1, int station2, double stationDistance) {
        this.sd_id = sd_id;
        this.station1 = station1;
        this.station2 = station2;
        this.stationDistance = stationDistance;
    }

    public void setStation1(int station1) {
        this.station1 = station1;
    }

    public int getStation2() {
        return station2;
    }

    public void setStation2(int station2) {
        this.station2 = station2;
    }

    public double getStationDistance(double stationDistance1) {
        return stationDistance;
    }

    public void setStationDistance(double stationDistance) {
        this.stationDistance = stationDistance;
    }

    @Override
    public String toString() {
        return "StationDistance{" +
                "sd_id=" + sd_id +
                ", station1='" + station1 + '\'' +
                ", station2='" + station2 + '\'' +
                ", stationDistance=" + stationDistance +
                '}';
    }

    public StationDistance() {
    }
}
