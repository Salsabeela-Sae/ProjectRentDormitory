package ProjectRentDormitory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ProjectRentDormitory.Customer.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(System.in);
        try {
            //สร้างอาร์เรย์เพื่อเก็บข้อมูลของ rooms ทั้งหมด
            List<Room> rooms_verEng = new ArrayList<>();
            List<Room> rooms_verThai = new ArrayList<>();
            //เวอร์ชั่นอังกฤษ
            //ข้อมูลห้องพักตึก A
            //ห้องเดี่ยว พัดลม ราคา 2200
            rooms_verEng.add(new Room("Single Room + Fan", "A100", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "A101", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "A102", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "A103", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "A104", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "A105", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "A106", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "A107", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "A108", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "A109", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "A110", 2200));
            //ห้องคู่ พัดลม ราคา 2800
            rooms_verEng.add(new Room("Double Room + Fan", "A200", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "A201", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "A202", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "A203", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "A204", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "A205", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "A206", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "A207", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "A208", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "A209", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "A210", 2800));
            //ห้องเดี่ยว มีแอร์ ราคา 3000
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A300", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A301", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A302", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A303", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A304", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A305", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A306", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A307", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A308", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A309", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "A310", 3000));
            //ห้องคู่ มีแอร์ ราคา 4500
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A400", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A401", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A402", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A403", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A404", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A405", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A406", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A407", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A408", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A409", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "A410", 4500));

            //ข้อมูลห้องพักตึก B
            //ห้องเดี่ยว พัดลม ราคา 2200
            rooms_verEng.add(new Room("Single Room + Fan", "B100", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "B101", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "B102", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "B103", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "B104", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "B105", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "B106", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "B107", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "B108", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "B109", 2200));
            rooms_verEng.add(new Room("Single Room + Fan", "B110", 2200));
            //ห้องคู่ พัดลม ราคา 2800
            rooms_verEng.add(new Room("Double Room + Fan", "B200", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "B201", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "B202", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "B203", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "B204", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "B205", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "B206", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "B207", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "B208", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "B209", 2800));
            rooms_verEng.add(new Room("Double Room + Fan", "B210", 2800));
            //ห้องเดี่ยว มีแอร์ ราคา 3000
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B300", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B301", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B302", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B303", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B304", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B305", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B306", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B307", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B308", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B309", 3000));
            rooms_verEng.add(new Room("Single Room + Air conditioner", "B310", 3000));
            //ห้องคู่ มีแอร์ ราคา 4500
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B400", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B401", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B402", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B403", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B404", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B405", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B406", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B407", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B408", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B409", 4500));
            rooms_verEng.add(new Room("Double Room + Air conditioner", "B410", 4500));

            //เวอร์ชั่นไทย
            //ข้อมูลห้องพักตึก A
            //ห้องเดี่ยว พัดลม ราคา 2200
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A100", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A101", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A102", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A103", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A104", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A105", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A106", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A107", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A108", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A109", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "A110", 2200));
            //ห้องคู่ พัดลม ราคา 2800
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A200", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A201", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A202", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A203", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A204", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A205", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A206", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A207", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A208", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A209", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "A210", 2800));
            //ห้องเดี่ยว มีแอร์ ราคา 3000
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A300", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A301", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A302", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A303", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A304", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A305", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A306", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A307", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A308", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A309", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "A310", 3000));
            //ห้องคู่ มีแอร์ ราคา 4500
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A400", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A401", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A402", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A403", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A404", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A405", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A406", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A407", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A408", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A409", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "A410", 4500));

            //ข้อมูลห้องพักตึก B
            //ห้องเดี่ยว พัดลม ราคา 2200
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B100", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B101", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B102", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B103", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B104", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B105", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B106", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B107", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B108", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B109", 2200));
            rooms_verThai.add(new Room("ห้องเดี่ยว พัดลม", "B110", 2200));
            //ห้องคู่ พัดลม ราคา 2800
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B200", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B201", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B202", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B203", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B204", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B205", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B206", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B207", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B208", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B209", 2800));
            rooms_verThai.add(new Room("ห้องคู่ พัดลม", "B210", 2800));
            //ห้องเดี่ยว มีแอร์ ราคา 3000
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B300", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B301", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B302", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B303", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B304", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B305", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B306", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B307", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B308", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B309", 3000));
            rooms_verThai.add(new Room("ห้องเดี่ยว แอร์", "B310", 3000));
            //ห้องคู่ มีแอร์ ราคา 4500
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B400", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B401", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B402", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B403", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B404", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B405", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B406", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B407", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B408", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B409", 4500));
            rooms_verThai.add(new Room("ห้องคู่ แอร์", "B410", 4500));
            boolean foundMatch = false;
            //กำหนดลูปแรกเพื่อควบคุมโปรแกรมทั้งหมด
            while (!foundMatch) {
                System.out.println();
                //เริ่มต้นเปิดโปรแกรม
                System.out.println("==================== Sandy House ====================");
                boolean foundLanguage = false;
                //ดักจับให้วนรับค่าภาษาที่ต้องการตามที่กำหนด
                while (!foundLanguage) {
                    System.out.print("Please select a language (English/ไทย) : ");
                    String language = kb.next();
                    if (language.equalsIgnoreCase("English")) {
                        System.out.println("\t            Welcome to Dormitory Booking.");
                        boolean foundToBook = false;
                        while (!foundToBook) {
                            System.out.print("Do you want to make a booking or check existing booking? (Book/Check Booking) : ");
                            String input = kb.next();
                            System.out.println();
                            if (input.equalsIgnoreCase("Book")) {
                                foundToBook = true; // ตั้งค่าเป็น true เพื่อออกจากลูป
                                System.out.println("Available rooms : ");
                                for (Room room : rooms_verEng) {
                                    room.displayRoom_verEng();//แสดงห้องที่ว่างทั้งหมด
                                }
                                boolean roomExists = false;
                                while (!roomExists) {
                                    System.out.print("Please enter the room number you want to book : ");
                                    String inputNumRoom = kb.next();
                                    int pos = -1;
                                    for (int i = 0; i < rooms_verEng.size(); i++) {
                                        if (rooms_verEng.get(i).getRoomNumber().equalsIgnoreCase(inputNumRoom)) {
                                            pos = i;
                                            break; // หากพบห้องที่ตรงกัน ให้หยุดการวน loop
                                        }
                                    }
                                    //ถ้าเจอห้องที่ต้องการ
                                    if (pos != -1) {
                                        rooms_verEng.get(pos).displayInfo_verEng();
                                        if (!rooms_verEng.get(pos).isBooked()) {//ถ้าห้องที่เลือกยังไม่ถูกจอง
                                            rooms_verEng.get(pos).setBooked(true);
                                            //สิ่งอำนวยความสะดวกเพิ่มเติม
                                            System.out.println("Additional facilities are available for an extra charge of 500 baht per month \n" +
                                                    "- Gym/Fitness Room \n" +
                                                    "- Co-working Space and Private Meeting Room \n" +
                                                    "- Swimming Pool \n");
                                            boolean foundMatchFacilities = false;
                                            while (!foundMatchFacilities) {
                                                System.out.print("Do you want to add additional facilities? (Yes/No) : ");
                                                String wantOrNot = kb.next();
                                                if (wantOrNot.equalsIgnoreCase("yes")) {
                                                    rooms_verEng.get(pos).setFacilities(true);
                                                    //ถ้าต้องการสิ่งอำนวยความสะดวกเพิ่มเติมให้บวกค่าห้องเพิ่ม 500 บาท
                                                    rooms_verEng.get(pos).setPrice(rooms_verEng.get(pos).getPrice() + 500);
                                                    foundMatchFacilities = true;
                                                } else if (wantOrNot.equalsIgnoreCase("no")) {
                                                    rooms_verEng.get(pos).setFacilities(false);
                                                    foundMatchFacilities = true;
                                                } else {
                                                    //ถ้าพิมพ์ไม่ถูกต้องให้วนกลับไปรับค่าอีกครั้ง
                                                    System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
                                                }
                                            }
                                            //แสดงราคาห้องและรายละเอียดต่าง ๆ
                                            System.out.println("Your room price is " + rooms_verEng.get(pos).getPrice() + " Baht per month.");
                                            UnitWaterAndElectricity unit = new UnitWaterAndElectricity() {
                                            };
                                            unit.displayInfo_verEng();
                                            //เมื่อเห็นรายละเอียดแล้ว ลูกค้ายังสนใจต่อหรือไม่
                                            boolean foundConfirm = false;
                                            while (!foundConfirm) {
                                                System.out.print("Confirm your booking (Confirm/Cancel) : ");
                                                String yesOrNo = kb.next();
                                                //ถ้่าลูกค้ายังยืนยันทำรายการต่อ ให้ทำการป้อนข้อมูลของตนเองเพื่อทำสัญญา
                                                if (yesOrNo.equalsIgnoreCase("confirm")) {
                                                    System.out.print("Please enter your name : ");
                                                    String name = kb.next();
                                                    boolean foundPhoneNum = false;
                                                    while (!foundPhoneNum) {
                                                        System.out.print("Please enter your phone number (08xxxxxxxx)) : ");
                                                        String phoneNumber = kb.next();
                                                        //ตรวจสอบเบอร์โทร
                                                        if (isValidPhoneNum(phoneNumber)) {
                                                            boolean foundId = false;
                                                            while (!foundId) {
                                                                System.out.print("Please enter your 13-digit Thai ID number  : ");
                                                                String idNumber = kb.next();
                                                                // ตรวจสอบเลขประจำตัวประชาชน
                                                                if (isValidID(idNumber)) {
                                                                    // สร้างอ็อบเจ็กต์ของคลาส Customer
                                                                    Customer customer = new Customer(name, phoneNumber, idNumber);
                                                                    System.out.println("Please enter the start date of the contract (you can move in on the contract start date)");
                                                                    System.out.print("Date/Month/Year (dd mm yyyy) : ");
                                                                    int day = kb.nextInt();
                                                                    int month = kb.nextInt();
                                                                    int year = kb.nextInt();
                                                                    // ต่อไปคือการใช้งานอ็อบเจ็กต์ customer ในการดำเนินการต่อ
                                                                    // เรียกใช้เมธอดเพื่อเขียนข้อมูลลูกค้าลงในไฟล์
                                                                    AccommodationAgreement startAgreement = new AccommodationAgreement(1000, day, month, year);
                                                                    //แสดงการทำสัญญาสำเร็จ
                                                                    startAgreement.writeAccommodationAgreement_verEng(customer, rooms_verEng.get(pos));
                                                                    // เรียกใช้เมธอดเพื่อเขียนข้อมูลลูกค้าลงในไฟล์ที่เก็บไว้
                                                                    AccommodationAgreement anotherFile = new AccommodationAgreement(1000, day, month, year);
                                                                    //ให้ลบห้องที่จองสำเร็จทั้ง verThai และ verEng
                                                                    rooms_verEng.remove(pos);
                                                                    rooms_verThai.remove(pos);
                                                                    System.out.println("Thank you for using the service.");
                                                                    System.out.println();
                                                                    break;
                                                                } else {
                                                                    System.out.println("Invalid ID number. Please enter again.");
                                                                }
                                                            }
                                                            break;
                                                        } else {
                                                            System.out.println("Invalid Phone number. Please enter again.");
                                                        }
                                                    }
                                                    break;//ทำการจองสำเร็จก็ให้หยุด loop
                                                } else if (yesOrNo.equalsIgnoreCase("cancel")) {
                                                    rooms_verEng.get(pos).setBooked(false);
                                                    System.out.println("Thank you.");
                                                } else {
                                                    //ถ้าป้อนไม่ถูกต้องให้ป้อนอีกครั้ง
                                                    System.out.println("Please enter again.");
                                                    continue;//ให้วน loop เดิม
                                                }
                                                break;
                                            }
                                        } else {
                                            System.out.println("Sorry, the room number you requested was not found.");
                                            continue;
                                        }
                                        break;
                                    }
                                }
                            } else if (input.equalsIgnoreCase("Check Booking")) { //ถ้าต้องการตรวจสอบ
                                for (Room room : rooms_verEng) {//ให้วนค่า room ทั้งหมดใน rooms_verEng
                                    boolean foundCon = false;
                                    while (!foundCon) {
                                        System.out.print("Please enter your contract number (ex 2024032011) : ");
                                        String contractNum = kb.next();
                                        // ตรวจสอบเลขทำสัญญา
                                        if (isValidContract(contractNum)) {
                                            //เลขทำสัญญาถูกต้อง
                                            boolean foundID = false;
                                            while (!foundID) {
                                                System.out.print("Please enter your 13-digit Thai ID number : ");
                                                String idNumber = kb.next();
                                                // ตรวจสอบเลขประจำตัวประชาชน
                                                if (isValidID(idNumber)) {
                                                    // เลขประจำตัวประชาชนถูกต้อง
                                                    //ถ้าห้องถูกจองไปแล้วให้แสดงข้อมูลในสัญญา
                                                    if (!room.isBooked()) {
                                                        File file = new File("/Users/salsabeelasa-e/Documents/OOP-term2/PreTest/San/" + contractNum + "_" + idNumber + ".txt");
                                                        Scanner sc = new Scanner(file);//อ่านข้อมูลจากไฟล์
                                                        while (sc.hasNextLine())
                                                            System.out.println(sc.nextLine());
                                                    }
                                                    foundID = true; // เมื่อเลขประจำตัวประชาชนถูกต้องแล้วให้ออกจากลูป
                                                } else {
                                                    System.out.println("Invalid ID number. Please enter again.");
                                                }
                                            }
                                            break;
                                        } else {
                                            System.out.println("Invalid contract number. Please enter again.");
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        //หลังจากทำรายการเสร็จ ต้องการทำรายการต่อไปหรือไม่
                        boolean yesNo = false;
                        while (!yesNo) {
                            System.out.print("Do you want to continue the transaction (Yes/No) : ");
                            String inputYesNo = kb.next();
                            //ถ้าต้องการให้เริ่มโปรแกรมอีกครั้ง
                            if (inputYesNo.equalsIgnoreCase("yes")) {
                                System.out.println("Program start again.");
                                break;
                                //ถ้าไม่ต้องการก็ให้ออกจากโปรแกรม
                            } else if (inputYesNo.equalsIgnoreCase("no")) {
                                System.out.println("Thank you for using the service.");
                                System.exit(1);
                                //ถ้าป้อนอย่างอื่นนอกเหนือจาก yse,no ให้วนกลับไปรับค่า อีกครั้ง
                            } else {
                                //ถ้าป้อนอย่างอื่นนอกเหนือจาก yse,no ให้วนกลับไปรับค่า อีกครั้ง
                                System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
                                continue;
                            }
                            break;
                        }
                    } else if (language.equalsIgnoreCase("ไทย")) {
                        System.out.println("\t            ต้อนรับเข้าสู่การจองหอพัก");
                        boolean foundToBook = false;
                        while (!foundToBook) {
                            System.out.print("คุณต้องการจองหอพักหรือตรวจสอบการจอง (จอง/ตรวจสอบการจอง) : ");
                            String input = kb.next();
                            System.out.println();
                            if (input.equalsIgnoreCase("จอง")) {
                                foundToBook = true; // ตั้งค่าเป็น true เพื่อออกจากลูป
                                System.out.println("ห้องพักว่างทั้งหมด : ");
                                for (Room room : rooms_verThai) {
                                    room.displayRoom_verThai();//แสดงห้องที่ว่างทั้งหมด
                                }
                                boolean roomExists = false;
                                while (!roomExists) {
                                    System.out.print("กรุณากรอกเลขห้องพักที่คุณต้องการจอง : ");
                                    String inputNumRoom = kb.next();
                                    int pos = -1;
                                    for (int i = 0; i < rooms_verThai.size(); i++) {
                                        if (rooms_verThai.get(i).getRoomNumber().equalsIgnoreCase(inputNumRoom)) {
                                            pos = i;
                                            break; // หากพบห้องที่ตรงกัน ให้หยุดการวน loop
                                        }
                                    }
                                    //ถ้าเจอห้องที่ต้องการ
                                    if (pos != -1) {
                                        rooms_verThai.get(pos).displayInfo_verThai();
                                        if (!rooms_verThai.get(pos).isBooked()) {
                                            rooms_verThai.get(pos).setBooked(true);
                                            //สิ่งอำนวยความสะดวกเพิ่มเติม
                                            System.out.println("สิ่งอำนวยความสะดวกเพิ่มเติมมีค่าใช้จ่าย 500 บาทต่อเดือน \n" +
                                                    "-ห้องออกกำลังกาย/ฟิตเนส \n" +
                                                    "-ห้อง Co-working Space และ ห้องประชุมส่วนตัว \n" +
                                                    "-สระว่ายน้ำ \n");
                                            boolean foundMatchFacilities = false;
                                            while (!foundMatchFacilities) {
                                                System.out.print("คุณต้องการเพิ่มสิ่งอำนวยความสะดวก (ใช่/ไม่ใช่) : ");
                                                String wantOrNot = kb.next();
                                                if (wantOrNot.equals("ใช่")) {
                                                    rooms_verThai.get(pos).setFacilities(true);
                                                    //ถ้าต้องการสิ่งอำนวยความสะดวกเพิ่มเติมให้บวกค่าห้องเพิ่ม 500 บาท
                                                    rooms_verThai.get(pos).setPrice(rooms_verThai.get(pos).getPrice() + 500);
                                                    foundMatchFacilities = true;
                                                } else if (wantOrNot.equals("ไม่ใช่")) {
                                                    rooms_verThai.get(pos).setFacilities(false);
                                                    foundMatchFacilities = true;
                                                } else {
                                                    //ถ้าพิมพ์ไม่ถูกต้องให้วนกลับไปรับค่าอีกครั้ง
                                                    System.out.println("กรอกคำสั่งไม่ถูกต้อง กรุณากรอกคำสั่งอีกครั้ง");
                                                }
                                            }
                                            //แสดงราคาห้องและรายละเอียดต่าง ๆ
                                            System.out.println("ค่าห้องของคุณ " + rooms_verThai.get(pos).getPrice() + " บาทต่อเดือน");
                                            UnitWaterAndElectricity unit = new UnitWaterAndElectricity() {
                                            };
                                            unit.displayInfo_verThai();
                                            //เมื่อเห็นรายละเอียดแล้ว ลูกค้ายังสนใจต่อหรือไม่
                                            boolean foundConfirm = false;
                                            while (!foundConfirm) {
                                                System.out.print("ยืนยันทำการจองต่อไป (ยืนยัน/ยกเลิก) : ");
                                                String yesOrNo = kb.next();
                                                //ถ้่าลูกค้ายังยืนยันทำรายการต่อ ให้ทำการป้อนข้อมูลของตนเองเพื่อทำสัญญา
                                                if (yesOrNo.equalsIgnoreCase("ยืนยัน")) {
                                                    System.out.print("กรุณากรอกชื่อลูกค้า : ");
                                                    String name = kb.next();
                                                    boolean foundPhoneNum = false;
                                                    while (!foundPhoneNum) {
                                                        System.out.print("กรุณากรอกเบอร์โทร (08xxxxxxxx) : ");
                                                        String phoneNumber = kb.next();
                                                        // ตรวจสอบเบอร์โทร
                                                        if (isValidPhoneNum(phoneNumber)) {
                                                            boolean foundId = false;
                                                            while (!foundId) {
                                                                System.out.print("กรุณากรอกเลขประจำตัวประชาชน 13 หลัก : ");
                                                                String idNumber = kb.next();
                                                                // ตรวจสอบเลขประจำตัวประชาชน
                                                                if (isValidID(idNumber)) {
                                                                    // สร้างอ็อบเจ็กต์ของคลาส Customer
                                                                    Customer customer = new Customer(name, phoneNumber, idNumber);
                                                                    System.out.println("กรุณากรอกวันที่ที่ต้องการเริ่มทำสัญญา(สามารถเข้าหอพักได้ตังแต่วันที่เริ่มทำสัญญา)");
                                                                    System.out.print("วันที่/เดือน/ปี ค.ศ (วว ดด ปปปป) : ");
                                                                    int day = kb.nextInt();
                                                                    int month = kb.nextInt();
                                                                    int year = kb.nextInt();
                                                                    // ต่อไปคือการใช้งานอ็อบเจ็กต์ customer ในการดำเนินการต่อ
                                                                    // เรียกใช้เมธอดเพื่อเขียนข้อมูลลูกค้าลงในไฟล์
                                                                    AccommodationAgreement startAgreement = new AccommodationAgreement(1000, day, month, year);
                                                                    //แสดงการทำสัญญาสำเร็จ
                                                                    startAgreement.writeAccommodationAgreement_verThai(customer, rooms_verThai.get(pos));
                                                                    // เรียกใช้เมธอดเพื่อเขียนข้อมูลลูกค้าลงในไฟล์ที่เก็บไว้
                                                                    AccommodationAgreement anotherFile = new AccommodationAgreement(1000, day, month, year);
                                                                    //ให้ลบห้องที่จองสำเร็จทั้ง verThai และ verEng
                                                                    rooms_verThai.remove(pos);
                                                                    rooms_verEng.remove(pos);
                                                                    System.out.println("ขอบคุณที่ใช้บริการครับ/ค่ะ");
                                                                    System.out.println();
                                                                    break;
                                                                } else {
                                                                    System.out.println("เลขประจำตัวประชาชนไม่ถูกต้อง กรุณากรอกอีกครั้ง");
                                                                }
                                                            }
                                                            break;
                                                        } else {
                                                            System.out.println("เบอร์โทร์ไม่ถูกต้อง กรุณากรอกอีกครั้ง");
                                                        }
                                                    }
                                                    break;//หยุด loop
                                                } else if (yesOrNo.equalsIgnoreCase("ยกเลิก")) {
                                                    rooms_verThai.get(pos).setBooked(false);
                                                    System.out.println("ขอบคุณที่ใช้บริการครับ/ค่ะ");
                                                } else {
                                                    //ถ้าป้อนไม่ถูกต้องให้ป้อนอีกครั้ง
                                                    System.out.println("กรอกคำสั่งไม่ถูกต้อง กรุณากรอกคำสั่งอีกครั้ง");
                                                    continue;//ให้วน loop เดิม
                                                }
                                                break;
                                            }
                                        } else {
                                            System.out.println("ขออภัย ไม่พบหมายเลขห้องที่คุณต้องการ");
                                            continue;//ให้วน loop เดิม
                                        }
                                        break;
                                    }
                                }
                            } else if (input.equalsIgnoreCase("ตรวจสอบการจอง")) { //ถ้าต้องการตรวจสอบ
                                for (Room room : rooms_verThai) {//ให้วนค่า room ทั้งหมดใน rooms_verThai
                                    boolean foundCon = false;
                                    while (!foundCon){
                                        System.out.print("กรุณากรอกเลขการทำสัญญาของคุณ(ตัวอย่าง 2024032011) : ");
                                        String contractNum = kb.next();
                                        // ตรวจสอบเลขทำสัญญา
                                        if (isValidContract(contractNum)) {
                                            //เลขทำสัญญาถูกต้อง
                                            boolean foundID = false;
                                            while (!foundID) {
                                                System.out.print("กรุณากรอกเลขประจำตัวประชาชน 13 หลัก : ");
                                                String idNumber = kb.next();
                                                // ตรวจสอบเลขประจำตัวประชาชน
                                                if (isValidID(idNumber)) {
                                                    // เลขประจำตัวประชาชนถูกต้อง
                                                    if (!room.isBooked()) {
                                                        File file = new File("/Users/salsabeelasa-e/Documents/OOP-term2/PreTest/San/" + contractNum + "_" + idNumber + ".txt");
                                                        Scanner sc = new Scanner(file);//อ่านข้อมูลจากไฟล์
                                                        while (sc.hasNextLine())
                                                            System.out.println(sc.nextLine());
                                                    }
                                                    foundID = true; // เมื่อเลขประจำตัวประชาชนถูกต้องแล้วให้ออกจากลูป
                                                } else {
                                                    System.out.println("เลขประจำตัวประชาชน 13 หลักไม่ถูกต้อง กรุณากรอกอีกครั้ง");
                                                }
                                            }
                                            break;
                                        }else {
                                            System.out.println("เลขการทำสัญญาของคุณไม่ถูกต้อง กรุณากรอกอีกครั้ง");
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        //หลังจากทำรายการเสร็จ ต้องการทำรายการต่อไปหรือไม่
                        boolean yesNo = false;
                        while (!yesNo) {
                            System.out.print("คุณต้องการทำรายการต่อหรือไม่ (ใช่/ไม่ใช่) : ");
                            String inputYesNo = kb.next();
                            //ถ้าต้องการให้เริ่มโปรแกรมอีกครั้ง
                            if (inputYesNo.equals("ใช่")) {
                                System.out.println("เริ่มโปรแกรมใหม่อีกครั้ง");
                                break;
                                //ถ้าไม่ต้องการก็ให้ออกจากโปรแกรม
                            } else if (inputYesNo.equals("ไม่ใช่")) {
                                System.out.println("ขอบคุณที่ใช้บริการครับ/ค่ะ");
                                System.exit(1);
                            } else {
                                //ถ้าป้อนอย่างอื่นนอกเหนือจากใช่,ไม่ใช่ ให้วนกลับไปรับค่า อีกครั้ง
                                System.out.println("ป้อนคำสั่งไม่ถูกต้อง กรุณาป้อนคำสั่งอีกครั้ง");
                                continue;
                            }
                            break;
                        }
                    } else {
                        continue;
                    }
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("something is wrongs please rerun program");
        }
    }
}