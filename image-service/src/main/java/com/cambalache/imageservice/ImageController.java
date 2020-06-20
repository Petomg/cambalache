package com.cambalache.imageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ImageController {
    private ImageRepository imageRepository;

    ImageController(ImageRepository imageRepository){
        this.imageRepository = imageRepository;
    }

    @Autowired
    private Environment env;

    @GetMapping("/")
    List<Image> allImages(){
        return imageRepository.findAll();
    }

    @PostMapping("/")
    Image newImage(@RequestBody Image newImage){
        return imageRepository.save(newImage);
    }

    @GetMapping("/{id}")
    public Image getOne(@PathVariable final Long id){
        return imageRepository.findById(id)
                .orElseThrow(() -> new ImageNotFoundException(id));
    }
}
