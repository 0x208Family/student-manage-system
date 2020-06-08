package edu.tyut.bean;

/**
 * @author TYUT_LH
 */
public class InaccessibleException extends RuntimeException {

    public InaccessibleException(String msg) {
        super(msg);
    }

    public InaccessibleException() {
    }
}
