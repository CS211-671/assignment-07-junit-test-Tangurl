package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList userList;
    @BeforeEach
    void init() {
        userList = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them

        // TODO: assert that UserList found User

        userList.addUser("Tan", "1234");
        userList.addUser("Nat", "4321");
        userList.addUser("Ant", "2134");
        String expected = "Tan";
        User user = userList.findUserByUsername("Tan");
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        // TODO: change password of one user

        // TODO: assert that user can change password
        userList.addUser("Tan", "1234");
        userList.addUser("Nat", "4321");
        userList.addUser("Ant", "2134");
        boolean actual = userList.changePassword("Tan", "1234", "1243");

        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        userList.addUser("Tan", "1234");
        userList.addUser("Nat", "4321");
        userList.addUser("Ant", "2134");
        User expected = userList.findUserByUsername("Tan");
        User actual = userList.login("Tan", "1234");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        userList.addUser("Tan", "1234");
        userList.addUser("Nat", "4321");
        userList.addUser("Ant", "2134");
        User actual = userList.login("Tan", "4321");
        assertNull(actual);
    }

}