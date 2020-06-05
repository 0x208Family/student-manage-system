package edu.tyut.service;

import edu.tyut.bean.mgb.County;
import edu.tyut.service.aspect.CriteriaHelper;

import java.util.List;

public interface CountyService extends CriteriaHelper {

    List<County> selectCounties(String cityCode);
}
