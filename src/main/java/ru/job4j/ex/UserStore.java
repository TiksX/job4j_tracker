package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                return users[i];
            }
        }
        throw new UserNotFoundException("User not found: " + login);
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() >= 3) {
            return true;
        }
        throw new UserInvalidException("User not valid: " + user.getUsername());
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };

        try {
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
        } catch (UserNotFoundException e) {
            System.out.println("User not found: " + e.getMessage());
        } catch (UserInvalidException e) {
            System.out.println("User is not valid: " + e.getMessage());
        }
    }
}
