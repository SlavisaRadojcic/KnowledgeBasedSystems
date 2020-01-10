package com.sbnz.doctor.interfaces.services;

import com.sbnz.doctor.dto.SymptomDTO;


public interface SymptomServiceInterface extends ServiceInterface<SymptomDTO> {

	public SymptomDTO getHighBloodPressureSymptom();

	public SymptomDTO getByCode(String code);
}
