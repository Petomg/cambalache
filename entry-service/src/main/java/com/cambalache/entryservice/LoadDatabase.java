package com.cambalache.entryservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EntryRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Entry("Titulo I", "Descripcion I", new ArrayList<String>(), new ArrayList<Category>())));
            log.info("Preloading " + repository.save(new Entry("Titulo II", "Descripcion II", new ArrayList<String>(), new ArrayList<Category>())));
        };
    }
}