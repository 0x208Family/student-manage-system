package edu.tyut.service.helper;

import edu.tyut.bean.LoginInformation;

/**
 * @author TYUT_LH
 */
public interface LoginHelper extends ServiceMapping {

    boolean loginChecker(LoginInformation l);
}
