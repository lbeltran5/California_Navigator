package org.labaproject.database.dao;

import org.labaproject.database.model.Stop;
import org.labaproject.database.model.Streets;

import java.util.List;

public interface StreetsDao {
    // These interfaces have methods for CRUD operations
    // (CREATE, READ, UPDATE, DELETE)
    Stop getStreetsById(int streetId);
    List<Streets> getAllStreets();

    void addStreets(Streets streets);
    void updateStreets(Streets streets);
    void deleteStreets(int streetId);
}
