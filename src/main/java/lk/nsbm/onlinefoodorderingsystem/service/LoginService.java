package lk.nsbm.onlinefoodorderingsystem.service;

import lk.nsbm.onlinefoodorderingsystem.dto.UserDto;
import lk.nsbm.onlinefoodorderingsystem.entity.UserCredential;

public interface LoginService {
    public boolean checkUserCredentials(UserCredential userCredential);
}
