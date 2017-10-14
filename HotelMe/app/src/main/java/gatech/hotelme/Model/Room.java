package gatech.hotelme.Model;

class Room {
    private RoomType _roomType;
    private int _roomNum;

    Room(RoomType roomType, int roomNum) {
        _roomType = roomType;
        _roomNum = roomNum;
    }

    RoomType get_roomType() {
        return _roomType;
    }

    void set_roomType(RoomType _roomType) {
        this._roomType = _roomType;
    }

    int get_roomNum() {
        return _roomNum;
    }

    void set_roomNum(int _roomNum) {
        this._roomNum = _roomNum;
    }

}
