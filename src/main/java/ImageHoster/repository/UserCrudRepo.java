package ImageHoster.repository;

import ImageHoster.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserCrudRepo extends CrudRepository<User, Integer> {

    @Query("select u from User u where u.username=:userName")
    public User findByUserName(@Param("userName") String userName);
}
