package edu.tyut.service.helper;

import edu.tyut.annotation.AOPIgnore;

public interface CriteriaHelper {

    String CLEAR_SIGNATURE = "clearCriteria";

    void clearCriteria();

    String CREATE_SIGNATURE = "createCriteria";

    void createCriteria();
}
