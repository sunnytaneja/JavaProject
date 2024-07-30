package com.corejavaproject.oopsInheritance;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BaseModel {
    private String model;
    private int year;
    private String gearBox;

    public void getModel() {
        log.info("Model:{}", model);
    }

    public void getYear() {
        log.info("YearOfBaseModel:{}", year);
    }

    public void getGearBox() {
        log.info("GearBoxOfBaseModel:{}", gearBox);
    }
}

class TopModel extends BaseModel {

}
