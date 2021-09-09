package com.bookmark.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "folder")
public class Folder {
	
    private @Id @GeneratedValue long folderId;
    private String folderName;
    
    List<Bookmark> bookmarks=new ArrayList<>();
    
	public Folder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Folder(long folderId, String folderName, List<Bookmark> bookmarks) {
		super();
		this.folderId = folderId;
		this.folderName = folderName;
		this.bookmarks = bookmarks;
	}
	public long getFolderId() {
		return folderId;
	}
	public void setFolderId(long folderId) {
		this.folderId = folderId;
	}
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	public List<Bookmark> getBookmarks() {
		return bookmarks;
	}
	public void setBookmarks(List<Bookmark> bookmarks) {
		this.bookmarks = bookmarks;
	}
	
   
   
   
   
}
