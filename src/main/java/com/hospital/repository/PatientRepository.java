package com.hospital.repository;

import com.hospital.domain.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by extrrk on 12/11/2016.
 */
@Repository
public interface PatientRepository extends CrudRepository<Patient,Long> {



}
