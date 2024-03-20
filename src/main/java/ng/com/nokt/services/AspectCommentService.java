package ng.com.nokt.services;

import ng.com.nokt.beans.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class AspectCommentService {

    private Logger logger = Logger.getLogger(AspectCommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publishing Comment...from " + comment.getComment() +" "+ comment.getAuthor());
    }

}
