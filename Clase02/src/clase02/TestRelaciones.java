package clase02;
public class TestRelaciones {
    public static void main(String[] args) {
        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1,"arg$");
        cuenta1.depositar(35000);
        cuenta1.depositar(40000);
        cuenta1.debitar(10000);
        System.out.println(cuenta1);
    }
}
