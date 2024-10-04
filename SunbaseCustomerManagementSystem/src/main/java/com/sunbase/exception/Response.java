package com.sunbase.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Response<T> {
    private T data;
    private String message;
    private int statusCode;
    private String jwtToken;

    //Response with a message and status.
    public Response(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    //Response with data, a message, and status
    public Response(T data, String message, int statusCode) {
        this.data = data;
        this.message = message;
        this.statusCode = statusCode;
    }

    //Response with a message, status, and JWT token.
    public Response(String message, int statusCode, String jwtToken) {
        this.message = message;
        this.statusCode = statusCode;
        this.jwtToken = jwtToken;
    }
}