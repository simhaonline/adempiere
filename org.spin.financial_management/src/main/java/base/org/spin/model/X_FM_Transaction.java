/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.spin.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for FM_Transaction
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_FM_Transaction extends PO implements I_FM_Transaction, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20180301L;

    /** Standard Constructor */
    public X_FM_Transaction (Properties ctx, int FM_Transaction_ID, String trxName)
    {
      super (ctx, FM_Transaction_ID, trxName);
      /** if (FM_Transaction_ID == 0)
        {
			setAmount (Env.ZERO);
			setDateTrx (new Timestamp( System.currentTimeMillis() ));
			setFM_Account_ID (0);
			setFM_Batch_ID (0);
			setFM_Transaction_ID (0);
			setProcessed (false);
// N
        } */
    }

    /** Load Constructor */
    public X_FM_Transaction (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_FM_Transaction[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount)
	{
		set_Value (COLUMNNAME_Amount, Amount);
	}

	/** Get Amount.
		@return Amount in a defined currency
	  */
	public BigDecimal getAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Transaction Date.
		@param DateTrx 
		Transaction Date
	  */
	public void setDateTrx (Timestamp DateTrx)
	{
		set_Value (COLUMNNAME_DateTrx, DateTrx);
	}

	/** Get Transaction Date.
		@return Transaction Date
	  */
	public Timestamp getDateTrx () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTrx);
	}

	public org.spin.model.I_FM_Account getFM_Account() throws RuntimeException
    {
		return (org.spin.model.I_FM_Account)MTable.get(getCtx(), org.spin.model.I_FM_Account.Table_Name)
			.getPO(getFM_Account_ID(), get_TrxName());	}

	/** Set Financial Account.
		@param FM_Account_ID Financial Account	  */
	public void setFM_Account_ID (int FM_Account_ID)
	{
		if (FM_Account_ID < 1) 
			set_Value (COLUMNNAME_FM_Account_ID, null);
		else 
			set_Value (COLUMNNAME_FM_Account_ID, Integer.valueOf(FM_Account_ID));
	}

	/** Get Financial Account.
		@return Financial Account	  */
	public int getFM_Account_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_FM_Account_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getFM_Account_ID()));
    }

	public org.spin.model.I_FM_Batch getFM_Batch() throws RuntimeException
    {
		return (org.spin.model.I_FM_Batch)MTable.get(getCtx(), org.spin.model.I_FM_Batch.Table_Name)
			.getPO(getFM_Batch_ID(), get_TrxName());	}

	/** Set Financial Transaction Batch.
		@param FM_Batch_ID Financial Transaction Batch	  */
	public void setFM_Batch_ID (int FM_Batch_ID)
	{
		if (FM_Batch_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_FM_Batch_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_FM_Batch_ID, Integer.valueOf(FM_Batch_ID));
	}

	/** Get Financial Transaction Batch.
		@return Financial Transaction Batch	  */
	public int getFM_Batch_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_FM_Batch_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Financial Transaction.
		@param FM_Transaction_ID Financial Transaction	  */
	public void setFM_Transaction_ID (int FM_Transaction_ID)
	{
		if (FM_Transaction_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_FM_Transaction_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_FM_Transaction_ID, Integer.valueOf(FM_Transaction_ID));
	}

	/** Get Financial Transaction.
		@return Financial Transaction	  */
	public int getFM_Transaction_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_FM_Transaction_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}