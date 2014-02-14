/**
 * InsufficientFundFaultType_DeserProxy.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * ? v%H%%T%
 */

package example;

public class InsufficientFundFaultType_DeserProxy  extends java.lang.Exception  implements java.io.Serializable {
    private int balance;
    private int requestedFund;

    public InsufficientFundFaultType_DeserProxy() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getRequestedFund() {
        return requestedFund;
    }

    public void setRequestedFund(int requestedFund) {
        this.requestedFund = requestedFund;
    }

    private transient java.lang.ThreadLocal __history;
    public boolean equals(java.lang.Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != this.getClass()) { return false;}
        InsufficientFundFaultType_DeserProxy other = (InsufficientFundFaultType_DeserProxy) obj;
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
        InsufficientFundFaultType_DeserProxy history = (InsufficientFundFaultType_DeserProxy) __history.get();
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
        InsufficientFundFaultType_DeserProxy history = (InsufficientFundFaultType_DeserProxy) __hashHistory.get();
        if (history != null) { return 0; }
        __hashHistory.set(this);
        int _hashCode = 1;
        _hashCode += getBalance();
        _hashCode += getRequestedFund();
        __hashHistory.set(null);
        return _hashCode;
    }

    public java.lang.Object convert() {
      return new example.InsufficientFundFaultType(
        getBalance(),
        getRequestedFund());
    }
}
