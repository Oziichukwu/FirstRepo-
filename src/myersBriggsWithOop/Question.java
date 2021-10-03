package myersBriggsWithOop;

public class Question {
    private String questionValue;
    private char response;

    public Question(String questionValue, char response) {
        this.questionValue = questionValue;
        this.response = response;
    }
    public String getQuestionValue() {
        return questionValue;
    }

    public char getResponse() {
        return response;
    }

    public void setResponse(char response) {
        this.response = response;
    }

}
