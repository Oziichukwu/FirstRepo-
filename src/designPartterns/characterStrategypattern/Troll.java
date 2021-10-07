package designPartterns.characterStrategypattern;

public class Troll extends Character{

    public Troll(){

        super();

        fightCharacters = new KnifeBehaviour();
    }
}
