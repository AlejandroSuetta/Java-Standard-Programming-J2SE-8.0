package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.entities.ClienteEmpresa;
import ar.com.eduit.curso.java.entities.Cuenta;
import ar.com.eduit.curso.java.entities.Cliente;
import java.util.List;

public class TestRelaciones {
    public static void main(String[] args) {
        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1,"arg$");
        cuenta1.depositar(35000);
        cuenta1.depositar(40000);
        cuenta1.debitar(10000);
        System.out.println(cuenta1);
        
        System.out.println("-- cliente1 --");
        Cliente cliente1=new Cliente(1,"Juan","Perez",2);
        cliente1.getCuenta().depositar(25000);
        
        Cuenta cuentaCliente1=cliente1.getCuenta();
        cuentaCliente1.depositar(25000);
        
        cliente1.getCuenta().debitar(10000);

        System.out.println(cliente1);
        System.out.println(cliente1.getCuenta());
        
        System.out.println("-- clienteEmpresa1 --");
        ClienteEmpresa clienteEmpresa1=new ClienteEmpresa(
                1,                          //nro
                "Todo Limpio SRL",          //Razon Social
                "Viel 360"                  //dirección
        );
        
        List<Cuenta>cuentas=clienteEmpresa1.getCuentas();
        cuentas.add(new Cuenta(10,"arg$"));         // 0
        cuentas.add(new Cuenta(11,"reales"));       // 1
        cuentas.add(new Cuenta(12,"u$s"));          // 2
        
        cuentas.get(0).depositar(40000);
        cuentas.get(0).depositar(30000);
        cuentas.get(0).debitar(10000);
        cuentas.get(1).depositar(24000);
        cuentas.get(2).depositar(12000);
        
        System.out.println(clienteEmpresa1);
        for(Cuenta c:cuentas) System.out.println(c);
        
    }
}
