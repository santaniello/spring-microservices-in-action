package com.thoughtmechanix.licenses.repository;

import com.thoughtmechanix.licenses.model.License;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class LicenseRepository{
    public static List<License> repository = new ArrayList<>();

    public void save(License license){
        repository.add(license);
    }

    public List<License> findByOrganizationId(String organizationId){
        return repository.stream().filter(r->r.getOrganizationId().equals(organizationId))
                                  .collect(Collectors.toList());
    }

    public License findByOrganizationIdAndLicenseId(String organizationId, String licenseId){
        return repository.stream().filter(r->r.getOrganizationId().equals(organizationId))
                                  .filter(r->r.getLicenseId().equals(licenseId))
                                  .findFirst()
                                  .get();
    }

    public List<License> findAll(){
        return this.repository;
    }

    public void delete(String licenseId){
        repository.removeIf(r->r.getLicenseId().equals(licenseId));
    }

    public void deleteAll(){
        repository.clear();
    }
}
