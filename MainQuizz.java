package burgerQuizz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by capetrel on 29/04/2016.
 */
public class MainQuizz {

    static QuestionReponse burgerQuizz = new QuestionReponse();

    // Enregistrement des questions
    public static void saisieQuestionreponse(){

    }

    // enregistrement du joueur
    public static void enregistrementJoueur (){

    }

    // Lancement de la partie
    public static void main(String[] args) {

        List<Reponse> reponses = new ArrayList<>();
        reponses.add(new Reponse("quatre"));
        reponses.add(new Reponse("cinq"));
        reponses.add(new Reponse("deux"));

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("nombre de doigts d'une main ?", reponses, 1));



        burgerQuizz.ajoutQuestionReponseDanstab("nombre de doigts d'une main ?", "cinq");
        burgerQuizz.tableauMauvaiseReponse("trois","quatre","six");
        System.out.println(burgerQuizz.afficherValueReponse("nombre de doigts d'une main ?"));

        System.out.println(burgerQuizz.nbQuestionreponse());
    }

}
