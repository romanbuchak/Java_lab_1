package ua.lviv.iot.Java_lab_1;

public class main {
    public static void main(String[] args) {
        AEP ABB = new AEP();
        AEP TeleTec = new AEP("TeleTec", 1.5, 342);
        AEP NIK = new AEP("NIK", 2, 0.75, "green", 210, 24);
        System.out.println(ABB);
        System.out.println(TeleTec);
        System.out.println(NIK);
    }
}