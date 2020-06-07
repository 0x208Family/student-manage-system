package edu.tyut.service.impl;

import edu.tyut.annotation.AOPIgnore;
import edu.tyut.bean.LoginInformation;
import edu.tyut.bean.mbg.Instructor;
import edu.tyut.bean.mbg.InstructorExample;
import edu.tyut.dao.InstructorMapper;
import edu.tyut.service.InstructorService;
import org.springframework.stereotype.Service;

/**
 * @author TYUT_LH
 */
@Service("instructorService")
public class InstructorServiceImpl implements InstructorService {

    private final InstructorMapper instructorMapper;

    private final InstructorExample ie = new InstructorExample();

    private InstructorExample.Criteria ic;

    public InstructorServiceImpl(InstructorMapper instructorMapper) {
        this.instructorMapper = instructorMapper;
    }

    @AOPIgnore
    @Override
    public Instructor queryById(String instructorId) {
        return instructorMapper.queryById(instructorId);
    }

    @Override
    public boolean loginChecker(LoginInformation l) {
        ic.andInstructorIdEqualTo(l.getLoginKey());
        ic.andPasswordEqualTo(l.getPassword());
        return instructorMapper.selectByExample(ie).size() != 0;
    }

    @Override
    public void clearCriteria() {
        ie.clear();
    }

    @Override
    public void createCriteria() {
        ic = ie.createCriteria();
    }
}
