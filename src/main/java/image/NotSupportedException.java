package image;

public class NotSupportedException extends RuntimeException{
    public NotSupportedException (String exception) {
        super(exception);
        //TODO verifier si c'est pas n'importe quoi
    }
}
