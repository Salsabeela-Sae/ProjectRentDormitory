package ProjectRentDormitory;

public class Room implements Management {
    private String roomType;
    private String roomNumber;
    private double price;
    private boolean isBooked;

    public Room(String roomType, String roomNumber, double price) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = false;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isBooked() {
        return isBooked;
    }
    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }

    public boolean setFacilities(boolean hasFacilities) {
        return hasFacilities;
    }

    @Override
    public void displayRoom_verThai() {
        System.out.println("ประเภทห้องพัก : " + roomType);
        System.out.println("เลขห้องพัก : " + roomNumber);
        System.out.println("ราคาห้องพักต่อเดือน : " + price + " บาท.");
        System.out.println();
    }

    @Override
    public void displayRoom_verEng() {
        System.out.println("Type Room : " + roomType);
        System.out.println("Number Room : " + roomNumber);
        System.out.println("Price per month : " + price + " Bath.");
        System.out.println();
    }

    @Override
    public String displayInfo_verThai() {
        return null;
    }

    @Override
    public String displayInfo_verEng() {
        return null;
    }
    public String hasFacilities_verThai() {
        if (setFacilities(true)) {
            return "สิ่งอำนวยความสะดวกเพิ่มเติม : มี\n";
        } else if (setFacilities(false)) {
            return "สิ่งอำนวยความสะดวกเพิ่มเติม : ไม่มี\n";
        }
        return hasFacilities_verThai();
    }
    public String hasFacilities_verEng() {
        if (setFacilities(true)) {
            return "Additional facilities: Available\n";
        } else if (setFacilities(false)) {
            return "Additional facilities: Not available\n";
        }
        return hasFacilities_verEng();
    }
}
