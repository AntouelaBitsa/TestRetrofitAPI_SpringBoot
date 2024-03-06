package com.example.RetrofitApiBackend.Controller;

import com.example.RetrofitApiBackend.Entity.Doctor;
import com.example.RetrofitApiBackend.Service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class DocController {

    @Autowired
    private DocService docService;

    @GetMapping("/getDoc/{id}")
    public ResponseEntity<Doctor> getDoc(@PathVariable Integer id){
//        Doctor doc = new Doctor("Antouela", "Bitsa", "Programmer");
//        return doc;
        return new ResponseEntity<Doctor>(docService.getDoc(id), HttpStatus.ACCEPTED);
    }

    @PostMapping("/postDoc")
    public ResponseEntity<Doctor> postDoc(@RequestBody Doctor doc){
//        doc = new Doctor("Antouela", "Bitsa", "Programmer");
//        return doc;
//        return docService.getDoc(doc);
//        return docService.saveDoc(doc);

        return new ResponseEntity<Doctor>(docService.saveDoc(doc), HttpStatus.CREATED);
    }
}
