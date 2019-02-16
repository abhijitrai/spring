package com.abhijit.service;

import com.abhijit.model.License;
import com.abhijit.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository ;


    public List<License> getLicensesByOrg(String organizationId){
        System.out.println("Abhijit : the org ID received : " + organizationId);
        Iterator<License> iterator = customerRepository.findAll().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        return customerRepository.findByOrganizationId( organizationId );
    }
}
