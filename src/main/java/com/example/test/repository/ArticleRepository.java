package com.example.test.repository;


import com.example.test.entity.Article;
import org.springframework.data.repository.CrudRepository;


// 관리대상 엔티디, 대표값 타입 적기
public interface ArticleRepository extends CrudRepository<Article,Long> {
}
