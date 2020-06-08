package edu.tyut.bean;

/**
 * @author TYUT_LH
 */
public abstract class RegisterAdapter implements Entity {

    public abstract int primaryKeyCheckThresholdLength();

    public abstract Class<? extends SubjectEntity> registerObject();

}
