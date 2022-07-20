package pl.sda.academy.calculations;

public class UserService {

    private final UserRepository userRepository;
    private final UserValidator userValidator;

    public UserService(UserRepository userRepository, UserValidator userValidator) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User createUser(User user) {
        if (userValidator.isUserValid(user)) {
            return userRepository.addUser(user);
        }

        throw new IllegalArgumentException("User is invalid");
    }
}
