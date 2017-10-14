package gatech.hotelme.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gatech.hotelme.R;

public class SuccessCheckInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_check_in);
    }

    public void onHomePressed(View view) {
        startActivity(new Intent(getBaseContext(),HotelMainActivity.class));
    }

    public void onGetKeyPressed(View view) {
        startActivity(new Intent(getBaseContext(), HotelKeyActivity.class));
    }
}
