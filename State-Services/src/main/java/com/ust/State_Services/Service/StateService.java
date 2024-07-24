package com.ust.State_Services.Service;

import com.ust.State_Services.Model.State;
import com.ust.State_Services.dto.Responsedto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StateService {
    State addState(State state);

    Responsedto getDistrictsByState(int stateCode) ;

    List<State> getAllState();

    Responsedto getDistrictsByStateName(String stateName);

    //List<Responsedto> getDistricts(String stateName);

}
