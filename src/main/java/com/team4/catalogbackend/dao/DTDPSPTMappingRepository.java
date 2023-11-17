package com.team4.catalogbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team4.catalogbackend.model.DTDPSPTMapping;

@Repository
public interface DTDPSPTMappingRepository extends JpaRepository<DTDPSPTMapping, Long> {
}

