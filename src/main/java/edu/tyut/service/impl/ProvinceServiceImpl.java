package edu.tyut.service.impl;

import edu.tyut.bean.mgb.Province;
import edu.tyut.bean.mgb.ProvinceExample;
import edu.tyut.dao.ProvinceMapper;
import edu.tyut.service.ProvinceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {

    private final ProvinceMapper provinceMapper;

    private ProvinceExample pe = new ProvinceExample();

    public ProvinceServiceImpl(ProvinceMapper provinceMapper) {
        this.provinceMapper = provinceMapper;
    }

    @Override
    public List<Province> selectProvinces() {
        return provinceMapper.selectByExample(null);
    }

    @Override
    public Province selectById(Integer id) {
        pe.clear();
        ProvinceExample.Criteria pc = pe.createCriteria();
        pc.andProvinceIdEqualTo(id);
        List<Province> res = provinceMapper.selectByExample(pe);
        if (res.size() != 0) {
            return res.get(0);
        }
        return null;
    }
}
