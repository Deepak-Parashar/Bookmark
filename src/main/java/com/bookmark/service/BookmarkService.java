package com.bookmark.service;

import com.bookmark.entity.Bookmark;

public interface BookmarkService {
  public void CreateBoookmark(Bookmark b);
  
  public Bookmark SearchBookmark(long id);
  
  public Bookmark UpdateBookmark(Bookmark b);
  
  public void DeleteBookmark(long id);
}
