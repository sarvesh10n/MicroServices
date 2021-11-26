package com.aurionpro.account.statement.requestobjects;

import java.io.Serializable;

public class AccountStatementRequest implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -3240626901854890403L;
	private String accountNo;
    private String accountId;
    private String accountName;
    private String transactionType;
    private String fromAmount;
    private String toAmount;
    private String referenceNo;
    private String currencyName;
    private Boolean isIbanPresent;
    private String fromDate;
    private String toDate;
    private String dataRange;
    private String selectedFormat;
    private String bankType;
    private String addInfoRequired;
    private String downloadFormat;
    private String bicCode;
    private String requestId;
    private String cif;
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public String getFromAmount() {
        return fromAmount;
    }
    public void setFromAmount(String fromAmount) {
        this.fromAmount = fromAmount;
    }
    public String getToAmount() {
        return toAmount;
    }
    public void setToAmount(String toAmount) {
        this.toAmount = toAmount;
    }
    public String getReferenceNo() {
        return referenceNo;
    }
    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
    public String getCurrencyName() {
        return currencyName;
    }
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
    public Boolean getIsIbanPresent() {
        return isIbanPresent;
    }
    public void setIsIbanPresent(Boolean isIbanPresent) {
        this.isIbanPresent = isIbanPresent;
    }
    public String getFromDate() {
        return fromDate;
    }
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }
    public String getToDate() {
        return toDate;
    }
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
    public String getDataRange() {
        return dataRange;
    }
    public void setDataRange(String dataRange) {
        this.dataRange = dataRange;
    }
    public String getSelectedFormat() {
        return selectedFormat;
    }
    public void setSelectedFormat(String selectedFormat) {
        this.selectedFormat = selectedFormat;
    }
    public String getBankType() {
        return bankType;
    }
    public void setBankType(String bankType) {
        this.bankType = bankType;
    }
    public String getAddInfoRequired() {
        return addInfoRequired;
    }
    public void setAddInfoRequired(String addInfoRequired) {
        this.addInfoRequired = addInfoRequired;
    }
    public String getDownloadFormat() {
        return downloadFormat;
    }
    public void setDownloadFormat(String downloadFormat) {
        this.downloadFormat = downloadFormat;
    }
    public String getBicCode() {
        return bicCode;
    }
    public void setBicCode(String bicCode) {
        this.bicCode = bicCode;
    }
    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
    
}
