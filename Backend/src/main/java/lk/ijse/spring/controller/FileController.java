package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Image;
import lk.ijse.spring.repo.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@RestController
@RequestMapping("/upload")
@CrossOrigin
public class FileController {

    @Autowired
    FileRepo fileRepo;

    @PostMapping
    public String uploadFile(@RequestParam("file") MultipartFile file, ModelMap modelMap) {
        modelMap.addAttribute("file", file);
        try {

            byte[] byteArray = file.getBytes();
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();

            long imageCount = fileRepo.count()+1;

            Path location = Paths.get(projectPath + "/image" + imageCount + ".jpeg");
            Files.write(location, byteArray);
            file.transferTo(location);
            System.out.println(projectPath);

            fileRepo.save(new Image(null, location.toString(),"New Image"));

            return Base64.getEncoder().encodeToString(byteArray);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

}
