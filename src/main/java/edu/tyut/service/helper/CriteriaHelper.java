package edu.tyut.service.helper;

import edu.tyut.annotation.AOPIgnore;

public interface CriteriaHelper {

    String CLEAR_SIGNATURE = "clearCriteria";

    @AOPIgnore
    void clearCriteria();

    String CREATE_SIGNATURE = "createCriteria";

    @AOPIgnore
    void createCriteria();
}
