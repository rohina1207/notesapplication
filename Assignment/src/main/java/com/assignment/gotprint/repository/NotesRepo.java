package com.assignment.gotprint.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.gotprint.model.Notes;
@Repository
public interface NotesRepo extends CrudRepository<Notes, Serializable> {

		public Notes findById(Integer id);
		
}
