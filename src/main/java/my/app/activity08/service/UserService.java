package my.app.activity08.service;

import my.app.activity08.dto.LoginDTO;
import my.app.activity08.entity.User;

public interface UserService {
    User processLogin(LoginDTO login_dto);
}
   