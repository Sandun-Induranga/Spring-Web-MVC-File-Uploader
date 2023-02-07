package lk.ijse.spring.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@RestController
@RequestMapping("/upload")
@CrossOrigin
public class FileController {

    @PostMapping
    public void uploadFile(@ModelAttribute ModelMap modelMap){
        System.out.println("Invoked");
    }

}
