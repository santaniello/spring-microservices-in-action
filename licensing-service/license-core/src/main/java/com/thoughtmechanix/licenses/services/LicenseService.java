package com.thoughtmechanix.licenses.services;

import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LicenseService {

    @Autowired
    private LicenseRepository licenseRepository;

    public License getLicense(String organizationId, String licenseId) {
        return licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
    }

    public List<License> getLicensesByOrg(String organizationId){
        return licenseRepository.findByOrganizationId( organizationId );
    }

    public void saveLicense(License license){
        license.setLicenseId( UUID.randomUUID().toString());
        licenseRepository.save(license);
    }

    public void updateLicense(License license){
      licenseRepository.save(license);
    }

    public void deleteLicense(License license){
        licenseRepository.delete( license.getLicenseId());
    }

    public List<License> findAll(){
        return licenseRepository.findAll();
    }
}
