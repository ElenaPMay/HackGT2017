package gatech.hotelme.Model;

import java.util.Date;

public class Model {
    private static final Model instance = new Model();
    private final ReservationManager _reservationManager;
    private final HotelManager _hotelManager;

    private Model() {
        _reservationManager = ReservationManager.getInstance();
        _hotelManager = HotelManager.getInstance();
        setUp();
    }

    private void setUp() {
        _reservationManager.setUp();
        _hotelManager.setUp();
        _hotelManager.addHotel("hotelid", "hotelnam");
        _reservationManager.addReservation(new Reservation());
    }

    public static Model getInstance() {
        return instance;
    }

    public int get_loginNum() {
        return _reservationManager.get_loginNum();
    }

    public String get_ownerFirstName() {
        return _reservationManager.get_ownerFirstName();
    }

    public String get_ownerLastName() {
        return _reservationManager.get_ownerLastName();
    }

    public int get_creditCardNum() {
        return _reservationManager.get_creditCardNum();
    }

    public double get_bill() {
        return _reservationManager.get_bill();
    }

    public Date get_checkInDate() {
        return _reservationManager.get_checkInDate();
    }

    public Date get_checkOutDate() {
        return _reservationManager.get_checkOutDate();
    }

    public Hotel get_hotel() {
        return _reservationManager.get_hotel();
    }

    public Room get_room() {
        return _reservationManager.get_room();
    }

    public void set_ownerFirstName(String _ownerFirstName) {
        _reservationManager.set_ownerFirstName(_ownerFirstName);
    }

    public void set_ownerLastName(String _ownerLastName) {
        _reservationManager. set_ownerLastName(_ownerLastName);
    }

    public void set_creditCardNum(String _stringCreditCardNum) {
        _reservationManager.set_creditCardNum(_stringCreditCardNum);
    }

    public void set_checkInDate(String _stringCheckInDate) {
        _reservationManager.set_checkInDate(_stringCheckInDate);
    }

    public void set_checkOutDate(String _stringCheckOutDate) {
        _reservationManager.set_checkOutDate(_stringCheckOutDate);
    }

    public void set_hotel(String _stringHotel) {
        _reservationManager.set_hotel(_stringHotel);
    }

    public void set_room(String _roomType, String _roomNum) {
        _reservationManager.set_room(_roomType, _roomNum);
    }

    public int login(String _loginID) {
        if (_reservationManager.login(_loginID) == 1) {
            _hotelManager.login(_loginID);
        }
        return 0;
    }

    public boolean isCheckedIn() {
        return false;
    }

    public void addHotel(String hotelID, String name) {
        _hotelManager.addHotel(hotelID, name);
    }
}
