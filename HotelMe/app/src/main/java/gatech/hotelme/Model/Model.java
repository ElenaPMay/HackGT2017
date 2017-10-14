package gatech.hotelme.Model;

public class Model {
    private static final Model instance = new Model();
    private ReservationManager _reservationManager;
    private HotelManager _hotelManager;

    private Model() {
        _reservationManager = ReservationManager.getInstance();
        _hotelManager = HotelManager.getInstance();
    }

    public Model getInstance() {
        return instance;
    }
}
