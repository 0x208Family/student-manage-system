package edu.tyut.service;

import edu.tyut.bean.mbg.PoliticalStatus;
import edu.tyut.service.helper.CriteriaHelper;

import java.util.List;

public interface PoliticalStatusService extends CriteriaHelper {

    List<PoliticalStatus> selectPoliticalStatus();
}
