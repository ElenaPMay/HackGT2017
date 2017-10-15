package gatech.hotelme.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Model {
    private static final Model instance = new Model();
    private static final DateFormat _formatter = new SimpleDateFormat
            ("MM/dd/yy");
    private final ReservationManager _reservationManager;
    private final HotelManager _hotelManager;

    private Model() {
        _reservationManager = ReservationManager.getInstance();
        _hotelManager = HotelManager.getInstance();
        setUp();
    }

    private void setUp() {
        _hotelManager.addHotel("hotelid", "Marriott");
        _reservationManager.addReservation("12392", "first", "last",
                "23234329", "23.0",
                "10/03/2017", "10/04/2017", "hotelid", "QUEEN", "17");
        _reservationManager.setUp();
        _hotelManager.setUp();
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

    public String get_checkInDate() {
        Date dateFormat =  _reservationManager.get_checkInDate();
        String dateString = _formatter.format(dateFormat).trim();
        return dateString;
    }

    public String get_checkOutDate() {
        Date dateFormat = _reservationManager.get_checkOutDate();
        String dateString = _formatter.format(dateFormat);
        return dateString;
    }

    public String get_hotel_name() {
        return _hotelManager.get_name();
    }

    public String get_reservation_number() {
        int curr = _reservationManager.get_loginNum();
        String num = String.valueOf(curr);
        return num;
    }

    public String get_room_num() {
        return String.valueOf(_reservationManager.get_room_num());
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

    public void set_room(String _roomType, String _roomNum) {
        _reservationManager.set_room(_roomType, _roomNum);
    }

    public int login(String _loginID) {
        if (_reservationManager.login(_loginID) == 0) {
            _hotelManager.login(_loginID);
            return 0;
        }
        return 1;
    }

    public boolean isCheckedIn() {
        return _reservationManager.is_checkedIn();
    }

    public void addHotel(String hotelID, String name) {
        _hotelManager.addHotel(hotelID, name);
    }

    public void set_checkedIn(boolean checkedIn) {
        _reservationManager.set_checkedIn(checkedIn);
    }
}
