package designPartterns.characterStrategypattern;

public class Queen extends Character{

    public Queen(){
        super();
        fightCharacters = new AxeBehaviour();
    }
}
