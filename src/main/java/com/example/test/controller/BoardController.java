package com.example.test.controller;


import com.example.test.dto.BoardForm;
import com.example.test.entity.Article;
import com.example.test.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired //스프링 부트가 미리 생성해놓은 객체를 가져다가 자동 연결
    private ArticleRepository articleRepository;


    @GetMapping("/new/board")
    public String go(){
        return "new/board";
    }

    @PostMapping("/new/board/create")
    public String createBoard(BoardForm form){
        System.out.println(form.toString());

        // 1. DTO를 Entity로 바꾸기
        Article article = form.toEntity();

        System.out.println(article.toString());

        // 2. repository(일꾼)에게 Entity를 DB에 저장하게 함.

        Article saved = articleRepository.save(article);

        System.out.println(saved.toString());
        return "";
    }
}
