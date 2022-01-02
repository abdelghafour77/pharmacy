package ac.upm.pharmacy.controller.advice;

import ac.upm.pharmacy.exception.ProductDuplicatedException;
import ac.upm.pharmacy.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductControllerExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    private ResponseEntity<?> handleProductNotFoundException(ProductNotFoundException exception){
        String responseMessage = "The provided product ["+exception.getMid()+"] is nowhere to be found.";
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(responseMessage);
    }

    @ExceptionHandler(ProductDuplicatedException.class)
    private ResponseEntity<?> handleProductDuplicatedException(ProductDuplicatedException exception){
        String responseMessage = "The provided product ["+exception.getMid()+"] is already existing.";
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(responseMessage);
    }
}
