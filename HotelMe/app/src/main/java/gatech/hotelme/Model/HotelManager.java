package gatech.hotelme.Model;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HotelManager {
    private static final HotelManager _instance = new
            HotelManager();
    private static Hotel _currentHotel;
    private static Map<String, Hotel> _hotels;
    private static DatabaseReference _databaseRef = FirebaseDatabase
            .getInstance().getReference();
    private static DatabaseReference _testDatabse = _databaseRef.child("test");


    private HotelManager() {
        _hotels = new HashMap<>();
    }

    static HotelManager getInstance() {
        return _instance;
    }

    static void set_currentHotel(String hotelID, String name) {
        HotelManager._currentHotel = new Hotel(hotelID, name);
    }

    String get_id() {
        return _currentHotel.get_hotelID();
    }

    String get_name() {
        return _currentHotel.get_name();
    }

    List<Reservation> get_rooms() {
        return _currentHotel.get_rooms();
    }

    List<Reservation> get_reservations() {
        return _currentHotel.get_reservations();
    }

    void set_name(String _name) {
        _currentHotel.set_name(_name);
    }

    //TODO
    Hotel getHotel(String name) {
        return null;
    }

    //TODO
    Room getRoom(String roomType, String roomNum) {
        return null;
    }

}
