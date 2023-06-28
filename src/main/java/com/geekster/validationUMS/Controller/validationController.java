package com.geekster.validationUMS.Controller;



import com.geekster.validationUMS.Model.validationModel;
import com.geekster.validationUMS.Service.validationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    public class validationController {



        @Autowired
        validationService service_pra;
        @PostMapping(value = "/addName")
        public String addName(@Valid @RequestBody validationModel model ){
            service_pra.addName(model);
            return "Name Added Succefully";



        }
        @GetMapping(value = "/getAllData")
        public List<validationModel> getList(){
            return service_pra.getAllData();
        }

        @GetMapping(value = "/getAllData/{id}")
        public validationModel getRestarantbyID (@PathVariable int   UserId){
            return service_pra.getDataById(UserId);
        }

        @PutMapping (value = "/update/{id}")
        public  validationModel update(@PathVariable int UserId, @RequestBody validationModel model ){
            return service_pra.update(UserId, model);
        }

        @DeleteMapping(value = "getAllData/{id}")
        public String delete(@PathVariable int id){
            validationModel model =service_pra.delete(id);
            return "User deleted with ID -"+id+"with data"+model.toString();
        }
    }








