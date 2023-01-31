package com.bluedart.app.service;

import com.bluedart.app.model.Stray;
import com.bluedart.app.model.StrayImage;
import com.bluedart.app.repository.StrayImageUploadRepository;
import com.bluedart.app.repository.StrayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StrayService {

    @Autowired
    private StrayRepository strayRepository;

    @Autowired
    private StrayImageUploadRepository strayImageUploadRepository;

    public String addStray(Stray stray){
        UUID uuid = UUID.randomUUID();
        strayRepository.addStray(uuid.toString(), stray.getDstraydate(), stray.getCstrayloc(), stray.getCpackdesc(), stray.getCvehicleno(), stray.getCvehicleorigin(), stray.getCroute(),"", stray.getCommodity(), stray.getCentemplcode());
        return uuid.toString();
    }

    public String upload(StrayImage strayImage){
        strayImageUploadRepository.upload(strayImage.getMcstrayno(), strayImage.getMcfilename(), strayImage.getMbimagefile(), strayImage.getMmime_type(), strayImage.getMduploaddt(), strayImage.getMcuplodemplcode(), Integer.valueOf("1"));
        return "Success";
    }
}
