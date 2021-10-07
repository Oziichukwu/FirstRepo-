package designPartterns.characterStrategypattern;

public class Character {

    public WeaponBehaviour fightCharacters;


    public String displayFightPattern(){

        return  fightCharacters.fight();
    }

    public void setFightCharacters(WeaponBehaviour newFightCharacter){
        fightCharacters = newFightCharacter;
    }
}
