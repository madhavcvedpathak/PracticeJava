package OOPS;

class Pokemon{
    int power;
    String type;
    Pokemon(String type, int power){ //this time it is also working as getter setter
        this.power = power;
        this.type = type;
    }
    int getPower(){
        return power;
    }
    void print(){
        System.out.println(this.power+" "+this.type);
    }
    Pokemon(){

    }
}
class RevisionOOPS {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Electric",70);
        pikachu.type="Fire";
        pikachu.power=34;
        Pokemon jigglypuff = new Pokemon("Fairy",50);
        System.out.println(pikachu.getPower());

        pikachu.print(); jigglypuff.print();
        Pokemon gengar = new Pokemon();

        final int x = 89; // x cant be changed.
        //x = 76;

    }
}
