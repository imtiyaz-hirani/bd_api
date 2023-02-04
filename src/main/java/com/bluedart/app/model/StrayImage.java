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
	public String getMcstrayno() {
		return mcstrayno;
	}
	public void setMcstrayno(String mcstrayno) {
		this.mcstrayno = mcstrayno;
	}
	public String getMcfilename() {
		return mcfilename;
	}
	public void setMcfilename(String mcfilename) {
		this.mcfilename = mcfilename;
	}
	public byte[] getMbimagefile() {
		return mbimagefile;
	}
	public void setMbimagefile(byte[] mbimagefile) {
		this.mbimagefile = mbimagefile;
	}
	public String getMmime_type() {
		return mmime_type;
	}
	public void setMmime_type(String mmime_type) {
		this.mmime_type = mmime_type;
	}
	public Date getMduploaddt() {
		return mduploaddt;
	}
	public void setMduploaddt(Date mduploaddt) {
		this.mduploaddt = mduploaddt;
	}
	public String getMcuplodemplcode() {
		return mcuplodemplcode;
	}
	public void setMcuplodemplcode(String mcuplodemplcode) {
		this.mcuplodemplcode = mcuplodemplcode;
	}
	public Integer getMncounter() {
		return mncounter;
	}
	public void setMncounter(Integer mncounter) {
		this.mncounter = mncounter;
	}
    
    
}
