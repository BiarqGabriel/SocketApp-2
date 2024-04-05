package com.arq.socketapp.sockets;

/**
 * @author erodriguez
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

 
public class MessageRecordComparator implements Comparator {
	
	private String[] tag = {};
	private String fmt = "";

	public MessageRecordComparator() {
		super();
	}

	public MessageRecordComparator(String tag) {
		super();
		this.tag = new String[1];
		this.tag[0] = tag;
	}

	public MessageRecordComparator(String[] tag) {
		super();
		this.tag = tag;
	}

	public MessageRecordComparator(String tag, String fmt) {
		this(tag);
		this.fmt = fmt;
	}
	
	public MessageRecordComparator(String[] tag, String fmt) {
		this(tag);
		this.fmt = fmt;
	}

	public int compare(Object object1, Object object2) {
		
		return 1;
	}
	
	private static int compare(CharacterField a, CharacterField b) {
		return a.getString().compareTo(b.getString());
	}

	private static int compare(DecimalField a, DecimalField b) {
		return a.getBigDecimal().compareTo(b.getBigDecimal());
	}

	private static int compare(Date a, Date b) {
		return a.compareTo(b);
	}

	private static int compare(String a, String b) {
		return a.compareTo(b);
	}

}
