package org.tsn.utility;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.tsn.resources.TSN_Constants;


public class BaseUtility {
	public static BaseUtility shared = new BaseUtility();

	protected BaseUtility() {

	}
 

	// TODO common methods should be moved to common area like aarcommonutils or
	// a server side only utils
	protected String fomatDate(Date d, String pattern)
	{
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(d);
	}

	protected String fomatToMMMMddyyyy(Calendar c)
	{
		if (c != null)
		{
			return fomatDate(c.getTime(), "MMMM dd, yyyy");
		}
		return "";
	}

	public String formatToDollar(Object obj)
	{
		return decimalToString(obj, "$#,###,###.00");
	}

	public String formatToPercent(Object obj)
	{
		return decimalToString(obj, "##0.00%");
	}

	public String decimalToString(Object obj, String pattern)
	{
		try
		{
			if (obj != null)
			{
				double d;
				if (obj instanceof BigDecimal)
				{
					d = ((BigDecimal) obj).doubleValue();
				}
				else if (obj instanceof Double)
				{
					d = ((Double) obj).doubleValue();
				}
				else
				{
					d = new Double(obj.toString()).doubleValue();
				}
				DecimalFormat format = new DecimalFormat(pattern);
				return format.format(d);
			}
			return "";
		}
		catch(Throwable th)
		{
		}
		return "";
	}
 

	public boolean toBoolean(Boolean b)
	{
		// null value is defaulting to false.
		return (null != b && b.booleanValue());
	}

	public double toDouble(BigDecimal bd)
	{
		//null value is not 0.0, so it is TSN_Constants.NOT_APPLICABLE.
		if (null == bd)
			return TSN_Constants.NOT_APPLICABLE;
		
		return bd.doubleValue();
	}

	public double toDouble(Double bd)
	{
		//null value is not 0.0, so it is TSN_Constants.NOT_APPLICABLE.
		if (null == bd)
			return TSN_Constants.NOT_APPLICABLE;
		
		return bd.doubleValue();
	}

	public double[] toDoubles(Double[] bds)
	{
		if (bds == null)
		{
			return null;
		}

		double[] values = new double[bds.length];

		for (int i = 0; bds != null && i < bds.length; i++)
		{
			values[i] = toDouble(bds[i]);
		}
		return values;
	}

	public int toInt(Integer b)
	{
		//null value is not 0.0, so it is TSN_Constants.NOT_APPLICABLE.
		if (null == b)
			return Integer.MIN_VALUE;

		return b.intValue();
	}

	public int toInt(String b)
	{
		
		if (null == b)
			return Integer.MIN_VALUE;
		
		int result = Integer.MIN_VALUE;
		try
		{
			result = new Integer(b).intValue();
		}
		catch(Throwable e)
		{
			result = Integer.MIN_VALUE;
		}
		return result;
	}

	  
	public Date toDateFromTimestamp(String timestamp)
	{
		 
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSS", Locale.ENGLISH);
		Date date = null;
		 
		try
		{
			date = format.parse(timestamp);
		}
		catch(Exception e)
		{
			// TODO: handle exception
		}
		
		return date;
	}

	public Date toDate(Timestamp timestamp)
	{
		if (timestamp == null)
		{
			return null;
		}
		return new Date(timestamp.getTime());
	}

	public Date toDate(Calendar calendar)
	{
		if (calendar == null)
		{
			return null;
		}
		return calendar.getTime();
	}

	 

	protected boolean toBoolean(int i)
	{
		return (i == 1)? true : false;
	}
 
}
