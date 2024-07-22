package hexlet.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testSayHi() {
        Assertions.assertEquals(App.sayHi(), "Hello world");
    }
}
