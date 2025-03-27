package com.tej.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.tej.entity.Notes;
import com.tej.entity.User;

public interface NotesService {

	public Notes saveNotes(Notes notes);
	
	public Notes getNotesById(int id);
	
	//public List<Notes> getNotesUser(User user);
	
	public Page<Notes> getNotesUser(User user,int pageNo);
	
	public Notes updateNotes(Notes notes);
	
	public boolean deleteNotes(int id);
	
}
