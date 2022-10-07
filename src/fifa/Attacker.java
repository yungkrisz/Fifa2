package fifa;

public class Attacker {
    private String name;
    private AttPositions position;
    private String nation;
    private String club;
    private boolean weakFoot;
    private int skillMoves;

    public Attacker(String name, AttPositions position, String nation, String club, boolean weakFoot, int skillMoves) {
        this.name = name;
        this.position = position;
        this.nation = nation;
        this.club = club;
        this.weakFoot = weakFoot;
        this.skillMoves = skillMoves;
    }

    @Override
    public String toString() {
        return "Támadó : " + name + position + nation + club + weakFoot + skillMoves;
    }
}
