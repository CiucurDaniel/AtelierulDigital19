package lab2.challenge2;

import lab1.challenge3.Pair;

public class Main {
    public static void main(String[] args) {
        //premii
        Premiu p1 = new Premiu("Oscar", 1990);
        Premiu p2 = new Premiu("Oscar", 1980);
        Premiu p3 = new Premiu("Oscar", 2009);
        Premiu p4 = new Premiu("Oscar", 2010);


        Premiu[] listaP1 = new Premiu[2];
        listaP1[0] = p1;
        listaP1[1] = p2;

        Actor a1 = new Actor("actor cu 2 oscaruri", 30, listaP1);
        Actor a2 = new Actor("actor cu un oscar", 20, new Premiu[] {p3} );
        Actor a3 = new Actor("actor cu 3 oscaruri", 20, new Premiu[] {p2, p3, p4} );
        Actor a4 = new Actor("actor fara oscaruri", 20, new Premiu[] {} );

        //filme
        Film f1 = new Film(200, "Film1", new Actor[] {a1, a2});
        Film f2 = new Film(200, "Film1", new Actor[] {a3, a4});

        //studio
        Studio s1 = new Studio("MGM", new Film[] {f1});
        Studio s2 = new Studio("Disney", new Film[] {f1,f2});

        Studio[] studioDatabase = new Studio[] {s1, s2};

        //get all studio names that published more than 1 movie
        for(int i = 0; i < studioDatabase.length; i++){
            if(studioDatabase[i].getNrFilme() > 1){
                System.out.println(studioDatabase[i].getNume());
            }
        }

        //
        for(int i =0; i < studioDatabase.length; i++){
            Film f = studioDatabase[i].getFilmByActor("actor cu 2 oscaruri");
            if(f != null){
                System.out.println(studioDatabase[i] + " contains actor");
            }
        }
    }//end-main
}//end-class
