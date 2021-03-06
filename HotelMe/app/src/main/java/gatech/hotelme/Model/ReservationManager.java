package gatech.hotelme.Model;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class ReservationManager {
    private static final ReservationManager _instance = new
            ReservationManager();
    private static Reservation _currentReservation;
    private static final HotelManager _hotelManager = HotelManager.getInstance();
    private static final DateFormat _formatter = new SimpleDateFormat
            ("MM/dd/yyyy");
    private Map<Integer, Reservation> _reservations;
    private static DatabaseReference _databaseRef = FirebaseDatabase
            .getInstance().getReference();
    private static DatabaseReference _reservationDatabase = _databaseRef
            .child("Reservation");


    private ReservationManager() {
        _reservations = new HashMap<>();
    }

    static ReservationManager getInstance() {
        return _instance;
    }

    void setUp() {
        _reservationDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snap : dataSnapshot.getChildren()) {
                    String _loginID = String.valueOf(snap.child("_loginID")
                            .getValue());
                    String _ownerFirstName = (String)snap.child
                            ("_ownerFirstName").getValue();
                    String _ownerLastName = (String) snap.child
                            ("_ownerLastName").getValue();
                    String _creditCardNumber = String.valueOf(snap
                            .child("_ownerCreditCardNumber").getValue());
                    String _billAmount = String.valueOf(snap.child
                            ("_ownerBillAmount").getValue());
                    String month = String.valueOf(snap.child("_checkInDate")
                            .child("month").getValue());
                    if (month.length() == 1) {
                        month = "0" + month;
                    }
                    String day = String.valueOf(snap.child("_checkInDate")
                            .child("day").getValue());
                    if (day.length() == 1) {
                        day = "0" + day;
                    }
                    String year = String.valueOf(snap.child("_checkInDate")
                            .child("year").getValue());
                    while (year.length() < 4) {
                        year = "0" + year;
                    }
                    String _checkIn =  month + "/" + day + "/" + year;
                    month = String.valueOf(snap.child("_checkOutDate")
                            .child("month").getValue());
                    if (month.length() == 1) {
                        month = "0" + month;
                    }
                    day = String.valueOf(snap.child("_checkOutDate")
                            .child("day").getValue());
                    if (day.length() == 1) {
                        day = "0" + day;
                    }
                    year = String.valueOf(snap.child("_checkOutDate")
                            .child("year").getValue());
                    while (year.length() < 4) {
                        year = "0" + year;
                    }
                    String _checkOut =  month + "/" + day + "/" + year;;
                    String _hotel = (String) snap.child("_hotelID").getValue();
                    String _roomType = (String) snap.child("_room").child(
                            "_roomType").getValue();
                    String _roomNumber = String.valueOf(snap.child("_room").child(
                            "_roomNumber").getValue());
                    addReservation(parse_string(_loginID, _ownerFirstName,
                            _ownerLastName, _creditCardNumber, _billAmount,
                            _checkIn, _checkOut, _hotel, _roomType, _roomNumber));
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private static Reservation parse_string(String loginID, String
            ownerFirstName, String ownerLastName, String stringCreditCardNum, String stringBill,
            String stringCheckInDate, String stringCheckOutDate, String
            stringHotel, String roomType, String roomNum) {
        int _loginID = Integer.valueOf(loginID);
        int creditCardNum = Integer.valueOf(stringCreditCardNum);
        double bill = Double.valueOf(stringBill);
        Date checkInDate =  null;
        Date checkOutDate = null;
        try {
            checkInDate = _formatter.parse(stringCheckInDate);
            checkOutDate = _formatter.parse(stringCheckOutDate);
        } catch (ParseException e) {
            e.printStackTrace();
            System.exit(0);
        }
        Room room = new Room(RoomType.valueOf(roomType), Integer.valueOf(roomNum));
        return new Reservation(_loginID, ownerFirstName, ownerLastName,
                creditCardNum, bill, checkInDate, checkOutDate, stringHotel, room);
    }

    static void set_currentReservation(String loginID, String ownerFirstName,
                                       String
            ownerLastName, String stringCreditCardNum, String stringBill,
            String stringCheckInDate, String stringCheckOutDate, String
            stringHotel, String roomType, String roomNum) {
        ReservationManager._currentReservation = parse_string
                (loginID, ownerFirstName,
                ownerLastName, stringCreditCardNum, stringBill,
                stringCheckInDate, stringCheckOutDate, stringHotel, roomType,
                roomNum);
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

    int get_room_num() {
        return _currentReservation.get_room().get_roomNumber();
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

    void set_room(String _roomType, String _roomNum) {
        Room _room = new Room(RoomType.valueOf(_roomType), Integer.valueOf
                (_roomNum));
        _currentReservation.set_room(_room);
    }

    void addReservation(String loginID, String ownerFirstName, String
            ownerLastName, String stringCreditCardNum, String stringBill,
            String stringCheckInDate, String stringCheckOutDate, String
            stringHotel, String roomType, String roomNum) {
        addReservation(parse_string(loginID, ownerFirstName, ownerLastName,
                stringCreditCardNum, stringBill, stringCheckInDate,
                stringCheckOutDate, stringHotel, roomType, roomNum));
    }

    void addReservation(Reservation reservation) {
        _reservations.put(reservation.get_loginID(), reservation);
        Map<String, Object> update = new HashMap<>();
        update.put(String.valueOf(reservation.get_loginID()), reservation);
        _reservationDatabase.updateChildren(update);
    }

    int login(String _loginID) {
        int loginID;
        try {
            loginID = Integer.valueOf(_loginID);
        } catch (Exception e) {
            return 1;
        }
        if (_reservations.keySet().contains(loginID)) {
            _currentReservation = _reservations.get(loginID);
            return 0;
        } else {
            return 1;
        }
    }

    void set_checkedIn(boolean checkedIn) {
        _currentReservation.set_checkedIn(checkedIn);
    }

    String get_hotelName() {
        return _hotelManager.get_name();
    }
}
