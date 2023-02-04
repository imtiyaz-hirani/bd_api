package com.bluedart.app.repository;

import java.sql.ResultSet;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bluedart.app.model.Stray;


@Repository
public interface StrayRepository extends JpaRepository<Stray, String> {

    @Procedure(procedureName = "StrayEntry_new")
    void addStray(String mcstrayno, String mdstraydate, String mcstrayloc, String mcpackdesc, String mcvehicleno, String mcvehicleorigin, String mcroute, String mcsubmit, String mcommodity, String mcemplcode);
    
    @Transactional
    @Procedure(name = Stray.NamedQuery_stray_csv_new)
    List<String> getAllStray(String mregion, String mcfromdate, String mctodate, 
    		String mcstrayloc, String mcpackdesc, String mcvehicleno, String mcvehicleorigin, 
    		String mcroute, String mcawbno, String mcremarks, String mcstatus, String mcommodity);
}
