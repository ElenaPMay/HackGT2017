package gatech.hotelme.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import gatech.hotelme.Model.Model;
import gatech.hotelme.R;

public class HotelKeyActivity extends AppCompatActivity {

    private TextView roomNum;
    private TextView userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_key);

        Model model = Model.getInstance();
        roomNum = (TextView) findViewById(R.id.room_number);
        roomNum.setText(model.get_room_num());

        userName = (TextView) findViewById(R.id.user_name);
        userName.setText(model.get_ownerFirstName());

    }

    public void onHomePressed(View view) {
        startActivity(new Intent(getBaseContext(),HotelMainActivity.class));
    }

}
