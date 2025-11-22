package ProjectRentDormitory;
public class Customer {
    private String name;
    private String phoneNumber;
    private String IdNumber;
    public Customer(String name, String phoneNumber, String idNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        IdNumber = idNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getIdNumber() {
        return IdNumber;
    }
    // ตรวจสอบเลขประจำตัวประชาชนว่าถูกต้องหรือไม่
    public static boolean isValidID(String IdNumber) {
        // ตรวจสอบความยาวของเลขประจำตัวประชาชน
        if (IdNumber.length() != 13) {
            return false;
        }
        // ตรวจสอบว่าเป็นตัวเลขทั้งหมดหรือไม่
        for (char c : IdNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidPhoneNum(String phoneNumber) {
        // ตรวจสอบความยาวของเลขประจำตัวประชาชน
        if (phoneNumber.length() != 10) {
            return false;
        }
        // ตรวจสอบว่าเป็นตัวเลขทั้งหมดหรือไม่
        for (char c : phoneNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidContract(String contract) {
        // ตรวจสอบความยาวของเลขสัญญา
        if (contract.length() != 10) {
            return false;
        }
        // ตรวจสอบว่าเป็นตัวเลขทั้งหมดหรือไม่
        for (char c : contract.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
