package fifa;

public class Attacker {
    private String name;
    private AttPositions position;
    private String national;
    private String club;
    private boolean weakFoot;
    private int skillMoves;

    public Attacker(String name, AttPositions position, String national, String club, boolean weakFoot, int skillMoves) {
        this.name = name;
        this.position = position;
        this.national = national;
        this.club = club;
        this.weakFoot = weakFoot;
        this.skillMoves = skillMoves;
    }
}
