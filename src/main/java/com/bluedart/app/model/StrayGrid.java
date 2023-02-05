package com.bluedart.app.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.ResultSet;

@NamedStoredProcedureQueries(
        @NamedStoredProcedureQuery(
                name = "STRAY_CSV_NEW",
                procedureName = "STRAY_CSV_NEW",
                resultClasses = StrayGrid.class,
                parameters = {
                        @StoredProcedureParameter(
                                name = "mregion",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mcfromdate",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mctodate",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mcstrayloc",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mcpackdesc",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mcvehicleno",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mcvehicleorigin",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mcroute",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mcawbno",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mcremarks",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mcstatus",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "mcommodity",
                                type = String.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "p_cursor",
                                type = ResultSet.class,
                                mode = ParameterMode.REF_CURSOR
                        )
                }
        )
)
@Entity
@Data
public class StrayGrid {
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
    private String cupdateEmp;
    @Lob
    private byte[] bimagefile;
}
