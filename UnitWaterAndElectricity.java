package ProjectRentDormitory;
public abstract class UnitWaterAndElectricity implements Management{
    protected static final double unitWater = 25.0;
    protected static final double unitElectricity = 7.0;
    public UnitWaterAndElectricity(){
    }
    //แสดงค่าน้ำค่าไฟเป็นภาษาไทย
    @Override
    public String displayInfo_verThai() {
        return "ค่าน้ำ หน่วยละ " + unitWater + " บาท \n" +
                "ค่าไฟ หน่วยละ " + unitElectricity + " บาท";
    }
    //แสดงค่าน้ำค่าไฟเป็นภาษาอังกฤษ
    @Override
    public String displayInfo_verEng() {
        return "Water bill per unit " + unitWater + " Bath \n" +
                "Electricity bill per unit " + unitElectricity + " Bath";
    }
    @Override
    public boolean isBooked() {
        return false;
    }
    @Override
    public void displayRoom_verThai() {
    }
    @Override
    public void displayRoom_verEng() {
    }
}