package com.modelo.modelo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalErrorHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(ModelNotFoundException.class)
    public ResponseEntity<ErrorResponse> errorModelNotFoundException(ModelNotFoundException ex, WebRequest req){
        ErrorResponse errorResponse=new ErrorResponse(LocalDateTime.now(),ex.getMessage(),req.getDescription(false));
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
       String message=ex.getBindingResult().getFieldErrors().stream()
               .map(error->error.getField()+" "+error.getDefaultMessage()).collect(Collectors.joining(","));
       
       
        ErrorResponse errorResponse=new ErrorResponse(LocalDateTime.now(),message,request.getDescription(false));
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
