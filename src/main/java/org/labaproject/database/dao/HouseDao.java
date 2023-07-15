package org.labaproject.database.dao;

import org.labaproject.database.model.Cities;
import org.labaproject.database.model.House;

import java.util.List;

public interface HouseDao {
    House getHouseById(int houseId);

    List<House> getAllHouse();

    //void insert(House house);
    void addHouse(House house);
    void updateHouse(House house);
    void deleteHouse(int houseId);

}
