package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@RestController
@RequestMapping("/upload")
@CrossOrigin
public class FileController {

    @PostMapping
    public String uploadFile(@RequestParam("file") MultipartFile file, ModelMap modelMap) {
        modelMap.addAttribute("file", file);
        try {

            byte[] byteArray = file.getBytes();
//            Path location = Paths.get("/media/sandu/0559F5C021740317/GDSE/Project_Zone/IdeaProjects/Spring-Web-MVC-File-Uploader/Backend/src/main/java/lk/ijse/spring/assets/image.jpeg");
//            Files.write(location, byteArray);
//            file.transferTo(location);
            return Base64.getEncoder().encodeToString(byteArray);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
