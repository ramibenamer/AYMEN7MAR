import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        if (userService.authenticateUser(user)) {
            return ResponseEntity.ok("User logged in successfully");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
