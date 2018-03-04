package kartavya.com.crowdsourcemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NearbyPlaces extends AppCompatActivity {

    public void placeDetails(View view){
        Intent intent = new Intent(this,PlaceDetails.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_places);
    }
}
