package edu.tyut.service;

import edu.tyut.bean.mgb.PoliticalStatus;
import edu.tyut.service.aspect.CriteriaHelper;

import java.util.List;

public interface PoliticalStatusService extends CriteriaHelper {

    List<PoliticalStatus> selectPoliticalStatus();
}
