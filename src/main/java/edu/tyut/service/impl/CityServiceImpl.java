package edu.tyut.service.impl;

import edu.tyut.bean.mgb.City;
import edu.tyut.bean.mgb.CityExample;
import edu.tyut.dao.CityMapper;
import edu.tyut.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cityService")
public class CityServiceImpl implements CityService {

    public final CityExample ce = new CityExample();

    private final CityMapper cityMapper;

    public CityServiceImpl(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public City selectCityByCode(String code) {
        ce.clear();
        CityExample.Criteria cc = ce.createCriteria();
        cc.andCityCodeEqualTo(code);
        List<City> res = cityMapper.selectByExample(ce);
        if (res.size() != 0) {
            return res.get(0);
        }
        return null;
    }

    @Override
    public City selectCityByProvinceCodeAndCityName(String code, String name) {
        ce.clear();;
        CityExample.Criteria cc = ce.createCriteria();
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
        ce.clear();
        CityExample.Criteria cc = ce.createCriteria();
        cc.andProvinceCodeEqualTo(provinceCode);
        return cityMapper.selectByExample(ce);
    }

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
}
