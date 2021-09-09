package com.bookmark.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "bookmark")
public class Bookmark {
	
	private @Id @GeneratedValue long bookmarkId;
	private String url;
	private String title;
	private Date date;
	private long folderId;
	
	
	
	public Bookmark() {
		super();
		
	}
	
	public Bookmark(long bookmarkId, String url, String title, long folderId, Date date) {
		super();
		this.bookmarkId = bookmarkId;
		this.url = url;
		this.title = title;
		this.folderId = folderId;
		this.date = date;
	}
	public long getBookmarkId() {
		return bookmarkId;
	}
	public void setBookmarkId(long bookmarkId) {
		this.bookmarkId = bookmarkId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getFolderId() {
		return folderId;
	}
	public void setFolderId(long folderId) {
		this.folderId = folderId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	

}
