package com.abhijit.repository;

//import com.abhijit.model.Customer;
import com.abhijit.model.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<License,String> {
    public List<License> findByOrganizationId(String organizationId);
}
