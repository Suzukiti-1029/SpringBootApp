package com.example.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.model.Comment;

@Repository // JpaRepositoryを継承しているため、不要ではある
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
