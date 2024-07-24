package com.ust.District_Services.Service;

import com.ust.District_Services.Model.District;
import com.ust.District_Services.Repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository repo;

    public District addDistrict(District district) {

        return repo.save(district);
    }

    public List<District> getDistrictByStateName(String stateName) {
        return repo.getDistrictsByStateName(stateName);
    }

    public List<District> getAllDistricts() {
        return repo.findAll();
    }
}
