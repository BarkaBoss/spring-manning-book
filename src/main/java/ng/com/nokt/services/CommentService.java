package ng.com.nokt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {

    private final AspectCommentService.CommentRepository commentRepository;


    @Autowired
    public CommentService(AspectCommentService.CommentRepository commentRepository) {
        System.out.println("Comment Bean Created");
        this.commentRepository = commentRepository;
    }

    public AspectCommentService.CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
