package minitwitter;

/**
 * Visitor design pattern
 */
public interface VisitorInterface {

    public void visitUser(User userView);

    public void visitGroup(Group groupView);

}
