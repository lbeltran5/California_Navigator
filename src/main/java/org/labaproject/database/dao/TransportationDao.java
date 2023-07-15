package org.labaproject.database.dao;

import org.labaproject.database.model.Cities;
import org.labaproject.database.model.Transportation;

import java.util.List;

public interface TransportationDao {

    // These interfaces have methods for CRUD operations
    // (CREATE, READ, UPDATE, DELETE)
    Transportation getTransportationById(int transportId);
    List<Transportation> getAllTransportation();
    void addTransportation(Transportation transportation);
    void updateTransportation(Transportation transportation);
    void deleteTransportation(int transportId);
}
