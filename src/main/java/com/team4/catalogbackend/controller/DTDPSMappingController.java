package com.team4.catalogbackend.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.team4.catalogbackend.dao.DTDPSPMappingRepository;
import com.team4.catalogbackend.service.DTDPSPMappingService;

@RestController
@RequestMapping("/api/service/{groupId}/DTDPSMapping")
public class DTDPSMappingController {
	private DTDPSPMappingService dtdpspMappingService;
}
