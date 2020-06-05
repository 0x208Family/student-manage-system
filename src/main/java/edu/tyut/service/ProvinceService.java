package edu.tyut.service;

import edu.tyut.bean.mgb.Province;

import java.util.List;

public interface ProvinceService extends CriteriaHelper {

    List<Province> selectProvinces();

    Province selectById(Integer id);
}
