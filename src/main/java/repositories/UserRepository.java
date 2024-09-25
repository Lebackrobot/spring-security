package repositories;

import models.UserModel;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<UserModel, Integer> {
}
