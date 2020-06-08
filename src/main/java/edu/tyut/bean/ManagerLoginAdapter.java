package edu.tyut.bean;

import edu.tyut.bean.mbg.Manager;
import edu.tyut.controller.ConstFlg;
import edu.tyut.util.SystemUtil;

/**
 * @author TYUT_LH
 */
public class ManagerLoginAdapter extends LoginAdapter {

    private String managerId;

    @Override
    public String homePath() {
        return ConstFlg.MANAGER_HOME;
    }

    @Override
    public Class<Manager> loginObject() {
        return Manager.class;
    }

    @Override
    public String cookieName() {
        return ConstFlg.MANAGER_COOKIE;
    }

    @Override
    public String cookieValue() {
        return SystemUtil.URLEncoder(SystemUtil.serialization(this));
    }

    @Override
    public Object uniqueKey() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }
}
