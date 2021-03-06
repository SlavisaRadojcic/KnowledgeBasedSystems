package com.sbnz.doctor.interfaces.services;

import com.sbnz.doctor.dto.DiseaseDTO;


public interface DiseaseServiceInterface extends ServiceInterface<DiseaseDTO> {

	public DiseaseDTO getByCode(String code);

}
