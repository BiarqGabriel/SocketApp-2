package com.arq.socketapp.sockets;

import com.arq.socketapp.sockets.routers.MessageRouter;
import java.io.*;
 

public class MessageReader
{
 
  public void readDetail(MessageRecord mrec, MessageHandler mh, MessageRouter mr)
			  throws IOException
  {
	String formatname = null;
	MessageRecord detail;

	detail = mh.receiveMessage(mr);
	formatname = detail.getFormatName();

	while (!detail.isEmpty())
	{
	  mrec.addDetail(detail);
	  detail = mh.receiveMessage(mr);
	  if (!formatname.equals(detail.getFormatName()))
		throw new IOException("Mismatch on detail record format.");
	}
  }    
}
