package pl.sda.academy.calculations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserValidator userValidator;

    @InjectMocks
    private UserService userService;

    @Test
    void shouldGetUserById() {
        // given
        Long id = 101L;
        Mockito.when(userRepository.findById(id))
                .thenReturn(Optional.of(new User(id, "Kazimierz", "Pierwszy")));

        // when
        User actualUser = userService.getUserById(id);

        // then
        assertNotNull(actualUser);
        assertEquals(id, actualUser.getId());
        assertEquals("Kazimierz", actualUser.getFirstName());
        assertEquals("Pierwszy", actualUser.getLastName());
    }
}