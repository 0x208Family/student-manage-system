package edu.tyut.bean;

/**
 * @author TYUT_LH
 */
public abstract class RegisterAdapter implements SubjectEntity {

    public abstract int primaryKeyCheckThresholdLength();

    public abstract Class<? extends SubjectEntity> registerObject();

    @Override
    public String password() {
        throw new InaccessibleException("没有访问权限");
    }
}
