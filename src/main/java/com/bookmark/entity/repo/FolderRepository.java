package com.bookmark.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmark.entity.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long> {

}
