package org.labaproject.database.mapper;

import java.util.List;

public interface StationDistanceMapper {
    List<String> getAllStationDistance();
  //  void calculateDistance(@Param("station1") int station1, @Param("station2") int station2,@Param("stationDistance") double stationDistance);
    void calculateDistance(String stationDistance);

}
