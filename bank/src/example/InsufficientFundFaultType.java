/**
 * InsufficientFundFaultType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * ? v%H%%T%
 */

package example;

public class InsufficientFundFaultType  extends java.lang.Exception  implements java.io.Serializable {
    private int balance;
    private int requestedFund;

    public InsufficientFundFaultType(
           int balance,
           int requestedFund) {
        this.balance = balance;
        this.requestedFund = requestedFund;
    }

    public int getBalance() {
        return balance;
    }

    public int getRequestedFund() {
        return requestedFund;
    }

    private transient java.lang.ThreadLocal __history;
    public boolean equals(java.lang.Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != this.getClass()) { return false;}
        InsufficientFundFaultType other = (InsufficientFundFaultType) obj;
        boolean _equals;
        _equals = true
            && this.balance == other.getBalance()
            && this.requestedFund == other.getRequestedFund();
        if (!_equals) { return false; }
        if (__history == null) {
            synchronized (this) {
                if (__history == null) {
                    __history = new java.lang.ThreadLocal();
                }
            }
        }
        InsufficientFundFaultType history = (InsufficientFundFaultType) __history.get();
        if (history != null) { return (history == obj); }
        if (this == obj) return true;
        __history.set(obj);
        __history.set(null);
        return true;
    }

    private transient java.lang.ThreadLocal __hashHistory;
    public int hashCode() {
        if (__hashHistory == null) {
            synchronized (this) {
                if (__hashHistory == null) {
                    __hashHistory = new java.lang.ThreadLocal();
                }
            }
        }
        InsufficientFundFaultType history = (InsufficientFundFaultType) __hashHistory.get();
        if (history != null) { return 0; }
        __hashHistory.set(this);
        int _hashCode = 1;
        _hashCode += getBalance();
        _hashCode += getRequestedFund();
        __hashHistory.set(null);
        return _hashCode;
    }

}
