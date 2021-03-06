package ladder.player.domain;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class Players {
    private static final int MIN_PLAYERS = 2;
    private final List<Player> players;

    private Players(List<Player> players) {
        validate(players);
        this.players = players;
    }

    public static Players of(String... playerNames) {
        return of(asList(playerNames));
    }

    public static Players of(List<String> playerNames) {
        return playerNames.stream()
                .map(Player::of)
                .collect(collectingAndThen(toList(), Players::new));
    }

    public Player getPlayer(int index) {
        return players.get(index);
    }

    public List<Player> getPlayers() {
        return new ArrayList<>(players);
    }

    public int size() {
        return players.size();
    }

    private void validate(List<Player> players) {
        if (players.size() < MIN_PLAYERS) {
            throw new NotEnoughCountOfPersonException();
        }
    }

    @Override
    public String toString() {
        return "Players{" +
                "players=" + players +
                '}';
    }
}
