package minitwitter;

/**
 * Visitor design pattern
 */
public interface VisitorInterface {

    public void visitUser(UserView userView);

    public void visitGroup(GroupView groupView);

}
