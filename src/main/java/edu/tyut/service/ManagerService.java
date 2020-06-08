package edu.tyut.service;

import edu.tyut.bean.mbg.Manager;
import edu.tyut.service.helper.CriteriaHelper;
import edu.tyut.service.helper.LoginHelper;

public interface ManagerService extends CriteriaHelper, LoginHelper {

    Manager queryByPrimaryKey(String managerName);

    @Override
    default Class<Manager> serviceFor() {
        return Manager.class;
    }
}
