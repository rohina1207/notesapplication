package com.assignment.gotprint.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.gotprint.model.Notes;
import com.assignment.gotprint.repository.NotesRepo;
@Service
public class NotesServiceImpl implements NotesService {
	@Autowired
	private NotesRepo notesRepo;
	@Override
	public Notes saveData(Notes notes) {
		Notes notes1=notesRepo.save(notes);
		return notes1;
	}
	@Override
	public Notes getDataById(Integer id) {
		Notes notes=notesRepo.findById(id);
		return notes;
	}
	@Override
	public Notes updateNotes(Integer id, Notes notes) {
		Notes notes1 = notesRepo.findById(id);
		notes1.setNote(notes.getNote());
		notes1.setTitle(notes.getTitle());
		notes1.setLastUpdateTime(notes.getLastUpdateTime());
		return notesRepo.save(notes1) ;
	}
	@Override
	public void deleteData(Integer id) {
		notesRepo.deleteById(id);
		
	}

}
