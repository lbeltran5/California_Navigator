package org.labaproject.floydalgorithm;

import org.labaproject.database.model.Stations;

import java.util.List;

public class ShortestStationDistance {
    private static final double INFINITY = Double.POSITIVE_INFINITY;
    private double[][] distanceMatrix;
    private int[][] stationMatrix;
    private List<Stations> stationsList;



    public  ShortestStationDistance(List<Stations> stationsList) {
        this.stationsList = stationsList;
        int size = stationsList.size();
        distanceMatrix = new double[size][size];
       stationMatrix = new int[size][size];
        calculateShortestDistances();

    }

    public void calculateShortestDistances() {
        for (int i = 0; i < stationsList.size(); i++) {
            for (int j = 0; j < stationsList.size(); j++) {
                Stations station1 = stationsList.get(i);
                Stations station2 = stationsList.get(j);
                double distance;
                distance = DistanceCalculator.distanceCalculatorFor(station1, station2 );
                distanceMatrix[i][j] = distance;
                stationMatrix[i][j] = j;
            }
        }

        for (int k = 0; k < stationsList.size(); k++) {
            for (int i = 0; i < stationsList.size(); i++) {
                for (int j = 0; j < stationsList.size(); j++) {
                    if (distanceMatrix[i][j] > distanceMatrix[i][k] + distanceMatrix[k][j]) {
                        distanceMatrix[i][j] = distanceMatrix[i][k] + distanceMatrix[k][j];
                        stationMatrix[i][j] = stationMatrix[i][k];
                    }
                }
            }
        }
    }

    public void printShortestPath(int startingCity, int destinationCity) {
        int nextCity = startingCity;
        String path = this.stationsList.get(startingCity).getStationName();

        while (nextCity != destinationCity) {
            nextCity = stationMatrix[nextCity][destinationCity];
            path += " -> " + this.stationsList.get(nextCity).getStationName();
        }

        System.out.println("Shortest path: " + path);
        System.out.println("Distance: " + distanceMatrix[startingCity][destinationCity]);
    }
}


