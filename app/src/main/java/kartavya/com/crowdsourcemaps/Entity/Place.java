package kartavya.com.crowdsourcemaps.Entity;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by HP on 2/27/2018.
 */

public class Place{
    private String placeName;
    private LatLng placeCoordinates;
    private int placeRating;
    private ArrayList<String> imageURIs;
    private String timings;
    private String placeReview;

    public Place() {
    }

    public Place(String placeName, LatLng placeCoordinates, ArrayList<String> imageURI, String timings, int placeRating, String placeReview) {
        this.placeName = placeName;
        this.placeCoordinates = placeCoordinates;
        imageURIs = imageURI;
        this.timings = timings;
        this.placeRating = placeRating;
        this.placeReview = placeReview;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public LatLng getPlaceCoordinates() {
        return placeCoordinates;
    }

    public void setPlaceCoordinates(LatLng placeCoordinates) {
        this.placeCoordinates = placeCoordinates;
    }

    public ArrayList<String> getImageURIs(int index) {
        return imageURIs;
    }

    public void setImageURIs(ArrayList<String> imageURIs) {
        this.imageURIs = imageURIs;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public int getPlaceRating() {
        return placeRating;
    }

    public void setPlaceRating(int placeRating) {
        this.placeRating = placeRating;
    }

    public String getPlaceReview() {
        return placeReview;
    }

    public void setPlaceReview(String placeReview) {
        this.placeReview = placeReview;
    }
}
