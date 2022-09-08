package homework6;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MethodOneTest {
    private MethodOne testMethod;

    @BeforeEach
    void startUp() {
        System.out.println("начинается тест");
        testMethod = new MethodOne();
    }

    @AfterEach
    void afterEach() {
        System.out.println("завершается тест");
    }

    @DisplayName("array = {1, 2, 4, 4, 2, 3, 4, 1, 7}")
    @Test
    void test1() throws Exception {
        Assertions.assertArrayEquals(testMethod.method(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}), new int[]{1,7}, "Тест не пройден");
    }
    @DisplayName("new int[0]")
    @Test
    void test2() throws Exception {
        Assertions.assertArrayEquals(testMethod.method(new int[0]), new int[0], "Тест не пройден");
    }
    @DisplayName("array = null")
    @Test
    void test3() throws Exception {
        Assertions.assertArrayEquals(testMethod.method(null), null, "Тест не пройден");
    }
    @DisplayName("array = {1, 2, 4, 4, 2, 3, 4, 1, 7}")
    @Test
    void test4() throws Exception {
        Assertions.assertArrayEquals(testMethod.method(new int[]{4, 4, 4, 4, 4, 4}), new int[]{}, "Тест не пройден");
    }
    @DisplayName("array = {1, 2, 4, 4, 2, 3, 4, 1, 7}")
    @Test
    void test5() throws Exception {
        Assertions.assertArrayEquals(testMethod.method(new int[]{4, 1, 1, 1, 1, 1, 1, 1}), new int[]{1, 1, 1, 1, 1, 1, 1});
    }
    @DisplayName("Проверка исключения")
    @Test
    void testException() {
        Assertions.assertThrows(Exception.class, () -> testMethod.method(new int[]{1, 2, 3, 5, 6, 7}));
    }
}