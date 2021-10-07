package designPartterns.characterStrategypattern;

public class King extends Character{

    public King(){

        super();

        fightCharacters = new BowAndArrowBehaviour();
    }

}
