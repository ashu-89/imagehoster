package ImageHoster.repository;

import ImageHoster.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepositoryImpl {

    @Autowired
    private CommentRepository commentRepository;


    public Comment saveComment(Comment comment){
        return commentRepository.save(comment);
    }
}
