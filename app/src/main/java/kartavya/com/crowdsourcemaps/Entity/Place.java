package kartavya.com.crowdsourcemaps.Entity;

/**
 * Created by HP on 2/27/2018.
 */

public class Place {

    private String placeID;
    private String placeName;
    private String placeCoordinates;
    private String placeRating;
    private String placeTimings;

    public Place(String placeID, String placeName, String placeCoordinates, String placeRating, String placeTimings) {
        this.placeID = placeID;
        this.placeName = placeName;
        this.placeCoordinates = placeCoordinates;
        this.placeRating = placeRating;
        this.placeTimings = placeTimings;
    }

    public String getPlaceID() {
        return placeID;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceCoordinates() {
        return placeCoordinates;
    }

    public void setPlaceCoordinates(String placeCoordinates) {
        this.placeCoordinates = placeCoordinates;
    }

    public String getPlaceRating() {
        return placeRating;
    }

    public void setPlaceRating(String placeRating) {
        this.placeRating = placeRating;
    }

    public String getPlaceTimings() {
        return placeTimings;
    }

    public void setPlaceTimings(String placeTimings) {
        this.placeTimings = placeTimings;
    }
}
