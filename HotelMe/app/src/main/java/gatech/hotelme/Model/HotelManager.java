package gatech.hotelme.Model;

import java.util.List;

class HotelManager {
    private static final HotelManager _instance = new
            HotelManager();
    private static Hotel _currentHotel;

    private HotelManager() {

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
