package com.ust.State_Services.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "state_info")
public class State {
    @Id
    private String stateName;
    private int stateCode;
    private String stateCapital;
}
