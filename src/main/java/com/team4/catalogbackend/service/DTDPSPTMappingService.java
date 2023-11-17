package com.team4.catalogbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.catalogbackend.dao.DTDPSPTMappingRepository;
import com.team4.catalogbackend.model.DTDPSPTMapping;

import java.util.List;
import java.util.Optional;

@Service
public class DTDPSPTMappingService {

    private final DTDPSPTMappingRepository dtdpsptMappingRepository;

    @Autowired
    public DTDPSPTMappingService(DTDPSPTMappingRepository dtdpsptMappingRepository) {
        this.dtdpsptMappingRepository = dtdpsptMappingRepository;
    }

    public List<DTDPSPTMapping> getAllDTDPSPTMappings() {
        return dtdpsptMappingRepository.findAll();
    }

    public Optional<DTDPSPTMapping> getDTDPSPTMappingById(Long id) {
        return dtdpsptMappingRepository.findById(id);
    }

    public DTDPSPTMapping saveDTDPSPTMapping(DTDPSPTMapping dtdpsptMapping) {
        return dtdpsptMappingRepository.save(dtdpsptMapping);
    }

    public void deleteDTDPSPTMapping(Long id) {
        dtdpsptMappingRepository.deleteById(id);
    }
}
