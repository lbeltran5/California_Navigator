package org.labaproject.database.mapper;

import org.labaproject.database.model.Cities;
import org.labaproject.database.model.House;

import java.util.List;

public interface HouseMapper {
    House getHouseById(int houseId);
    List<House> getAllHouse();
    void addHouse(House house);
    void updateHouse(House house);
    void deleteHouse(int houseId);
}

