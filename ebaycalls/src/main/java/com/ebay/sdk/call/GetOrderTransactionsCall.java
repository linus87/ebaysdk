/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.Boolean;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetOrderTransactions call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ItemTransactionIDArray</code> - This container is used if the seller wants to search for one or more specific order line items. An <b>ItemTransactionID</b> container is required for each order line item that is to be retrieved.  An order line item can be identified with an <b>ItemID</b>/<b>TransactionID</b> pair, with a <b>OrderLineItemID</b> value, or with a <b>SKU</b> value (if a SKU exists for the order line item).
 * <br> <B>Input property:</B> <code>OrderIDArray</code> - This container is used if the seller wants to search for one or more specific orders. An <b>OrderID</b> field is required for each order that is to be retrieved.  Up to 20 <b>OrderID</b> fields can be used.
 * <br> <B>Input property:</B> <code>Platform</code> - <span class="tablenote"><b>Note: </b> This field's purpose is to allow the seller to retrieve only eBay listings or only Half.com listings instead of both order types. Since the Half.com site has been shut down, this field is no longer necessary to use since eBay orders will be the only orders that are retrieved.
 * </span>
 * The default behavior of <b>GetOrderTransactions</b> is to retrieve all orders originating from eBay.com and Half.com. If the user wants to retrieve only eBay.com order line items or Half.com order line items, this filter can be used to perform that function. Inserting <code>eBay</code> into this field will restrict retrieved order line items to those originating on eBay.com, and inserting <code>Half</code> into this field will restrict retrieved order line items to those originating on Half.com.
 * <br> <B>Input property:</B> <code>IncludeFinalValueFees</code> - This field is included and set to <code>true</code> if the seller wishes to include the Final Value Fee (FVF) for each order in the response. A Final Value Fee is calculated based on total amount of the sale, including the final price of the item and shipping/handling charges. This fee is charged to a seller's account immediately upon creation of an order line item.
 * <br> <B>Output property:</B> <code>ReturnedOrderArray</code> - This container consists of an array of eBay orders that match the input criteria that was passed into the call request.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetOrderTransactionsCall extends com.ebay.sdk.ApiCall
{
  
  private ItemTransactionIDArrayType itemTransactionIDArray = null;
  private OrderIDArrayType orderIDArray = null;
  private TransactionPlatformCodeType platform = null;
  private Boolean includeFinalValueFees = null;
  private OrderArrayType returnedOrderArray=null;


  /**
   * Constructor.
   */
  public GetOrderTransactionsCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetOrderTransactionsCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * The base request type for the <b>GetOrderTransactions</b> call. This call retrieves detailed information about one or more orders. All recent orders can be retrieved, or the seller can search based on <b>OrderID</b> value(s), <b>ItemID</b> value(s), <b>OrderLineItemID</b> value(s), or by <b>SKU</b> value(s).
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The OrderArrayType object.
   */
  public OrderArrayType getOrderTransactions()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetOrderTransactionsRequestType req;
    req = new GetOrderTransactionsRequestType();
    if (this.itemTransactionIDArray != null)
      req.setItemTransactionIDArray(this.itemTransactionIDArray);
    if (this.orderIDArray != null)
      req.setOrderIDArray(this.orderIDArray);
    if (this.platform != null)
      req.setPlatform(this.platform);
    if (this.includeFinalValueFees != null)
      req.setIncludeFinalValueFees(this.includeFinalValueFees);

    GetOrderTransactionsResponseType resp = (GetOrderTransactionsResponseType) execute(req);

    this.returnedOrderArray = resp.getOrderArray();
    return this.getReturnedOrderArray();
  }

  /**
   * Gets the GetOrderTransactionsRequestType.includeFinalValueFees.
   * @return Boolean
   */
  public Boolean getIncludeFinalValueFees()
  {
    return this.includeFinalValueFees;
  }

  /**
   * Sets the GetOrderTransactionsRequestType.includeFinalValueFees.
   * @param includeFinalValueFees Boolean
   */
  public void setIncludeFinalValueFees(Boolean includeFinalValueFees)
  {
    this.includeFinalValueFees = includeFinalValueFees;
  }

  /**
   * Gets the GetOrderTransactionsRequestType.itemTransactionIDArray.
   * @return ItemTransactionIDArrayType
   */
  public ItemTransactionIDArrayType getItemTransactionIDArray()
  {
    return this.itemTransactionIDArray;
  }

  /**
   * Sets the GetOrderTransactionsRequestType.itemTransactionIDArray.
   * @param itemTransactionIDArray ItemTransactionIDArrayType
   */
  public void setItemTransactionIDArray(ItemTransactionIDArrayType itemTransactionIDArray)
  {
    this.itemTransactionIDArray = itemTransactionIDArray;
  }

  /**
   * Gets the GetOrderTransactionsRequestType.orderIDArray.
   * @return OrderIDArrayType
   */
  public OrderIDArrayType getOrderIDArray()
  {
    return this.orderIDArray;
  }

  /**
   * Sets the GetOrderTransactionsRequestType.orderIDArray.
   * @param orderIDArray OrderIDArrayType
   */
  public void setOrderIDArray(OrderIDArrayType orderIDArray)
  {
    this.orderIDArray = orderIDArray;
  }

  /**
   * Gets the GetOrderTransactionsRequestType.platform.
   * @return TransactionPlatformCodeType
   */
  public TransactionPlatformCodeType getPlatform()
  {
    return this.platform;
  }

  /**
   * Sets the GetOrderTransactionsRequestType.platform.
   * @param platform TransactionPlatformCodeType
   */
  public void setPlatform(TransactionPlatformCodeType platform)
  {
    this.platform = platform;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetOrderTransactionsResponseType.returnedOrderArray.
   * 
   * @return OrderArrayType
   */
  public OrderArrayType getReturnedOrderArray()
  {
    return this.returnedOrderArray;
  }

}

