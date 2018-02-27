package kartavya.com.crowdsourcemaps.Entity;

/**
 * Created by karta on 27-02-2018.
 */

public class RandQuestions {

    private String AnswerID;
    private String PlaceID;
    private int NoOfTimesAnswered;
    private String QuestionID;

    public RandQuestions() {
    }

    public String getAnswerID() {
        return AnswerID;
    }

    public void setAnswerID(String answerID) {
        AnswerID = answerID;
    }

    public String getPlaceID() {
        return PlaceID;
    }

    public void setPlaceID(String placeID) {
        PlaceID = placeID;
    }

    public int getNoOfTimesAnswered() {
        return NoOfTimesAnswered;
    }

    public void setNoOfTimesAnswered(int noOfTimesAnswered) {
        NoOfTimesAnswered = noOfTimesAnswered;
    }

    public String getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(String questionID) {
        QuestionID = questionID;
    }
}
