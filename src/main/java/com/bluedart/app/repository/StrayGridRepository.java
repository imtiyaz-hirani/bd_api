package com.bluedart.app.repository;

import com.bluedart.app.model.StrayGrid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StrayGridRepository extends JpaRepository<StrayGrid, String> {

    @Transactional
    @Procedure(procedureName = "STRAY_CSV_NEW", refCursor = true, outputParameterName = "p_cursor")
    List<StrayGrid> getStrayGrid(String mregion, String mcfromdate, String mctodate, String mcstrayloc, String mcpackdesc, String mcvehicleno, String mcvehicleorigin, String mcroute, String mcawbno, String mcremarks, String mcstatus, String mcommodity);

}
