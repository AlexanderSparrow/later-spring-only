package ru.practicum.user;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private static final Logger log = LoggerFactory.getLogger(UserController.class);


    @GetMapping
    public List<User> getAllUsers() {
        log.info("Получен запрос на вывод всех юзверей.");
        return userService.getAllUsers();
    }

    @PostMapping
    public User saveUser (@RequestBody User user) {
        log.info("Получен зарос на добавление юзверя.");
        return userService.saveUser(user);
    }
}
