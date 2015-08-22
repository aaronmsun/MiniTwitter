package minitwitter;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * User class : Observable and Observer Design Pattern
 */
public abstract class AbstractUser extends Observable implements Observer {

    /**
     * update method :<u>change the new feed ( own and followers )</u>
     *
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        //call update news feed mtd
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}
