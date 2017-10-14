package gatech.hotelme.Model;

class Room {
    private RoomType _roomType;
    private int _roomNum;

    public RoomType get_roomType() {
        return _roomType;
    }

    public void set_roomType(RoomType _roomType) {
        this._roomType = _roomType;
    }

    public int get_roomNum() {
        return _roomNum;
    }

    public void set_roomNum(int _roomNum) {
        this._roomNum = _roomNum;
    }

    Room(RoomType roomType, int roomNum) {
        _roomType = roomType;
        _roomNum = roomNum;
    }

}
