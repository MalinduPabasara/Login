package lk.stitchline.login.service.impl;

import lk.stitchline.login.dto.UserDTO;
import lk.stitchline.login.entity.User;
import lk.stitchline.login.repo.UserRepo;
import lk.stitchline.login.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public boolean saveUser(UserDTO dto) {
        User user = mapper.map(dto, User.class);
        userRepo.save(user);
        return true;
    }

    @Override
    public boolean deleteUser(String nic) {
        userRepo.deleteById(nic);
        return true;
    }

    @Override
    public boolean updateUser(UserDTO dto) {
        if (userRepo.existsById(dto.getNic())) {
            User user = mapper.map(dto, User.class);
            userRepo.save(user);
            return true;
        }
        return false;
    }

    @Override
    public UserDTO searchUser(String nic) {
        Optional<User> user = userRepo.findById(nic);
        if (user.isPresent()) {
            return mapper.map(user.get(), UserDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<UserDTO> getAllUser() {
        List<User> all = userRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<UserDTO>>() {
        }.getType());
    }
}
