package com.ust.State_Services.Service;

import com.ust.State_Services.Model.State;
import com.ust.State_Services.Repository.StateRepository;
import com.ust.State_Services.dto.Districtdto;
import com.ust.State_Services.dto.Responsedto;
import com.ust.State_Services.dto.Statedto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {
    @Autowired
    private StateRepository repo;

    @Autowired
    private WebClient webClient;

    @Override
    public State addState(State state) {
        return repo.save(state);
    }

    @Override
    public Responsedto getDistrictsByState(int stateCode) {
        Responsedto responseDto = new Responsedto();

        // Retrieve state information from repository
        State state = repo.findByStateCode(stateCode)
                .orElseThrow(() -> new RuntimeException("State not found"));

        // Map State entity to Statedto
        Statedto statedto = mapToState(state);
        responseDto.setState(statedto);

        // Retrieve districts using WebClient asynchronously
        List<Districtdto> districtdtoList = webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/district/{stateCode}")
                        .build(state.getStateCode()))
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Districtdto>>() {})
                .block(); // Note: Consider using subscribe or other reactive operators instead of block()

        responseDto.setDistrict(districtdtoList);

        return responseDto;
    }

    public Statedto mapToState(State state) {
        Statedto dto = new Statedto();
        dto.setStateCode(state.getStateCode());
        dto.setStateName(state.getStateName());
        dto.setStateCapital(state.getStateCapital());
        return dto;
    }


    @Override
    public List<State> getAllState(){
        return repo.findAll();
    }

    @Override
    public Responsedto getDistrictsByStateName(String stateName) {
        return null;
    }

}
