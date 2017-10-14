package gatech.hotelme.Model;

import java.util.LinkedList;
import java.util.List;

class Hotel {
    private String _hotelID;
    private String _name;
    private List<Room> _rooms;
    private List<Reservation> _reservations;

    Hotel() {
        _rooms = new LinkedList<>();
        _reservations = new LinkedList<>();
    }

    Hotel(String hotelID, String name) {
        this();
        _hotelID = hotelID;
        _name = name;
    }

    String get_hotelID() {
        return _hotelID;
    }

    String get_name() {
        return _name;
    }

    List<Room> get_rooms() {
        return _rooms;
    }

    List<Reservation> get_reservations() {
        return _reservations;
    }

    void set_hotelID(String _hotelID) {
        this._hotelID = _hotelID;
    }

    void set_name(String _name) {
        this._name = _name;
    }

    public void set_rooms(List<Room> _rooms) {
        this._rooms = _rooms;
    }

    public void set_reservations(List<Reservation> _reservations) {
        this._reservations = _reservations;
    }
}
