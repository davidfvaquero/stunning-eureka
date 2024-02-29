
public class Saludar {

    public static void main(String[] args) {
        Saludador s1 = new Saludador();
        Saludador s2 = new Saludador("EN");
        System.out.println(s1.saludar());
        System.out.println(s1.saludar());
        System.out.println(s1.saludar());
        System.out.println(s1.getContador());
        System.out.println(s2.saludar());
        System.out.println(s2.saludar());
        System.out.println(s2.saludar());
    }
}
