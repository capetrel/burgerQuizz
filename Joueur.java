package burgerQuizz;

/**
 * Created by capetrel on 29/04/2016.
 */
public class Joueur {
    private String nom;
    private String score;

    public Joueur(String nom, String score) {
        this.nom = nom;
        this.score = score;
    }

    public void ajouterUnJoueur () {

    }
    public void modifierScore (){

    }

    @Override
    public String toString() {
        return "le joueur "+ nom +
                " a un score de "+ score +" .\n";
    }

    public String getNom() {
        return nom;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
