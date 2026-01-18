package my.app.activity08.service;

import java.util.Optional;
import my.app.activity08.dto.LoginDTO;
import my.app.activity08.entity.User;
import my.app.activity08.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImplt implements UserService{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public UserServiceImplt(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
 
    @Override
    public User processLogin(LoginDTO login_dto) {
        Optional<User> optional_user= userRepository.findByUsername(login_dto.getUsername());
        if(optional_user.isPresent()){
            User user=optional_user.get();
            if(passwordEncoder.matches(login_dto.getPassword(), user.getPassword())){
                return user;
            }else{
                return null;
            }
        }else{
            return null;
        }
    }
    
}
