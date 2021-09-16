package ch.juventus.object;



public class Application {
    public static void main(String[] args) {


        Address marcoAd = new Address("Am Giessenpak", 300, 8080, "AmA Arsch vode Wält");
        Person marco = new Person("Marco", "Kunz",  marcoAd, 21, true);
        Person marco2 = new Person("Marco", "Kunz",  marcoAd, 21, true);
        System.out.println(marco);


        System.out.println("Equalstest" +marco.equals(marco2));
    }
}
