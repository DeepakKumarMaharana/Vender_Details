package com.vender_details.vender_details.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vender_details.vender_details.entity.Vender;
import com.vender_details.vender_details.repository.VenderRepository;
import com.vender_details.vender_details.service.VenderService;
@Service
public class VenderServiceImpl implements VenderService {
	
	@Autowired
	VenderRepository venderRepo;

	@Override
	public List<Vender> getAllVenders() {
		
		return venderRepo.findAll();
	}

	@Override
	public Vender getVenderById(Long id) {
		
		return venderRepo.findById(id).orElseThrow(()->new RuntimeException("id not found"+id));
	}

	@Override
	public Vender createVender(Vender vender) {
		
		return venderRepo.save(vender);
	}

	@Override
	public Vender updateVenderById(Long id, Vender updatedVenders) {
		Vender vender = venderRepo.findById(id).orElseThrow(()->new RuntimeException("id not found"+id));
		vender.setName(updatedVenders.getName());
		vender.setEmail(updatedVenders.getEmail());
		vender.setAddress(updatedVenders.getAddress());
		return venderRepo.save(vender);
	}

	@Override
	public void deleteById(Long id) {
		Vender vender = venderRepo.findById(id).orElseThrow(()->new RuntimeException("id not found"+id));
		venderRepo.delete(vender);
	}

}
