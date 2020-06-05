package edu.tyut.service;

import edu.tyut.bean.mgb.Province;

import java.util.List;

public interface ProvinceService {

    List<Province> selectProvinces();

    Province selectById(Integer id);
}
