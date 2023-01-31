package com.bluedart.app.api;

import com.bluedart.app.model.Stray;
import com.bluedart.app.model.StrayImage;
import com.bluedart.app.service.StrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
public class StrayApi {

    @Autowired
    private StrayService service;

    @PostMapping("/stray")
    public String addStray(@RequestBody Stray stray){
        return service.addStray(stray);
    }

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadImage(@RequestPart("file") MultipartFile file ,@RequestParam("mcstrayno") String uuid){
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

            return service.upload(strayImage);
        }
        return "Failed";
    }

    @GetMapping("/")
    public String helloApi(){
        return "BlueDart Api";
    }
}
