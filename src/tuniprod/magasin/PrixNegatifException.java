package tuniprod.magasin;

public class PrixNegatifException extends Exception {
    public PrixNegatifException(String message) {
        super(message);
    }
}

