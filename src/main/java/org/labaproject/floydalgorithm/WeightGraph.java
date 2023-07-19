package org.labaproject.floydalgorithm;

import org.labaproject.database.dao.HouseDao;
import org.labaproject.database.dao.CitiesDao;
import org.labaproject.database.dao.StreetsDao;
import org.labaproject.database.model.House;
import org.labaproject.database.model.Cities;
import org.labaproject.database.model.Streets;

import java.util.ArrayList;
import java.util.List;

public class WeightGraph {
    private int numVertices;
    private int[][] weightMatrix;
    private CitiesDao citiesDao;
    private StreetsDao streetsDao;
    private HouseDao houseDao;

    public WeightGraph(CitiesDao citiesDao, StreetsDao streetsDao, HouseDao houseDao) {
        this.citiesDao = citiesDao;
        this.streetsDao = streetsDao;
        this.houseDao = houseDao;
        initializeGraph();
    }

    private void initializeGraph() {
        List<Cities> cities = citiesDao.getAllCities();
        List<Streets> streets = streetsDao.getAllStreets();
        List<House> houses = houseDao.getAllHouses();

        numVertices = cities.size();
        weightMatrix = new int[numVertices][numVertices];

        // Initialize weight matrix with maximum values
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                weightMatrix[i][j] = Integer.MAX_VALUE;
            }
        }

        // Populate weight matrix with distances between connected cities
     /*   for (Streets street : streets) {
            int startCityId = street.getCityId();
            int endCityId = street.getCityId();
            double distance = calculateDistance(startCityId, endCityId);
            weightMatrix[startCityId - 1][endCityId - 1] = (int) distance;
            weightMatrix[endCityId - 1][startCityId - 1] = (int) distance;
        }
    */
        // Populate weight matrix with distances between cities and houses
        for (House house : houses) {
            int cityId = house.getCityId();
            double distance = calculateDistance(cityId, cityId);
            weightMatrix[cityId - 1][cityId - 1] = (int) distance;
        }
    }

    private double calculateDistance(int startCityId, int endCityId) {
        Cities startCity = citiesDao.getCitiesById(startCityId);
        Cities endCity = citiesDao.getCitiesById(endCityId);

        double startLat = startCity.getLatitude();
        double startLon = startCity.getLongitude();
        double endLat = endCity.getLatitude();
        double endLon = endCity.getLongitude();

        // Implement your logic to calculate the distance between cities.
        // Here's an example using the Haversine formula:

        double earthRadius = 6371; // Radius of the Earth in kilometers

        double latDiff = Math.toRadians(endLat - startLat);
        double lonDiff = Math.toRadians(endLon - startLon);

        double a = Math.sin(latDiff / 2) * Math.sin(latDiff / 2)
                + Math.cos(Math.toRadians(startLat)) * Math.cos(Math.toRadians(endLat))
                * Math.sin(lonDiff / 2) * Math.sin(lonDiff / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distance = earthRadius * c;

        return distance;
    }

    public static class Vertex {
        private int id;
        private int index;

        public Vertex(int id, int index) {
            this.id = id;
            this.index = index;
        }

        public int getId() {
            return id;
        }

        public int getIndex() {
            return index;
        }
    }

}
