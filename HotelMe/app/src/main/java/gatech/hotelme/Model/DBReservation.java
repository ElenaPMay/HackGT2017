package gatech.hotelme.Model;


class DBReservation {
    private int _loginID;
    private String _ownerFirstName;
    private String _ownerLastName;
    private int _ownerCreditCardNumber;
    private double _ownerBillAmount;
    private String _hotelID;


    public int get_loginID() {
        return _loginID;
    }

    public void set_loginID(int _loginID) {
        this._loginID = _loginID;
    }

    public String get_ownerFirstName() {
        return _ownerFirstName;
    }

    public void set_ownerFirstName(String _ownerFirstName) {
        this._ownerFirstName = _ownerFirstName;
    }

    public String get_ownerLastName() {
        return _ownerLastName;
    }

    public void set_ownerLastName(String _ownerLastName) {
        this._ownerLastName = _ownerLastName;
    }

    public int get_ownerCreditCardNumber() {
        return _ownerCreditCardNumber;
    }

    public void set_ownerCreditCardNumber(int _ownerCreditCardNumber) {
        this._ownerCreditCardNumber = _ownerCreditCardNumber;
    }

    public double get_ownerBillAmount() {
        return _ownerBillAmount;
    }

    public void set_ownerBillAmount(double _ownerBillAmount) {
        this._ownerBillAmount = _ownerBillAmount;
    }

    public String get_hotelID() {
        return _hotelID;
    }

    public void set_hotelID(String _hotelID) {
        this._hotelID = _hotelID;
    }

    public DBReservation() {

    }

    public DBReservation(int _loginID, String _ownerFirstName,
                         String _ownerLastName, int _ownerCreditCardNumber,
                         double _ownerBillAmount, String _hotelID) {
        this._loginID = _loginID;
        this._ownerFirstName = _ownerFirstName;
        this._ownerLastName = _ownerLastName;
        this._ownerCreditCardNumber = _ownerCreditCardNumber;
        this._ownerBillAmount = _ownerBillAmount;
        this._hotelID = _hotelID;
    }
}
