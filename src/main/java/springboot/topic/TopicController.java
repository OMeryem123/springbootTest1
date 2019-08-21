package springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
@Autowired
    private TopicService topicSevice;
@RequestMapping("/topics")
    public List<Topic> getAllTopics(){

           return topicSevice.getAllTopics();
    }
@RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable  String id){
    return topicSevice.getTopic(id );
    }

    @RequestMapping(method= RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody  Topic topic){
    topicSevice.addTopic(topic);
    }
}


















































