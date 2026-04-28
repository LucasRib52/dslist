package com.lucascardoso.dslist.repositories;

import com.lucascardoso.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
