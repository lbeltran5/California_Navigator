package org.labaproject.database.dao;

import org.labaproject.database.mapper.CitiesMapper;
import org.labaproject.database.model.Cities;

import java.util.List;

public class CitiesDaoImpl implements CitiesDao {
    private final CitiesMapper citiesMapper;

    public CitiesDaoImpl(CitiesMapper citiesMapper) {
        this.citiesMapper = citiesMapper;
    }

    @Override
    public Cities getCitiesById(int cityId) {
        return citiesMapper.getCitiesById(cityId);
    }

    @Override
    public List<Cities> getAllCities() {
        return citiesMapper.getAllCities();
    }

    @Override
    public void addCities(Cities cities) {
        citiesMapper.addCities(cities);
    }

    @Override
    public void updateCities(Cities cities) {
        citiesMapper.updateCities(cities);
    }

    @Override
    public void deleteCities(int cityId) {
        citiesMapper.deleteCities(cityId);
    }
}
