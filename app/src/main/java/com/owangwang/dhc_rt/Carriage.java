package com.owangwang.dhc_rt;

import java.util.List;

/**
 * Created by wangchao on 2017/10/31
 */

public class Carriage {
    private String name;
    List<Door> doorList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Door> getDoorList() {
        return doorList;
    }

    public void setDoorList(List<Door> doorList) {
        this.doorList = doorList;
    }
}
