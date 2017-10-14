package gatech.hotelme.Model;

class Room {
    private RoomType _roomType;
    private int _roomNumber;

    Room() {

    }

    Room(RoomType roomType, int roomNum, String hotelID, int reservationID) {
        _roomType = roomType;
        _roomNumber = roomNum;
    }

    String get_roomType() {
        return _roomType.toString();
    }

    int get_roomNumber() {
        return _roomNumber;
    }



    void set_roomType(String _roomType) {
        this._roomType = RoomType.valueOf(_roomType);
    }

    void set_roomNumber(int _roomNumber) {
        this._roomNumber = _roomNumber;
    }
}
