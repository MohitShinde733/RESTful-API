package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

@Service
public class TopicService 
{

    private List<Topic> topics =  new ArrayList<>(Arrays.asList(
        new Topic("spring", "Spring Framework", "Spring Framework Description"),
        new Topic("java", "Core Java", "Core Java Description"),
        new Topic("javascript", "JavaScript Basics", "JavaScript Description")
    ));

    private TopicRepositery topicRepositery;



    
    
    
    public List<Topic> getAllTopics() 
    {
        return StreamSupport.stream(topicRepositery.findAll().spliterator(), false)
                .collect(Collectors.toList());
    } 
        

    public Topic getTopic(String id) 
    {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }

    public void addTopic(Topic topic)
    {
        topics.add(topic);
    }

   public void updateTopic(String id, Topic topic) 
   {
    topics.stream()
        .filter(t -> t.getId().equals(id))
        .findFirst()
        .ifPresent(t -> {t.setName(topic.getName());t.setDescription(topic.getDescription());});
    }

    public Topic deleteTopic(String id) 
    {
        Topic topic = topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (topic != null) {
            topics.remove(topic);
        }
        return topic;
    }
        

}