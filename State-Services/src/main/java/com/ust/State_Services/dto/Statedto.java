package com.ust.State_Services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Statedto {
    private int stateCode;
    private String stateName;
    private String stateCapital;
}
