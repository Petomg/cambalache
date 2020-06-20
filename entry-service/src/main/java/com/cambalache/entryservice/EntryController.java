package com.cambalache.entryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@RequestMapping("/")
public class EntryController {

    private EntryRepository entryRepository;

    EntryController(EntryRepository entryRepository){
        this.entryRepository = entryRepository;
    }

    @Autowired
    private Environment env;

    @GetMapping("/")
    List<Entry> getAllEntries(){
        return entryRepository.findAll();
    }

    @PostMapping("/")
    Entry newEntry(@RequestBody Entry newEntry){
        return entryRepository.save(newEntry);
    }

    @GetMapping("/{id}")
    Entry getOneEntry(@PathVariable final Long id){
        return entryRepository.findById(id).orElseThrow(()-> new EntryNotFoundException(id));
    }
}
