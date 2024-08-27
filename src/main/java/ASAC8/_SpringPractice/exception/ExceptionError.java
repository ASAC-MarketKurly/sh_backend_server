package ASAC8._SpringPractice.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ExceptionError {
    private int type;
    private String detail;

    public static ExceptionError of(int type, String detail){
        return new ExceptionError(type, detail);
    }
}
