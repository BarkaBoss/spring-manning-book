package ng.com.nokt;

import ng.com.nokt.beans.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@Lazy
public class CommentService {

    private final CommentRepository commentRepository;


    @Autowired
    public CommentService(CommentRepository commentRepository) {
        System.out.println("Comment Bean Created");
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
