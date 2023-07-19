package org.labaproject.floydalgorithm;

import org.apache.ibatis.session.SqlSession;
import org.labaproject.database.mapper.StationsMapper;
import org.labaproject.database.model.Stations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import static org.labaproject.database.configuration.MyBatisConfiguration.sqlSessionFactory;

public class ShortestPathFinderImplementation {
    private static final Logger LOGGER = Logger.getLogger(ShortestPathFinderImplementation.class.getName());

    public void calculateShortestDistance(double[][] distances) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            StationsMapper stationsMapper = sqlSession.getMapper(StationsMapper.class);
            List<Stations> stations = stationsMapper.getAllStations();

            // Build adjacency matrix
            double[][] distances1 = DistanceMatrix.buildDistanceMatrix(stations);
            LOGGER.info(Arrays.toString(distances));
            // Perform distance calculations using Floyd algorithm
            shortestPath(distances);

            // Get the names of all stations
            List<String> stationNames = new ArrayList<>();
            for (Stations station : stations) {
                stationNames.add(station.getStationName());
            }

            // Generate XML output
        }
    }
    public void shortestPath(double[][] distances) {
        int n = distances.length;

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    distances[i][j] = Math.min(distances[i][j], distances[i][k] + distances[k][j]);
                }
            }
        }
    }
}
