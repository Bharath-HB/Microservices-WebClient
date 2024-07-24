package com.ust.State_Services.Controller;

import com.ust.State_Services.Model.State;
import com.ust.State_Services.Service.StateService;
import com.ust.State_Services.dto.Responsedto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {
    @Autowired
    private StateService service;

    @PostMapping("/addState")
    public ResponseEntity<State> addState(State state){
        return ResponseEntity.ok(service.addState(state));
    }



    @GetMapping("/getAllState")
    public List<State> getAllState(){
        return service.getAllState();
    }
    //<YOUR_GithubPersonalAccessToken_HERE


}
