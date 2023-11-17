package com.team4.catalogbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.catalogbackend.dao.DTDPMappingRepository;
import com.team4.catalogbackend.model.DTDPMapping;

import java.util.List;
import java.util.Optional;

@Service
public class DTDPMappingService {

    private final DTDPMappingRepository dtdpMappingRepository;

    @Autowired
    public DTDPMappingService(DTDPMappingRepository dtdpMappingRepository) {
        this.dtdpMappingRepository = dtdpMappingRepository;
    }

    public List<DTDPMapping> getAllDTDPMappings() {
        return dtdpMappingRepository.findAll();
    }

    public Optional<DTDPMapping> getDTDPMappingById(Long id) {
        return dtdpMappingRepository.findById(id);
    }

    public DTDPMapping saveDTDPMapping(DTDPMapping dtdpMapping) {
        return dtdpMappingRepository.save(dtdpMapping);
    }

    public void deleteDTDPMapping(Long id) {
        dtdpMappingRepository.deleteById(id);
    }
}
