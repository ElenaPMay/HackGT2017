package gatech.hotelme.Model;

import java.util.Date;

class Reservation {
    private static int reservationCount = 0;
    private int _loginNum;
    private String _ownerFirstName;
    private String _ownerLastName;
    private int _creditCardNum;
    private int _bill;
    private Date _checkInDate;
    private Date _checkOutDate;
    private Hotel _hotel;
    private Room _room;

    Reservation(String ownerFirstName, String ownerLastName, int
            creditCardNum, int bill, Date checkInDate, Date checkOutDate,
            Hotel hotel, Room room) {
        _loginNum = reservationCount++;
        _ownerFirstName = ownerFirstName;
        _ownerLastName = ownerLastName;
        _creditCardNum = creditCardNum;
        _bill = bill;
        _checkInDate = checkInDate;
        _checkOutDate = checkOutDate;
        _hotel = hotel;
        _room = room;
    }

    int get_loginNum() {
        return _loginNum;
    }

    String get_ownerFirstName() {
        return _ownerFirstName;
    }

    String get_ownerLastName() {
        return _ownerLastName;
    }

    int get_creditCardNum() {
        return _creditCardNum;
    }

    int get_bill() {
        return _bill;
    }

    Date get_checkInDate() {
        return _checkInDate;
    }

    Date get_checkOutDate() {
        return _checkOutDate;
    }

    Hotel get_hotel() {
        return _hotel;
    }

    Room get_room() {
        return _room;
    }

    void set_ownerFirstName(String _ownerFirstName) {
        this._ownerFirstName = _ownerFirstName;
    }

    void set_ownerLastName(String _ownerLastName) {
        this._ownerLastName = _ownerLastName;
    }

    void set_creditCardNum(int _creditCardNum) {
        this._creditCardNum = _creditCardNum;
    }

    void set_bill(int _bill) {
        this._bill = _bill;
    }

    void set_checkInDate(Date _checkInDate) {
        this._checkInDate = _checkInDate;
    }

    void set_checkOutDate(Date _checkOutDate) {
        this._checkOutDate = _checkOutDate;
    }

    void set_hotel(Hotel _hotel) {
        this._hotel = _hotel;
    }

    void set_room(Room _room) {
        this._room = _room;
    }
}
