package com.example.RetrofitApiBackend.Entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String fName;
    @Column(nullable = false)
    private String lName;
    @Column(nullable = false)
    private String proff;

    public Doctor() {
    }

    public Doctor(String fName, String lName, String proff) {
        this.fName = fName;
        this.lName = lName;
        this.proff = proff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getProff() {
        return proff;
    }

    public void setProff(String proff) {
        this.proff = proff;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", proff='" + proff + '\'' +
                '}';
    }
}
