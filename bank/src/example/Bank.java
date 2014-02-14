/**
 * Bank.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * ? v%H%%T%
 */

package example;

public interface Bank extends java.rmi.Remote {
    public boolean withdraw(java.lang.String account, int amount) throws java.rmi.RemoteException, example.InsufficientFundFaultType, example.AccountNotExistFault;
}
