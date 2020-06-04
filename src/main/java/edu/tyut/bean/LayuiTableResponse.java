package edu.tyut.bean;

import lombok.Data;

import java.util.Collection;

@Data
public class LayuiTableResponse<T> {

    private Integer code = 0;

    private String msg = "";

    private Integer count;

    private Collection<T> data;

}
