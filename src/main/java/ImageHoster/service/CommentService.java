package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import ImageHoster.repository.CommentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepositoryImpl commentRepositoryImpl;

    public Comment saveComment(Comment comment){
        return commentRepositoryImpl.saveComment(comment);
    }
}