package com.example.baky.hackernews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.baky.hackernews.model.News;
import com.example.baky.hackernews.service.NewsService;

@RestController
public class NewsController {
	
	@Autowired
	NewsService newsService;
	
	@GetMapping(value = "/news")
	public List<News> getNews() {
		return newsService.getAllNews();
	}
}
