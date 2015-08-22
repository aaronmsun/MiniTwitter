package minitwitter;

import java.util.ArrayList;
import java.util.Observable;

/**
 * User
 */
public class User extends AbstractUser {

    String id;
    public ArrayList<String> FollowerTweets = new ArrayList<>();
    public ArrayList<String> myTweets = new ArrayList<>();
    public ArrayList<User> followingUsers = new ArrayList<>();

    public User(String id) {
        this.id = id;

    }

    @Override
    public String toString() {
        return this.id;
    }

    public void tweet(String tweet) {
        FollowerTweets.add(tweet);
        //notify observers to update the news feed
    }

    /**
     * Update the news feed
     *
     * @param follower
     * @param message
     */
    @Override
    public void update(Observable follower, Object message) {
        //call update news feed mtd
        //add the followers tweet
        FollowerTweets.add(follower.toString() + ": " + message.toString());

    }
}
