package com.bluedart.app.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluedart.app.model.Stray;
import com.bluedart.app.model.StrayGrid;
import com.bluedart.app.model.StrayImage;
import com.bluedart.app.model.StrayQuery;
import com.bluedart.app.repository.StrayGridRepository;
import com.bluedart.app.repository.StrayImageUploadRepository;
import com.bluedart.app.repository.StrayRepository;

@Service
public class StrayService {

    @Autowired
    private StrayRepository strayRepository;

    @Autowired
    private StrayImageUploadRepository strayImageUploadRepository;
    
    @Autowired
    private StrayGridRepository strayGridRepository;

    public String addStray(Stray stray){
        UUID uuid = UUID.randomUUID();
        strayRepository.addStray(uuid.toString(), stray.getDstraydate(), stray.getCstrayloc(), stray.getCpackdesc(), stray.getCvehicleno(), stray.getCvehicleorigin(), stray.getCroute(),"", stray.getCommodity(), stray.getCentemplcode());
        return uuid.toString();
    }

    public String upload(StrayImage strayImage){
        strayImageUploadRepository.upload(strayImage.getMcstrayno(), strayImage.getMcfilename(), strayImage.getMbimagefile(), strayImage.getMmime_type(), strayImage.getMduploaddt(), strayImage.getMcuplodemplcode(), Integer.valueOf("1"));
        return "Success";
    }
    
    @Transactional
    public List<StrayGrid> getStrayGrid(StrayQuery strayQuery){
    	/*
        List query = this.em.createNamedStoredProcedureQuery("STRAY_CSV_NEW").
                setParameter("mregion", strayQuery.getMregion())
                .setParameter("mcfromdate", strayQuery.getMcfromdate())
                .setParameter("mctodate", strayQuery.getMctodate())
                .setParameter("mcstrayloc", strayQuery.getMcstrayloc())
                .setParameter("mcpackdesc", strayQuery.getMcpackdesc())
                .setParameter("mcvehicleno", strayQuery.getMcvehicleno())
                .setParameter("mcvehicleorigin", strayQuery.getMcvehicleorigin())
                .setParameter("mcroute", strayQuery.getMcroute())
                .setParameter("mcawbno", strayQuery.getMcawbno())
                .setParameter("mcremarks", strayQuery.getMcremarks())
                .setParameter("mcstatus", strayQuery.getMcstatus())
                .setParameter("mcommodity", strayQuery.getMcommodity())
                .getResultList();
        return query;
        */
    	return strayGridRepository.stray_csv_new(strayQuery.getMregion(), strayQuery.getMcfromdate(), 
    			strayQuery.getMctodate(), strayQuery.getMcstrayloc(), strayQuery.getMcpackdesc(), 
    			strayQuery.getMcvehicleno(), strayQuery.getMcvehicleorigin(), 
    			strayQuery.getMcroute(), strayQuery.getMcawbno(), strayQuery.getMcremarks(),
    			strayQuery.getMcstatus(), strayQuery.getMcommodity());
    }
	/*
	 * @Transactional public List<ResultSet> getStray() { return
	 * strayRepository.getAllStray("123", "123", "123", "123", "123", "123", "123",
	 * "123", "123", "123", "123", "123");
	 * 
	 * }
	 */
}
