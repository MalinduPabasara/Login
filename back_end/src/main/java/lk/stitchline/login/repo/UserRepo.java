package lk.stitchline.login.repo;

import lk.stitchline.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
