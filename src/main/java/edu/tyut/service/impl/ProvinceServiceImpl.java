package edu.tyut.service.impl;

import edu.tyut.bean.mgb.Province;
import edu.tyut.bean.mgb.ProvinceExample;
import edu.tyut.dao.ProvinceMapper;
import edu.tyut.service.ProvinceService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {

    private final ProvinceMapper provinceMapper;

    private final ProvinceExample pe = new ProvinceExample();

    private ProvinceExample.Criteria pc;

    public ProvinceServiceImpl(ProvinceMapper provinceMapper) {
        this.provinceMapper = provinceMapper;
    }

    @Override
    public List<Province> selectProvinces() {
        return provinceMapper.selectByExample(null);
    }

    @Override
    public Province selectById(Integer id) {
        pc.andProvinceIdEqualTo(id);
        List<Province> res = provinceMapper.selectByExample(pe);
        if (res.size() != 0) {
            return res.get(0);
        }
        return null;
    }

    @Override
    public void clearCriteria() {
        pe.clear();
    }

    @Override
    public void createCriteria() {
        pc = pe.createCriteria();
    }
}
