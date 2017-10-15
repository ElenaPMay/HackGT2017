package gatech.hotelme.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import gatech.hotelme.Model.Model;
import gatech.hotelme.R;

public class CheckInActivity extends AppCompatActivity {
    Model _model = Model.getInstance();
    TextView _hotelName;
    TextView _checkInDate;
    TextView _checkOutDate;
    TextView _roomInfo;
    TextView _reservationNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
        Bundle bundle = getIntent().getExtras();
        if (bundle == null) {
            Button button = (Button) findViewById(R.id.checkInButton);
            button.setEnabled(false);
            button.setVisibility(View.GONE);
        } else {
            Button button = (Button) findViewById(R.id.checkInButton);
            button.setEnabled(true);
            button.setVisibility(View.VISIBLE);
        }
        _hotelName = (TextView) findViewById(R.id.hotel_name);
        _hotelName.setText(_model.get_hotel_name());

        _checkInDate = (TextView) findViewById(R.id.check_in_date_text);
        _checkInDate.setText(_checkInDate.getText().toString() + "     " +
                _model
                .get_checkInDate());

        _checkOutDate = (TextView) findViewById(R.id.check_out_date_text);
        _checkOutDate.setText(_checkOutDate.getText().toString() + "     " + _model
                .get_checkOutDate());

        _reservationNumber = (TextView) findViewById(R.id.res_num);
        _reservationNumber.setText(_reservationNumber.getText().toString() + "     " +
                _model
                .get_reservation_number());

    }

    public void onCheckInPressed(View view) {
        startActivity(new Intent(getBaseContext(),SuccessCheckInActivity.class));
    }
}
