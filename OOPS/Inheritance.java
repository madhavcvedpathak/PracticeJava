package OOPS;

class Pokemonn{
    int power;
    String type;
    Pokemonn(String type, int power){
        this.power = power;
        this.type = type;
    }
    Pokemonn(){}
    void print(){ //getter
        System.out.println(this.power+" "+this.type);
    }
}
class StrongPokemon extends Pokemonn{
    String speed;
}
class LegendaryPokemon extends Pokemonn{
    String ability;
}
class GodPokemon extends LegendaryPokemon{
    char tag;
}
public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
        Pokemonn pikachu = new Pokemonn();
        GodPokemon dialga = new GodPokemon();
        
    }
}
