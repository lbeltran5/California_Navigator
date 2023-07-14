package org.labaproject.database;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.labaproject.database.configuration.MyBatisConfiguration;
import org.labaproject.database.dao.*;
import org.labaproject.database.mapper.*;
import org.labaproject.database.model.*;

import java.util.List;

public class MyBatisRunner {
    private static final Logger LOGGER = LogManager.getLogger(MyBatisRunner.class);
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = MyBatisConfiguration.getSqlSessionFactory();
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            CitiesMapper citiesMapper = sqlSession.getMapper(CitiesMapper.class);
            CitiesDao citiesDao = new CitiesDaoImpl(citiesMapper);
            List<Cities> citiesList = citiesDao.getAllCities();

            HouseMapper houseMapper = sqlSession.getMapper(HouseMapper.class);
            HouseDao houseDao = new HouseDaoImpl(houseMapper);
            List<House> houseList = houseDao.getAllHouse();

            StopMapper stopMapper = sqlSession.getMapper(StopMapper.class);
            StopDao stopDao = new StopDaoImpl(stopMapper);
            List<Stop> stopList = stopDao.getAllStop();

            StreetsMapper streetsMapper = sqlSession.getMapper(StreetsMapper.class);
            StreetsDao streetsDao = new StreetsDaoImpl(streetsMapper);
            List<Streets> streetsList = streetsDao.getAllStreets();

            TransportationMapper transportationMapper = sqlSession.getMapper(TransportationMapper.class);
            TransportationDao transportationDao = new TransportationDaoImpl(transportationMapper);
            List<Transportation> transportationList = transportationDao.getAllTransportation();

            DistanceMapper distanceMapper = sqlSession.getMapper(DistanceMapper.class);
            DistanceDao distanceDao = new DistanceDaoImpl(distanceMapper);
            List<Distance> distanceList = distanceDao.getAllDistance();

            System.out.println("Cities Table:");
            for (Cities city : citiesList) {
                System.out.println(city);

            System.out.println("Houses table:") ;
            for (House house : houseList) {
                System.out.println(house);

            System.out.println("Stop Table:");
            for (Stop stop : stopList) {
                System.out.println(stop);

            System.out.println("Streets Table:");
            for (Streets streets : streetsList) {
                System.out.println(streets);

            System.out.println("Transportation Table");
            for (Transportation transportation : transportationList) {
                System.out.println(transportation);

            System.out.println("Distance Table:");
            for (Distance distance : distanceList) {
                System.out.println(distance);
            }
            }
            }
            }
            }
            }
        }
    }
}

