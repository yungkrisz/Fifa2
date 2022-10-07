package fifa;

public class Defender {
    private String name;
    private DefPositions position;
    private String nation;
    private String club;
    private boolean weakFoot;
    private int skillMoves;

    public Defender(String name, DefPositions position, String nation, String club, boolean weakFoot, int skillMoves) {
        this.name = name;
        this.position = position;
        this.nation = nation;
        this.club = club;
        this.weakFoot = weakFoot;
        this.skillMoves = skillMoves;
    }

    @Override
    public String toString() {
        return "Védekező : " + name + position + nation + club + weakFoot + skillMoves;
    }
}
