package task24.task02;

public class rentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    static int rent;

    public rentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        rent = rentofRooms(roomCount);
        setBalconyOrNo(balconyOrNo);
    }

    public rentApartments() {
    }

    int rentofRooms(int roomCount) {

        switch (roomCount) {
            case 0:
                rent = 1400;
                break;
            case 1:
                rent = 1700;
                break;
            case 2:
                rent = 2200;
                break;
            case 3:
                rent = 2700;
                break;
        }
        return rent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {

        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        if (balconyOrNo) {
            rent += 200;
        }
        this.balconyOrNo = balconyOrNo;
    }

    @Override
    public String toString() {
        return
                "Name= " + name + ", room= " + roomCount + ", balconyOrNo=" + balconyOrNo + ", rent= " + rent;
    }
}
