package edu.tyut.service;

import edu.tyut.bean.mgb.PoliticalStatus;

import java.util.List;

public interface PoliticalStatusService {

    List<PoliticalStatus> selectPoliticalStatus();
}
