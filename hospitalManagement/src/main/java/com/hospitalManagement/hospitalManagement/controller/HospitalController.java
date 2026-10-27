package com.hospitalManagement.hospitalManagement.controller;

import com.hospitalManagement.hospitalManagement.entity.HospitalEntity;
import com.hospitalManagement.hospitalManagement.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/code")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/getallHospital")
    public List<HospitalEntity> getAllHospital(){
        return hospitalService.getallHospital();
    }

    @PostMapping("/addHospital")
    public HospitalEntity addHospital(@RequestBody HospitalEntity  hospital){
        return hospitalService.addHospital(hospital);
    }

    @DeleteMapping("/deleteHospital/{id}")
    public String deleteHospital(@PathVariable int id ){
         hospitalService.deleteHospital(id);
         return "hospital deleted successfully";
    }

    @PutMapping("/{id}/status")
    public HospitalEntity updateHospital(@PathVariable int id ,@RequestBody HospitalEntity hospital){
        return hospitalService.updateHospital(id,hospital);
    }


}
