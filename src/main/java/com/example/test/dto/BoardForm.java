package com.example.test.dto;

import com.example.test.entity.Article;
import net.bytebuddy.implementation.bind.annotation.AllArguments;


public class BoardForm {
    private String title;
    private String content;

    public BoardForm(String title, String content) {
        this.title = title;
        this.content = content;
    }


    public Article toEntity() {
        return new Article(null, title, content);
    }
}
