package com.hospitalManagement.hospitalManagement.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Hospital")
public class HospitalEntity {

    @Id
    private int id;
    private String name;
}
