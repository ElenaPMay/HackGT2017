package gatech.hotelme.Controller;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.net.URI;

import gatech.hotelme.R;

public class HotelMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_main);
    }

    public void onGetKeyPressed(View view) {
        startActivity(new Intent(getBaseContext(),HotelKeyActivity.class));
    }

    public void onCheckOutPressed(View view) {
        startActivity(new Intent(getBaseContext(),CheckOutActivity.class));
    }


    public void onServicesPressed(View view) {
        startActivity(new Intent(getBaseContext(), ServicesAndAmenities.class));
    }

    public void onResInfoPressed(View view){
        startActivity(new Intent(getBaseContext(), HotelReservationActivity.class));
    }

    public void oncallPressed(View v) {
        dialContactPhone("7068251740");
    }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}
