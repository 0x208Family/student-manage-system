package edu.tyut.bean;

import edu.tyut.util.SystemUtil;

/**
 * @author TYUT_LH
 */
public abstract class LoginAdapter implements CookieContext, SubjectEntity {

    protected String password;

    public abstract String homePath();

    public abstract Class<? extends SubjectEntity> loginObject();

    @Override
    public String cookieValue() {
        return SystemUtil.URLEncoder(SystemUtil.serialization(this));
    }

    @Override
    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
