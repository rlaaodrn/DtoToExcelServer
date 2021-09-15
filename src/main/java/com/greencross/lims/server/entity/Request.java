package com.greencross.lims.server.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema="public", name = "request")
@Data
@Accessors(fluent = true)
public class Request {
	@Id
	@Column(columnDefinition="varchar(255)")
	private String id;
	@Column(length=64)
	private Long sample;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="service", referencedColumnName="id", insertable=false, updatable=false)
	private Service service;
	@Column(length=64)
	private Integer prefix;
	@Column(length=1)
	private Integer postfix;
	@Column(name="create_at")
	private LocalDate createAt;
	@Column(name="last_modify_at")
	private LocalDate lastModifyAt;
	@Column(columnDefinition="varchar(255)")
	private String institution;
	@Column(length=64)
	private Long previous;
	@Column(name="patient_name")
	private String patientName;
	@Column(name="patient_sex")
	private char sex;
	@Column(name="patient_birth_year")
	private Integer birthYear;
	@Column(name="patient_birth_month")
	private Integer birthMonth;
	@Column(name="patient_birth_day")
	private Integer birthDay;
	@Column(columnDefinition="varchar(255)")
	private String mrn;
	@Column(name="sample_type")
	private String sampleType;
	@Column
	private Long barcode;
	@Column
	private String remark;
	@Column(name="date_sampling")
	private LocalDate dateSampling;
	@Column
	private String department;
	@Column
	private String ward;
	@Column
	private String physician;
	@Column
	private Boolean readonly;
}
