package edu.tyut.service.impl;

import edu.tyut.bean.mbg.PoliticalStatus;
import edu.tyut.bean.example.PoliticalStatusExample;
import edu.tyut.dao.PoliticalStatusMapper;
import edu.tyut.service.PoliticalStatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("politicalStatusService")
public class PoliticalStatusServiceImpl implements PoliticalStatusService {

    private final PoliticalStatusMapper politicalStatusMapper;

    private final PoliticalStatusExample pe = new PoliticalStatusExample();

    public PoliticalStatusServiceImpl(PoliticalStatusMapper politicalStatusMapper) {
        this.politicalStatusMapper = politicalStatusMapper;
    }

    @Override
    public List<PoliticalStatus> selectPoliticalStatus() {
        return politicalStatusMapper.selectByExample(null);
    }

    @Override
    public void clearCriteria() {
        pe.clear();
    }

    @Override
    public void createCriteria() {

    }
}
