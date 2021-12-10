package java.core.designpattern.factory;

public class FactoryException extends RuntimeException{

    private String message;
    private Integer statusCode;

    public FactoryException(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}
