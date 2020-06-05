package edu.tyut.service;

import edu.tyut.bean.mgb.City;

import java.util.List;

public interface CityService extends CriteriaHelper {

    City selectCityByCode(String code);

    City selectCityByProvinceCodeAndCityName(String code, String name);

    List<City> selectCities(String provinceCode);

    int insert(City city);

    int deleteByCityCode(String code);

    int update(City city);
}
