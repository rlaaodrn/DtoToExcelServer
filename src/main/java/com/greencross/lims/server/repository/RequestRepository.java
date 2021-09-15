package com.greencross.lims.server.repository;

import com.greencross.lims.server.entity.Request;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface RequestRepository extends PagingAndSortingRepository<Request, String> {
	@Query(value="SELECT * FROM request WHERE sample = :sample AND service = :service AND readonly = false", nativeQuery=true)
	Slice<Request> findById(@Param("sample") long sample, @Param("service") String service);
	@Query(value="SELECT * FROM request WHERE institution = :institution AND readonly = false", nativeQuery=true)
	Slice<Request> findNewPatientList(@Param("institution") String institution);
}
