package com.greencross.lims.service;

import com.greencross.lims.medical.dto.RequestDto;
import com.greencross.lims.server.entity.Request;
import com.greencross.lims.server.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class MedicalCheckupService {
	@Autowired
	private RequestRepository requestRepo;

	@Transactional(value="transactionManager", readOnly=true)
	public List<RequestDto> getRequestRenderedData(String institution) {
		List<Request> request =  requestRepo.findNewPatientList(institution).getContent();
		List<RequestDto> requestDto = new ArrayList<>();
		RequestDto reqDto = new RequestDto();

		for(Request req : request){
			reqDto.setPrefix(String.valueOf(req.prefix()));
			reqDto.setPatientNum(req.mrn());
			reqDto.setInstitution(req.institution());
			reqDto.setPatientBirthYear(String.valueOf(req.birthYear()));
			reqDto.setPatientSex(String.valueOf(req.sex()));
			reqDto.setMrn(req.mrn());
			reqDto.setServiceCode(req.service().id());
			reqDto.setServiceName(req.service().name());
			requestDto.add(reqDto);
		}

		return requestDto;
	}
}
