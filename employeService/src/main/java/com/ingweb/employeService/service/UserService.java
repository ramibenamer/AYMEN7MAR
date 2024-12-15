import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public void registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public boolean authenticateUser(User user) {
        User foundUser = userRepository.findByUsername(user.getUsername());
        return foundUser != null && passwordEncoder.matches(user.getPassword(), foundUser.getPassword());
    }
}
