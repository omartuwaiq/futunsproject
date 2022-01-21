package com.example.Recruiting_Office.model.Service;

import com.example.Recruiting_Office.model.Entities.Contractor;
import com.example.Recruiting_Office.model.Repository.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractorService {
    private ContractorRepository  contractorRepository;
    @Autowired
    public ContractorService(ContractorRepository contractorRepository){this.contractorRepository = contractorRepository;}
    public Optional<Contractor> getContractor(Integer contractorId) { return contractorRepository.findById(contractorId);

    }

    public List<Contractor> getContractors() {
        return contractorRepository.findAll();
    }
    public void addNewContractor(Contractor contractor) {
        contractorRepository.save(contractor);
    }

    public void deleteContractor(Integer contractorId) { contractorRepository.deleteById(contractorId);

    }
}
