package com.bluedart.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.bluedart.app.model.StrayGrid;

public interface StrayGridRepository extends JpaRepository<StrayGrid, String>{
	
	  @Transactional
	    @Procedure(procedureName = StrayGrid.NamedQuery_getStray,refCursor = true, outputParameterName = "p_cursor" )
	    List<StrayGrid> stray_csv_new(String mregion, String mcfromdate, String mctodate, 
	    		String mcstrayloc, String mcpackdesc, String mcvehicleno, 
	    		String mcvehicleorigin, String mcroute, String mcawbno, 
	    		String mcremarks, String mcstatus, String mcommodity);
}
