/*
 * Created on Jun 13, 2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.arq.socketapp.master;

import java.io.IOException;
import java.util.Calendar;

import com.arq.socketapp.sockets.MessageContext;
import com.arq.socketapp.sockets.MessageField;
import com.arq.socketapp.sockets.MessageHandler;
import com.arq.socketapp.sockets.MessageRecord;
import com.arq.socketapp.sockets.routers.TOSocketMessageRouter;

public class MessageProcessor {

    private MessageHandler mh;

    public MessageProcessor(MessageHandler mh) {
        super();
        this.mh = mh;
    }

    public MessageProcessor(MessageContext mc) {
        super();
        this.mh = mc.getHandler();
    }

    public MessageProcessor(String key) throws IOException {
        super();
        this.mh = getMessageHandler(key);
    }

    /**
     * This method returns the Program Name used by the Message Header in the
     * sockets protocol.
     *
     * @return the formatname of the MessageRecord class, as a String.
     *
     */
    public final static String getProgramName(String formatname) {
        String result = "";
        if (formatname != null && formatname.length() > 7) {
            result = formatname.substring(0, 7);
        } else if (formatname != null) {
            result = formatname;
        }
        return result;
    }

    /**
     * This method returns the Time Stamp String used by the Header Message in
     * the sockets protocol.
     *
     * @return TimeStamp, as a String, in this very moment.
     *
     */
    private final static String getTimeStamp() {

        Calendar calendar = Calendar.getInstance();
        String year = "" + calendar.get(Calendar.YEAR);
        String month = "" + (calendar.get(Calendar.MONTH) + 1);
        String day = "" + calendar.get(Calendar.DAY_OF_MONTH);
        String hour = "" + calendar.get(Calendar.HOUR_OF_DAY);
        String minute = "" + calendar.get(Calendar.MINUTE);
        String second = "" + calendar.get(Calendar.SECOND);

        year = year.substring(2);
        month = month.length() == 1 ? "0" + month : month;
        day = day.length() == 1 ? "0" + day : day;
        hour = hour.length() == 1 ? "0" + hour : hour;
        minute = minute.length() == 1 ? "0" + minute : minute;
        second = second.length() == 1 ? "0" + second : second;

        return (year + month + day + hour + minute + second);

    }

    /**
     * @return
     */
    public MessageHandler getMessageHandler() {
        return mh;
    }

    public MessageHandler getMessageHandler(String key) throws IOException {

        MessageHandler mh = null;
        String host = "10.24.104.141";
        int port = 16000;
        int timeout = 5000;
        String packageName = null;
        try {
            mh
                    = new MessageHandler(
                            new TOSocketMessageRouter(
                                    host,
                                    port,
                                    timeout),
                            packageName);
            return mh;
        } catch (Exception e) {
            if (mh == null) {
                throw new IOException("Socket not Open(Host = " + host + ", Port " + port + "). "
                        + "Error: " + e.toString());
            } else {
                throw new IOException(mh.toString()
                        + "Error: " + e.toString());
            }
        }
    }

    public MessageRecord getMessageRecord(String messageName) {
        MessageRecord message = null;
        try {
            message = mh.getMessageRecord(messageName);
        } catch (Exception e) {
            throw new RuntimeException("Error initializing " + messageName);
        }
        return message;
    }

    public MessageRecord getMessageRecord(
            String messageName,
            String user,
            String opCode) {
        MessageRecord message = null;
        try {
            message = getMessageRecord(messageName);
            java.util.Enumeration enu = message.fieldEnumeration();
            MessageField field = null;
            String value = null;
            while (enu.hasMoreElements()) {
                field = (MessageField) enu.nextElement();

                if (field.getTag().indexOf("USERID") >= 0) {
                    field.setString(user);
                } else if (field.getTag().indexOf("PROGRM") >= 0) {
                    field.setString(getProgramName(message.getFormatName()));
                } else if (field.getTag().indexOf("TIMSYS") >= 0) {
                    field.setString(getTimeStamp());
                } else if (opCode != "" && field.getTag().indexOf("OPECOD") >= 0) {
                    field.setString(opCode);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Error initializing " + messageName);
        }
        return message;
    }

    /**
     * Receives a message from the current input stream.
     *
     * @return the MessageRecord class.
     * @exception IOException if there is any problem receiving the message.
     */
    public MessageRecord receiveMessageRecord()
            throws IOException {
        try {
            MessageRecord newmessage = mh.receiveMessage();
            return newmessage;
        } catch (IOException e) {
            throw new IOException("On MessageHandler: " + mh.toString() + " : Cause By: " + e.toString());
        }
    }

    /**
     * Receives a message from the current input stream.
     *
     * @return the MessageRecord class.
     * @exception IOException if there is any problem receiving the message.
     */
    public MessageRecord receiveMessageRecord(String formatname)
            throws IOException, ClassCastException {

        try {
            MessageRecord newmessage = mh.receiveMessage();
            if (!newmessage.getFormatName().equals(formatname)) {
                throw new ClassCastException("Message is not " + formatname);
            }
            return newmessage;
        } catch (IOException e) {
            throw new IOException("On MessageHandler: " + mh.toString() + " : Cause By: " + e.toString());
        }
    }

    /**
     * Send a message over the current output stream.
     *
     * @param message an instance of a MessageRecord subclass.
     * @exception IOException if there is any problem sending the message.
     */
    public void sendMessage(MessageRecord message)
            throws IOException {
        try {
            mh.sendMessage(message);
            message.destroy();

        } catch (IOException e) {
            throw new IOException("On MessageHandler: " + mh.toString() + " : Cause By: " + e.toString());
        }
    }

    public void close() throws IOException {
        if (mh != null) {
            mh.flush();
            mh.releaseMessageRouter().close();
        }
    }

}
