package com.example.casestudy.service.user;


import com.example.casestudy.model.User;
import com.example.casestudy.model.dto.UserDTO;
import com.example.casestudy.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User getByUsername(String username);

    Optional<UserDTO> findUserDTOByUsername(String username);

    Optional<UserDTO> findUserById(Long id);

    List<UserDTO> findAllUserDTOByDeletedIsFalse();

    List<UserDTO> findUserDTOByRoleIdAndDeletedIsFalse(Long id);


}
