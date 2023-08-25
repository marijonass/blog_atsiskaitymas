package com.marius.blogma2023.service;

import com.marius.blogma2023.entity.Topic;
import com.marius.blogma2023.repo.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }
}
