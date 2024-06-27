package com.example.Vendor.Information.Service.controller;


import com.example.Vendor.Information.Service.model.CloudVendor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIServices {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorAPIServices(String vendorId)
    {
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Sucessfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(CloudVendor cloudVendor)
    {
        this.cloudVendor= cloudVendor;
        return "cloudVendor Updated Sucessfully";
    }

    @DeleteMapping(("{vendorId}"))
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor= cloudVendor;
        return "Deleted sucessfully";
    }
}
