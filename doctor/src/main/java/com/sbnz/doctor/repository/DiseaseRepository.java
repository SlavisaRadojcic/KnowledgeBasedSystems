package com.sbnz.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.doctor.model.Disease;


public interface DiseaseRepository extends JpaRepository<Disease, Long> {

	public Disease getDiseaseByDiseaseCode(String code);
}
