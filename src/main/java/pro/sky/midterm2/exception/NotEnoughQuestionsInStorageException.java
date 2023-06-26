package pro.sky.midterm2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class NotEnoughQuestionsInStorageException extends RuntimeException {
    public NotEnoughQuestionsInStorageException() {
    }

    public NotEnoughQuestionsInStorageException(String message) {
        super(message);
    }

    public NotEnoughQuestionsInStorageException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughQuestionsInStorageException(Throwable cause) {
        super(cause);
    }

    public NotEnoughQuestionsInStorageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
