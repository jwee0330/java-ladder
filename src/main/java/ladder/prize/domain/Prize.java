package ladder.prize.domain;

import java.util.Objects;

public class Prize {
    private final String prize;

    private Prize(String prize) {
        this.prize = prize;
    }

    public static Prize of(String prize) {
        return new Prize(prize);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prize)) return false;
        Prize prize1 = (Prize) o;
        return Objects.equals(prize, prize1.prize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prize);
    }
}
