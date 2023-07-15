package org.labaproject.database.mapper;

import org.labaproject.database.model.Cities;
import org.labaproject.database.model.Transportation;

import java.util.List;

public interface TransportationMapper {
    Transportation getTransportationById(int transportId);
    List<Transportation> getAllTransportation();
    void addTransportation(Transportation transportation);
    void updateTransportation(Transportation transportation);
    void deleteTransportation(int transportId);
}
