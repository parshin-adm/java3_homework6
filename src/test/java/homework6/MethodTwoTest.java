package homework6;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MethodTwoTest {
    private MethodTwo testMethod;

    @BeforeEach
    void startUp() {
        System.out.println("начинается тест");
        testMethod = new MethodTwo();
    }

    @AfterEach
    void afterEach() {
        System.out.println("завершается тест");
    }

    @DisplayName("array = {1, 2, 4, 4, 2, 3, 4, 1, 7}")
    @Test
    void test1()  {
        Assertions.assertTrue(testMethod.method(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}),"Тест не пройден");
    }
    @DisplayName("new int[0]")
    @Test
    void test2()  {
        Assertions.assertFalse(testMethod.method(new int[0]), "Тест не пройден");
    }
    @DisplayName("array = {0, 2, 3, 5}")
    @Test
    void test3() {
        Assertions.assertFalse(testMethod.method(new int[]{0, 2, 3, 5}), "Тест не пройден");
    }


}