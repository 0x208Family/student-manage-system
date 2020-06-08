package edu.tyut.service.helper;


import edu.tyut.bean.Entity;

public interface ServiceMapping {

    Class<? extends Entity> serviceFor();
}
