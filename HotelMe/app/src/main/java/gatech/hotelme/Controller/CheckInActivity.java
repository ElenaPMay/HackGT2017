package gatech.hotelme.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import gatech.hotelme.Model.Model;
import gatech.hotelme.R;

public class CheckInActivity extends AppCompatActivity {
    Model _model = Model.getInstance();
    TextView _hotelName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
        _hotelName = (TextView) findViewById(R.id.hotel_name);
        _hotelName.setText(_model.get_hotel_name());
    }

    public void onCheckInPressed(View view) {
        startActivity(new Intent(getBaseContext(),SuccessCheckInActivity.class));
    }
}
