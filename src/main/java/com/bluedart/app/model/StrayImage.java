package com.bluedart.app.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Date;

@Entity
@Data
public class StrayImage {

    @Id
    private String mcstrayno;
    private String  mcfilename;
    @Lob
    private byte[] mbimagefile;
    private String mmime_type;
    private Date mduploaddt;
    private String mcuplodemplcode;
    private Integer mncounter;
}
