package lab2.challenge2;

public class Film {
    private int anApartitie;
    private String nume;
    private Actor[] actori;

    public Film(int anApartitie, String nume, Actor[] actori){
        this.anApartitie = anApartitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Actor getActorByName(String name){
        for(int i = 0 ; i < actori.length; i++ ){
            if(actori[i].getNume().equals(name)){
                return actori[i];
            }
        }
        return null;
    }
}//end-class

