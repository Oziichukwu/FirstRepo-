package myersBriggsQuestionaire;

public class Questionaire {

    Question [] questions = new Question[20];
    Question [] questionsToServe = new Question[20];

    public Questionaire() {
        this.questions = questions;
        this.questionsToServe = questionsToServe;
    }

    public Question[] getQuestions() {
        return questions;
    }
}
