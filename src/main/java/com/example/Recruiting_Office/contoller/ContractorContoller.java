package com.example.Recruiting_Office.contoller;

import com.example.Recruiting_Office.model.Entities.Contractor;
import com.example.Recruiting_Office.model.Service.ContractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path ="Contractor")
public class ContractorContoller {
    private ContractorService contractorService;
    @Autowired
    public ContractorContoller(ContractorService contractorService){this.contractorService=contractorService;}

    @GetMapping
    public List<Contractor> getContractors() {
        return contractorService.getContractors();
    }
    @GetMapping(path = "{contractorId}")
    public Optional<Contractor> getContractors(@PathVariable(name = "ContractorId") Integer contractorId) {
        return contractorService.getContractor(contractorId);
    }
    @PostMapping(path = "add")
    public void registerNewContractor(@RequestBody Contractor contractor){
        contractorService.addNewContractor(contractor);
    }

    @DeleteMapping(path = "delete/{contractorId}")
    public void deleteContractor(@PathVariable ("contractorId") Integer contractorId){
        contractorService.deleteContractor(contractorId);
    }
}
