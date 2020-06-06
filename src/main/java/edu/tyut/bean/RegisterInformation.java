package edu.tyut.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface RegisterInformation {

    // location
    String getProvince();

    String getCity();

    String getCounty();

    // ethnic
    String getEthnic();

    // nation
    String getNation();

    // political status
    String getPoliticalStatus();

    @JsonIgnore
    String getKey();

    int keyLength();
}
