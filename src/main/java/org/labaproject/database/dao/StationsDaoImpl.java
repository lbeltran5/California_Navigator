package org.labaproject.database.dao;

import org.apache.ibatis.session.SqlSession;
import org.labaproject.database.mapper.StationsMapper;
import org.labaproject.database.model.Stations;

import java.util.List;
public class StationsDaoImpl implements StationsDao{
    private final SqlSession sqlSession;
    private final StationsMapper stationsMapper;

    public StationsDaoImpl(SqlSession sqlSession, StationsMapper stationsMapper) {
        this.sqlSession =sqlSession;
        this.stationsMapper = stationsMapper;
    }

    @Override
    public List<Stations> getAllStations() {

       return sqlSession.selectList("getAllStations");
    }

    @Override
    public int getStationID(String stationName) {

        return stationsMapper.getStationID();
    }

}
