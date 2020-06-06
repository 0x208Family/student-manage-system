package edu.tyut.service;

import edu.tyut.bean.mbg.Province;
import edu.tyut.service.aspect.CriteriaHelper;

import java.util.List;

public interface ProvinceService extends CriteriaHelper {

    List<Province> selectProvinces();

    Province selectById(Integer id);
}
