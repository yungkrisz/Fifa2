package fifa;

public class Main {
    public static void main(String[] args) {
        Goalkeeper Yashin = new Goalkeeper(95,"Yashin", "Russia", "Icon", false, 3  );
        System.out.println(Yashin);

        Defender Ramos = new Defender("Ramos",88,DefPositions.CB,"Spain","PSG",false,3);
        System.out.println(Ramos);

        Midfielder Modric = new Midfielder("Modric", 89, MidPositions.CM,"Croatia","Real Madrid",false,5);
        System.out.println(Modric);

        Attacker Ronaldo = new Attacker("Ronaldo", 90, AttPositions.ST,"Portugal","ManUtd",true,5);
        System.out.println(Ronaldo);
    }
}
