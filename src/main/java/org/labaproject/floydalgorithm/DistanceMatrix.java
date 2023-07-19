package org.labaproject.floydalgorithm;

import org.labaproject.database.model.Stations;

import java.util.List;

public class DistanceMatrix {
    public static double[][] buildDistanceMatrix(List<Stations> stationsList) {
        int n = stationsList.size();
        double[][] graph = new double[n][n];

        // Initialize the  matrix with maximum values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.MAX_VALUE;
            }
        }
        // Populate the adjacency matrix with actual distances
        for (int i = 0; i < n; i++) {
            Stations source = stationsList.get(i);
            for (int j = 0; j < n; j++) {
                Stations destination = stationsList.get(j);
                graph[i][j] =  DistanceCalculator.distanceCalculatorFor(source, destination);
            }
        }
        return graph;
    }
}
