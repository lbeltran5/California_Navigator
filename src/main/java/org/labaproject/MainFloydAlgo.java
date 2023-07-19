package org.labaproject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.labaproject.database.configuration.MyBatisConfiguration;
import org.labaproject.database.dao.StationsDao;
import org.labaproject.database.dao.StationsDaoImpl;
import org.labaproject.database.mapper.StationsMapper;
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

            UserInput userInput = new UserInput();
            System.out.println("Welcome to the California Travel Planner!");
            String sourceStation = userInput.promptCity(("Enter the starting Station: "));
            String destinationStation = userInput.promptCity(("Enter Destination Station: "));
            int stationID1 = stationsMapper.getStationID();
            int stationID2 = stationsMapper.getStationID();
            LOGGER.info(String.valueOf(stationID2));
            userInput.close();
            ShortestStationDistance shortPath = new ShortestStationDistance();
            shortPath.printShortestPath(stationID1, stationID2);
        }
    }
}
