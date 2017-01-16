package burgerQuizz;

import java.util.List;

/**
 * Created by capetrel on 29/04/2016.
 */
public class Question {

    private String question;
    private List<Reponse> responses;
    private int bonneReponse;

    public Question(String question, List<Reponse> responses, int bonneReponse) {
        this.question = question;
        this.responses = responses;
        this.bonneReponse = bonneReponse;
    }

    public String getQuestion() {
        return question;
    }


    public List<Reponse> getResponses() {
        return responses;
    }


    public int getBonneReponse() {
        return bonneReponse;
    }
}
