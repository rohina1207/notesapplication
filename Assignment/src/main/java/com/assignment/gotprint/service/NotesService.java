package com.assignment.gotprint.service;

import com.assignment.gotprint.model.Notes;

public interface NotesService {

	public Notes saveData(Notes notes);
	 
	public Notes getDataById(Integer id);
	
	public Notes updateNotes(Integer id, Notes notes);
	
	public void deleteData(Integer id);
}
