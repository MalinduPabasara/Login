package lk.stitchline.login.controller;

import lk.stitchline.login.dto.UserDTO;
import lk.stitchline.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/stitchline/login")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveUser(@RequestBody UserDTO dto) {

        boolean b = service.saveUser(dto);
        return b + "";

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<UserDTO> getAllUser() {

        return service.getAllUser();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO searchUser(@PathVariable String id) {
        return service.searchUser(id);
    }


    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteUser(@RequestParam String id) {
        System.out.println("delete called");
        boolean b = service.deleteUser(id);
        return b + "";
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateUser(@RequestBody UserDTO dto) {
        boolean b = service.updateUser(dto);
        return b + "";
    }
}
