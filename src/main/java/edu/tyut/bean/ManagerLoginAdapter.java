package edu.tyut.bean;

import edu.tyut.bean.mbg.Manager;
import edu.tyut.controller.ConstFlg;

/**
 * @author TYUT_LH
 */
public class ManagerLoginAdapter extends LoginAdapter {

    private String name;

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
    public Object uniqueKey() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
