package guiaturistica.controlador.exception;

/**
 * @author sandrojc
 */

public class NoneexistentEntityException extends Exception {

    public NoneexistentEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoneexistentEntityException(String message) {
        super(message);
    }
}
