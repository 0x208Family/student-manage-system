package edu.tyut.bean;

/**
 * @author TYUT_LH
 */
public abstract class LoginAdapter implements CookieContext, SubjectEntity {

    protected String password;

    public abstract String homePath();

    public abstract Class<? extends SubjectEntity> loginObject();

    @Override
    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
