package org.labaproject.database.dao;

import org.labaproject.database.mapper.StreetsMapper;
import org.labaproject.database.model.Stop;
import org.labaproject.database.model.Streets;

import java.util.List;

public class StreetsDaoImpl implements StreetsDao {
    private final StreetsMapper streetsMapper;

    public StreetsDaoImpl(StreetsMapper streetsMapper) {
        this.streetsMapper = streetsMapper;
    }

    @Override
    public Stop getStreetsById(int streetId) {
        return streetsMapper.getStreetsById(streetId);
    }

    @Override
    public List<Streets> getAllStreets() {
        return streetsMapper.getAllStreets();
    }

    @Override
    public void addStreets(Streets streets) {
        streetsMapper.addStreets(streets);
    }

    @Override
    public void updateStreets(Streets streets) {
        streetsMapper.updateStreets(streets);
    }

    @Override
    public void deleteStreets(int streetId) {
        streetsMapper.deleteStreets(streetId);
    }
}
