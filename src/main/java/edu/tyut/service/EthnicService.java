package edu.tyut.service;

import edu.tyut.bean.mgb.Ethnic;

import java.util.List;

public interface EthnicService extends CriteriaHelper {

    List<Ethnic> selectEthnic();
}
