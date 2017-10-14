package gatech.hotelme.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gatech.hotelme.R;

public class CheckOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
    }

    public void onCompleteCheckoutPressed(View view) {
        startActivity(new Intent(getBaseContext(),CheckOutSuccess.class));
    }
}
