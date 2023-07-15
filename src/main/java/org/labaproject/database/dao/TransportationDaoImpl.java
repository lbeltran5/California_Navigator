package org.labaproject.database.dao;

import org.labaproject.database.mapper.CitiesMapper;
import org.labaproject.database.mapper.TransportationMapper;
import org.labaproject.database.model.Cities;
import org.labaproject.database.model.Transportation;

import java.util.List;

public class TransportationDaoImpl implements TransportationDao{
    private final TransportationMapper transportationMapper;

    public TransportationDaoImpl(TransportationMapper transportationMapper) {
        this.transportationMapper = transportationMapper;
    }

    @Override
    public Transportation getTransportationById(int transportId) {
        return transportationMapper.getTransportationById(transportId);
    }

    @Override
    public List<Transportation> getAllTransportation() {
        return transportationMapper.getAllTransportation();
    }

    @Override
    public void addTransportation(Transportation transportation) {
        transportationMapper.addTransportation(transportation);
    }

    @Override
    public void updateTransportation(Transportation transportation) {
        transportationMapper.updateTransportation(transportation);
    }

    @Override
    public void deleteTransportation(int transportId) {
        transportationMapper.deleteTransportation(transportId);
    }
}
