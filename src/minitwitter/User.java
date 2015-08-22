package minitwitter;

/**
 * User
 */
public class User extends AbstractUser {

    String id;

    @Override
    public String toString() {
        return this.id;
    }
}
