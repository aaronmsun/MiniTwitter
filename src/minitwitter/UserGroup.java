package minitwitter;

import java.util.ArrayList;

/**
 * User group
 * <u>Composite design pattern</u>
 */
public class UserGroup {

    String id;
    //composite design pattern
    public ArrayList<UserGroup> subGroups = new ArrayList<>();
    public ArrayList<UserView> users = new ArrayList<>();

    public UserGroup(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.id;
    }
}
