package gatech.hotelme.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import gatech.hotelme.Model.Model;
import gatech.hotelme.R;

public class LoginActivity extends AppCompatActivity {
    private TextView _regCode;
    //private Button _loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        _regCode = (TextView) findViewById(R.id.reg_code);
        //_loginButton = (Button) findViewById(R.id.login_button);
    }

    public void onLoginPressed(View view) {
        Model model = Model.getInstance();
        String logID = _regCode.getText().toString();
        int validLogin = model.login(logID);

        if (validLogin == 0) {
            if (model.isCheckedIn()) {
                startActivity(new Intent(getBaseContext(),HotelMainActivity.class));
            }
            startActivity(new Intent(getBaseContext(),CheckInActivity.class));
        }
        Toast.makeText(getApplicationContext(), "Incorrect Login ID",
                Toast.LENGTH_SHORT).show();
    }
}
