package edu.tyut.service.impl;

import edu.tyut.annotation.AOPIgnore;
import edu.tyut.bean.mgb.Manager;
import edu.tyut.bean.mgb.ManagerExample;
import edu.tyut.dao.ManagerMapper;
import edu.tyut.service.ManagerService;
import org.springframework.stereotype.Service;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

    private final ManagerMapper managerMapper;

    private final ManagerExample me = new ManagerExample();

    private ManagerExample.Criteria mc;

    public ManagerServiceImpl(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }

    @AOPIgnore
    @Override
    public Manager queryByPrimaryKey(String managerName) {
        return managerMapper.queryByPrimaryKey(managerName);
    }

    @Override
    public boolean loginHelper(String name, String password) {
        mc.andNameEqualTo(name);
        mc.andPasswordEqualTo(password);
        return managerMapper.selectByExample(me).size() != 0;
    }

    @Override
    public void clearCriteria() {
        me.clear();
    }

    @Override
    public void createCriteria() {
        mc = me.createCriteria();
    }
}
