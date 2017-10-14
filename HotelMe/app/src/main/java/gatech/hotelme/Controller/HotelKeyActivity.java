package gatech.hotelme.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gatech.hotelme.R;

public class HotelKeyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_key);
    }

    public void onHomePressed(View view) {
        startActivity(new Intent(getBaseContext(),HotelMainActivity.class));
        finish();
    }

}
