package gatech.hotelme.Controller;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import gatech.hotelme.R;

public class RoomServiceActivity extends AppCompatActivity {

    private ListView menuListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_service);
        menuListView = (ListView) findViewById(R.id.menu);
        String[] string_array = {"food item 1", "food item 2", "food item 3",
                "food item 4", "food item 5"};
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout
                .support_simple_spinner_dropdown_item, string_array);
        menuListView.setAdapter(adapter);
    }


    public void onSubmitOrderPressed(View view) {
        Toast.makeText(getApplicationContext(), "Order successfully submitted"
                        + " (functionality not ready set",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, HotelMainActivity.class);
        startActivity(intent);
    }





}
