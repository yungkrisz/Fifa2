package fifa;

public class Attacker {
    private String name;
    private AttPositions position;
    private Paramet paramets;
    private String national;
    private String club;
    private boolean weakFoot;
    private int skillMoves;

    public Attacker(String name, AttPositions position, Paramet paramets, String national, String club, boolean weakFoot, int skillMoves) {
        this.name = name;
        this.position = position;
        this.paramets = paramets;
        this.national = national;
        this.club = club;
        this.weakFoot = weakFoot;
        this.skillMoves = skillMoves;
    }
}
