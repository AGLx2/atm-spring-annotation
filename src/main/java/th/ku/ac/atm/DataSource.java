package th.ku.ac.atm;

import th.ku.ac.atm.Customer;

import java.util.Map;

public interface DataSource {
    Map<Integer, Customer> readCustomers();
}
