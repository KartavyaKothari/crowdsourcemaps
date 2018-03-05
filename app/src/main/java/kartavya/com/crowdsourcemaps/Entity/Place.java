package kartavya.com.crowdsourcemaps.Entity;

/**
 * Created by HP on 2/27/2018.
 */

public class Place {

    private String placeID;
    private String placeName;
    private String placeCoordinates;
    private String placeRating;

    public Place() {
    }

    public Place(String placeID, String placeName, String placeCoordinates, String placeRating) {
        this.placeID = placeID;
        this.placeName = placeName;
        this.placeCoordinates = placeCoordinates;
        this.placeRating = placeRating;
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
}
