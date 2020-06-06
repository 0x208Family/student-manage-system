package edu.tyut.service;

import edu.tyut.bean.mgb.Manager;
import edu.tyut.service.aspect.CriteriaHelper;

public interface ManagerService extends CriteriaHelper {

    Manager queryByPrimaryKey(String managerName);

    boolean loginHelper(String name, String password);
}
