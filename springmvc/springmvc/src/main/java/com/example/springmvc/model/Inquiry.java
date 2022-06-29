package com.example.springmvc.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inquiry {
  // 入力必須・文字列60字まで
  @NotBlank
  @Size(max = 60)
  private String name;

  // 入力必須・Email形式・文字列254字まで
  @NotBlank
  @Email
  @Size(max = 254)
  private String email;

  // 必須入力・文字列500字まで
  @NotBlank
  @Size(max = 500)
  private String inquiry;
}
