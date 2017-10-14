package gatech.hotelme.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gatech.hotelme.R;

public class CheckInActivity extends AppCompatActivity {
    private Button _checkInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
    }

    public void onCheckInPressed(View view) {
        startActivity(new Intent(getBaseContext(),SuccessCheckInActivity.class));
    }
}
