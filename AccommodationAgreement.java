package ProjectRentDormitory;

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AccommodationAgreement extends UnitWaterAndElectricity{
    private double initialPayment;
    private int day;
    private int month;
    private int year;
    public AccommodationAgreement(double initialPayment, int day, int month, int year){
        this.initialPayment = initialPayment;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //วันเริ่มต้นสัญญา
    public String startAccommodationAgreement(){
        return day + "/" + month + "/" + year;
    }
    //วันสิ้นสุดสัญญา
    public String endAccommodationAgreement(){
        //กำหนดวันสิ้นสุดสัญญาเมื่อครบ 6 เดือน
        int newMonth = month + 6;
        int newYear = year;
        if (newMonth > 12) {
            newMonth -= 12;
            newYear++;
        }
        return day + "/" + newMonth + "/" + newYear;
    }
    //ค่ามัดจำ
    public double getInitialPayment() {
        return initialPayment;
    }
    //ทำสัญญา ver thai
    public void writeAccommodationAgreement_verThai(Customer customer, Room room) {
        String fileName = generateContractNumber() + "_" + customer.getIdNumber() + ".txt"; // ตั้งชื่อไฟล์ตามเลข ID ลูกค้า
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("เลขที่สัญญาการเช่า : " + generateContractNumber() + "\n");//เลที่สัญญาการเช่าตามวันที่ทำสัญญา
            writer.write("วันที่ทำสัญญา : " + startAccommodationAgreement() + "\n");
            writer.write("ชื่อลูกค้า : " + customer.getName() + "\n");
            writer.write("เบอร์โทรศัพท์ : " + customer.getPhoneNumber() + "\n");
            writer.write("เลขที่บัตรประชาชน : " + customer.getIdNumber() + "\n");
            writer.write("ห้องที่เช่า : " + room.getRoomNumber() + "\n");
            writer.write("ราคาเช่า : " + room.getPrice() + " บาท/เดือน\n");
            writer.write(room.hasFacilities_verThai());
            writer.write(super.displayInfo_verThai());
            writer.newLine();
            writer.write("ค่ามัดจำเริ่มต้น : " + getInitialPayment() + " บาท\n");
            writer.write("วันสิ้นสุดสัญญา : " + endAccommodationAgreement() + "\n");
            writer.write("จำนวนเงินที่ท่านต้องชำระก่อนเข้าหอพักทั้งหมดเป็นจำนวนเงิน : " + (room.getPrice() + getInitialPayment()) + " บาท \n");//เงินที่ต้องชำระ
            System.out.println("สร้างสัญญาการเช่าลงในไฟล์ " + fileName + " เรียบร้อยแล้ว");
            System.out.println("***สำคัญมาก*** เลขการทำสัญญาของคุณ : " + generateContractNumber() + " (ใช้ในการตรวจสอบการจอง)");
        } catch (IOException e) {//ดักจับถ้าเกิดข้อผิดพลาด
            System.err.println("เกิดข้อผิดพลาดในการเขียนไฟล์ : " + e.getMessage());
        }
        //สร้างไฟล์สำหรับเก็บข้อมูลไว้แบบไม่แสดงออกมา
            String fileName2 = room.getRoomNumber() + "_1.txt"; // ตั้งชื่อไฟล์ตามชื่อลูกค้า
            try (BufferedWriter writer2 = new BufferedWriter(new FileWriter(fileName2))) {
                writer2.write("วันที่ทำสัญญา : " + startAccommodationAgreement() + "\n");
                writer2.write("ชื่อลูกค้า : " + customer.getName() + "\n");
                writer2.write("เบอร์โทรศัพท์ : " + customer.getPhoneNumber() + "\n");
                writer2.write("เลขที่บัตรประชาชน : " + customer.getIdNumber() + "\n");
                writer2.write("ห้องที่เช่า : " + room.getRoomNumber() + "\n");
                writer2.write("ราคาเช่า : " + room.getPrice() + " บาท/เดือน\n");
                writer2.write(room.hasFacilities_verThai());
                writer2.write(super.displayInfo_verThai());
                writer2.newLine();
                writer2.write("ค่ามัดจำเริ่มต้น : " + getInitialPayment() + " บาท\n");
                writer2.write("วันสิ้นสุดสัญญา : " + endAccommodationAgreement() + "\n");
                writer2.write("จำนวนเงินที่ท่านต้องชำระก่อนเข้าหอพักทั้งหมดเป็นจำนวนเงิน : " + (room.getPrice() + getInitialPayment()) + " บาท \n");
                //ดักจับข้อผิดพลาด
            } catch (IOException e) {
                System.err.println("เกิดข้อผิดพลาดในการเขียนไฟล์ : " + e.getMessage());
            }
        }

    //ทำสัญญา ver eng
    public void writeAccommodationAgreement_verEng(Customer customer, Room room) {
        String fileName = generateContractNumber() + "_" + customer.getIdNumber() + ".txt"; // ตั้งชื่อไฟล์ตามชื่อลูกค้า
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Contract Number : " + generateContractNumber() + "\n");
            writer.write("Contract Date : " + startAccommodationAgreement() + "\n");
            writer.write("Customer Name : " + customer.getName() + "\n");
            writer.write("Phone Number : " + customer.getPhoneNumber() + "\n");
            writer.write("ID Card Number : " + customer.getIdNumber() + "\n");
            writer.write("Room Number : " + room.getRoomNumber() + "\n");
            writer.write("Price : " + room.getPrice() + " Bath per month.\n");
            writer.write(room.hasFacilities_verEng());
            writer.write(super.displayInfo_verEng());
            writer.newLine();
            writer.write("Initial Payment : " + getInitialPayment() + " Bath\n");
            writer.write("Contract End Date : " + endAccommodationAgreement() + "\n");
            writer.write("The total amount you must pay before entering the dormitory is : " + (room.getPrice() + getInitialPayment()) + " Bath\n");
            System.out.println("Create a rental contract on file " + fileName + " finished.");
            System.out.println("***Important*** Your contract number: " + generateContractNumber() + " (Used for reservation verification)");
        } catch (IOException e) {
            System.err.println("An error occurred writing the file : " + e.getMessage());
        }
        //สร้างไฟล์สำหรับเก็บข้อมูลไว้แบบไม่แสดงออกมา
        String fileName2 = room.getRoomNumber() + "_1.txt"; // ตั้งชื่อไฟล์ตามชื่อลูกค้า
        try (BufferedWriter writer2 = new BufferedWriter(new FileWriter(fileName2))) {
            writer2.write("Contract Number : " + generateContractNumber() + "\n");
            writer2.write("Contract Date : " + startAccommodationAgreement() + "\n");
            writer2.write("Customer Name : " + customer.getName() + "\n");
            writer2.write("Phone Number : " + customer.getPhoneNumber() + "\n");
            writer2.write("ID Card Number : " + customer.getIdNumber() + "\n");
            writer2.write("Room Number : " + room.getRoomNumber() + "\n");
            writer2.write("Price : " + room.getPrice() + " Bath per month.\n");
            writer2.write(room.hasFacilities_verEng());
            writer2.write(super.displayInfo_verEng());
            writer2.newLine();
            writer2.write("Initial Payment : " + getInitialPayment() + " Bath\n");
            writer2.write("Contract End Date : " + endAccommodationAgreement() + "\n");
            writer2.write("The total amount you must pay before entering the dormitory is : " + (room.getPrice() + getInitialPayment()) + " Bath\n");
        } catch (IOException e) {
            System.err.println("An error occurred writing the file : " + e.getMessage());
        }
    }


    // เมธอดสร้างเลขที่สัญญากำหนดเป็นปี เดือน วัน ชม.
    public String getCurrentDateTime(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyyMMddHH");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }
    public String generateContractNumber() {
        // โค้ดสร้างเลขที่สัญญาตามวันที่ทำสัญญา
        return String.valueOf(getCurrentDateTime());
    }

}


