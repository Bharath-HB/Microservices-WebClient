package com.ust.State_Services.Repository;

import com.ust.State_Services.Model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StateRepository extends JpaRepository<State, String> {
    Optional<State> findByStateCode(int stateCode);
}
