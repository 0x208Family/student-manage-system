package edu.tyut.service.impl;

import edu.tyut.bean.mgb.Manager;
import edu.tyut.bean.mgb.ManagerExample;
import edu.tyut.dao.ManagerMapper;
import edu.tyut.service.ManagerService;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
    
    private ManagerMapper managerMapper;
    
    public ManagerServiceImpl(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }


}
