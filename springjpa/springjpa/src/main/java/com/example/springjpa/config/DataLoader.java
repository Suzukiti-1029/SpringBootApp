package com.example.springjpa.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springjpa.model.Comment;
import com.example.springjpa.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {
  private final CommentRepository repository;

  @Override
  public void run(String... args) throws Exception {
    Comment comment = new Comment();
    comment.setContent("こんにちは");
    repository.save(comment);

    comment = new Comment();
    comment.setContent("テストコメント");
    repository.save(comment);
  }
}
