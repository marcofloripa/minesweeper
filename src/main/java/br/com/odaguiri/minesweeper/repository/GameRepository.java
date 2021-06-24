package br.com.odaguiri.minesweeper.repository;

import br.com.odaguiri.minesweeper.model.Game;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends ReactiveMongoRepository<Game, String> {
}
