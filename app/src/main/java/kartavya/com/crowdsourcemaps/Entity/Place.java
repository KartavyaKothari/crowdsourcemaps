package kartavya.com.crowdsourcemaps.Entity;

/**
 * Created by HP on 2/27/2018.
 */

public class Place {

    private String PlaceID;
    private String PlaceName;
    private String PlaceCoordinates;
    private String PlaceRating;

    public Place() {
    }

    public Place(String placeID, String placeName, String placeCoordinates, String placeRating) {
        PlaceID = placeID;
        PlaceName = placeName;
        PlaceCoordinates = placeCoordinates;
        PlaceRating = placeRating;
    }

    public String getPlaceID() {
        return PlaceID;
    }

    public void setPlaceID(String placeID) {
        PlaceID = placeID;
    }

    public String getPlaceName() {
        return PlaceName;
    }

    public void setPlaceName(String placeName) {
        PlaceName = placeName;
    }

    public String getPlaceCoordinates() {
        return PlaceCoordinates;
    }

    public void setPlaceCoordinates(String placeCoordinates) {
        PlaceCoordinates = placeCoordinates;
    }

    public String getPlaceRating() {
        return PlaceRating;
    }

    public void setPlaceRating(String placeRating) {
        PlaceRating = placeRating;
    }
}
