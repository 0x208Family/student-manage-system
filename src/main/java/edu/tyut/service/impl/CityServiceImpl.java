package edu.tyut.service.impl;

import edu.tyut.annotation.AOPIgnore;
import edu.tyut.bean.mbg.City;
import edu.tyut.bean.example.CityExample;
import edu.tyut.dao.CityMapper;
import edu.tyut.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cityService")
public class CityServiceImpl implements CityService {

    private final CityExample ce = new CityExample();

    private final CityMapper cityMapper;

    private CityExample.Criteria cc;

    public CityServiceImpl(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public City selectCityByCode(String code) {
        cc.andCityCodeEqualTo(code);
        List<City> res = cityMapper.selectByExample(ce);
        if (res.size() != 0) {
            return res.get(0);
        }
        return null;
    }

    @Override
    public City selectCityByProvinceCodeAndCityName(String code, String name) {
        cc.andProvinceCodeEqualTo(code);
        cc.andCityNameEqualTo(name);
        List<City> res = cityMapper.selectByExample(ce);
        if (res.size() != 0) {
            return res.get(0);
        }
        return null;
    }

    @Override
    public List<City> selectCities(String provinceCode) {
        cc.andProvinceCodeEqualTo(provinceCode);
        return cityMapper.selectByExample(ce);
    }

    @AOPIgnore
    @Override
    public int insert(City city) {
        return cityMapper.insert(city);
    }

    @Override
    public int deleteByCityCode(String code) {
        return 0;
    }

    @Override
    public int update(City city) {
        return 0;
    }

    @Override
    public void clearCriteria() {
        ce.clear();
    }

    @Override
    public void createCriteria() {
        cc = ce.createCriteria();
    }
}
