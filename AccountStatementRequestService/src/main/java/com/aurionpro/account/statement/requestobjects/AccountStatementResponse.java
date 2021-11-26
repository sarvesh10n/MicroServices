package com.aurionpro.account.statement.requestobjects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountStatementResponse {

	
	String uuid;
	String date_time;
	String Open_Bal;
	String Close_Bal;
	String Unclear_Bal;
	String productName;
	List<TransactionDetail> trnDetail;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getDate_time() {
		return date_time;
	}

	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}

	
	public String getOpen_Bal() {
		return Open_Bal;
	}

	public void setOpen_Bal(String open_Bal) {
		Open_Bal = open_Bal;
	}

	public String getClose_Bal() {
		return Close_Bal;
	}

	public void setClose_Bal(String close_Bal) {
		Close_Bal = close_Bal;
	}

	public String getUnclear_Bal() {
		return Unclear_Bal;
	}

	public void setUnclear_Bal(String unclear_Bal) {
		Unclear_Bal = unclear_Bal;
	}

	public List<TransactionDetail> getTrnDetail() {
		return trnDetail;
	}

	public void setTrnDetail(List<TransactionDetail> trnDetail) {
		this.trnDetail = trnDetail;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}


class TransactionDetail {
	

	
	@JsonProperty("Tran_Date")
	String tran_Date;
	
	@JsonProperty("Value_Date")
	String value_Date;
	
	@JsonProperty("ChequeNo")
	String chequeNo;
	
	@JsonProperty("Tran_Details")
	String tran_Details;
	
	@JsonProperty("Amount")
	String amount;
	
	@JsonProperty("DR_CR_Flag")
	String dR_CR_Flag;
	
	@JsonProperty("Running_Balance")
	String Running_Balance;
	
	@JsonProperty("Clearing_Branch")
	String clearing_Branch;
	
	@JsonProperty("Tran_Desc")
	String tran_Desc;
	
	@JsonProperty("Opening_Balance")
	String Opening_Balance;
	
	@JsonProperty("Journal_sequence")
	String journal_sequence;
	
	@JsonProperty("Transaction_Code")
	String transaction_Code;
	
	@JsonProperty("Description")
	String description;
	
	@JsonProperty("References")
	String references;
	
	@JsonProperty("Corporate_Reference_No")
	String corporate_Reference_No;
	
	@JsonProperty("Remitter_Info")
	String remitter_Info;
	
	@JsonProperty("Benificiary_Info")
	String benificiary_Info;
	
	@JsonProperty("Sender_to_reciver_Info")
	String sender_to_receiver_Info;
	
	@JsonProperty("Swift_Reference_No")
	String swift_Reference_No;
	
	String accountNumber;

	public String getTran_Date() {
		return tran_Date;
	}

	public void setTran_Date(String tran_Date) {
		this.tran_Date = tran_Date;
	}

	public String getValue_Date() {
		return value_Date;
	}

	public void setValue_Date(String value_Date) {
		this.value_Date = value_Date;
	}

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getTran_Details() {
		return tran_Details;
	}

	public void setTran_Details(String tran_Details) {
		this.tran_Details = tran_Details;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getdR_CR_Flag() {
		return dR_CR_Flag;
	}

	public void setdR_CR_Flag(String dR_CR_Flag) {
		this.dR_CR_Flag = dR_CR_Flag;
	}

	public String getRunning_Balance() {
		return Running_Balance;
	}

	public void setRunning_Balance(String running_Balance) {
		Running_Balance = running_Balance;
	}

	public String getClearing_Branch() {
		return clearing_Branch;
	}

	public void setClearing_Branch(String clearing_Branch) {
		this.clearing_Branch = clearing_Branch;
	}

	public String getTran_Desc() {
		return tran_Desc;
	}

	public void setTran_Desc(String tran_Desc) {
		this.tran_Desc = tran_Desc;
	}

	public String getOpening_Balance() {
		return Opening_Balance;
	}

	public void setOpening_Balance(String opening_Balance) {
		Opening_Balance = opening_Balance;
	}

	public String getJournal_sequence() {
		return journal_sequence;
	}

	public void setJournal_sequence(String journal_sequence) {
		this.journal_sequence = journal_sequence;
	}

	public String getTransaction_Code() {
		return transaction_Code;
	}

	public void setTransaction_Code(String transaction_Code) {
		this.transaction_Code = transaction_Code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReferences() {
		return references;
	}

	public void setReferences(String references) {
		this.references = references;
	}

	public String getCorporate_Reference_No() {
		return corporate_Reference_No;
	}

	public void setCorporate_Reference_No(String corporate_Reference_No) {
		this.corporate_Reference_No = corporate_Reference_No;
	}

	public String getRemitter_Info() {
		return remitter_Info;
	}

	public void setRemitter_Info(String remitter_Info) {
		this.remitter_Info = remitter_Info;
	}

	public String getBenificiary_Info() {
		return benificiary_Info;
	}

	public void setBenificiary_Info(String benificiary_Info) {
		this.benificiary_Info = benificiary_Info;
	}

	public String getSender_to_receiver_Info() {
		return sender_to_receiver_Info;
	}

	public void setSender_to_receiver_Info(String sender_to_receiver_Info) {
		this.sender_to_receiver_Info = sender_to_receiver_Info;
	}

	public String getSwift_Reference_No() {
		return swift_Reference_No;
	}

	public void setSwift_Reference_No(String swift_Reference_No) {
		this.swift_Reference_No = swift_Reference_No;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}

