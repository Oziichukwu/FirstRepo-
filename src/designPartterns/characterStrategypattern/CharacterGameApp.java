package designPartterns.characterStrategypattern;

public class CharacterGameApp {

    public static void main(String[] args) {

        Character elizabeth = new Queen();
        Character john = new King();
        Character william = new Troll();

        System.out.println("Queen: " +  elizabeth.displayFightPattern());
        System.out.println("King: " +  john.displayFightPattern());
        System.out.println("Troll: " +  william.displayFightPattern());

        Character willy = new Troll();
        willy.setFightCharacters(new AxeBehaviour());
        System.out.println("Troll: " + willy.displayFightPattern());
    }
}
