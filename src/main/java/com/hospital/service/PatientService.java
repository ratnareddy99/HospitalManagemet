package com.hospital.service;

import com.hospital.dao.PatientDAO;
import com.hospital.domain.Patient;
import com.hospital.repository.CustomPatientRepository;
import com.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by extrrk on 12/11/2016.
 */
@Service
public class PatientService implements CustomPatientRepository{

    @Autowired
    private PatientDAO patientDAO;

    @Autowired
    private PatientRepository patientRepository;

    public Object findAll(){
        return patientRepository.findAll();
    }

    public Patient findById(Long id){
        return patientRepository.findOne(id);
    }

    public Patient save(Patient patient){
        return patientRepository.save(patient);
    }

    public Patient findBySSN(Long ssn){
        return findBySSN(ssn);
    }

}
