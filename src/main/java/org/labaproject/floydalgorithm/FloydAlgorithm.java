package org.labaproject.floydalgorithm;

import org.apache.ibatis.session.SqlSession;
import org.labaproject.database.mapper.StationsMapper;
import org.labaproject.database.model.Stations;

import java.util.*;
import java.util.logging.Logger;

import static org.labaproject.database.configuration.MyBatisConfiguration.sqlSessionFactory;

public class FloydAlgorithm {
    private static final Logger LOGGER = Logger.getLogger(FloydAlgorithm.class.getName());

    public FloydAlgorithm(WeightGraph weightGraph) {
    }

    public void calculateShortestPaths(double[][] distances) {
        int n = distances.length;

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    distances[i][j] = Math.min(distances[i][j], distances[i][k] + distances[k][j]);
                }
            }
        }
    }

    public void calculateShortestDistance(double[][] distances) {
        List<Stations> stations = null;
            // Build adjacency matrix
            double[][] distances1 = DistanceMatrix.buildDistanceMatrix(stations);

            // Perform distance calculations using Floyd algorithm
              calculateShortestPaths(distances);

            // Get the names of all stations
            List<String> stationNames = new ArrayList<>();
            for (Stations station : stations) {
                stationNames.add(station.getStationName());
            }
            // Generate XML output
         //   String xmlOutput = generateXmlOutput(distances, stationNames);

            // Save the output to an XML file
         //   saveXmlOutput(xmlOutput);

        }
}

