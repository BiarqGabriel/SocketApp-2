package com.arq.socketapp.sockets.routers;

import java.io.*;

public abstract class MessageRouter {

    private int version = 0;

    /**
     * Close the router. Subclasses must provide an implementation to close the
     * router.
     *
     * @exception IOException
     */
    public abstract void close() throws IOException;

    /**
     * Flush the router. Subclasses must provide an implementation to flush the
     * router.
     *
     * @exception IOException
     */
    public abstract void flush() throws IOException;

    /**
     * Get the version of this MessageRecord
     *
     * @return int - the version number
     */
    public int getVersion() {
        return version;
    }

    /**
     * Initialize the router for a session. Subclasses can override this method
     * to perform initialization when the router is dispensed from a pool of
     * availble routers.
     */
    public void initialize() {
    }

    /**
     * Open the router. Subclasses must provide an implementation to open the
     * router.
     *
     * @exception IOException
     */
    public abstract void open() throws IOException;

    /**
     * Recieve byte array from this router. Subclasses must provide an
     * implementation.
     *
     * @return byte[] message returned as an array of bytes.
     * @exception IOException
     */

    public abstract byte[] receive() throws IOException;

    /**
     * Send a byte array on this router. Subclasses must provide an
     * implementation.
     *
     * @param byte[] message to be sent as an array of bytes.
     * @exception IOException
     */
    public abstract void send(byte[] message) throws IOException;

    /**
     * Set the version of this MessageRecord
     *
     * @param ver int - the version number
     */
    public void setVersion(int ver) {
        version = ver;
    }
}
