package com.bluedart.app.model;

import java.sql.ResultSet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import lombok.Data;



@Entity
@Data
public class Stray {
	
	public static final String NamedQuery_stray_csv_new = "stray_csv_new";
	
    @Id
    private String cstrayno;
    private String dstraydate;
    private String cstrayloc;
    private String centemplcode;
    private String dentrydate;
    private String cpackdesc;
    private String cvehicleno;
    private String croute;
    private String commodity;
    private String cvehicleorigin;
    private String cremarks;
    private String cstatus;
    
	public String getCstrayno() {
		return cstrayno;
	}
	public void setCstrayno(String cstrayno) {
		this.cstrayno = cstrayno;
	}
	public String getDstraydate() {
		return dstraydate;
	}
	public void setDstraydate(String dstraydate) {
		this.dstraydate = dstraydate;
	}
	public String getCstrayloc() {
		return cstrayloc;
	}
	public void setCstrayloc(String cstrayloc) {
		this.cstrayloc = cstrayloc;
	}
	public String getCentemplcode() {
		return centemplcode;
	}
	public void setCentemplcode(String centemplcode) {
		this.centemplcode = centemplcode;
	}
	public String getDentrydate() {
		return dentrydate;
	}
	public void setDentrydate(String dentrydate) {
		this.dentrydate = dentrydate;
	}
	public String getCpackdesc() {
		return cpackdesc;
	}
	public void setCpackdesc(String cpackdesc) {
		this.cpackdesc = cpackdesc;
	}
	public String getCvehicleno() {
		return cvehicleno;
	}
	public void setCvehicleno(String cvehicleno) {
		this.cvehicleno = cvehicleno;
	}
	public String getCroute() {
		return croute;
	}
	public void setCroute(String croute) {
		this.croute = croute;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getCvehicleorigin() {
		return cvehicleorigin;
	}
	public void setCvehicleorigin(String cvehicleorigin) {
		this.cvehicleorigin = cvehicleorigin;
	}
	public String getCremarks() {
		return cremarks;
	}
	public void setCremarks(String cremarks) {
		this.cremarks = cremarks;
	}
	public String getCstatus() {
		return cstatus;
	}
	public void setCstatus(String cstatus) {
		this.cstatus = cstatus;
	}

    
}
