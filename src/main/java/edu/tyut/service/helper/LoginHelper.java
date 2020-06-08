package edu.tyut.service.helper;

import edu.tyut.bean.SubjectEntity;

/**
 * @author TYUT_LH
 */
public interface LoginHelper extends ServiceMapping {

    boolean loginChecker(SubjectEntity obj);
}