package com.bluedart.app.model;

import lombok.Data;

@Data
public class StrayQuery {
    private String mregion;
    private String mcfromdate;
    private String mctodate;
    private String mcstrayloc;
    private String mcpackdesc;
    private String mcvehicleno;
    private String mcvehicleorigin;
    private String mcroute;
    private String mcawbno;
    private String mcremarks;
    private String mcstatus;
    private String mcommodity;
}
