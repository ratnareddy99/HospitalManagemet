package com.hospital.service;

import com.hospital.dao.DoctorDAO;
import com.hospital.domain.Doctor;
import com.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by extrrk on 12/11/2016.
 */

@Service
public class DoctorService {

    @Autowired
    private DoctorDAO doctorDAO;

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor findByName(String name){
        return doctorRepository.findByName(name);
    }

    public Doctor save(Doctor doctor){
        return doctorRepository.save(doctor);
    }
}
