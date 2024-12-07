package ru.practicum.user;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public List<User> getAllUsers() {
        log.info("Выполняем вызов списка пользователей в методе userRepository.findAll()");
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        log.info("Выполняем сохранение пользователя в методе userRepository.save(user)");
        return userRepository.save(user);
    }
}
