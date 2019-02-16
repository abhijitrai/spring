package com.abhijit.controller;

import com.abhijit.config.ServiceConfig;
import com.abhijit.model.License;
import com.abhijit.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class ChatterboxController {

    @Autowired
    CustomerService customerService;

    @Autowired
    ServiceConfig sc;

    @RequestMapping(value="greeting/{firstName}/{lastName}",method = RequestMethod.GET)
    public String hello( @PathVariable("firstName") String firstName,
                         @PathVariable("lastName") String lastName) {

        return String.format("{\"message\":\"Hello %s %s\"}", firstName, lastName);
    }

    @GetMapping("license/{orgID}")
    public List<License> getLicensesByOrgID(@PathVariable("orgID") String orgID){
        System.out.println("Test property is : " + sc.getTest());
        return customerService.getLicensesByOrg(orgID);

    }

}
