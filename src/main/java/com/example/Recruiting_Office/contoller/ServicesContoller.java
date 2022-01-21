package com.example.Recruiting_Office.contoller;

import com.example.Recruiting_Office.model.Entities.Services;
import com.example.Recruiting_Office.model.Service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "Services")
public class ServicesContoller {
    private ServicesService servicesService;


    @Autowired
    public ServicesContoller(ServicesService servicesService) {
        this.servicesService = servicesService;
    }

    @GetMapping
    public List<Services> getServicess() {
        return servicesService.getServicess();
    }
    @GetMapping(path = "{servicesId}")
    public Optional<Services> getServicess(@PathVariable(name = "fervicesId") Integer servicesId) {
        return servicesService.getServices(servicesId);
    }
    @PostMapping(path = "add")
    public void registerNewServices(@RequestBody Services services){
        servicesService.addNewServices(services);
    }

    @DeleteMapping(path = "delete/{servicesId}")
    public void deleteServices(@PathVariable ("servicesId") Integer servicesId){
        servicesService.deleteServices(servicesId);
    }
}
