package use_case.login;

import entity.User;

/**
 * DAO for the Login Use Case.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Sets the name indicating the name of the user of the application.
     * @param name the new current name; null to indicate that no one is currently logged into the application.
     */
    void setCurrentUser(String name);

    /**
     * Returns the current user's name.
     * @return the user's name
     */
    String getCurrentUser();
}
