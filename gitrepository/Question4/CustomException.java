import java.lang.*;
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super( message,null,false,false);
    }
    public synchronized Throwable fillInStackTrace(){
        return this;
    }
}
