package com.example.Recruiting_Office.model.Service;

import com.example.Recruiting_Office.model.Entities.Services;
import com.example.Recruiting_Office.model.Repository.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesService {
    private ServicesRepository servicesRepository;
    @Autowired
    public ServicesService(ServicesRepository servicesRepository) {
        this.servicesRepository = servicesRepository;
    }

    public Optional<Services> getServices(Integer servicesId) { return servicesRepository.findById(servicesId);

    }

    public List<Services> getServicess() {
        return servicesRepository.findAll();
    }
    public void addNewServices(Services services) {
        servicesRepository.save(services);
    }
    public void deleteServices(Integer servicesId) { servicesRepository.deleteById(servicesId);

    }
}
