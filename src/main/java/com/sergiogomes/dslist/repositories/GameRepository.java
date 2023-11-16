package com.sergiogomes.dslist.repositories;

import com.sergiogomes.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
