package prototype;

public class NotCloneableObject extends RuntimeException{
    public NotCloneableObject(String message) {
        super(message);
    }

}
