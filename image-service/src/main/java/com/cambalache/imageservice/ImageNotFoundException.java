package com.cambalache.imageservice;

public class ImageNotFoundException extends RuntimeException {
    ImageNotFoundException(Long id){
        super("Could not found image " + id);
    }
}

