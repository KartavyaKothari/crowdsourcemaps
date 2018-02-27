package kartavya.com.crowdsourcemaps.Entity;

/**
 * Created by karta on 27-02-2018.
 */

public class User {

    private String UserEmailID;
    private String UserName;
    private int UserID;
    private String UserSex;
    private int UserAge;
    private String UserDOB;

    public User() {
    }

    public User(String userEmailID, String userName, int userID, String userSex, int userAge, String userDOB) {
        UserEmailID = userEmailID;
        UserName = userName;
        UserID = userID;
        UserSex = userSex;
        UserAge = userAge;
        UserDOB = userDOB;
    }

    public String getUserEmailID() {
        return UserEmailID;
    }

    public void setUserEmailID(String userEmailID) {
        UserEmailID = userEmailID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserSex() {
        return UserSex;
    }

    public void setUserSex(String userSex) {
        UserSex = userSex;
    }

    public int getUserAge() {
        return UserAge;
    }

    public void setUserAge(int userAge) {
        UserAge = userAge;
    }

    public String getUserDOB() {
        return UserDOB;
    }

    public void setUserDOB(String userDOB) {
        UserDOB = userDOB;
    }
}
