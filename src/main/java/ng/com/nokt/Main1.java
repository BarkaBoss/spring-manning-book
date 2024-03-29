package ng.com.nokt;

import ng.com.nokt.config.ProjectConfig;
import ng.com.nokt.services.CommentService;
import ng.com.nokt.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Created Eager Bean Above and Lazy Below");
        CommentService commentService = context.getBean(CommentService.class);
        UserService userService = context.getBean(UserService.class);

        //Bean is now a Prototype
        boolean b = userService.getCommentRepository() == commentService.getCommentRepository();
        System.out.println(b);
    }
}
