package gatech.hotelme.Model;

// loginID == reservationID

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler {

//    // Database Version
//    private static final int DATABASE_VERSION = 1;
//
//    // Database Name
//    private static final String DATABSE_NAME = "HOTEL_ME";
//
//    // Table Names
//    private static final String TABLE_HOTEL = "hotel";
//    private static final String TABLE_ROOM = "room";
//    private static final String TABLE_RESERVATION = "reservation";
//
//    // Common Column Names
//    private static final String KEY_HOTEL_ID = "hotelID";
//    private static final String KEY_ROOM_NUMBER = "roomNumber";
//
//    // Hotel Table Column Names
//    private static final String KEY_HOTEL_NAME = "name";
//
//    // Room Column Names
//    private static final String KEY_ROOM_TYPE = "roomType";
//    private static final String KEY_RESERVATION_ID = "reservationID";
//
//    // Reservation Column Names
//    private static final String KEY_LOGIN_ID = "loginID";
//    private static final String KEY_OWNER_FIRST_NAME = "ownerFirstName";
//    private static final String KEY_OWNER_LAST_NAME = "ownerLastName";
//    private static final String KEY_OWNER_CREDIT_CARD_NUMBER =
//            "ownerCreditCardNumber";
//    private static final String KEY_OWNER_BILL_AMOUNT = "ownerBillAmount";
//    private static final String KEY_CHECKIN_DATE = "checkInDate";
//    private static final String KEY_CHECKOUT_DATE = "checkOutDate";
//
//    // Table Create Statements
//    // Hotel Table Create Statement
//    private static final String CREATE_TABLE_HOTEL = "CREATE TABLE "
//            + TABLE_HOTEL + "(" + KEY_HOTEL_ID + " TEXT PRIMARY KEY,"
//            + KEY_HOTEL_NAME + " TEXT" + ")";
//
//    // Room Table Create Statement
//    private static final String CREATE_TABLE_ROOM = "CREATE TABLE " +
//            TABLE_HOTEL + "(" + KEY_HOTEL_ID + " TEXT PRIMARY KEY," +
//            KEY_ROOM_NUMBER + " TEXT PRIMARY KEY," + KEY_RESERVATION_ID + " "
//            + "INTEGER," + KEY_ROOM_TYPE + " TEXT" + ")";
//
//    //Reservation Table Create Statement
//    private static final String CREATE_TABLE_RESERVATION = "CREATE TABLE " +
//            TABLE_RESERVATION + "(" + KEY_LOGIN_ID + " INTEGER PRIMARY KEY," +
//            KEY_OWNER_FIRST_NAME + " TEXT," + KEY_OWNER_LAST_NAME + " TEXT,"
//            + KEY_OWNER_BILL_AMOUNT + " REAL," + KEY_HOTEL_ID + " TEXT," +
//            KEY_ROOM_NUMBER + " TEXT," + KEY_OWNER_CREDIT_CARD_NUMBER + " "
//            + "INTEGER," + KEY_CHECKIN_DATE + " NUMERIC," + KEY_CHECKOUT_DATE
//            + "NUMERIC" + ")";
//
//    /**
//     * constructor
//     *
//     * @param context of db
//     */
//    public DBHandler(Context context) {
//        super(context, DATABSE_NAME, null, DATABASE_VERSION);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        // creating required tables
//        db.execSQL(CREATE_TABLE_HOTEL);
//        db.execSQL(CREATE_TABLE_ROOM);
//        db.execSQL(CREATE_TABLE_RESERVATION);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//    }
//
//    /**
//     * creates a single hotel and adds it to the db
//     *
//     * @param hotel to be added to db
//     */
//    public void createHotel(Hotel hotel) {
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//        values.put(KEY_HOTEL_ID, hotel.get_hotelID());
//        values.put(KEY_HOTEL_NAME, hotel.get_name());
//
//        // insert row
//        db.insert(TABLE_HOTEL, null, values);
//    }
//
//    /**
//     * get a single hotel from the db
//     *
//     * @param hotelID id of hotel to get
//     * @return hotel that matches passed in hotelID
//     */
//    public Hotel getHotel(String hotelID) {
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        String selectQuery = "SELECT * FROM " + TABLE_HOTEL + " WHERE " +
//                KEY_HOTEL_ID + " = " + hotelID;
//
//        Cursor c = db.rawQuery(selectQuery, null);
//
//        if (c != null) {
//            c.moveToFirst();
//        }
//
//        Hotel hotel = new Hotel();
//        hotel.set_hotelID(c.getString(c.getColumnIndex(KEY_HOTEL_ID)));
//        hotel.set_hotelID(c.getString(c.getColumnIndex(KEY_HOTEL_NAME)));
//
//        return hotel;
//    }
//
//    /**
//     * creates a single room and adds it to the db
//     *
//     * @param room to be added to db
//     */
//    public void createRoom(Room room) {
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//        values.put(KEY_HOTEL_ID, room.get_hotelID());
//        values.put(KEY_ROOM_NUMBER, room.get_roomNumber());
//        values.put(KEY_ROOM_TYPE, room.get_roomType());
//        values.put(KEY_RESERVATION_ID, room.get_reservationID());
//
//        // insert row
//        db.insert(TABLE_ROOM, null, values);
//    }
//
//    /**
//     * gets a single room from db
//     *
//     * @param hotelID    id of hotel to get
//     * @param roomNumber id of room in hotel to get
//     * @return hotel corresponding to the unique COMBINATION of hotelID and
//     * roomNumber
//     */
//    public Room getRoom(String hotelID, int roomNumber) {
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        String selectQuery = "SELECT * FROM " + TABLE_ROOM + " WHERE " +
//                KEY_HOTEL_ID + " = " + hotelID + " AND " + KEY_ROOM_NUMBER +
//                " = " + roomNumber;
//
//        Cursor c = db.rawQuery(selectQuery, null);
//
//        if (c != null) {
//            c.moveToFirst();
//        }
//
//        Room room = new Room();
//        room.set_hotelID(c.getString(c.getColumnIndex(KEY_HOTEL_ID)));
//        room.set_roomType(c.getString(c.getColumnIndex(KEY_ROOM_TYPE)));
//        room.set_roomNumber(c.getInt(c.getColumnIndex(KEY_ROOM_NUMBER)));
//        room.set_reservationID(c.getInt(c.getColumnIndex(KEY_RESERVATION_ID)));
//
//        return room;
//    }
//
//    public void createReservation(int loginID, String fname, String lname,
//                                  int cnumber, double bill, String hotelID) {
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//
//        values.put(KEY_LOGIN_ID, loginID);
//        values.put(KEY_OWNER_FIRST_NAME, fname);
//        values.put(KEY_OWNER_LAST_NAME, lname);
//        values.put(KEY_OWNER_CREDIT_CARD_NUMBER, cnumber);
//        values.put(KEY_OWNER_BILL_AMOUNT, bill);
//        values.put(KEY_HOTEL_ID, hotelID);
//
//        db.insert(TABLE_RESERVATION, null, values);
//    }
//
//    public Reservation getDBReservation(int loginID) {
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        String selectQuery = "SELECT * FROM " + TABLE_RESERVATION + " WHERE " +
//                KEY_LOGIN_ID + " = " + loginID;
//
//        Cursor c = db.rawQuery(selectQuery, null);
//
//        if (c != null) {
//            c.moveToFirst();
//        }
//
//        Reservation reservation = new Reservation();
//        reservation.set_loginID(c.getInt(c.getColumnIndex(KEY_LOGIN_ID)));
//        reservation.set_ownerFirstName(c.getString(c
//                .getColumnIndex(KEY_OWNER_FIRST_NAME)));
//        reservation.set_ownerLastName(c.getString(c.getColumnIndex(KEY_OWNER_LAST_NAME)));
//        reservation.set_ownerCreditCardNumber(c.getInt(c.getColumnIndex
//                (KEY_OWNER_CREDIT_CARD_NUMBER)));
//        reservation.set_ownerBillAmount(c.getDouble(c.getColumnIndex
//                (KEY_OWNER_BILL_AMOUNT)));
//        reservation.set_hotelID(c.getString(c.getColumnIndex(KEY_HOTEL_ID)));
//
//        return reservation;
//    }

}
