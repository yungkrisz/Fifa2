package fifa;

public class Attacker {
    private String name;
    private int rating;
    private AttPositions position;
    private String nation;
    private String club;
    private boolean weakFoot;
    private int skillMoves;

    public Attacker(String name, int rating, AttPositions position, String nation, String club, boolean weakFoot, int skillMoves) {
        this.name = name;
        this.rating = rating;
        this.position = position;
        this.nation = nation;
        this.club = club;
        this.weakFoot = weakFoot;
        this.skillMoves = skillMoves;
    }

    public String getName() {
        return name;
    }
    public int getRating(){
        return rating;
    }
    public AttPositions getPosition() {
        return position;
    }

    public String getNation() {
        return nation;
    }

    public String getClub() {
        return club;
    }

    public boolean isWeakFoot() {
        return weakFoot;
    }

    public int getSkillMoves() {
        return skillMoves;
    }

    @Override
    public String toString() {
        return "Támadó : " + name + rating + position + nation + club + weakFoot + skillMoves;
    }
}
