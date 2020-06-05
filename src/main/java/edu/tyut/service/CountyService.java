package edu.tyut.service;

import edu.tyut.bean.mgb.County;

import java.util.List;

public interface CountyService {

    List<County> selectCounties(String cityCode);
}
