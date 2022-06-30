package com.ibm.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface GameRepository extends CrudRepository<Game, Integer> {
}
