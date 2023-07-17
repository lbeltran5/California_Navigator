package org.labaproject.database;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.labaproject.database.configuration.MyBatisConfiguration;
import org.labaproject.database.dao.*;
import org.labaproject.database.mapper.*;
import org.labaproject.database.model.*;
import java.util.List;
import java.util.logging.Logger;

public class MyBatisRunner {
    private static final Logger LOGGER = Logger.getLogger(MyBatisRunner.class.getName());

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

            LOGGER.info("Cities Table:");
            for (Cities city : citiesList) {
                LOGGER.info(city.toString());
            }

            LOGGER.info("Houses table:");
            for (House house : houseList) {
                LOGGER.info(house.toString());
            }

            LOGGER.info("Stop Table:");
            for (Stop stop : stopList) {
                LOGGER.info(stop.toString());
            }

            LOGGER.info("Streets Table:");
            for (Streets streets : streetsList) {
                LOGGER.info(streets.toString());
            }

            LOGGER.info("Transportation Table:");
            for (Transportation transportation : transportationList) {
                LOGGER.info(transportation.toString());
            }

            LOGGER.info("Distance Table:");
            for (Distance distance : distanceList) {
                LOGGER.info(distance.toString());
            }

        }
    }
}
