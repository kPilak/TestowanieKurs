package pl.sda.academy.calculations;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    private static final String SAMPLE_OBJECT = "sample text";
    private static Connection connection;

    private Storage storage;

    @BeforeAll
    static void beforeAll() throws InterruptedException {
        connection = new Connection();
        connection.open();
    }

    @AfterAll
    static void afterAll() throws InterruptedException {
        connection.close();
    }

    @BeforeEach
    void beforeEach() {
        storage = new Storage(connection);
    }

    @AfterEach
    void afterEach() {
        connection.refresh();
    }

    @Test
    @DisplayName("Should add data to storage when connection is initialized and opened")
    void shouldAddDataToStorage() throws InterruptedException {
        // given
//        Connection connection = new Connection();
//        connection.open();
//        Storage storage = new Storage(connection);

        // when
        int actualSize = storage.addValue(SAMPLE_OBJECT);

        // then
        assertEquals(1, actualSize);
        assertTrue(storage.getData().contains(SAMPLE_OBJECT));
    }

    @Test
//    @Disabled("due to temporary failure")
    void shouldRemoveExistingData() throws InterruptedException {
        // given
//        Connection connection = new Connection();
//        connection.open();
//        Storage storage = new Storage(connection);
        storage.addValue(SAMPLE_OBJECT);

        // when
        boolean removeResult = storage.removeValue(SAMPLE_OBJECT);

        // then
        assertTrue(removeResult);
        assertEquals(0, storage.getData().size());
    }
}
