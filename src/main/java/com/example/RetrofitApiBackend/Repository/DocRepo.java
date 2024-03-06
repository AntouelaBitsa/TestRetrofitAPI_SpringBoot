package com.example.RetrofitApiBackend.Repository;

import com.example.RetrofitApiBackend.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocRepo extends JpaRepository<Doctor, Integer> {
}
