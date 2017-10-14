package gatech.hotelme.Model;

import java.util.Date;

class ReservationManager {
    private static final ReservationManager _instance = new
            ReservationManager();
    private static Reservation _currentReservation;

    private ReservationManager() {

    }

    static ReservationManager getInstance() {
        return _instance;
    }

    static void set_currentReservation(String ownerFirstName, String
            ownerLastName, int creditCardNum, int bill, Date checkInDate,
            Date checkOutDate, Hotel hotel, Room room) {
        ReservationManager._currentReservation = new Reservation
                (ownerFirstName, ownerLastName, creditCardNum, bill,
                checkInDate, checkOutDate, hotel, room);
    }

    int get_loginNum() {
        return _currentReservation.get_loginNum();
    }

    String get_ownerFirstName() {
        return _currentReservation.get_ownerFirstName();
    }

    String get_ownerLastName() {
        return _currentReservation.get_ownerLastName();
    }

    int get_creditCardNum() {
        return _currentReservation.get_creditCardNum();
    }

    int get_bill() {
        return _currentReservation.get_bill();
    }

    Date get_checkInDate() {
        return _currentReservation.get_checkInDate();
    }

    Date get_checkOutDate() {
        return _currentReservation.get_checkOutDate();
    }

    Hotel get_hotel() {
        return _currentReservation.get_hotel();
    }

    Room get_room() {
        return _currentReservation.get_room();
    }

    void set_ownerFirstName(String _ownerFirstName) {
        _currentReservation.set_ownerFirstName(_ownerFirstName);
    }

    void set_ownerLastName(String _ownerLastName) {
        _currentReservation. set_ownerLastName(_ownerLastName);
    }

    void set_creditCardNum(int _creditCardNum) {
        _currentReservation.set_creditCardNum(_creditCardNum);
    }

    void set_bill(int _bill) {
        _currentReservation.set_bill(_bill);
    }

    void set_checkInDate(Date _checkInDate) {
        _currentReservation.set_checkInDate(_checkInDate);
    }

    void set_checkOutDate(Date _checkOutDate) {
        _currentReservation.set_checkOutDate(_checkOutDate);
    }

    void set_hotel(Hotel _hotel) {
        _currentReservation.set_hotel(_hotel);
    }

    void set_room(Room _room) {
        _currentReservation.set_room(_room);
    }

}
