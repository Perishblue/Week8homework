package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {

        SBI s = new SBI();
        AXIS a = new AXIS();
        ICICI i = new ICICI();
        System.out.println("SBI Rate of Interest:" + s.getRateOfInterest());
        System.out.println("AXIS Rate of Interest:" + a.getRateOfInterest());
        System.out.println("ICICI Rate of Interest:" + i.getRateOfInterest());

    }
}
