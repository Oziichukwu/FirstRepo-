package designPartterns.characterStrategypattern;

public interface WeaponBehaviour {
    String fight();
}

class AxeBehaviour implements WeaponBehaviour{


    public String fight() {
        return "I can fight with an Axe";
    }
}

class KnifeBehaviour implements WeaponBehaviour{

    public String fight() {
        return "I can fight perfectly well with a knife";
    }
}

class BowAndArrowBehaviour implements WeaponBehaviour{

    public String fight() {
        return "Bow and arrows are my favourite weapons to fight";
    }
}

class SwordBehaviour implements WeaponBehaviour{

    public String fight() {
        return "Swords are the best for defense against enemies";
    }
}

