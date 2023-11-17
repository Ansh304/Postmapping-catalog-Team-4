package com.team4.catalogbackend.model;


import java.sql.Time;

//import com.team4.catalogbackend.model.SubProcess;

import jakarta.persistence.*;

@Entity
public class DTDPSPMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dtdpspMappingId;

    @ManyToOne
    @JoinColumn(name = "dtdp_mapping_id")
    private DTDPMapping dtdpMapping;

    @ManyToOne
    @JoinColumn(name = "sub_process_id")
    private SubProcess subProcess;
    
    private String createdBy;
    private Time createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;

    // Getters and setters

    public Long getDtdpspMappingId() {
        return dtdpspMappingId;
    }

    public void setDtdpspMappingId(Long dtdpspMappingId) {
        this.dtdpspMappingId = dtdpspMappingId;
    }

    public DTDPMapping getDtdpMapping() {
        return dtdpMapping;
    }

    public void setDtdpMapping(DTDPMapping dtdpMapping) {
        this.dtdpMapping = dtdpMapping;
    }

    public SubProcess getSubProcess() {
        return subProcess;
    }

    public void setSubProcess(SubProcess subProcess) {
        this.subProcess = subProcess;
    }

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Time getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Time createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Time getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Time modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
}
