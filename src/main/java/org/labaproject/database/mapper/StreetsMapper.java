package org.labaproject.database.mapper;

import org.labaproject.database.model.Stop;
import org.labaproject.database.model.Streets;

import java.util.List;

public interface StreetsMapper {
    Stop getStreetsById(int streetId);
    List<Streets> getAllStreets();
    void addStreets(Streets streets);
    void updateStreets(Streets streets);
    void deleteStreets(int streetId);
}
