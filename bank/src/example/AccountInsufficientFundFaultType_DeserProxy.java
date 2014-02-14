/**
 * AccountInsufficientFundFaultType_DeserProxy.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * ? v%H%%T%
 */

package example;

public class AccountInsufficientFundFaultType_DeserProxy  extends example.InsufficientFundFaultType_DeserProxy  implements java.io.Serializable {
    private java.lang.String account;

    public AccountInsufficientFundFaultType_DeserProxy() {
    	System.out.println("test changed");
    }

    public java.lang.String getAccount() {
        return account;
    }

    public void setAccount(java.lang.String account) {
        this.account = account;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != this.getClass()) { return false;}
        AccountInsufficientFundFaultType_DeserProxy other = (AccountInsufficientFundFaultType_DeserProxy) obj;
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

    public java.lang.Object convert() {
      return new example.AccountInsufficientFundFaultType(
        getBalance(),
        getRequestedFund(),
        getAccount());
    }
}
