package kartavya.com.crowdsourcemaps.Entity;

/**
 * Created by karta on 27-02-2018.
 */

public class UserInApp {

    private String UserLastKnownLocation;
    private int UserInAppID;
    private int UserRank;

    public UserInApp() {
    }

    public UserInApp(String userLastKnownLocation, int userInAppID, int userRank) {
        UserLastKnownLocation = userLastKnownLocation;
        UserInAppID = userInAppID;
        UserRank = userRank;
    }

    public String getUserLastKnownLocation() {
        return UserLastKnownLocation;
    }

    public void setUserLastKnownLocation(String userLastKnownLocation) {
        UserLastKnownLocation = userLastKnownLocation;
    }

    public int getUserInAppID() {
        return UserInAppID;
    }

    public void setUserInAppID(int userInAppID) {
        UserInAppID = userInAppID;
    }

    public int getUserRank() {
        return UserRank;
    }

    public void setUserRank(int userRank) {
        UserRank = userRank;
    }
}
