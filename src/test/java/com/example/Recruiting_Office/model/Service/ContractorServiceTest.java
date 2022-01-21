package com.example.Recruiting_Office.model.Service;

import com.example.Recruiting_Office.model.Entities.Contractor;
import com.example.Recruiting_Office.model.Entities.Feedback;
import com.example.Recruiting_Office.model.Entities.Services;
import com.example.Recruiting_Office.model.Entities.User;
import com.example.Recruiting_Office.model.Repository.ContractorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class ContractorServiceTest {
    @Mock
    ContractorRepository contractorRepository;
    @InjectMocks
    ContractorService contractorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetContractor() {
        Optional<Contractor> result = contractorService.getContractor(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testGetContractors() {
        List<Contractor> result = contractorService.getContractors();
        Assertions.assertEquals(Arrays.<Contractor>asList(new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(new Feedback("subject", "description", null, null)), Arrays.<Services>asList(null)), null, Arrays.<Feedback>asList(new Feedback("subject", "description", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(null)), null)))))), result);
    }

    @Test
    void testAddNewContractor() {
        contractorService.addNewContractor(new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(new Feedback("subject", "description", null, null)), Arrays.<Services>asList(null)), null, Arrays.<Feedback>asList(new Feedback("subject", "description", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(null)), null))))));
    }

    @Test
    void testDeleteContractor() {
        contractorService.deleteContractor(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme