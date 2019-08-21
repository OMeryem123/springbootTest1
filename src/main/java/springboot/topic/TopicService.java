package springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
@Autowired
TopicRepository topicRepository;

    private  List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "spring framework", "description"),
    new Topic("java", "java framework", "description"),
    new Topic("js", "js framework", "description")

));

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id ){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    public  void addTopic(Topic topic){
        topics.add(topic);
    }
}
