package lab2.challenge2;

public class Actor {
    private String nume;
    private int varsta;
    private Premiu[] premii;

    public Actor(String nume, int varsta, Premiu[] premii){
        this.nume =nume;
        this.premii = premii;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public Premiu[] getPremii() {
        return premii;
    }
}
