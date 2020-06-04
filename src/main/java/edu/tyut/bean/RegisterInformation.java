package edu.tyut.bean;

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

    String getKey();

    int keyLength();
}
