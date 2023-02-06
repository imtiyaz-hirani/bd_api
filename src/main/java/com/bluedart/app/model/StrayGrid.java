package com.bluedart.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name = StrayGrid.NamedQuery_getStray,
        procedureName = "STRAY_CSV_NEW",
        resultClasses = StrayGrid.class,
        parameters = {
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(
                        type = String.class,
                        mode = ParameterMode.IN
                ),
                @StoredProcedureParameter(type = void.class, mode = ParameterMode.REF_CURSOR)
        }
)
@Entity
public class StrayGrid {
		
	public static final String NamedQuery_getStray = "STRAY_CSV_NEW";
	   @Id
	    private String cstrayno;
	    private String dstraydate;
	    private String centemplcode;
	    private String cemplname;
	   
	    private String cpackdesc;
	    private String cawbno;
	    private String cremarks;
	    private String cstatus;
	   
	    private String cvehicleno;
	    private String cvehicleorigin;
	    private String croute;
	    
	    private String commodity;
	    
	    private String cupdatedate;
	    
	    private String cupdateemp;
	    
	    @Lob
	    private byte[] bimagefile;
	   
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
		public String getCentemplcode() {
			return centemplcode;
		}
		public void setCentemplcode(String centemplcode) {
			this.centemplcode = centemplcode;
		}
		public String getCemplname() {
			return cemplname;
		}
		public void setCemplname(String cemplname) {
			this.cemplname = cemplname;
		}
		public String getCpackdesc() {
			return cpackdesc;
		}
		public void setCpackdesc(String cpackdesc) {
			this.cpackdesc = cpackdesc;
		}
		public String getCawbno() {
			return cawbno;
		}
		public void setCawbno(String cawbno) {
			this.cawbno = cawbno;
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
		public String getCvehicleno() {
			return cvehicleno;
		}
		public void setCvehicleno(String cvehicleno) {
			this.cvehicleno = cvehicleno;
		}
		public String getCvehicleorigin() {
			return cvehicleorigin;
		}
		public void setCvehicleorigin(String cvehicleorigin) {
			this.cvehicleorigin = cvehicleorigin;
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
		public String getCupdatedate() {
			return cupdatedate;
		}
		public void setCupdatedate(String cupdatedate) {
			this.cupdatedate = cupdatedate;
		}
		public String getCupdateemp() {
			return cupdateemp;
		}
		public void setCupdateemp(String cupdateemp) {
			this.cupdateemp = cupdateemp;
		}
		public byte[] getBimagefile() {
			return bimagefile;
		}
		public void setBimagefile(byte[] bimagefile) {
			this.bimagefile = bimagefile;
		}
		 
		 
	 
	    
		 
	    
	    
}
