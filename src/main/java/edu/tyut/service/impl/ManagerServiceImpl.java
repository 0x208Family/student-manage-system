package edu.tyut.service.impl;

import edu.tyut.dao.ManagerMapper;
import edu.tyut.service.ManagerService;
import org.springframework.stereotype.Service;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

    private final ManagerMapper managerMapper;

    public ManagerServiceImpl(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }


    @Override
    public void clearCriteria() {

    }

    @Override
    public void createCriteria() {

    }
}
