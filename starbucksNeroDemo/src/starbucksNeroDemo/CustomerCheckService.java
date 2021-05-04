package starbucksNeroDemo;

import java.rmi.RemoteException;

public interface CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
