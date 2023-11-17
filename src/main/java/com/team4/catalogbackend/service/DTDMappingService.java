package com.team4.catalogbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.catalogbackend.dao.DTDMappingRepository;
import com.team4.catalogbackend.model.DTDMapping;
import com.team4.catalogbackend.model.DTMapping;
import com.team4.catalogbackend.model.Deliverables;

import java.util.List;
import java.util.Optional;

@Service
public class DTDMappingService {

    private final DTDMappingRepository dtdMappingRepository;

    @Autowired
    public DTDMappingService(DTDMappingRepository dtdMappingRepository) {
        this.dtdMappingRepository = dtdMappingRepository;
    }

    public List<DTDMapping> getAllDTDMappings() {
        return dtdMappingRepository.findAll();
    }

    public Optional<DTDMapping> getDTDMappingById(Long id) {
        return dtdMappingRepository.findById(id);
    }

    public DTDMapping saveDTDMapping(DTDMapping dtdMapping) {
        return dtdMappingRepository.save(dtdMapping);
    }

    public void deleteDTDMapping(Long id) {
        dtdMappingRepository.deleteById(id);
    }

	public List<DTDMapping> check(Deliverables deliverable, DTMapping dtmapping) {
		// TODO Auto-generated method stub
		List<DTDMapping>dtdmappings = dtdMappingRepository.findbyDTAndDeliverable(deliverable, dtmapping);
		
		return dtdmappings;
	}
}
