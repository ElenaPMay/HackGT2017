package gatech.hotelme.Controller;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gatech.hotelme.R;

public class ServicesAndAmenities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_and_amenities);
    }

    public void onRoomServicePressed(View view) {
        startActivity(new Intent(getBaseContext(), RoomServiceActivity.class));
    }

    public void onHotelInfoPressed(View view) {
        startActivity(new Intent(getBaseContext(), HotelInfoActivity.class));
    }

    public void onGoogleMapsPressed(View view) {
        startActivity(new Intent(getBaseContext(), MapsActivity.class));
    }

    public void oncleaning_service_Pressed(View v) {
        dialContactPhone("7068251740");
    }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}
