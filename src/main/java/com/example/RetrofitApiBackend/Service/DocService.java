package com.example.RetrofitApiBackend.Service;

import com.example.RetrofitApiBackend.Entity.Doctor;
import com.example.RetrofitApiBackend.Repository.DocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocService {
    @Autowired
    private DocRepo docRepo;

    public Doctor getDoc(Integer id){
        System.out.println("Get doc TEST");
        return docRepo.findById(id).orElse(null);
//        return d;
//        return docRepo.findAll();
    }

    public Doctor saveDoc(Doctor d){
//        d.setId(2);
//        System.out.println("ON SERVICE : ISN'T SAVING");
//        docRepo.save(d);
//        return d;
        System.out.println("Save doc test!");
        return docRepo.save(d);
    }
}
