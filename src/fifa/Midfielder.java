package fifa;

public class Midfielder {
    private String name;
    private MidPositions position;
    private String nation;
    private String club;
    private boolean weakFoot;
    private int skillMoves;


    public Midfielder(String name,  MidPositions position, String nation, String club, boolean weakFoot, int skillMoves) {
        this.name = name;
        this.position = position;
        this.nation = nation;
        this.club = club;
        this.weakFoot = weakFoot;
        this.skillMoves = skillMoves;
    }

    @Override
    public String toString() {
        return "Midfielder{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", nation='" + nation + '\'' +
                ", club='" + club + '\'' +
                ", weakFoot=" + weakFoot +
                ", skillMoves=" + skillMoves +
                '}';
    }
}
