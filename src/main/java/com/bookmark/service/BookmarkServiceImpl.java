package com.bookmark.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmark.entity.Bookmark;
import com.bookmark.entity.repo.BookmarkRepository;

@Service
public class BookmarkServiceImpl implements BookmarkService {
    
	@Autowired
	BookmarkRepository bmr;
	
	
	
	public BookmarkServiceImpl() {
		
	}

	@Override
	public void CreateBoookmark(Bookmark b) {
		bmr.save(b);

	}

	@Override
	public Bookmark SearchBookmark(long id) {
		return bmr.findById(id).get();
	}

	@Override
	public Bookmark UpdateBookmark(Bookmark b) {
		// TODO Auto-generated method stub
		return bmr.saveAndFlush(b);
	}

	@Override
	public void DeleteBookmark(long id) {
		bmr.deleteById(id);

	}

}
