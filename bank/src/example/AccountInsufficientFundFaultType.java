/**
 * AccountInsufficientFundFaultType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * ? v%H%%T%
 */

package example;

public class AccountInsufficientFundFaultType  extends example.InsufficientFundFaultType  implements java.io.Serializable {
    private java.lang.String account;

    public AccountInsufficientFundFaultType(
           int _InsufficientFundFaultType_balance,
           int _InsufficientFundFaultType_requestedFund,
           java.lang.String account) {
        super(
            _InsufficientFundFaultType_balance,
            _InsufficientFundFaultType_requestedFund);
        this.account = account;
    }

    public java.lang.String getAccount() {
        return account;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != this.getClass()) { return false;}
        AccountInsufficientFundFaultType other = (AccountInsufficientFundFaultType) obj;
        boolean _equals;
        _equals = true
            && ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount())));
        if (!_equals) { return false; }
        if (!super.equals(obj)) { return false; }
        return true;
    }

    public int hashCode() {
        int _hashCode = super.hashCode();
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        return _hashCode;
    }

}
