package restiapi.restapiproj.service;

import restiapi.restapiproj.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}