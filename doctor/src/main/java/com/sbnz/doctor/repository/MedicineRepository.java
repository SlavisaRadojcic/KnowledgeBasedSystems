package com.sbnz.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.doctor.model.Medicine;


public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}
