package org.labaproject.database.dao;

import org.labaproject.database.model.*;

import java.util.*;

public interface CitiesDao {

    // These interfaces have methods for CRUD operations
    // (CREATE, READ, UPDATE, DELETE)
    Cities getCitiesById(int cityId);
    List<Cities> getAllCities();
    void addCities(Cities cities);
    void updateCities(Cities cities);
    void deleteCities(int cityId);
}
