package com.thoughtmechanix.licenses.web.controller;



import com.thoughtmechanix.licenses.config.PostgreConfig;
import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.services.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @Autowired
    private LicenseService service;

    @Autowired
    private PostgreConfig teste;

    @GetMapping(value="/{licenseId}")
    public License getLicenses(
                @PathVariable("organizationId") String organizationId,
                @PathVariable("licenseId")      String licenseId) {
        System.out.println(teste.getDatabase());
        return service.getLicense(organizationId,licenseId);
    }
}
