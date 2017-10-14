package gatech.hotelme.Model;

enum RoomType {

    /**
     * the different types a room can be
     */
    QUEEN("contains one queen bed"),
    KING("contains one king bed"),
    TWIN("contains two twin beds"), DOUBLE_DOUBLE("contains two double beds")
    , STUDIO ("contains a studio bed"), MASTER_SUITE("a parlour or living "
            + "room connected to a bedroom"), JUNIOR_SUITE("a single room "
            + "with a bed and sitting area");

    /**
     * description of the type
     */
    private final String _type;

    /**
     * creates a new room type
     * @param type of room to be created
     */
    RoomType(String type) {
        _type = type;
    }

}
