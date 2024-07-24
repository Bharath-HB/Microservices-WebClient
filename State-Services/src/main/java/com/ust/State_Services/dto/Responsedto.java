package com.ust.State_Services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Responsedto {
    private Statedto state;
    private List<Districtdto> district;
}