package fifa;

public class Goalkeeper {
    private int rating;
    private String name;
    private String national;
    private String club;
    private boolean weakFoot;
    private int skillMoves;

    public Goalkeeper(int rating, String name, String national, String club, boolean weakFoot, int skillMoves) {
        this.rating = rating;
        this.name = name;
        this.national = national;
        this.club = club;
        this.weakFoot = weakFoot;
        this.skillMoves = skillMoves;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getNational() {
        return national;
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

}
