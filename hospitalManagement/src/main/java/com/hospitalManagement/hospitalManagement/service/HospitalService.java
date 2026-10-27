package com.hospitalManagement.hospitalManagement.service;

import com.hospitalManagement.hospitalManagement.entity.HospitalEntity;
import com.hospitalManagement.hospitalManagement.repo.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepo hospitalRepo;

    public List<HospitalEntity> getallHospital(){
        return hospitalRepo.findAll();
    }

    public HospitalEntity addHospital( HospitalEntity  hospital){
        return hospitalRepo.save(hospital);
    }

    public void deleteHospital(int id ){
        hospitalRepo.deleteById(id);
    }

    public HospitalEntity updateHospital(int id, HospitalEntity hospital) {

        Optional<HospitalEntity> optionalHospital = hospitalRepo.findById(id);

        if (optionalHospital.isPresent()) {

            HospitalEntity existingHospital = optionalHospital.get();

            existingHospital.setName(hospital.getName());

            return hospitalRepo.save(existingHospital);

        } else {

            throw new RuntimeException("Hospital not found");

        }
    }
}


