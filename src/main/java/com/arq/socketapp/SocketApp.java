package com.arq.socketapp;

import com.arq.socketapp.beans.TEST20001Message;
import com.arq.socketapp.master.MessageProcessor;
import com.arq.socketapp.sockets.MessageHandler;
import com.arq.socketapp.sockets.routers.MessageRouter;
import com.arq.socketapp.sockets.routers.TOSocketMessageRouter;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author aparada
 */
public class SocketApp {

    private static final Logger logger = LogManager.getLogger(SocketApp.class);
    private static final String PACKAGE_BEANS = "ip";
    private static final String IP_SERVIDOR = "com.arq.socketapp.beans";
    private static final int PUERTO = 16000;
    private static final int TIMEOUT = 5000;

    public static void main(String[] args) {

        try {

            MessageProcessor mp = getMessageProcessor();

            TEST20001Message test = new TEST20001Message();

            test.setH01PROGRM("TEST2");
            test.setH01USERID("AIBSUSER");

            mp.sendMessage(test);

            TEST20001Message msg = (TEST20001Message) mp.receiveMessageRecord();
            System.out.println("msg" + msg);

        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }

    public static MessageProcessor getMessageProcessor() {
        try {
            return new MessageProcessor(getMessageHandler());
        } catch (Exception e) {
            logger.fatal(e.getMessage());
        }
        return null;
    }

    public static MessageHandler getMessageHandler() {

        MessageHandler mh = null;

        try {
            mh = new MessageHandler((MessageRouter) new TOSocketMessageRouter(IP_SERVIDOR, PUERTO, TIMEOUT), PACKAGE_BEANS);
            return mh;
        } catch (Exception e) {
            if (mh == null) {
                logger.error("Socket not Open(Host = " + IP_SERVIDOR + ", Port " + PUERTO + "). " + "Error: " + e.toString());
            }
            logger.error(String.valueOf(mh.toString()) + "Error: " + e.toString());
        }
        return mh;
    }

}
