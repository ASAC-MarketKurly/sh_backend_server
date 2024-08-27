package ASAC8._SpringPractice.exception;

public class AaronException extends RuntimeException{
    // AaronException 의 생성자에서 RuntimeException 의 생성자를 부른거야

    // AaronException 생성자
    public AaronException(String message){
        // RuntimeException 생성자 : 부모의 생성자를 호출할때는 super(..원하는 값)
        super(message);
    }
}
