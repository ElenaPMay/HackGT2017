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
    private static DatabaseReference _hotelDatabase = _databaseRef.child
            ("Hotel");

    private HotelManager() {
        _hotels = new HashMap<>();
    }

    static HotelManager getInstance() {
        return _instance;
    }

    void setUp() {
        _hotelDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snap: dataSnapshot.getChildren()) {
                    String hotelID = (String) snap.child("_hotelID").getValue();
                    String name = (String) snap.child("_name").getValue();
                    addHotel(hotelID, name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
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

    List<Room> get_rooms() {
        return _currentHotel.get_rooms();
    }

    List<Reservation> get_reservations() {
        return _currentHotel.get_reservations();
    }

    void set_name(String _name) {
        _currentHotel.set_name(_name);
    }



    Hotel getHotel(String name) {
        return _hotels.get(name);
    }

    Room getRoom(String hotelName, String roomType, String roomNum) {
        List<Room> rooms = getHotel(hotelName).get_rooms();
        for (Room room: rooms) {
            if (room.get_roomType().toString().equals(roomType) && String
                    .valueOf(room.get_roomNumber()).equals(roomNum)) {
                return room;
            }
        }
        return null;
    }

    void addHotel(String hotelID, String name) {
        Hotel hotel = new Hotel(hotelID, name);
        _hotels.put(hotelID, hotel);
        Map<String, Object> update = new HashMap<>();
        update.put(hotelID, hotel);
        _hotelDatabase.updateChildren(update);
    }
}
