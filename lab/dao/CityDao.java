package gov.iti.day6.lab.dao;

import gov.iti.day6.lab.domain.City;

import java.util.List;

public interface CityDao {
    City findCityById(int id);

    City removeCity(City city);

    City addCity(City city);

    City updateCity(City city);

    List<City> findAllCities();

    List<City> findCitiesByCountryCode(String countryCode);

    List<City> readCitiesFromFile(String fileName);
}
