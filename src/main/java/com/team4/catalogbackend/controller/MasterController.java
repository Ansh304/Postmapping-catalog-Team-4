package com.team4.catalogbackend.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team4.catalogbackend.model.DTDMapping;
import com.team4.catalogbackend.model.DTDPSPMapping;
import com.team4.catalogbackend.model.DTMapping;
import com.team4.catalogbackend.model.Deliverables;
import com.team4.catalogbackend.model.Domain;
import com.team4.catalogbackend.model.Technology;
import com.team4.catalogbackend.service.DTDMappingService;
import com.team4.catalogbackend.service.DTDPMappingService;
import com.team4.catalogbackend.service.DTDPSPMappingService;
import com.team4.catalogbackend.service.DTDPSPTMappingService;
import com.team4.catalogbackend.service.DTMappingService;
import com.team4.catalogbackend.service.DeliverablesService;
import com.team4.catalogbackend.service.DomainService;
import com.team4.catalogbackend.service.TechnologyService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/service/{groupId}/master")
public class MasterController {
	//getting all the mapping services
	DTMappingService dtMappingService;
	DTDMappingService dtdMappingService;
	DTDPMappingService dtdpMappingService;
	DTDPSPMappingService dtdpspMappingService;
	DTDPSPTMappingService dtdpsptMappingService;
	
	
	DomainService domainService;
	TechnologyService technologyService;
	DeliverablesService deliverablesService;
	
	// For saving the Admin created Mapping
	@PostMapping("/saveadminmapping")
	 public HashMap<String, Long> SaveAdminMapping(@RequestBody HashMap<String,Long>mapping) {
		boolean alreadyMapping = true;
		
		Domain domain = domainService.getDomainById(mapping.get("domain"));
		Technology technology = technologyService.getTechnologyById(mapping.get("technology"));
		
		List<DTMapping> dtMappings =  dtMappingService.check(domain ,technology);
		DTMapping dtmapping;
		if(dtMappings.size() == 1) {
			dtmapping = dtMappings.get(0);
		}else {
			DTMapping temp_dtMapping=new DTMapping(domain ,technology);
			dtmapping = dtMappingService.saveDTMapping(temp_dtMapping);
			alreadyMapping = false;
		}
		
		// cheking for deliverable
		
		if(mapping.get("deliverable") != null ) {
			Deliverables deliverable = deliverablesService.getDeliverablesById(mapping.get("delivaerable"));
			
			List<DTDMapping>dtdMappings = dtdMappingService.check(deliverable , dtmapping);	
			DTDMapping dtdMapping;
			if(dtdMappings.size() == 1) {
				dtdMapping = dtdMappings.get(0);
			}else {
				DTDMapping temp_dtdMapping=new DTDMapping(dtmapping,deliverable);
				dtdMapping = dtdMappingService.saveDTDMapping(temp_dtdMapping);
				alreadyMapping = false;
			}
		}else {
			if(alreadyMapping)return "mapping is already present";
			return "your mapping is saved";
		}
		
		if (alreadyMapping)return "mapping is already their";
		return "mapping is created";
		
	}
}
