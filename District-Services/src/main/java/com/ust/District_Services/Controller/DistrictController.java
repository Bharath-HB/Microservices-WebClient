package com.ust.District_Services.Controller;

import com.ust.District_Services.Model.District;
import com.ust.District_Services.Service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private DistrictService service;

    @PostMapping("/addDistrict")
    public District addDistrict(@RequestBody District district) {
        return service.addDistrict(district);
    }

    @GetMapping("/getDistrict/{stateName}")
    public List<District> getDistrictByStateName(@PathVariable String stateName) {
        return service.getDistrictByStateName(stateName);
    }
    @GetMapping("/getAllDistricts")
    public List<District> getAllDistricts() {
        return service.getAllDistricts();
    }

}
