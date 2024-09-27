package repositories;

import models.UserModel;
import org.springframework.data.repository.Repository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserRepository extends Repository<UserModel, Integer> {
    public UserDetails findByUsername(String username);
}
