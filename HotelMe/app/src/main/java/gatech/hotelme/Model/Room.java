package gatech.hotelme.Model;

class Room {
    private RoomType _roomType;
    private int _roomNumber;
    private String _hotelID;
    private int _reservationID;

    Room() {

    }

    Room(RoomType roomType, int roomNum, String hotelID, int reservationID) {
        _roomType = roomType;
        _roomNumber = roomNum;
        _hotelID = hotelID;
        _reservationID = reservationID;
    }

    String get_roomType() {
        return _roomType.toString();
    }

    int get_roomNumber() {
        return _roomNumber;
    }

    String get_hotelID() {
        return _hotelID;
    }

    int get_reservationID() {
        return _reservationID;
    }

    void set_roomType(String _roomType) {
        this._roomType = RoomType.valueOf(_roomType);
    }

    void set_roomNumber(int _roomNumber) {
        this._roomNumber = _roomNumber;
    }

    void set_hotelID(String _hotelID) {
        this._hotelID = _hotelID;
    }

    void set_reservationID(int _reservationID) {
        this._reservationID = _reservationID;
    }

}
