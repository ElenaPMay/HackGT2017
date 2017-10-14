package gatech.hotelme.Model;


public class DBHotel {

    private String _hotelID;
    private String _name;

    public String get_hotelID() {
        return _hotelID;
    }

    public void set_hotelID(String _hotelID) {
        this._hotelID = _hotelID;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    DBHotel(String hotelID, String name) {
        _hotelID = hotelID;
        _name = name;
    }

    DBHotel() {

    }

}
