package com.example.Rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handleInvalidCredentials(InvalidCredentials e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handleUnauthorizedUser(UnauthorizedUser e) {
        System.out.println("UnauthorizedUser exception: " + e.getMessage());
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
    }
}
