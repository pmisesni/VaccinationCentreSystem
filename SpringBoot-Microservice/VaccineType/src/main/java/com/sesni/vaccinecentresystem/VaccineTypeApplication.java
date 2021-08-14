package com.sesni.vaccinecentresystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sesni.vaccinecentresystem.Repository.VaccineTypeRepository;
import com.sesni.vaccinecentresystem.model.VaccineType;


@EnableDiscoveryClient
@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class VaccineTypeApplication {
	
	@Autowired
    private VaccineTypeRepository vaccine_type_repository;

    @PostMapping("/registerVaccine")
    public String register(@RequestBody VaccineType vaccine) {
    	vaccine_type_repository.save(vaccine);
        return "Hi " +  " Vaccine Registration process successfully completed";
    }
    
    @GetMapping("/getAllVaccines")
    public List<VaccineType> findAllVaccines() {
        return vaccine_type_repository.findAll();
    }

	public static void main(String[] args) {
		SpringApplication.run(VaccineTypeApplication.class, args);
	}

}
