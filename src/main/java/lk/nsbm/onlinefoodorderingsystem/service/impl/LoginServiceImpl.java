package lk.nsbm.onlinefoodorderingsystem.service.impl;

import lk.nsbm.onlinefoodorderingsystem.dto.UserDto;
import lk.nsbm.onlinefoodorderingsystem.entity.User;
import lk.nsbm.onlinefoodorderingsystem.entity.UserCredential;
import lk.nsbm.onlinefoodorderingsystem.repository.LoginRepository;
import lk.nsbm.onlinefoodorderingsystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public boolean checkUserCredentials(UserCredential userCredential) {
        if (userCredential == null) {
            return false;
        }

        UserCredential credential = null;
        try {
            credential = loginRepository.findById(userCredential.getUsername()).get();

            return credential.getPassword().equals(userCredential.getPassword());
        } catch (Exception e) {
            System.out.println("Incorrect user");
        }
        return false;
    }
}
