package com.bluedart.app.repository;

import com.bluedart.app.model.StrayImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface StrayImageUploadRepository extends JpaRepository<StrayImage, String> {

    @Procedure(procedureName = "uploadfiletodatabase")
    void upload(String mcstrayno, String mcfilename, byte[] mbimagefile, String mmime_type, Date mduploaddt, String mcuplodemplcode, Integer mncounter);
}
