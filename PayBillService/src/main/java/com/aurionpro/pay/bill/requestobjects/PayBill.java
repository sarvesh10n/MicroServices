package com.aurionpro.pay.bill.requestobjects;

import java.io.Serializable;

public class PayBill implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = -2052603684503169427L;
		
		private String type;
	    private String id;
	    private String accountORIban;
	    private String billPayCriteriaName;
	    private String billerId;
	    private String productId;
	    private String debitAccountId;
	    private String debitAccountNo;
	    private String debitAmount;
	    private String debitCurrencyId;
	    private String payAmount;
	    private String billAmount;
	    private String payDate;
	    private String billDate;
	    private String billDueDate;
	    private String referenceField1;
	    private String referenceFieldValue1;
	    private String referenceField2;
	    private String referenceFieldValue2;
	    private String referenceField3;
	    private String referenceFieldValue3;
	    private String referenceField4;
	    private String referenceFieldValue4;
	    private String subscriberName;
	    private String isRegistered;
	    private Boolean selfConfirmed;
	    private String requestId;
	    public String getType() {
	        return type;
	    }
	    public void setType(String type) {
	        this.type = type;
	    }
	    public String getId() {
	        return id;
	    }
	    public void setId(String id) {
	        this.id = id;
	    }
	    public String getAccountORIban() {
	        return accountORIban;
	    }
	    public void setAccountORIban(String accountORIban) {
	        this.accountORIban = accountORIban;
	    }
	    public String getBillPayCriteriaName() {
	        return billPayCriteriaName;
	    }
	    public void setBillPayCriteriaName(String billPayCriteriaName) {
	        this.billPayCriteriaName = billPayCriteriaName;
	    }
	    public String getBillerId() {
	        return billerId;
	    }
	    public void setBillerId(String billerId) {
	        this.billerId = billerId;
	    }
	    public String getProductId() {
	        return productId;
	    }
	    public void setProductId(String productId) {
	        this.productId = productId;
	    }
	    public String getDebitAccountId() {
	        return debitAccountId;
	    }
	    public void setDebitAccountId(String debitAccountId) {
	        this.debitAccountId = debitAccountId;
	    }
	    public String getDebitAccountNo() {
	        return debitAccountNo;
	    }
	    public void setDebitAccountNo(String debitAccountNo) {
	        this.debitAccountNo = debitAccountNo;
	    }
	    public String getDebitAmount() {
	        return debitAmount;
	    }
	    public void setDebitAmount(String debitAmount) {
	        this.debitAmount = debitAmount;
	    }
	    public String getDebitCurrencyId() {
	        return debitCurrencyId;
	    }
	    public void setDebitCurrencyId(String debitCurrencyId) {
	        this.debitCurrencyId = debitCurrencyId;
	    }
	    public String getPayAmount() {
	        return payAmount;
	    }
	    public void setPayAmount(String payAmount) {
	        this.payAmount = payAmount;
	    }
	  
	    public String getPayDate() {
	        return payDate;
	    }
	    public void setPayDate(String payDate) {
	        this.payDate = payDate;
	    }
	    public String getBillAmount() {
			return billAmount;
		}
		public void setBillAmount(String billAmount) {
			this.billAmount = billAmount;
		}
		public String getBillDate() {
			return billDate;
		}
		public void setBillDate(String billDate) {
			this.billDate = billDate;
		}
		public String getBillDueDate() {
			return billDueDate;
		}
		public void setBillDueDate(String billDueDate) {
			this.billDueDate = billDueDate;
		}
		public String getReferenceField1() {
	        return referenceField1;
	    }
	    public void setReferenceField1(String referenceField1) {
	        this.referenceField1 = referenceField1;
	    }
	    public String getReferenceFieldValue1() {
	        return referenceFieldValue1;
	    }
	    public void setReferenceFieldValue1(String referenceFieldValue1) {
	        this.referenceFieldValue1 = referenceFieldValue1;
	    }
	    public String getReferenceField2() {
	        return referenceField2;
	    }
	    public void setReferenceField2(String referenceField2) {
	        this.referenceField2 = referenceField2;
	    }
	    public String getReferenceFieldValue2() {
	        return referenceFieldValue2;
	    }
	    public void setReferenceFieldValue2(String referenceFieldValue2) {
	        this.referenceFieldValue2 = referenceFieldValue2;
	    }
	    public String getReferenceField3() {
	        return referenceField3;
	    }
	    public void setReferenceField3(String referenceField3) {
	        this.referenceField3 = referenceField3;
	    }
	    public String getReferenceFieldValue3() {
	        return referenceFieldValue3;
	    }
	    public void setReferenceFieldValue3(String referenceFieldValue3) {
	        this.referenceFieldValue3 = referenceFieldValue3;
	    }
	    public String getReferenceField4() {
	        return referenceField4;
	    }
	    public void setReferenceField4(String referenceField4) {
	        this.referenceField4 = referenceField4;
	    }
	    public String getReferenceFieldValue4() {
	        return referenceFieldValue4;
	    }
	    public void setReferenceFieldValue4(String referenceFieldValue4) {
	        this.referenceFieldValue4 = referenceFieldValue4;
	    }
	    public String getSubscriberName() {
	        return subscriberName;
	    }
	    public void setSubscriberName(String subscriberName) {
	        this.subscriberName = subscriberName;
	    }
	    public String getIsRegistered() {
	        return isRegistered;
	    }
	    public void setIsRegistered(String isRegistered) {
	        this.isRegistered = isRegistered;
	    }
	    public Boolean getSelfConfirmed() {
	        return selfConfirmed;
	    }
	    public void setSelfConfirmed(Boolean selfConfirmed) {
	        this.selfConfirmed = selfConfirmed;
	    }
	    public String getRequestId() {
	        return requestId;
	    }
	    public void setRequestId(String requestId) {
	        this.requestId = requestId;
	    }
}
