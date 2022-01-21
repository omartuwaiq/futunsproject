package com.example.Recruiting_Office.model.Repository;

import com.example.Recruiting_Office.model.Entities.Contractor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractorRepository extends JpaRepository<Contractor,Integer> {
}
