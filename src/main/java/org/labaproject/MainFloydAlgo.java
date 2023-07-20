package org.labaproject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.labaproject.database.configuration.MyBatisConfiguration;
import org.labaproject.database.dao.StationsDao;
import org.labaproject.database.dao.StationsDaoImpl;
import org.labaproject.database.mapper.StationsMapper;
import org.labaproject.database.model.Cities;
import org.labaproject.database.model.Stations;
import org.labaproject.floydalgorithm.DistanceMatrix;
import org.labaproject.floydalgorithm.ShortestStationDistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class MainFloydAlgo {
    private static final Logger LOGGER = Logger.getLogger(MainFloydAlgo.class.getName());

    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = MyBatisConfiguration.getSqlSessionFactory();
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            StationsMapper stationsMapper = sqlSession.getMapper(StationsMapper.class);
            StationsDao stationsDao = new StationsDaoImpl(sqlSession, stationsMapper);
            List<Stations> stationsList = stationsDao.getAllStations();

          LOGGER.info("Welcome to the California Travel Planner!");
          LOGGER.info("Stations Table:");
            for (Stations stations : stationsList) {
                LOGGER.info(stations.getStationName());
            }

            UserInput userInput = new UserInput();

            String sourceStation = userInput.promptCity(("Enter the starting Station: "));
            String destinationStation = userInput.promptCity(("Enter Destination Station: "));
          //  String sc = "Rose Garden";
         //   String dc = "Lower Pacific";
            int stationID1 = stationsDao.getStationID(sourceStation);
            int stationID2 = stationsDao.getStationID(destinationStation);

            userInput.close();

         //   int stationID1 = 4;
         //   int stationID2 = 1;

            ShortestStationDistance shortPath = new ShortestStationDistance(stationsList);
            shortPath.printShortestPath(stationID1, stationID2);
        }
    }
}
