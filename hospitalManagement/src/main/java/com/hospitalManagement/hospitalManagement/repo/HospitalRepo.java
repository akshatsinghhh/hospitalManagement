package com.hospitalManagement.hospitalManagement.repo;

import com.hospitalManagement.hospitalManagement.entity.HospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepo extends JpaRepository<HospitalEntity,Integer>{
}
