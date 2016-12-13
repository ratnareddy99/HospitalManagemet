package com.hospital.repository;

import com.hospital.domain.Patient;

/**
 * Created by extrrk on 12/11/2016.
 */
public interface CustomPatientRepository {

    public Patient findBySSN(Long ssn);
}
