package com.bookmark.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmark.entity.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

}
