package com.team4.catalogbackend.model;

import java.sql.Time;

//import com.team4.catalogbackend.model.Task;

import jakarta.persistence.*;

@Entity
public class DTDPSPTMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dtdpsptMappingId;

    @ManyToOne
    @JoinColumn(name = "dtdpsp_mapping_id")
    private DTDPSPMapping dtdpspMapping;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;
    
    private String createdBy;
    private Time createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;

    // Getters and setters

    public Long getDtdpsptMappingId() {
        return dtdpsptMappingId;
    }

    public void setDtdpsptMappingId(Long dtdpsptMappingId) {
        this.dtdpsptMappingId = dtdpsptMappingId;
    }

    public DTDPSPMapping getDtdpspMapping() {
        return dtdpspMapping;
    }

    public void setDtdpspMapping(DTDPSPMapping dtdpspMapping) {
        this.dtdpspMapping = dtdpspMapping;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
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

