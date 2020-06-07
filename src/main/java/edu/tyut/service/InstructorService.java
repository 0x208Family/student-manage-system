package edu.tyut.service;

import edu.tyut.bean.mbg.Instructor;
import edu.tyut.service.helper.LoginHelper;
import edu.tyut.service.helper.CriteriaHelper;

public interface InstructorService extends CriteriaHelper, LoginHelper {

    Instructor queryById(String instructorId);

    @Override
    default Class<Instructor> serviceFor() {
        return Instructor.class;
    }
}
