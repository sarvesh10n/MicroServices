package com.aurionpro.txn.enquiry.requestobjects;

import java.util.List;

import com.aurionpro.generic.request.BaseResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

// TODO: Auto-generated Javadoc
/**
 * The Class InstrumentQuery.
 *
 * @author ramakant.ingole
 */
@JsonInclude(Include.NON_NULL)
public class InstrumentQuery extends BaseResponse {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The clg branch name. */
	private String clgBranchName;

	/** The clg user login. */
	private String clgUserLogin;

	/** The debit currency name. */
	private String debitCurrencyName;

	/** The enrichments. */
	private String enrichments;

	/** The corporate id. */
	private String corporateId;

	/** The corporate name. */
	private String corporateName;

	/** The corporate product id. */
	private String corporateProductId;

	/** The corporate product name. */
	private String corporateProductName;

	/** The batch no. */
	private String batchNo;

	/** The Bank ref no. */
	private String BankRefNo;

	/** The corporate ref no. */
	private String corporateRefNo;

	/** The error message. */
	private String errorMessage;

	/** The activation date. */
	private String activationDate;

	/** The instrument date. */
	private String instrumentDate;

	/** The activation start date. */
	private String activationStartDate;

	/** The activation end date. */
	private String activationEndDate;

	/** The activation start date. */
	private String entryStartDate;

	/** The activation end date. */
	private String entryEndDate;

	/** The instrument start date. */
	private String instrumentStartDate;

	/** The instrument end date. */
	private String instrumentEndDate;

	/** The payment method id. */
	private String paymentMethodId;

	/** The payment method name. */
	private String paymentMethodName;

	/** The payment method code. */
	private String paymentMethodCode;

	/** The issueance branch id. */
	private String issueanceBranchId;

	/** The issueance branch name. */
	private String issueanceBranchName;

	/** The print branch id. */
	private String printBranchId;

	/** The print branch name. */
	private String printBranchName;

	/** The instrument no. */
	private String instrumentNo;

	/** The short account no. */
	private String shortAccountNo;

	/** The payable amount. */
	private String payableAmount;

	/** The payable currency code. */
	private String payableCurrencyCode;

	/** The beneficiary id. */
	private String beneficiaryId;

	/** The beneficiary name. */
	private String beneficiaryName;

	/** The instrument start no. */
	private String instrumentStartNo;

	/** The instrument end no. */
	private String instrumentEndNo;

	/** The start amount. */
	private String startAmount;

	/** The end amount. */
	private String endAmount;

	/** The instrument status. */
	private String instrumentStatus;

	/** The maker. */
	private String maker;

	/** The approved1 date. */
	
	private String approved1Date;

	/** The approved2 by. */
	private String approved2By;

	/** The approved2 date. */
	
	private String approved2Date;

	/** The printed on. */
	
	private String printedOn;

	/** The printed by. */
	private String printedBy;

	/** The claimed date. */
	private String claimedDate;

	/** The claimed by. */
	private String claimedBy;

	/** The claimed update by. */
	private String claimedUpdateBy;

	/** The negotiation date. */
	private String negotiationDate;

	/** The negotiation by. */
	private String negotiationBy;

	/** The void date. */
	private String voidDate;

	/** The void by. */
	private String voidBy;

	/** The replaced date. */
	private String replacedDate;

	/** The replaced by. */
	private String replacedBy;

	/** The old check no. */
	private String oldCheckNo;

	/** The consolidation batch no. */
	private String consolidationBatchNo;

	/** The paid date. */
	private String paidDate;

	/** The paid location. */
	private String paidLocation;

	/** The remarks. */
	private String remarks;

	/** The special request batch no. */
	private String specialRequestBatchNo;

	/** The special request status. */
	private String specialRequestStatus;

	/** The partner bank name. */
	private String partnerBankName;

	/** The partner bank branch name. */
	private String partnerBankBranchName;

	/** The payable location name. */
	private String payableLocationName;

	/** The settlement date. */
	private String settlementDate;

	/** The settlement end date. */
	
	private String settlementEndDate;

	/** The utr no. */
	// private SystemRequestStatus systemRequestStatus;
	private String utrNo;

	/** The debit account no. */
	private String debitAccountNo;

	/** The debit account ccy. */
	private String debitAccountCcy;

	/** The ecs ref no check box. */
	private String ecsRefNoCheckBox;

	/** The u i status. */
	private String uIStatus;

	/** The contract mode. */
	private String contractMode;

	/** The fx rate. */
	private String fxRate;

	/** The buy currency name. */
	private String buyCurrencyName;

	/** The deal number. */
	private String dealNumber;

	/** The sell currency name. */
	private String sellCurrencyName;

	/** The dealer name. */
	private String dealerName;

	/** The account no. */
	private String accountNo;

	/** The parent id. */
	private Long parentId;

	/** The charge to. */
	private String chargeTo;

	/** The payment instructions. */
	private String paymentInstructions;

	/** The value date. */
	
	private String valueDate;

	/** The si batch no check box. */
	private String siBatchNoCheckBox;

	/** The error details. */
	private String errorDetails;

	/** The bic code. */
	/* Additional Details */
	private String bicCode;

	/** The bene bank. */
	private String beneBank;

	/** The bene branch. */
	private String beneBranch;

	/** The add1. */
	private String add1;

	/** The add2. */
	private String add2;

	/** The add3. */
	private String add3;

	/** The location name. */
	private String locationName;

	/** The state name. */
	private String stateName;

	/** The country name. */
	private String countryName;

	/** The bank sort code. */
	private String bankSortCode;

	/** The inter bank bic code. */
	private String interBankBICCode;

	/** The inter bank. */
	private String interBank;

	/** The inter bank branch. */
	private String interBankBranch;

	/** The inter bank add1. */
	private String interBankAdd1;

	/** The inter bank add2. */
	private String interBankAdd2;

	/** The inter bank add3. */
	private String interBankAdd3;

	/** The swift code. */
	private String swiftCode;

	/** The routing code. */
	private String routingCode;

	/** The account type. */
	private String accountType;

	/** The payment type. */
	private String paymentType;
	
	private String[] enrichmentDetailsHeaders;
	private List<String[]> enrichmentDetailsList;
	
	// Added for Supporting Document for OTT
		private String uploadFileName;
		
	/*Start:  Zip file upload*/
	private String supportingMSTFileName;
	private String supportingMSTSysFileName;
	private String supportingDocFilename;
	private String supportingDocSysfilename;	
	private String requestBy;
	
	private String paymentDetails1;
	
	private String paymentDetails2;
	private String paymentDetails3;
	private String paymentDetails4;
	
	private String channel;
	
	private String checkerChannel;
	
	private String verifiedBy;
	
	private String verifiedOn;
	
	private String collectorName;
	
	private String collectorIdType;
	
	private String collectorIdNumber;
	
	private String makerDateTime;
	
	/** Added By GS **/
	private String rejectReason;
	
	private String PostingReturnReason;
	
	private String systemRequestStatus;
	
	private String beneAccTypeName;
	

	private String modifiedBy;
	
		public String getUploadFileName() {
			return uploadFileName;
		}

		public void setUploadFileName(String uploadFileName) {
			this.uploadFileName = uploadFileName;
		}

	private String systemFileName;


	public String getSystemFileName() {
			return systemFileName;
		}

		public void setSystemFileName(String systemFileName) {
			this.systemFileName = systemFileName;
		}

	/**
	 * Gets the corporate id.
	 *
	 * @return the corporateId
	 */
	public String getCorporateId() {
		return corporateId;
	}

	/**
	 * Sets the corporate id.
	 *
	 * @param corporateId
	 *            the corporateId to set
	 */
	public void setCorporateId(String corporateId) {
		this.corporateId = corporateId;
	}

	/**
	 * Gets the corporate name.
	 *
	 * @return the corporateName
	 */
	public String getCorporateName() {
		return corporateName;
	}

	/**
	 * Sets the corporate name.
	 *
	 * @param corporateName
	 *            the corporateName to set
	 */
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	/**
	 * Gets the corporate product id.
	 *
	 * @return the corporateProductId
	 */
	public String getCorporateProductId() {
		return corporateProductId;
	}

	/**
	 * Sets the corporate product id.
	 *
	 * @param corporateProductId
	 *            the corporateProductId to set
	 */
	public void setCorporateProductId(String corporateProductId) {
		this.corporateProductId = corporateProductId;
	}

	/**
	 * Gets the corporate product name.
	 *
	 * @return the corporateProductName
	 */
	public String getCorporateProductName() {
		return corporateProductName;
	}

	/**
	 * Sets the corporate product name.
	 *
	 * @param corporateProductName
	 *            the corporateProductName to set
	 */
	public void setCorporateProductName(String corporateProductName) {
		this.corporateProductName = corporateProductName;
	}

	/**
	 * Gets the batch no.
	 *
	 * @return the batchNo
	 */
	public String getBatchNo() {
		return batchNo;
	}

	/**
	 * Sets the batch no.
	 *
	 * @param batchNo
	 *            the batchNo to set
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * Gets the bank ref no.
	 *
	 * @return the bankRefNo
	 */
	public String getBankRefNo() {
		return BankRefNo;
	}

	/**
	 * Sets the bank ref no.
	 *
	 * @param bankRefNo
	 *            the bankRefNo to set
	 */
	public void setBankRefNo(String bankRefNo) {
		BankRefNo = bankRefNo;
	}

	/**
	 * Gets the corporate ref no.
	 *
	 * @return the corporateRefNo
	 */
	public String getCorporateRefNo() {
		return corporateRefNo;
	}

	/**
	 * Sets the corporate ref no.
	 *
	 * @param corporateRefNo
	 *            the corporateRefNo to set
	 */
	public void setCorporateRefNo(String corporateRefNo) {
		this.corporateRefNo = corporateRefNo;
	}

	/**
	 * Gets the error message.
	 *
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Sets the error message.
	 *
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * Gets the payment method id.
	 *
	 * @return the paymentMethodId
	 */
	public String getPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * Sets the payment method id.
	 *
	 * @param paymentMethodId
	 *            the paymentMethodId to set
	 */
	public void setPaymentMethodId(String paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	/**
	 * Gets the payment method name.
	 *
	 * @return the paymentMethodName
	 */
	public String getPaymentMethodName() {
		return paymentMethodName;
	}

	/**
	 * Sets the payment method name.
	 *
	 * @param paymentMethodName
	 *            the paymentMethodName to set
	 */
	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}

	/**
	 * Gets the payment method code.
	 *
	 * @return the paymentMethodCode
	 */
	public String getPaymentMethodCode() {
		return paymentMethodCode;
	}

	/**
	 * Sets the payment method code.
	 *
	 * @param paymentMethodCode
	 *            the paymentMethodCode to set
	 */
	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}

	/**
	 * Gets the issueance branch id.
	 *
	 * @return the issueanceBranchId
	 */
	public String getIssueanceBranchId() {
		return issueanceBranchId;
	}

	/**
	 * Sets the issueance branch id.
	 *
	 * @param issueanceBranchId
	 *            the issueanceBranchId to set
	 */
	public void setIssueanceBranchId(String issueanceBranchId) {
		this.issueanceBranchId = issueanceBranchId;
	}

	/**
	 * Gets the issueance branch name.
	 *
	 * @return the issueanceBranchName
	 */
	public String getIssueanceBranchName() {
		return issueanceBranchName;
	}

	/**
	 * Sets the issueance branch name.
	 *
	 * @param issueanceBranchName
	 *            the issueanceBranchName to set
	 */
	public void setIssueanceBranchName(String issueanceBranchName) {
		this.issueanceBranchName = issueanceBranchName;
	}

	/**
	 * Gets the prints the branch id.
	 *
	 * @return the printBranchId
	 */
	public String getPrintBranchId() {
		return printBranchId;
	}

	/**
	 * Sets the prints the branch id.
	 *
	 * @param printBranchId
	 *            the printBranchId to set
	 */
	public void setPrintBranchId(String printBranchId) {
		this.printBranchId = printBranchId;
	}

	/**
	 * Gets the prints the branch name.
	 *
	 * @return the printBranchName
	 */
	public String getPrintBranchName() {
		return printBranchName;
	}

	/**
	 * Sets the prints the branch name.
	 *
	 * @param printBranchName
	 *            the printBranchName to set
	 */
	public void setPrintBranchName(String printBranchName) {
		this.printBranchName = printBranchName;
	}

	/**
	 * Gets the instrument no.
	 *
	 * @return the instrumentNo
	 */
	public String getInstrumentNo() {
		return instrumentNo;
	}

	/**
	 * Sets the instrument no.
	 *
	 * @param instrumentNo
	 *            the instrumentNo to set
	 */
	public void setInstrumentNo(String instrumentNo) {
		this.instrumentNo = instrumentNo;
	}

	/**
	 * Gets the short account no.
	 *
	 * @return the shortAccountNo
	 */
	public String getShortAccountNo() {
		return shortAccountNo;
	}

	/**
	 * Sets the short account no.
	 *
	 * @param shortAccountNo
	 *            the shortAccountNo to set
	 */
	public void setShortAccountNo(String shortAccountNo) {
		this.shortAccountNo = shortAccountNo;
	}

	/**
	 * Gets the payable amount.
	 *
	 * @return the payableAmount
	 */
	public String getPayableAmount() {
		return payableAmount;
	}

	/**
	 * Sets the payable amount.
	 *
	 * @param payableAmount
	 *            the payableAmount to set
	 */
	public void setPayableAmount(String payableAmount) {
		this.payableAmount = payableAmount;
	}

	/**
	 * Gets the payable currency code.
	 *
	 * @return the payableCurrencyCode
	 */
	public String getPayableCurrencyCode() {
		return payableCurrencyCode;
	}

	/**
	 * Sets the payable currency code.
	 *
	 * @param payableCurrencyCode
	 *            the payableCurrencyCode to set
	 */
	public void setPayableCurrencyCode(String payableCurrencyCode) {
		this.payableCurrencyCode = payableCurrencyCode;
	}

	/**
	 * Gets the beneficiary id.
	 *
	 * @return the beneficiaryId
	 */
	public String getBeneficiaryId() {
		return beneficiaryId;
	}

	/**
	 * Sets the beneficiary id.
	 *
	 * @param beneficiaryId
	 *            the beneficiaryId to set
	 */
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	/**
	 * Gets the beneficiary name.
	 *
	 * @return the beneficiaryName
	 */
	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	/**
	 * Sets the beneficiary name.
	 *
	 * @param beneficiaryName
	 *            the beneficiaryName to set
	 */
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	/**
	 * Gets the instrument start no.
	 *
	 * @return the instrumentStartNo
	 */
	public String getInstrumentStartNo() {
		return instrumentStartNo;
	}

	/**
	 * Sets the instrument start no.
	 *
	 * @param instrumentStartNo
	 *            the instrumentStartNo to set
	 */
	public void setInstrumentStartNo(String instrumentStartNo) {
		this.instrumentStartNo = instrumentStartNo;
	}

	/**
	 * Gets the instrument end no.
	 *
	 * @return the instrumentEndNo
	 */
	public String getInstrumentEndNo() {
		return instrumentEndNo;
	}

	/**
	 * Sets the instrument end no.
	 *
	 * @param instrumentEndNo
	 *            the instrumentEndNo to set
	 */
	public void setInstrumentEndNo(String instrumentEndNo) {
		this.instrumentEndNo = instrumentEndNo;
	}

	/**
	 * Gets the start amount.
	 *
	 * @return the startAmount
	 */
	public String getStartAmount() {
		return startAmount;
	}

	/**
	 * Sets the start amount.
	 *
	 * @param startAmount
	 *            the startAmount to set
	 */
	public void setStartAmount(String startAmount) {
		this.startAmount = startAmount;
	}

	/**
	 * Gets the end amount.
	 *
	 * @return the endAmount
	 */
	public String getEndAmount() {
		return endAmount;
	}

	/**
	 * Sets the end amount.
	 *
	 * @param endAmount
	 *            the endAmount to set
	 */
	public void setEndAmount(String endAmount) {
		this.endAmount = endAmount;
	}

	/**
	 * Gets the instrument status.
	 *
	 * @return the instrumentStatus
	 */
	public String getInstrumentStatus() {
		return instrumentStatus;
	}

	/**
	 * Sets the instrument status.
	 *
	 * @param instrumentStatus
	 *            the instrumentStatus to set
	 */
	public void setInstrumentStatus(String instrumentStatus) {
		this.instrumentStatus = instrumentStatus;
	}

	/**
	 * Gets the approved2 by.
	 *
	 * @return the approved2By
	 */
	public String getApproved2By() {
		return approved2By;
	}

	/**
	 * Sets the approved2 by.
	 *
	 * @param approved2By
	 *            the approved2By to set
	 */
	public void setApproved2By(String approved2By) {
		this.approved2By = approved2By;
	}

	/**
	 * Gets the printed by.
	 *
	 * @return the printedBy
	 */
	public String getPrintedBy() {
		return printedBy;
	}

	/**
	 * Sets the printed by.
	 *
	 * @param printedBy
	 *            the printedBy to set
	 */
	public void setPrintedBy(String printedBy) {
		this.printedBy = printedBy;
	}

	/**
	 * Gets the claimed by.
	 *
	 * @return the claimedBy
	 */
	public String getClaimedBy() {
		return claimedBy;
	}

	/**
	 * Sets the claimed by.
	 *
	 * @param claimedBy
	 *            the claimedBy to set
	 */
	public void setClaimedBy(String claimedBy) {
		this.claimedBy = claimedBy;
	}

	/**
	 * Gets the claimed update by.
	 *
	 * @return the claimedUpdateBy
	 */
	public String getClaimedUpdateBy() {
		return claimedUpdateBy;
	}

	/**
	 * Sets the claimed update by.
	 *
	 * @param claimedUpdateBy
	 *            the claimedUpdateBy to set
	 */
	public void setClaimedUpdateBy(String claimedUpdateBy) {
		this.claimedUpdateBy = claimedUpdateBy;
	}

	/**
	 * Gets the negotiation by.
	 *
	 * @return the negotiationBy
	 */
	public String getNegotiationBy() {
		return negotiationBy;
	}

	/**
	 * Sets the negotiation by.
	 *
	 * @param negotiationBy
	 *            the negotiationBy to set
	 */
	public void setNegotiationBy(String negotiationBy) {
		this.negotiationBy = negotiationBy;
	}

	/**
	 * Gets the void by.
	 *
	 * @return the voidBy
	 */
	public String getVoidBy() {
		return voidBy;
	}

	/**
	 * Sets the void by.
	 *
	 * @param voidBy
	 *            the voidBy to set
	 */
	public void setVoidBy(String voidBy) {
		this.voidBy = voidBy;
	}

	/**
	 * Gets the replaced by.
	 *
	 * @return the replacedBy
	 */
	public String getReplacedBy() {
		return replacedBy;
	}

	/**
	 * Sets the replaced by.
	 *
	 * @param replacedBy
	 *            the replacedBy to set
	 */
	public void setReplacedBy(String replacedBy) {
		this.replacedBy = replacedBy;
	}

	/**
	 * Gets the old check no.
	 *
	 * @return the oldCheckNo
	 */
	public String getOldCheckNo() {
		return oldCheckNo;
	}

	/**
	 * Sets the old check no.
	 *
	 * @param oldCheckNo
	 *            the oldCheckNo to set
	 */
	public void setOldCheckNo(String oldCheckNo) {
		this.oldCheckNo = oldCheckNo;
	}

	/**
	 * Gets the consolidation batch no.
	 *
	 * @return the consolidationBatchNo
	 */
	public String getConsolidationBatchNo() {
		return consolidationBatchNo;
	}

	/**
	 * Sets the consolidation batch no.
	 *
	 * @param consolidationBatchNo
	 *            the consolidationBatchNo to set
	 */
	public void setConsolidationBatchNo(String consolidationBatchNo) {
		this.consolidationBatchNo = consolidationBatchNo;
	}

	/**
	 * Gets the paid date.
	 *
	 * @return the paidDate
	 */
	public String getPaidDate() {
		return paidDate;
	}

	/**
	 * Sets the paid date.
	 *
	 * @param paidDate
	 *            the paidDate to set
	 */
	public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}

	/**
	 * Gets the paid location.
	 *
	 * @return the paidLocation
	 */
	public String getPaidLocation() {
		return paidLocation;
	}

	/**
	 * Sets the paid location.
	 *
	 * @param paidLocation
	 *            the paidLocation to set
	 */
	public void setPaidLocation(String paidLocation) {
		this.paidLocation = paidLocation;
	}

	/**
	 * Gets the remarks.
	 *
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * Sets the remarks.
	 *
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * Gets the special request batch no.
	 *
	 * @return the specialRequestBatchNo
	 */
	public String getSpecialRequestBatchNo() {
		return specialRequestBatchNo;
	}

	/**
	 * Sets the special request batch no.
	 *
	 * @param specialRequestBatchNo
	 *            the specialRequestBatchNo to set
	 */
	public void setSpecialRequestBatchNo(String specialRequestBatchNo) {
		this.specialRequestBatchNo = specialRequestBatchNo;
	}

	/**
	 * Gets the special request status.
	 *
	 * @return the specialRequestStatus
	 */
	public String getSpecialRequestStatus() {
		return specialRequestStatus;
	}

	/**
	 * Sets the special request status.
	 *
	 * @param specialRequestStatus
	 *            the specialRequestStatus to set
	 */
	public void setSpecialRequestStatus(String specialRequestStatus) {
		this.specialRequestStatus = specialRequestStatus;
	}

	/**
	 * Gets the partner bank name.
	 *
	 * @return the partnerBankName
	 */
	public String getPartnerBankName() {
		return partnerBankName;
	}

	/**
	 * Sets the partner bank name.
	 *
	 * @param partnerBankName
	 *            the partnerBankName to set
	 */
	public void setPartnerBankName(String partnerBankName) {
		this.partnerBankName = partnerBankName;
	}

	/**
	 * Gets the partner bank branch name.
	 *
	 * @return the partnerBankBranchName
	 */
	public String getPartnerBankBranchName() {
		return partnerBankBranchName;
	}

	/**
	 * Sets the partner bank branch name.
	 *
	 * @param partnerBankBranchName
	 *            the partnerBankBranchName to set
	 */
	public void setPartnerBankBranchName(String partnerBankBranchName) {
		this.partnerBankBranchName = partnerBankBranchName;
	}

	/**
	 * Gets the payable location name.
	 *
	 * @return the payableLocationName
	 */
	public String getPayableLocationName() {
		return payableLocationName;
	}

	/**
	 * Sets the payable location name.
	 *
	 * @param payableLocationName
	 *            the payableLocationName to set
	 */
	public void setPayableLocationName(String payableLocationName) {
		this.payableLocationName = payableLocationName;
	}

	/**
	 * Gets the utr no.
	 *
	 * @return the utrNo
	 */
	public String getUtrNo() {
		return utrNo;
	}

	/**
	 * Sets the utr no.
	 *
	 * @param utrNo
	 *            the utrNo to set
	 */
	public void setUtrNo(String utrNo) {
		this.utrNo = utrNo;
	}

	/**
	 * Gets the debit account no.
	 *
	 * @return the debitAccountNo
	 */
	public String getDebitAccountNo() {
		return debitAccountNo;
	}

	/**
	 * Sets the debit account no.
	 *
	 * @param debitAccountNo
	 *            the debitAccountNo to set
	 */
	public void setDebitAccountNo(String debitAccountNo) {
		this.debitAccountNo = debitAccountNo;
	}

	/**
	 * Gets the debit account ccy.
	 *
	 * @return the debitAccountCcy
	 */
	public String getDebitAccountCcy() {
		return debitAccountCcy;
	}

	/**
	 * Sets the debit account ccy.
	 *
	 * @param debitAccountCcy
	 *            the debitAccountCcy to set
	 */
	public void setDebitAccountCcy(String debitAccountCcy) {
		this.debitAccountCcy = debitAccountCcy;
	}

	/**
	 * Gets the ecs ref no check box.
	 *
	 * @return the ecsRefNoCheckBox
	 */
	public String getEcsRefNoCheckBox() {
		return ecsRefNoCheckBox;
	}

	/**
	 * Sets the ecs ref no check box.
	 *
	 * @param ecsRefNoCheckBox
	 *            the ecsRefNoCheckBox to set
	 */
	public void setEcsRefNoCheckBox(String ecsRefNoCheckBox) {
		this.ecsRefNoCheckBox = ecsRefNoCheckBox;
	}

	/**
	 * Gets the u i status.
	 *
	 * @return the uIStatus
	 */
	public String getuIStatus() {
		return uIStatus;
	}

	/**
	 * Sets the u i status.
	 *
	 * @param uIStatus
	 *            the uIStatus to set
	 */
	public void setuIStatus(String uIStatus) {
		this.uIStatus = uIStatus;
	}

	/**
	 * Gets the contract mode.
	 *
	 * @return the contractMode
	 */
	public String getContractMode() {
		return contractMode;
	}

	/**
	 * Sets the contract mode.
	 *
	 * @param contractMode
	 *            the contractMode to set
	 */
	public void setContractMode(String contractMode) {
		this.contractMode = contractMode;
	}

	/**
	 * Gets the fx rate.
	 *
	 * @return the fxRate
	 */
	public String getFxRate() {
		return fxRate;
	}

	/**
	 * Sets the fx rate.
	 *
	 * @param fxRate
	 *            the fxRate to set
	 */
	public void setFxRate(String fxRate) {
		this.fxRate = fxRate;
	}

	/**
	 * Gets the buy currency name.
	 *
	 * @return the buyCurrencyName
	 */
	public String getBuyCurrencyName() {
		return buyCurrencyName;
	}

	/**
	 * Sets the buy currency name.
	 *
	 * @param buyCurrencyName
	 *            the buyCurrencyName to set
	 */
	public void setBuyCurrencyName(String buyCurrencyName) {
		this.buyCurrencyName = buyCurrencyName;
	}

	/**
	 * Gets the deal number.
	 *
	 * @return the dealNumber
	 */
	public String getDealNumber() {
		return dealNumber;
	}

	/**
	 * Sets the deal number.
	 *
	 * @param dealNumber
	 *            the dealNumber to set
	 */
	public void setDealNumber(String dealNumber) {
		this.dealNumber = dealNumber;
	}

	/**
	 * Gets the sell currency name.
	 *
	 * @return the sellCurrencyName
	 */
	public String getSellCurrencyName() {
		return sellCurrencyName;
	}

	/**
	 * Sets the sell currency name.
	 *
	 * @param sellCurrencyName
	 *            the sellCurrencyName to set
	 */
	public void setSellCurrencyName(String sellCurrencyName) {
		this.sellCurrencyName = sellCurrencyName;
	}

	/**
	 * Gets the dealer name.
	 *
	 * @return the dealerName
	 */
	public String getDealerName() {
		return dealerName;
	}

	/**
	 * Sets the dealer name.
	 *
	 * @param dealerName
	 *            the dealerName to set
	 */
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	/**
	 * Gets the account no.
	 *
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * Sets the account no.
	 *
	 * @param accountNo
	 *            the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * Gets the parent id.
	 *
	 * @return the parentId
	 */
	public Long getParentId() {
		return parentId;
	}

	/**
	 * Sets the parent id.
	 *
	 * @param parentId
	 *            the parentId to set
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * Gets the charge to.
	 *
	 * @return the chargeTo
	 */
	public String getChargeTo() {
		return chargeTo;
	}

	/**
	 * Sets the charge to.
	 *
	 * @param chargeTo
	 *            the chargeTo to set
	 */
	public void setChargeTo(String chargeTo) {
		this.chargeTo = chargeTo;
	}

	/**
	 * Gets the payment instructions.
	 *
	 * @return the paymentInstructions
	 */
	public String getPaymentInstructions() {
		return paymentInstructions;
	}

	/**
	 * Sets the payment instructions.
	 *
	 * @param paymentInstructions
	 *            the paymentInstructions to set
	 */
	public void setPaymentInstructions(String paymentInstructions) {
		this.paymentInstructions = paymentInstructions;
	}

	/**
	 * Gets the si batch no check box.
	 *
	 * @return the siBatchNoCheckBox
	 */
	public String getSiBatchNoCheckBox() {
		return siBatchNoCheckBox;
	}

	/**
	 * Sets the si batch no check box.
	 *
	 * @param siBatchNoCheckBox
	 *            the siBatchNoCheckBox to set
	 */
	public void setSiBatchNoCheckBox(String siBatchNoCheckBox) {
		this.siBatchNoCheckBox = siBatchNoCheckBox;
	}

	/**
	 * Gets the error details.
	 *
	 * @return the errorDetails
	 */
	public String getErrorDetails() {
		return errorDetails;
	}

	/**
	 * Sets the error details.
	 *
	 * @param errorDetails
	 *            the errorDetails to set
	 */
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	/**
	 * Gets the enrichments.
	 *
	 * @return the enrichments
	 */
	public String getEnrichments() {
		return enrichments;
	}

	/**
	 * Sets the enrichments.
	 *
	 * @param enrichments
	 *            the enrichments to set
	 */
	public void setEnrichments(String enrichments) {
		this.enrichments = enrichments;
	}

	/**
	 * Gets the clg branch name.
	 *
	 * @return the clgBranchName
	 */
	public String getClgBranchName() {
		return clgBranchName;
	}

	/**
	 * Sets the clg branch name.
	 *
	 * @param clgBranchName
	 *            the clgBranchName to set
	 */
	public void setClgBranchName(String clgBranchName) {
		this.clgBranchName = clgBranchName;
	}

	/**
	 * Gets the clg user login.
	 *
	 * @return the clgUserLogin
	 */
	public String getClgUserLogin() {
		return clgUserLogin;
	}

	/**
	 * Sets the clg user login.
	 *
	 * @param clgUserLogin
	 *            the clgUserLogin to set
	 */
	public void setClgUserLogin(String clgUserLogin) {
		this.clgUserLogin = clgUserLogin;
	}

	/**
	 * Gets the debit currency name.
	 *
	 * @return the debitCurrencyName
	 */
	public String getDebitCurrencyName() {
		return debitCurrencyName;
	}

	/**
	 * Sets the debit currency name.
	 *
	 * @param debitCurrencyName
	 *            the debitCurrencyName to set
	 */
	public void setDebitCurrencyName(String debitCurrencyName) {
		this.debitCurrencyName = debitCurrencyName;
	}

	/**
	 * Gets the bic code.
	 *
	 * @return the bicCode
	 */
	public String getBicCode() {
		return bicCode;
	}

	/**
	 * Sets the bic code.
	 *
	 * @param bicCode
	 *            the bicCode to set
	 */
	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
	}

	/**
	 * Gets the bene bank.
	 *
	 * @return the beneBank
	 */
	public String getBeneBank() {
		return beneBank;
	}

	/**
	 * Sets the bene bank.
	 *
	 * @param beneBank
	 *            the beneBank to set
	 */
	public void setBeneBank(String beneBank) {
		this.beneBank = beneBank;
	}

	/**
	 * Gets the bene branch.
	 *
	 * @return the beneBranch
	 */
	public String getBeneBranch() {
		return beneBranch;
	}

	/**
	 * Sets the bene branch.
	 *
	 * @param beneBranch
	 *            the beneBranch to set
	 */
	public void setBeneBranch(String beneBranch) {
		this.beneBranch = beneBranch;
	}

	/**
	 * Gets the add1.
	 *
	 * @return the add1
	 */
	public String getAdd1() {
		return add1;
	}

	/**
	 * Sets the add1.
	 *
	 * @param add1
	 *            the add1 to set
	 */
	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	/**
	 * Gets the add2.
	 *
	 * @return the add2
	 */
	public String getAdd2() {
		return add2;
	}

	/**
	 * Sets the add2.
	 *
	 * @param add2
	 *            the add2 to set
	 */
	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	/**
	 * Gets the add3.
	 *
	 * @return the add3
	 */
	public String getAdd3() {
		return add3;
	}

	/**
	 * Sets the add3.
	 *
	 * @param add3
	 *            the add3 to set
	 */
	public void setAdd3(String add3) {
		this.add3 = add3;
	}

	/**
	 * Gets the location name.
	 *
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * Sets the location name.
	 *
	 * @param locationName
	 *            the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 * Gets the state name.
	 *
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * Sets the state name.
	 *
	 * @param stateName
	 *            the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * Gets the country name.
	 *
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * Sets the country name.
	 *
	 * @param countryName
	 *            the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * Gets the bank sort code.
	 *
	 * @return the bankSortCode
	 */
	public String getBankSortCode() {
		return bankSortCode;
	}

	/**
	 * Sets the bank sort code.
	 *
	 * @param bankSortCode
	 *            the bankSortCode to set
	 */
	public void setBankSortCode(String bankSortCode) {
		this.bankSortCode = bankSortCode;
	}

	/**
	 * Gets the inter bank bic code.
	 *
	 * @return the interBankBICCode
	 */
	public String getInterBankBICCode() {
		return interBankBICCode;
	}

	/**
	 * Sets the inter bank bic code.
	 *
	 * @param interBankBICCode
	 *            the interBankBICCode to set
	 */
	public void setInterBankBICCode(String interBankBICCode) {
		this.interBankBICCode = interBankBICCode;
	}

	/**
	 * Gets the inter bank.
	 *
	 * @return the interBank
	 */
	public String getInterBank() {
		return interBank;
	}

	/**
	 * Sets the inter bank.
	 *
	 * @param interBank
	 *            the interBank to set
	 */
	public void setInterBank(String interBank) {
		this.interBank = interBank;
	}

	/**
	 * Gets the inter bank branch.
	 *
	 * @return the interBankBranch
	 */
	public String getInterBankBranch() {
		return interBankBranch;
	}

	/**
	 * Sets the inter bank branch.
	 *
	 * @param interBankBranch
	 *            the interBankBranch to set
	 */
	public void setInterBankBranch(String interBankBranch) {
		this.interBankBranch = interBankBranch;
	}

	/**
	 * Gets the inter bank add1.
	 *
	 * @return the interBankAdd1
	 */
	public String getInterBankAdd1() {
		return interBankAdd1;
	}

	/**
	 * Sets the inter bank add1.
	 *
	 * @param interBankAdd1
	 *            the interBankAdd1 to set
	 */
	public void setInterBankAdd1(String interBankAdd1) {
		this.interBankAdd1 = interBankAdd1;
	}

	/**
	 * Gets the inter bank add2.
	 *
	 * @return the interBankAdd2
	 */
	public String getInterBankAdd2() {
		return interBankAdd2;
	}

	/**
	 * Sets the inter bank add2.
	 *
	 * @param interBankAdd2
	 *            the interBankAdd2 to set
	 */
	public void setInterBankAdd2(String interBankAdd2) {
		this.interBankAdd2 = interBankAdd2;
	}

	/**
	 * Gets the inter bank add3.
	 *
	 * @return the interBankAdd3
	 */
	public String getInterBankAdd3() {
		return interBankAdd3;
	}

	/**
	 * Sets the inter bank add3.
	 *
	 * @param interBankAdd3
	 *            the interBankAdd3 to set
	 */
	public void setInterBankAdd3(String interBankAdd3) {
		this.interBankAdd3 = interBankAdd3;
	}

	/**
	 * Gets the swift code.
	 *
	 * @return the swiftCode
	 */
	public String getSwiftCode() {
		return swiftCode;
	}

	/**
	 * Sets the swift code.
	 *
	 * @param swiftCode
	 *            the swiftCode to set
	 */
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	/**
	 * Gets the routing code.
	 *
	 * @return the routingCode
	 */
	public String getRoutingCode() {
		return routingCode;
	}

	/**
	 * Sets the routing code.
	 *
	 * @param routingCode
	 *            the routingCode to set
	 */
	public void setRoutingCode(String routingCode) {
		this.routingCode = routingCode;
	}

	/**
	 * Gets the maker.
	 *
	 * @return the maker
	 */
	public String getMaker() {
		return maker;
	}

	/**
	 * Sets the maker.
	 *
	 * @param maker
	 *            the maker to set
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}

	/**
	 * Gets the printed on.
	 *
	 * @return the printedOn
	 */
	public String getPrintedOn() {
		return printedOn;
	}

	/**
	 * Sets the printed on.
	 *
	 * @param printedOn
	 *            the printedOn to set
	 */
	public void setPrintedOn(String printedOn) {
		this.printedOn = printedOn;
	}

	/**
	 * Gets the account type.
	 *
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Sets the account type.
	 *
	 * @param accountType
	 *            the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * Gets the activation date.
	 *
	 * @return the activationDate
	 */
	public String getActivationDate() {
		return activationDate;
	}

	/**
	 * Sets the activation date.
	 *
	 * @param activationDate
	 *            the activationDate to set
	 */
	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}

	/**
	 * Gets the instrument date.
	 *
	 * @return the instrumentDate
	 */
	public String getInstrumentDate() {
		return instrumentDate;
	}

	/**
	 * Sets the instrument date.
	 *
	 * @param instrumentDate
	 *            the instrumentDate to set
	 */
	public void setInstrumentDate(String instrumentDate) {
		this.instrumentDate = instrumentDate;
	}

	/**
	 * Gets the activation start date.
	 *
	 * @return the activationStartDate
	 */
	public String getActivationStartDate() {
		return activationStartDate;
	}

	/**
	 * Sets the activation start date.
	 *
	 * @param activationStartDate
	 *            the activationStartDate to set
	 */
	public void setActivationStartDate(String activationStartDate) {
		this.activationStartDate = activationStartDate;
	}

	/**
	 * Gets the activation end date.
	 *
	 * @return the activationEndDate
	 */
	public String getActivationEndDate() {
		return activationEndDate;
	}

	/**
	 * Sets the activation end date.
	 *
	 * @param activationEndDate
	 *            the activationEndDate to set
	 */
	public void setActivationEndDate(String activationEndDate) {
		this.activationEndDate = activationEndDate;
	}

	
	public String getEntryStartDate() {
		return entryStartDate;
	}

	public void setEntryStartDate(String entryStartDate) {
		this.entryStartDate = entryStartDate;
	}

	public String getEntryEndDate() {
		return entryEndDate;
	}

	public void setEntryEndDate(String entryEndDate) {
		this.entryEndDate = entryEndDate;
	}

	/**
	 * Gets the instrument start date.
	 *
	 * @return the instrumentStartDate
	 */
	public String getInstrumentStartDate() {
		return instrumentStartDate;
	}

	/**
	 * Sets the instrument start date.
	 *
	 * @param instrumentStartDate
	 *            the instrumentStartDate to set
	 */
	public void setInstrumentStartDate(String instrumentStartDate) {
		this.instrumentStartDate = instrumentStartDate;
	}

	/**
	 * Gets the instrument end date.
	 *
	 * @return the instrumentEndDate
	 */
	public String getInstrumentEndDate() {
		return instrumentEndDate;
	}

	/**
	 * Sets the instrument end date.
	 *
	 * @param instrumentEndDate
	 *            the instrumentEndDate to set
	 */
	public void setInstrumentEndDate(String instrumentEndDate) {
		this.instrumentEndDate = instrumentEndDate;
	}

	/**
	 * Gets the approved1 date.
	 *
	 * @return the approved1Date
	 */
	public String getApproved1Date() {
		return approved1Date;
	}

	/**
	 * Sets the approved1 date.
	 *
	 * @param approved1Date
	 *            the approved1Date to set
	 */
	public void setApproved1Date(String approved1Date) {
		this.approved1Date = approved1Date;
	}

	/**
	 * Gets the approved2 date.
	 *
	 * @return the approved2Date
	 */
	public String getApproved2Date() {
		return approved2Date;
	}

	/**
	 * Sets the approved2 date.
	 *
	 * @param approved2Date
	 *            the approved2Date to set
	 */
	public void setApproved2Date(String approved2Date) {
		this.approved2Date = approved2Date;
	}

	/**
	 * Gets the claimed date.
	 *
	 * @return the claimedDate
	 */
	public String getClaimedDate() {
		return claimedDate;
	}

	/**
	 * Sets the claimed date.
	 *
	 * @param claimedDate
	 *            the claimedDate to set
	 */
	public void setClaimedDate(String claimedDate) {
		this.claimedDate = claimedDate;
	}

	/**
	 * Gets the negotiation date.
	 *
	 * @return the negotiationDate
	 */
	public String getNegotiationDate() {
		return negotiationDate;
	}

	/**
	 * Sets the negotiation date.
	 *
	 * @param negotiationDate
	 *            the negotiationDate to set
	 */
	public void setNegotiationDate(String negotiationDate) {
		this.negotiationDate = negotiationDate;
	}

	/**
	 * Gets the void date.
	 *
	 * @return the voidDate
	 */
	public String getVoidDate() {
		return voidDate;
	}

	/**
	 * Sets the void date.
	 *
	 * @param voidDate
	 *            the voidDate to set
	 */
	public void setVoidDate(String voidDate) {
		this.voidDate = voidDate;
	}

	/**
	 * Gets the replaced date.
	 *
	 * @return the replacedDate
	 */
	public String getReplacedDate() {
		return replacedDate;
	}

	/**
	 * Sets the replaced date.
	 *
	 * @param replacedDate
	 *            the replacedDate to set
	 */
	public void setReplacedDate(String replacedDate) {
		this.replacedDate = replacedDate;
	}

	/**
	 * Gets the settlement date.
	 *
	 * @return the settlementDate
	 */
	public String getSettlementDate() {
		return settlementDate;
	}

	/**
	 * Sets the settlement date.
	 *
	 * @param settlementDate
	 *            the settlementDate to set
	 */
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	/**
	 * Gets the settlement end date.
	 *
	 * @return the settlementEndDate
	 */
	public String getSettlementEndDate() {
		return settlementEndDate;
	}

	/**
	 * Sets the settlement end date.
	 *
	 * @param settlementEndDate
	 *            the settlementEndDate to set
	 */
	public void setSettlementEndDate(String settlementEndDate) {
		this.settlementEndDate = settlementEndDate;
	}

	/**
	 * Gets the value date.
	 *
	 * @return the valueDate
	 */
	public String getValueDate() {
		return valueDate;
	}

	/**
	 * Sets the value date.
	 *
	 * @param valueDate
	 *            the valueDate to set
	 */
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	/**
	 * Gets the payment type.
	 *
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * Sets the payment type.
	 *
	 * @param paymentType
	 *            the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	@Override
	public String getEntityIdentifier() {
		return "EntityIdentifier : "+getCorporateName();
	}

	public String[] getEnrichmentDetailsHeaders() {
		return enrichmentDetailsHeaders;
	}

	public void setEnrichmentDetailsHeaders(String[] enrichmentDetailsHeaders) {
		this.enrichmentDetailsHeaders = enrichmentDetailsHeaders;
	}

	public List<String[]> getEnrichmentDetailsList() {
		return enrichmentDetailsList;
	}

	public void setEnrichmentDetailsList(List<String[]> enrichmentDetailsList) {
		this.enrichmentDetailsList = enrichmentDetailsList;
	}

	public String getSupportingMSTFileName() {
		return supportingMSTFileName;
	}

	public void setSupportingMSTFileName(String supportingMSTFileName) {
		this.supportingMSTFileName = supportingMSTFileName;
	}

	public String getSupportingMSTSysFileName() {
		return supportingMSTSysFileName;
	}

	public void setSupportingMSTSysFileName(String supportingMSTSysFileName) {
		this.supportingMSTSysFileName = supportingMSTSysFileName;
	}

	public String getSupportingDocFilename() {
		return supportingDocFilename;
	}

	public void setSupportingDocFilename(String supportingDocFilename) {
		this.supportingDocFilename = supportingDocFilename;
	}

	public String getSupportingDocSysfilename() {
		return supportingDocSysfilename;
	}

	public void setSupportingDocSysfilename(String supportingDocSysfilename) {
		this.supportingDocSysfilename = supportingDocSysfilename;
	}

	public String getRequestBy() {
		return requestBy;
	}

	public void setRequestBy(String requestBy) {
		this.requestBy = requestBy;
	}

	public String getPaymentDetails1() {
		return paymentDetails1;
}

	public void setPaymentDetails1(String paymentDetails1) {
		this.paymentDetails1 = paymentDetails1;
	}

	public String getPaymentDetails2() {
		return paymentDetails2;
	}

	public void setPaymentDetails2(String paymentDetails2) {
		this.paymentDetails2 = paymentDetails2;
	}

	public String getPaymentDetails3() {
		return paymentDetails3;
	}

	public void setPaymentDetails3(String paymentDetails3) {
		this.paymentDetails3 = paymentDetails3;
	}

	public String getPaymentDetails4() {
		return paymentDetails4;
	}

	public void setPaymentDetails4(String paymentDetails4) {
		this.paymentDetails4 = paymentDetails4;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCheckerChannel() {
		return checkerChannel;
	}

	public void setCheckerChannel(String checkerChannel) {
		this.checkerChannel = checkerChannel;
	}

	public String getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	public String getVerifiedOn() {
		return verifiedOn;
	}

	public void setVerifiedOn(String verifiedOn) {
		this.verifiedOn = verifiedOn;
	}

	public String getCollectorName() {
		return collectorName;
	}

	public void setCollectorName(String collectorName) {
		this.collectorName = collectorName;
	}

	public String getCollectorIdType() {
		return collectorIdType;
	}

	public void setCollectorIdType(String collectorIdType) {
		this.collectorIdType = collectorIdType;
	}

	public String getCollectorIdNumber() {
		return collectorIdNumber;
	}

	public void setCollectorIdNumber(String collectorIdNumber) {
		this.collectorIdNumber = collectorIdNumber;
	}

	public String getMakerDateTime() {
		return makerDateTime;
	}

	public void setMakerDateTime(String makerDateTime) {
		this.makerDateTime = makerDateTime;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getPostingReturnReason() {
		return PostingReturnReason;
	}

	public void setPostingReturnReason(String postingReturnReason) {
		PostingReturnReason = postingReturnReason;
	}

	public String getSystemRequestStatus() {
		return systemRequestStatus;
	}

	public void setSystemRequestStatus(String systemRequestStatus) {
		this.systemRequestStatus = systemRequestStatus;
	}



	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getBeneAccTypeName() {
		return beneAccTypeName;
	}

	public void setBeneAccTypeName(String beneAccTypeName) {
		this.beneAccTypeName = beneAccTypeName;
	}
	
}
