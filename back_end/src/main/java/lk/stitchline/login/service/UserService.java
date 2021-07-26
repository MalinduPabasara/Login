package lk.stitchline.login.service;

import lk.stitchline.login.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {
    boolean saveUser(UserDTO dto);

    boolean deleteUser(String id);

    boolean updateUser(UserDTO dto);

    UserDTO searchUser(String id);

    ArrayList<UserDTO> getAllUser();
}
