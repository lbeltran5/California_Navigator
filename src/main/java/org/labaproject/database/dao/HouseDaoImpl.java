package org.labaproject.database.dao;

import org.labaproject.database.mapper.HouseMapper;
import org.labaproject.database.model.House;

import java.util.List;

public class HouseDaoImpl implements HouseDao {
    private final HouseMapper houseMapper;

    public HouseDaoImpl(HouseMapper houseMapper) {
        this.houseMapper = houseMapper;
    }

    @Override
    public House getHouseById(int houseId) {
        return houseMapper.getHouseById(houseId);
    }

    @Override
    public List<House> getAllHouse() {
        return houseMapper.getAllHouse();
    }

    @Override
    public void addHouse(House house) {
        houseMapper.addHouse(house);
    }

    @Override
    public void updateHouse(House house) {
        houseMapper.updateHouse(house);
    }

    @Override
    public void deleteHouse(int houseId) {
        houseMapper.deleteHouse(houseId);
    }

    @Override
    public List<House> getAllHouses() {
        return houseMapper.getAllHouse();
    }

}
