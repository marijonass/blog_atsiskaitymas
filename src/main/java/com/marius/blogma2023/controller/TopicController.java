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
    @GetMapping("/{id}")
    public String getTopic(@PathVariable Long id,  Model model) {
        Topic topic = topicService.getTopic(id);
        model.addAttribute("topic", topic);
        return "topic";
    }
    @GetMapping("/add")
    public String getAddTopicForm(Model model) {
        model.addAttribute("newTopic", new Topic());
        return "addTopic";
    }

    @PostMapping
    public String postTopics(Topic newTopic, Model model) {

        System.out.println(newTopic);

        Topic savedTopic = topicService.addNewTopic(newTopic);
        model.addAttribute("newTopic", savedTopic);
        return "topic";
    }
}
