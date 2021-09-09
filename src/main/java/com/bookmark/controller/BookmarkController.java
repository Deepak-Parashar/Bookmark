package com.bookmark.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookmark.entity.Bookmark;
import com.bookmark.entity.Status;
import com.bookmark.entity.User;
import com.bookmark.service.BookmarkService;

@RestController
public class BookmarkController {
	
	@Autowired
	BookmarkService bookMarkService;
  
	@PostMapping("/Bookmark/create")
	public Status CreateBookmark(@Valid @RequestBody Bookmark bookMark) {
		bookMarkService.CreateBoookmark(bookMark);
		return Status.SUCCESS;
	}
	@PutMapping("/Bookmark/update")
    public Status UpdateBookmark(@Valid @RequestBody Bookmark bookMark) {
		bookMarkService.UpdateBookmark(bookMark);
		return Status.SUCCESS;
	}
	@GetMapping("/Bookmark/{id}")
	public Bookmark searchBookmark(long id) {
		return bookMarkService.SearchBookmark(id);
	}
	@DeleteMapping("/bookmark/{id}")
	public Status deletebookmark(long id) {
		bookMarkService.DeleteBookmark(id);
		return Status.SUCCESS;
	}
}
