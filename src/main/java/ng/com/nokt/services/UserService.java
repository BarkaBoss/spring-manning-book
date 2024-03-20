package ng.com.nokt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final AspectCommentService.CommentRepository commentRepository;

    @Autowired
    public UserService(AspectCommentService.CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public AspectCommentService.CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
