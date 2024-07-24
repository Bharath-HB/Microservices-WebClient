package com.ust.District_Services.Repository;

import com.ust.District_Services.Model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District,Integer> {
    List<District> getDistrictsByStateName(String stateName);

}
