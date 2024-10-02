package controllers.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/message")
public class MessageController {

    @GetMapping
    public ResponseEntity<String> getMessage() {
        try {
<<<<<<< HEAD
            return ResponseEntity.status(200).body("Private messages.");
=======
            return ResponseEntity.status(200).body("Private message.");
>>>>>>> origin/main
        }

        catch (Exception error) {
            System.out.println(error.getMessage());
            return ResponseEntity.status(500).body("Internal server error");
        }
    }
}
