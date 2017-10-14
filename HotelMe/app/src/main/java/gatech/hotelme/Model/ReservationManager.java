package gatech.hotelme.Model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

class ReservationManager {
    private static final ReservationManager _instance = new
            ReservationManager();
    private static Reservation _currentReservation;
    private static final HotelManager _hotelManager = HotelManager.getInstance();
    private static final DateFormat _formatter = new SimpleDateFormat
            ("MM/dd/yyyy");
    private Map<Integer, Reservation> _reservations;


    private ReservationManager() {

    }

    static ReservationManager getInstance() {
        return _instance;
    }

    static void set_currentReservation(String ownerFirstName, String
            ownerLastName, String stringCreditCardNum, String stringBill,
            String stringCheckInDate, String stringCheckOutDate, String
            stringHotel, String roomType, String roomNum) {
        int creditCardNum = Integer.valueOf(stringCreditCardNum);
        int bill = Integer.valueOf(stringBill);
        Date checkInDate =  null;
        Date checkOutDate = null;
        try {
            checkInDate = _formatter.parse(stringCheckInDate);
            checkOutDate = _formatter.parse(stringCheckOutDate);
        } catch (ParseException e) {
            e.printStackTrace();
            System.exit(0);
        }
        Hotel hotel = _hotelManager.getHotel(stringHotel);
        Room room = _hotelManager.getRoom(roomType, roomNum);
        ReservationManager._currentReservation = new Reservation
                (ownerFirstName, ownerLastName, creditCardNum, bill,
                checkInDate, checkOutDate, hotel, room);
    }

    int get_loginNum() {
        return _currentReservation.get_loginID();
    }

    String get_ownerFirstName() {
        return _currentReservation.get_ownerFirstName();
    }

    String get_ownerLastName() {
        return _currentReservation.get_ownerLastName();
    }

    int get_creditCardNum() {
        return _currentReservation.get_ownerCreditCardNumber();
    }

    double get_bill() {
        return _currentReservation.get_ownerBillAmount();
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

    boolean is_checkedIn() {
        return _currentReservation.is_checkedIn();
    }

    void set_ownerFirstName(String _ownerFirstName) {
        _currentReservation.set_ownerFirstName(_ownerFirstName);
    }

    void set_ownerLastName(String _ownerLastName) {
        _currentReservation. set_ownerLastName(_ownerLastName);
    }

    void set_creditCardNum(String _stringCreditCardNum) {
        int _creditCardNum = Integer.valueOf(_stringCreditCardNum);
        _currentReservation.set_ownerCreditCardNumber(_creditCardNum);
    }

    void set_checkInDate(String _stringCheckInDate) {
        Date _checkInDate = null;
        try {
            _checkInDate = _formatter.parse(_stringCheckInDate);
        }  catch (ParseException e) {
            e.printStackTrace();
            System.exit(0);
        }
        _currentReservation.set_checkInDate(_checkInDate);
    }

    void set_checkOutDate(String _stringCheckOutDate) {
        Date _checkOutDate = null;
        try {
            _checkOutDate = _formatter.parse(_stringCheckOutDate);
        }  catch (ParseException e) {
            e.printStackTrace();
            System.exit(0);
        }
        _currentReservation.set_checkOutDate(_checkOutDate);
    }

    void set_hotel(String _stringHotel) {
        Hotel _hotel = _hotelManager.getHotel(_stringHotel);
        _currentReservation.set_hotel(_hotel);
    }

    void set_room(String _roomType, String _roomNum) {
        Room _room = _hotelManager.getRoom(_roomType, _roomNum);
        _currentReservation.set_room(_room);
    }
}
