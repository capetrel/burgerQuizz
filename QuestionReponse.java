package burgerQuizz;

import java.util.HashMap;

/**
 * Created by capetrel on 29/04/2016.
 */
public class QuestionReponse {
    private HashMap<String, String> tabQuestionreponse = new HashMap <String, String>();


    public void ajoutQuestionReponseDanstab (String question, String reponse) {
        tabQuestionreponse.put(question, reponse);
    }

    public void afficherQuestionReponse (){

    }

    public String afficherValueReponse (String question1) {
        return tabQuestionreponse.get(question1);
    }


    public int nbQuestionreponse (){ return tabQuestionreponse.size(); }

    public String[] tableauMauvaiseReponse(String reponse1, String reponse2, String reponse3) {
        return null;
    }

    public HashMap<String, String> getTabQuestionreponse() {
        return tabQuestionreponse;
    }

    public void setTabQuestionreponse(HashMap<String, String> tabQuestionreponse) {
        this.tabQuestionreponse = tabQuestionreponse;
    }

}
