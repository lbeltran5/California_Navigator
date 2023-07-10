package org.labaproject.database.mapper;

import org.labaproject.database.model.Cities;

import java.util.List;

public interface CitiesMapper {
    Cities getCitiesById(int cityId);
    List<Cities> getAllCities();
    void addCities(Cities cities);
    void updateCities(Cities cities);
    void deleteCities(int cityId);
}
