package fifa;

public class Defender {
    private String name;
    private DefPositions position;
    private String national;
    private String club;
    private boolean weakFoot;
    private int skillMoves;

    public Defender(String name, DefPositions position, String national, String club, boolean weakFoot, int skillMoves) {
        this.name = name;
        this.position = position;
        this.national = national;
        this.club = club;
        this.weakFoot = weakFoot;
        this.skillMoves = skillMoves;
    }
}
