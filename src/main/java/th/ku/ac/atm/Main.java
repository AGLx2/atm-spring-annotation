package th.ku.ac.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import th.ku.ac.atm.AtmUI;
import th.ku.ac.atm.DataSourceDB;
import th.ku.ac.atm.DataSourceFile;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);

        ATM atm = context.getBean(ATM.class);
        String name = atm.validateCustomer(2, 2345);
        System.out.println(name + " has " + atm.getBalance());
        atm.withdraw(200);
        System.out.println(name + " has " + atm.getBalance());
    }
}
