package edu.tyut.service.impl;

import edu.tyut.bean.mgb.County;
import edu.tyut.bean.mgb.CountyExample;
import edu.tyut.dao.CountyMapper;
import edu.tyut.service.CountyService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("countyService")
public class CountyServiceImpl implements CountyService {

    private CountyMapper countyMapper;

    private CountyExample ce = new CountyExample();

    public CountyServiceImpl(CountyMapper countyMapper) {
        this.countyMapper = countyMapper;
    }


    @Override
    public List<County> selectCounties(String cityCode) {
        ce.clear();
        CountyExample.Criteria cc = ce.createCriteria();
        cc.andCityCodeEqualTo(cityCode);
        return countyMapper.selectByExample(ce);
    }
}
