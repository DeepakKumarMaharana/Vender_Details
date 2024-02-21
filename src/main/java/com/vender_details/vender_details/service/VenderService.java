package com.vender_details.vender_details.service;

import java.util.List;

import com.vender_details.vender_details.entity.Vender;

public interface VenderService {
	List<Vender>getAllVenders();
	Vender getVenderById(Long id);
	Vender createVender(Vender vender);
	Vender updateVenderById(Long id,Vender vender);
	void deleteById(Long id);
}
