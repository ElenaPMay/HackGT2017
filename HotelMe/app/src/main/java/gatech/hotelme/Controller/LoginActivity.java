package gatech.hotelme.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import gatech.hotelme.Model.Model;
import gatech.hotelme.R;

public class LoginActivity extends AppCompatActivity {
    private Model _model = Model.getInstance();
    private TextView _regCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        _regCode = (TextView) findViewById(R.id.reg_code);
    }

    public void onLoginPressed(View view) {
        String logID = _regCode.getText().toString();
        int validLogin = _model.login(logID);

        if (validLogin == 0) {
            if (_model.isCheckedIn()) {
                startActivity(new Intent(getBaseContext(),HotelMainActivity.class));
            } else {
                Intent intent = new Intent(getBaseContext(), CheckInActivity
                        .class);
                intent.putExtra("flag", true);
                startActivity(intent);
            }
        } else {
            Toast.makeText(getApplicationContext(), "Incorrect Login ID",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
