package ng.com.nokt.services;

import ng.com.nokt.beans.Comment;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class AspectCommentService {

    private Logger logger = Logger.getLogger(AspectCommentService.class.getName());

    public String publishComment(Comment comment){
        logger.info("Publishing Comment...from " + comment.getComment() +" "+ comment.getAuthor());
        return "SUCCESS";
    }

    @ToLog
    public String delete(Comment comment){

        logger.info("Deleting Comment");
        return "Deleted";
    }

    @Repository
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public static class CommentRepository {
    }
}
