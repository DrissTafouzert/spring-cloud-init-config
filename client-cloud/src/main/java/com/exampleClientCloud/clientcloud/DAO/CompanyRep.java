package com.exampleClientCloud.clientcloud.DAO;

import com.exampleClientCloud.clientcloud.Entities.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * CompanyRep
 */
@RepositoryRestResource
public interface CompanyRep extends JpaRepository<Company, Long>
{

    
}