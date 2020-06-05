package edu.tyut.service;

import edu.tyut.bean.mgb.Ethnic;
import edu.tyut.service.aspect.CriteriaHelper;

import java.util.List;

public interface EthnicService extends CriteriaHelper {

    List<Ethnic> selectEthnic();
}
