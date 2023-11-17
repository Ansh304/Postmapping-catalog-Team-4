package com.team4.catalogbackend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team4.catalogbackend.model.DTDPMapping;
import com.team4.catalogbackend.model.DTDPSPMapping;
import com.team4.catalogbackend.model.Process;

@Repository
public interface DTDPSPMappingRepository extends JpaRepository<DTDPSPMapping, Long> {
}

