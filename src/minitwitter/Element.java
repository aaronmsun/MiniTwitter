package minitwitter;

/**
 * Visitor Design Pattern
 */
public interface Element {

    public void accept(VisitorInterface visitor);
}
