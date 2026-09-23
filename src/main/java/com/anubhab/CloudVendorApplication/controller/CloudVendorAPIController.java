package com.anubhab.CloudVendorApplication.controller;

import com.anubhab.CloudVendorApplication.model.CloudVendor;
import com.anubhab.CloudVendorApplication.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIController {

    CloudVendorService cloudVendorService;

    public CloudVendorAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping
    public List<CloudVendor> getALLCloudVendorDetails(){


        return cloudVendorService.getAllCloudVendor();

    }

    @GetMapping("{id}")
    public CloudVendor getCloudVendorDetails(@PathVariable("id") String id){


        return cloudVendorService.getCloudVendor(id);

    }

    @PostMapping
    public String createCloudVendorDeatails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDeatails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor updated successfully";
    }

    @DeleteMapping("{id}")
    public String deleteCloudVendorDetails(@PathVariable("id") String id){
        cloudVendorService.deleteCloudVendor(id);
        return "Cloud Vendor Deleted";
    }

}
