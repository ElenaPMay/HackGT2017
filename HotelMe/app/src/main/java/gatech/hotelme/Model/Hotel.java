package gatech.hotelme.Model;

import java.util.LinkedList;
import java.util.List;

class Hotel {
    private static int hotelCount = 0;
    private int _id;
    private String _name;
    private List<Reservation> _rooms;
    private List<Reservation> _reservations;

    Hotel(String name) {
        _id = hotelCount++;
        _name = name;
        _rooms = new LinkedList<>();
        _reservations = new LinkedList<>();
    }

    int get_id() {
        return _id;
    }

    String get_name() {
        return _name;
    }

    List<Reservation> get_rooms() {
        return _rooms;
    }

    List<Reservation> get_reservations() {
        return _reservations;
    }

    void set_name(String _name) {
        this._name = _name;
    }
}
