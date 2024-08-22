package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    public void testIsUsername() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.isUsername("plain-p@ssw0rd");
        assertFalse(actual);
        boolean actual2 = user.isUsername("user01");
        assertTrue(actual2);
    }

    @Test
    public void testSetPassword() {
        User user1 = new User("user01", "1234");
        assertNotEquals("1234", user1.getPassword()); // should not be equal
        boolean actual = user1.validatePassword("1234");
        assertTrue(actual);
    }
}