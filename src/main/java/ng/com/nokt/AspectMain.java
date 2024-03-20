package ng.com.nokt;

import ng.com.nokt.beans.Comment;
import ng.com.nokt.config.ProjectConfig;
import ng.com.nokt.services.AspectCommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectMain {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(AspectCommentService.class);
        Comment comment = new Comment();
        comment.setAuthor("James Bond");
        comment.setComment("I'm Bond ");
        commentService.publishComment(comment);
    }
}
