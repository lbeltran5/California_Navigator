package org.labaproject.database;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.labaproject.database.configuration.MyBatisConfiguration;
import org.labaproject.database.dao.CitiesDao;
import org.labaproject.database.dao.CitiesDaoImpl;
import org.labaproject.database.mapper.CitiesMapper;
import org.labaproject.database.model.Cities;

import java.util.List;

public class MyBatisRunner {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = MyBatisConfiguration.getSqlSessionFactory();
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            CitiesMapper citiesMapper = sqlSession.getMapper(CitiesMapper.class);
            CitiesDao citiesDao = new CitiesDaoImpl(citiesMapper);

            List<Cities> citiesList = citiesDao.getAllCities();

            System.out.println("Cities Table:");
            for (Cities city : citiesList) {
                System.out.println(city);
            }
        }
    }
}

