package kartavya.com.crowdsourcemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import kartavya.com.crowdsourcemaps.Entity.Place;

public class AddPlace extends AppCompatActivity {
    EditText nameOfPlace;

    public void addPlace(View view){
        Intent intent = new Intent(this,Questions.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_place);

        Place newPlace = new Place();

        nameOfPlace = (EditText) findViewById(R.id.newPlaceName);

        newPlace.setPlaceName(nameOfPlace.getText().toString());

    }
}
