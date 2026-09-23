package com.anubhab.CloudVendorApplication.repository;

import com.anubhab.CloudVendorApplication.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository <CloudVendor, String>{

}
