package com.arq.socketapp.sockets;

import java.util.*;

 
public class MessageEnumerator implements Enumeration, Iterator
{
  MessageRecord myrec;
  int fcount;
  int fpos;
  
/**
 * Create a MessageEnumerator for the specified MessageRecord.
 *
 * @param MessageRecord the message record to enumerate the fields of
 */
protected MessageEnumerator(MessageRecord mr)
  {
	myrec = mr;
	fcount = myrec.getFieldCount();
	fpos = 0;
  }      
/**
 * Method to check for more elements.
 *
 * @return true if there are more elements.
 */
public boolean hasMoreElements()
  {
	return (fpos < fcount);
  }      
/**
 * Returns the next element.
 *
 * @return The next element.
 * @exception NoSuchElementException If there is no next element.
 */
public Object nextElement() throws NoSuchElementException
  {
	if (fpos >= fcount)
	  throw new NoSuchElementException();
	  
	return myrec.getField(fpos++);
  }      

public boolean hasNext() {
	return hasMoreElements();
}
public Object next() {
	return nextElement();
}
public void remove() {
	throw new UnsupportedOperationException("Can't remove Fields, this is a fixed Object");
}      
}
