package com.marius.blogma2023.controller;


import com.marius.blogma2023.entity.Topic;
import com.marius.blogma2023.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;
     @GetMapping("/filter")
    public String filterTopics() {
               return "topics";
    }
    @GetMapping
    public String getTopics(Model model) {
        List<Topic> topics = topicService.getAllTopics();
        System.out.println(topics.get(0).getTitle());
       model.addAttribute("topics", topics);
        return "topics";
    }


}
