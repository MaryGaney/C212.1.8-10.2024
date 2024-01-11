import static org.junit.jupiter.api.Assertions.*;

class C2FTest {

    @org.junit.jupiter.api.Test
    void main() {
        assertEquals(32, C2F.c2f(0), "0c = 32f");
        assertEquals(32, C2F.c2f(0), "0c = 32f");

        assertAll(
                () -> assertEquals(32, C2F.c2f(0), "0c = 32f"),
                () -> assertEquals(32, C2F.c2f(0), "0c != 33f"),
                () -> assertEquals(-40, C2F.c2f(-40), "-40c = -40f")
        );
    }
}