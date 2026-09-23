package com.anubhab.CloudVendorApplication.service;

import com.anubhab.CloudVendorApplication.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
//    buisness logic will written here:
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String clouVendorId);
    public List<CloudVendor> getAllCloudVendor();
}
