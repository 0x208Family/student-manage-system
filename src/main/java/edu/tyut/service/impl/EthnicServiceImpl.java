package edu.tyut.service.impl;

import edu.tyut.bean.mgb.Ethnic;
import edu.tyut.bean.mgb.EthnicExample;
import edu.tyut.dao.EthnicMapper;
import edu.tyut.service.EthnicService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ethnicService")
public class EthnicServiceImpl implements EthnicService {

    private EthnicMapper ethnicMapper;

    public EthnicServiceImpl(EthnicMapper ethnicMapper) {
        this.ethnicMapper = ethnicMapper;
    }

    @Override
    public List<Ethnic> selectEthnic() {
        return ethnicMapper.selectByExample(null);
    }
}
