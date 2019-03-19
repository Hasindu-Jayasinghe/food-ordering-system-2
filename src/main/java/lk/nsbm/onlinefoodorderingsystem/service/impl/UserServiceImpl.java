package lk.nsbm.onlinefoodorderingsystem.service.impl;

import lk.nsbm.onlinefoodorderingsystem.dto.UserCredentialDto;
import lk.nsbm.onlinefoodorderingsystem.dto.UserDto;
import lk.nsbm.onlinefoodorderingsystem.entity.User;
import lk.nsbm.onlinefoodorderingsystem.entity.UserCredential;
import lk.nsbm.onlinefoodorderingsystem.repository.UserCredentialRepository;
import lk.nsbm.onlinefoodorderingsystem.repository.UserRepository;
import lk.nsbm.onlinefoodorderingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserCredentialRepository userCredentialRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean registerUser(UserCredentialDto userCredentialDto) {
        if (userCredentialDto == null) {
            return false;
        }

        UserCredential userCredential = new UserCredential();
        userCredential.setUsername(userCredentialDto.getUsername());
        userCredential.setPassword(userCredentialDto.getPassword());

        User user = new User();
        user.setFirstName(userCredentialDto.getUser().getFirstName());
        user.setLastName(userCredentialDto.getUser().getLastName());
        user.setEmail(userCredentialDto.getUser().getEmail());
        user.setUserType(userCredentialDto.getUser().getUserType());

        UserCredential save = userCredentialRepository.save(userCredential);
        return save != null;

    }
}
