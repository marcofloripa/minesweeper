package br.com.odaguiri.minesweeper.usecase;

import br.com.odaguiri.minesweeper.model.Game;
import br.com.odaguiri.minesweeper.repository.GameRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.BDDAssertions.then;
import static reactor.core.publisher.Mono.when;

@ExtendWith(MockitoExtension.class)
class CreateGameTest {

    @InjectMocks
    private CreateGame createGame;

    @Mock
    private GameRepository gameRepository;

    @Test
    void createGame_isReturned() {
        var game = new Game();
        var newGame = new Game();

        when(gameRepository.save(game)).thenReturn(newGame);

        var result = createGame.create(game);

        then(result).isNotNull();
    }
}
