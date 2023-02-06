package com.bluedart.app.api;


import com.bluedart.app.model.Stray;
import com.bluedart.app.model.StrayGrid;
import com.bluedart.app.model.StrayImage;
import com.bluedart.app.model.StrayQuery;
import com.bluedart.app.service.StrayService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
public class StrayController {

    @Autowired
    private StrayService service;

    @PostMapping("/stray")
    public ResponseEntity<StrayNoResponse> addStray(@RequestBody Stray stray){
        StrayNoResponse response = new StrayNoResponse();
        response.setStrayNo(service.addStray(stray));
        return new ResponseEntity<StrayNoResponse>(response, HttpStatus.OK);
    }

    @PostMapping("/getstray")
    public ResponseEntity<List<StrayGrid>> getStrayGrid(@RequestBody StrayQuery strayQuery){
        return new ResponseEntity<List<StrayGrid>>(service.getStrayGrid(strayQuery), HttpStatus.OK);
    }

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<StrayImageResponse> uploadImage(@RequestPart("file") MultipartFile file ,@RequestParam("mcstrayno") String uuid){
        StrayImageResponse strayImageResponse = new StrayImageResponse();
        if(!file.isEmpty()) {
            StrayImage strayImage = new StrayImage();
            strayImage.setMcstrayno(uuid);
            strayImage.setMcfilename(file.getOriginalFilename());
            try {
                strayImage.setMbimagefile(file.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
            strayImage.setMmime_type(file.getContentType());
            strayImage.setMcuplodemplcode("IMT");
            strayImage.setMduploaddt(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));



            strayImageResponse.setMesaage(service.upload(strayImage));
            return new ResponseEntity<StrayImageResponse>(strayImageResponse, HttpStatus.OK);
        }
        strayImageResponse.setMesaage("Failed");
        return new ResponseEntity<StrayImageResponse>(strayImageResponse, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/")
    public String helloApi(){
        return "BlueDart Api";
    }

    @Data
    private class StrayNoResponse{
        private String strayNo;

		public String getStrayNo() {
			return strayNo;
		}

		public void setStrayNo(String strayNo) {
			this.strayNo = strayNo;
		}
        
        
    }

    @Data
    private class StrayImageResponse{
        private String mesaage;

		public String getMesaage() {
			return mesaage;
		}

		public void setMesaage(String mesaage) {
			this.mesaage = mesaage;
		}
        
    }
}
