package com.assignment.gotprint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.gotprint.model.Notes;
import com.assignment.gotprint.service.NotesService;

@RestController
public class NotesController {
	@Autowired
	private NotesService notesService;
	
	@PostMapping("/notessave")
	public ResponseEntity<Notes> saveData(@RequestBody Notes notes){
		Notes notes2=notesService.saveData(notes);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(notes2);
	}
	@GetMapping("/getdata/{id}")
	public ResponseEntity<Notes> getData(@PathVariable("id") Integer id){
		Notes notes3=notesService.getDataById(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(notes3);
	}
	@PutMapping("/updatedata/{id}")
	public ResponseEntity<Notes> updateData(@PathVariable("id") Integer id,@RequestBody Notes notes){
		Notes notes4 =notesService.updateNotes(id, notes);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(notes4);
	}
	@DeleteMapping("/deletedata/{id}")
	public void deleteData(@PathVariable("id") Integer id) {
		notesService.deleteData(id);
	}
}
