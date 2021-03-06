package edu.tyut.service.impl;

import edu.tyut.bean.mbg.County;
import edu.tyut.bean.example.CountyExample;
import edu.tyut.dao.CountyMapper;
import edu.tyut.service.CountyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("countyService")
public class CountyServiceImpl implements CountyService {

    private final CountyMapper countyMapper;

    private final CountyExample ce = new CountyExample();

    private CountyExample.Criteria cc;

    public CountyServiceImpl(CountyMapper countyMapper) {
        this.countyMapper = countyMapper;
    }

    @Override
    public List<County> selectCounties(String cityCode) {
        cc.andCityCodeEqualTo(cityCode);
        return countyMapper.selectByExample(ce);
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
