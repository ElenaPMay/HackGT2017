package gatech.hotelme.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import gatech.hotelme.R;

public class RoomServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_service);
    }
    public void onSubmitOrderPressed(View view) {
        Toast.makeText(getApplicationContext(), "Order successfully submitted",
                Toast.LENGTH_SHORT).show();
    }



}
