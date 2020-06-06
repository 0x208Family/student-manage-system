package edu.tyut.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface LoginInformation {

    @JsonIgnore
    String getIdentityKey();

    String getPassword();
}
