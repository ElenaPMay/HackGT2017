package gatech.hotelme.Model;

import java.util.Date;

class Reservation {
    private int _loginID;
    private String _ownerFirstName;
    private String _ownerLastName;
    private int _ownerCreditCardNumber;
    private double _ownerBillAmount;
    private Date _checkInDate;
    private Date _checkOutDate;
    private String _hotelID;

    public String get_hotelID() {
        return _hotelID;
    }

    public void set_hotelID(String _hotelID) {
        this._hotelID = _hotelID;
    }

    private Room _room;
    private boolean _checkedIn;
    private static final HotelManager _hotelManager = HotelManager
            .getInstance();

    Reservation() {

    }

    Reservation(int reservationCount, String ownerFirstName, String
            ownerLastName, int
            creditCardNum, double bill, Date checkInDate, Date checkOutDate,
            String hotelID, Room room) {
        _loginID = reservationCount;
        _ownerFirstName = ownerFirstName;
        _ownerLastName = ownerLastName;
        _ownerCreditCardNumber = creditCardNum;
        _ownerBillAmount = bill;
        _checkInDate = checkInDate;
        _checkOutDate = checkOutDate;
        _hotelID = hotelID;
        _hotelManager.addReservation(hotelID, this);
        _room = room;
    }

    int get_loginID() {
        return _loginID;
    }

    String get_ownerFirstName() {
        return _ownerFirstName;
    }

    String get_ownerLastName() {
        return _ownerLastName;
    }

    int get_ownerCreditCardNumber() {
        return _ownerCreditCardNumber;
    }

    double get_ownerBillAmount() {
        return _ownerBillAmount;
    }

    Date get_checkInDate() {
        return _checkInDate;
    }

    Date get_checkOutDate() {
        return _checkOutDate;
    }

    Room get_room() {
        return _room;
    }

    boolean is_checkedIn() {
        return _checkedIn;
    }

    void set_loginID(int _loginID) {
        this._loginID = _loginID;
    }

    void set_ownerFirstName(String _ownerFirstName) {
        this._ownerFirstName = _ownerFirstName;
    }

    void set_ownerLastName(String _ownerLastName) {
        this._ownerLastName = _ownerLastName;
    }

    void set_ownerCreditCardNumber(int _ownerCreditCardNumber) {
        this._ownerCreditCardNumber = _ownerCreditCardNumber;
    }

    void set_ownerBillAmount(double _ownerBillAmount) {
        this._ownerBillAmount = _ownerBillAmount;
    }

    void set_checkInDate(Date _checkInDate) {
        this._checkInDate = _checkInDate;
    }

    void set_checkOutDate(Date _checkOutDate) {
        this._checkOutDate = _checkOutDate;
    }

    void set_room(Room _room) {
        this._room = _room;
    }

    void set_checkedIn(boolean checkedIn) {
        _checkedIn = checkedIn;
    }
}
