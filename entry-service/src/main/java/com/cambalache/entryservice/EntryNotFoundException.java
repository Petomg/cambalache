package com.cambalache.entryservice;

public class EntryNotFoundException extends RuntimeException {
    EntryNotFoundException(Long id){
        super("Could not found entry" + id);
    }
}
