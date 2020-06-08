package edu.tyut.service;

import edu.tyut.bean.mbg.Instructor;
import edu.tyut.service.helper.CriteriaHelper;
import edu.tyut.service.helper.LoginHelper;

public interface InstructorService extends CriteriaHelper, LoginHelper {

    Instructor queryById(String instructorId);

    @Override
    default Class<Instructor> serviceFor() {
        return Instructor.class;
    }
}
