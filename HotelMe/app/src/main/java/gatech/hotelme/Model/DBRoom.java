package gatech.hotelme.Model;


class DBRoom {
    private int _roomNumber;
    private String _hotelID;
    private String _roomType;
    private int _reservationID;


    public int get_roomNumber() {
        return _roomNumber;
    }

    public void set_roomNumber(int _roomNumber) {
        this._roomNumber = _roomNumber;
    }

    public String get_hotelID() {
        return _hotelID;
    }

    public void set_hotelID(String _hotelID) {
        this._hotelID = _hotelID;
    }

    public String get_roomType() {
        return _roomType;
    }

    public void set_roomType(String roomType) {
        this._roomType = roomType;
    }

    public int get_reservationID() {
        return _reservationID;
    }

    public void set_reservationID(int _reservationID) {
        this._reservationID = _reservationID;
    }

    DBRoom() {

    }

    public DBRoom(int _roomNumber, String _hotelID, String roomType,
                  int _reservationID) {
        this._roomNumber = _roomNumber;
        this._hotelID = _hotelID;
        this._roomType = roomType;
        this._reservationID = _reservationID;
    }
}
