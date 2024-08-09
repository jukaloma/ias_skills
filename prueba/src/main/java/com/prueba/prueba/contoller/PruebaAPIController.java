package com.prueba.prueba.contoller;

import com.prueba.prueba.dto.RequestDTO;
import com.prueba.prueba.dto.ResponseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class PruebaAPIController {

    @GetMapping("/hola")
    public String checkHealth(){
        return "hola mundo";
    }

    @PostMapping("/reservar")
    public ResponseDTO reservar(@RequestBody RequestDTO request){
        ResponseDTO response = new ResponseDTO();
        return response;
    }
}
