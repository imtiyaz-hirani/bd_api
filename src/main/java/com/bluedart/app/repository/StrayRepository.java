package com.bluedart.app.repository;

import com.bluedart.app.model.Stray;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface StrayRepository extends JpaRepository<Stray, String> {

    @Procedure(procedureName = "StrayEntry_new")
    void addStray(String mcstrayno, String mdstraydate, String mcstrayloc, String mcpackdesc, String mcvehicleno, String mcvehicleorigin, String mcroute, String mcsubmit, String mcommodity, String mcemplcode);
}
