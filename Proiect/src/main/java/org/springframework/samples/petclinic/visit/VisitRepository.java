package org.springframework.samples.petclinic.visit;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.BaseEntity;

import java.util.List;

public interface VisitRepository extends Repository<Visit, Integer> {

	void save(Visit visit) throws DataAccessException;

	List<Visit> findByPetId(Integer petId);

}
