package com.bluedart.app.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Stray {

    @Id
    private String cstrayno;
    private String dstraydate;
    private String cstrayloc;
    private String centemplcode;
    private String cpackdesc;
    private String cvehicleno;
    private String croute;
    private String commodity;
    private String cvehicleorigin;

}
