package com.arq.socketapp.beans;

 
import com.arq.socketapp.sockets.CharacterField;
import com.arq.socketapp.sockets.DecimalField;
import com.arq.socketapp.sockets.MessageField;
import com.arq.socketapp.sockets.MessageRecord;
import java.io.*;
import java.math.*;

import java.util.*;

/**
* Class generated by AS/400 CRTCLASS command from TEST20001 physical file definition.
* 
* File level identifier is 1240401182848.
* Record format level identifier is 3FD3E4C5E4DFE.
*/

public class TEST20001Message extends MessageRecord
{
  final static String fldnames[] = {
                                     "H01USERID",
                                     "H01PROGRM",
                                     "H01TIMSYS",
                                     "H01SCRCOD",
                                     "H01OPECOD",
                                     "H01FLGMAS",
                                     "H01FLGWK1",
                                     "H01FLGWK2",
                                     "H01FLGWK3",
                                     "E01TRCID",
                                     "E01RUTORI",
                                     "E01CTAORI",
                                     "E01NARTEF",
                                     "E01BCOORI",
                                     "E01RUTDES",
                                     "E01CTADES",
                                     "E01NOMDES",
                                     "E01FECDES",
                                     "E01FECHAS",
                                     "E01HORDES",
                                     "E01HORHAS",
                                     "E01MONDES",
                                     "E01MONHAS",
                                     "S01RUTORI",
                                     "S01NOMCLI",
                                     "S01CTAORI",
                                     "S01FECTEF",
                                     "S01MONTEF",
                                     "S01BCODES",
                                     "S01RUTDES",
                                     "S01NOMDES",
                                     "S01CTADES",
                                     "S01TRCID",
                                     "S01MOTTEF",
                                     "S01GLOSA",
                                     "S01ESTRET"
                                   };
  final static String tnames[] = {
                                   "H01USERID",
                                   "H01PROGRM",
                                   "H01TIMSYS",
                                   "H01SCRCOD",
                                   "H01OPECOD",
                                   "H01FLGMAS",
                                   "H01FLGWK1",
                                   "H01FLGWK2",
                                   "H01FLGWK3",
                                   "E01TRCID",
                                   "E01RUTORI",
                                   "E01CTAORI",
                                   "E01NARTEF",
                                   "E01BCOORI",
                                   "E01RUTDES",
                                   "E01CTADES",
                                   "E01NOMDES",
                                   "E01FECDES",
                                   "E01FECHAS",
                                   "E01HORDES",
                                   "E01HORHAS",
                                   "E01MONDES",
                                   "E01MONHAS",
                                   "S01RUTORI",
                                   "S01NOMCLI",
                                   "S01CTAORI",
                                   "S01FECTEF",
                                   "S01MONTEF",
                                   "S01BCODES",
                                   "S01RUTDES",
                                   "S01NOMDES",
                                   "S01CTADES",
                                   "S01TRCID",
                                   "S01MOTTEF",
                                   "S01GLOSA",
                                   "S01ESTRET"
                                 };
  final static String fid = "1240401182848";
  final static String rid = "3FD3E4C5E4DFE";
  final static String fmtname = "TEST20001";
  final int FIELDCOUNT = 36;
  private static Hashtable tlookup = new Hashtable();
  private CharacterField fieldH01USERID = null;
  private CharacterField fieldH01PROGRM = null;
  private CharacterField fieldH01TIMSYS = null;
  private CharacterField fieldH01SCRCOD = null;
  private CharacterField fieldH01OPECOD = null;
  private CharacterField fieldH01FLGMAS = null;
  private CharacterField fieldH01FLGWK1 = null;
  private CharacterField fieldH01FLGWK2 = null;
  private CharacterField fieldH01FLGWK3 = null;
  private CharacterField fieldE01TRCID = null;
  private CharacterField fieldE01RUTORI = null;
  private DecimalField fieldE01CTAORI = null;
  private CharacterField fieldE01NARTEF = null;
  private CharacterField fieldE01BCOORI = null;
  private CharacterField fieldE01RUTDES = null;
  private DecimalField fieldE01CTADES = null;
  private CharacterField fieldE01NOMDES = null;
  private DecimalField fieldE01FECDES = null;
  private DecimalField fieldE01FECHAS = null;
  private DecimalField fieldE01HORDES = null;
  private DecimalField fieldE01HORHAS = null;
  private DecimalField fieldE01MONDES = null;
  private DecimalField fieldE01MONHAS = null;
  private CharacterField fieldS01RUTORI = null;
  private CharacterField fieldS01NOMCLI = null;
  private DecimalField fieldS01CTAORI = null;
  private CharacterField fieldS01FECTEF = null;
  private DecimalField fieldS01MONTEF = null;
  private CharacterField fieldS01BCODES = null;
  private CharacterField fieldS01RUTDES = null;
  private CharacterField fieldS01NOMDES = null;
  private DecimalField fieldS01CTADES = null;
  private CharacterField fieldS01TRCID = null;
  private CharacterField fieldS01MOTTEF = null;
  private CharacterField fieldS01GLOSA = null;
  private CharacterField fieldS01ESTRET = null;

  /**
  * Constructor for TEST20001Message.
  */
  public TEST20001Message()
  {
    createFields();
    initialize();
  }

  /**
  * Create fields for this message.
  * This method implements the abstract method in the MessageRecord superclass.
  */
  protected void createFields()
  {
    recordsize = 823;
    fileid = fid;
    recordid = rid;
    message = new byte[getByteLength()];
    formatname = fmtname;
    fieldnames = fldnames;
    tagnames = tnames;
    fields = new MessageField[FIELDCOUNT];

    fields[0] = fieldH01USERID =
    new CharacterField(message, HEADERSIZE + 0, 10, "H01USERID");
    fields[1] = fieldH01PROGRM =
    new CharacterField(message, HEADERSIZE + 10, 10, "H01PROGRM");
    fields[2] = fieldH01TIMSYS =
    new CharacterField(message, HEADERSIZE + 20, 12, "H01TIMSYS");
    fields[3] = fieldH01SCRCOD =
    new CharacterField(message, HEADERSIZE + 32, 2, "H01SCRCOD");
    fields[4] = fieldH01OPECOD =
    new CharacterField(message, HEADERSIZE + 34, 4, "H01OPECOD");
    fields[5] = fieldH01FLGMAS =
    new CharacterField(message, HEADERSIZE + 38, 1, "H01FLGMAS");
    fields[6] = fieldH01FLGWK1 =
    new CharacterField(message, HEADERSIZE + 39, 1, "H01FLGWK1");
    fields[7] = fieldH01FLGWK2 =
    new CharacterField(message, HEADERSIZE + 40, 1, "H01FLGWK2");
    fields[8] = fieldH01FLGWK3 =
    new CharacterField(message, HEADERSIZE + 41, 1, "H01FLGWK3");
    fields[9] = fieldE01TRCID =
    new CharacterField(message, HEADERSIZE + 42, 25, "E01TRCID");
    fields[10] = fieldE01RUTORI =
    new CharacterField(message, HEADERSIZE + 67, 25, "E01RUTORI");
    fields[11] = fieldE01CTAORI =
    new DecimalField(message, HEADERSIZE + 92, 13, 0, "E01CTAORI");
    fields[12] = fieldE01NARTEF =
    new CharacterField(message, HEADERSIZE + 105, 60, "E01NARTEF");
    fields[13] = fieldE01BCOORI =
    new CharacterField(message, HEADERSIZE + 165, 4, "E01BCOORI");
    fields[14] = fieldE01RUTDES =
    new CharacterField(message, HEADERSIZE + 169, 25, "E01RUTDES");
    fields[15] = fieldE01CTADES =
    new DecimalField(message, HEADERSIZE + 194, 13, 0, "E01CTADES");
    fields[16] = fieldE01NOMDES =
    new CharacterField(message, HEADERSIZE + 207, 60, "E01NOMDES");
    fields[17] = fieldE01FECDES =
    new DecimalField(message, HEADERSIZE + 267, 9, 0, "E01FECDES");
    fields[18] = fieldE01FECHAS =
    new DecimalField(message, HEADERSIZE + 276, 9, 0, "E01FECHAS");
    fields[19] = fieldE01HORDES =
    new DecimalField(message, HEADERSIZE + 285, 7, 0, "E01HORDES");
    fields[20] = fieldE01HORHAS =
    new DecimalField(message, HEADERSIZE + 292, 7, 0, "E01HORHAS");
    fields[21] = fieldE01MONDES =
    new DecimalField(message, HEADERSIZE + 299, 17, 2, "E01MONDES");
    fields[22] = fieldE01MONHAS =
    new DecimalField(message, HEADERSIZE + 316, 17, 2, "E01MONHAS");
    fields[23] = fieldS01RUTORI =
    new CharacterField(message, HEADERSIZE + 333, 25, "S01RUTORI");
    fields[24] = fieldS01NOMCLI =
    new CharacterField(message, HEADERSIZE + 358, 60, "S01NOMCLI");
    fields[25] = fieldS01CTAORI =
    new DecimalField(message, HEADERSIZE + 418, 13, 0, "S01CTAORI");
    fields[26] = fieldS01FECTEF =
    new CharacterField(message, HEADERSIZE + 431, 26, "S01FECTEF");
    fields[27] = fieldS01MONTEF =
    new DecimalField(message, HEADERSIZE + 457, 17, 2, "S01MONTEF");
    fields[28] = fieldS01BCODES =
    new CharacterField(message, HEADERSIZE + 474, 45, "S01BCODES");
    fields[29] = fieldS01RUTDES =
    new CharacterField(message, HEADERSIZE + 519, 25, "S01RUTDES");
    fields[30] = fieldS01NOMDES =
    new CharacterField(message, HEADERSIZE + 544, 60, "S01NOMDES");
    fields[31] = fieldS01CTADES =
    new DecimalField(message, HEADERSIZE + 604, 13, 0, "S01CTADES");
    fields[32] = fieldS01TRCID =
    new CharacterField(message, HEADERSIZE + 617, 25, "S01TRCID");
    fields[33] = fieldS01MOTTEF =
    new CharacterField(message, HEADERSIZE + 642, 120, "S01MOTTEF");
    fields[34] = fieldS01GLOSA =
    new CharacterField(message, HEADERSIZE + 762, 60, "S01GLOSA");
    fields[35] = fieldS01ESTRET =
    new CharacterField(message, HEADERSIZE + 822, 1, "S01ESTRET");

    synchronized (tlookup)
    {
      if (tlookup.isEmpty())
      {
        for (int i = 0; i < tnames.length; i++)
          tlookup.put(tnames[i], new Integer(i));
      }
    }

    taglookup = tlookup;
  }

  /**
  * Set field H01USERID using a String value.
  */
  public void setH01USERID(String newvalue)
  {
    fieldH01USERID.setString(newvalue);
  }

  /**
  * Get value of field H01USERID as a String.
  */
  public String getH01USERID()
  {
    return fieldH01USERID.getString();
  }

  /**
  * Set field H01PROGRM using a String value.
  */
  public void setH01PROGRM(String newvalue)
  {
    fieldH01PROGRM.setString(newvalue);
  }

  /**
  * Get value of field H01PROGRM as a String.
  */
  public String getH01PROGRM()
  {
    return fieldH01PROGRM.getString();
  }

  /**
  * Set field H01TIMSYS using a String value.
  */
  public void setH01TIMSYS(String newvalue)
  {
    fieldH01TIMSYS.setString(newvalue);
  }

  /**
  * Get value of field H01TIMSYS as a String.
  */
  public String getH01TIMSYS()
  {
    return fieldH01TIMSYS.getString();
  }

  /**
  * Set field H01SCRCOD using a String value.
  */
  public void setH01SCRCOD(String newvalue)
  {
    fieldH01SCRCOD.setString(newvalue);
  }

  /**
  * Get value of field H01SCRCOD as a String.
  */
  public String getH01SCRCOD()
  {
    return fieldH01SCRCOD.getString();
  }

  /**
  * Set field H01OPECOD using a String value.
  */
  public void setH01OPECOD(String newvalue)
  {
    fieldH01OPECOD.setString(newvalue);
  }

  /**
  * Get value of field H01OPECOD as a String.
  */
  public String getH01OPECOD()
  {
    return fieldH01OPECOD.getString();
  }

  /**
  * Set field H01FLGMAS using a String value.
  */
  public void setH01FLGMAS(String newvalue)
  {
    fieldH01FLGMAS.setString(newvalue);
  }

  /**
  * Get value of field H01FLGMAS as a String.
  */
  public String getH01FLGMAS()
  {
    return fieldH01FLGMAS.getString();
  }

  /**
  * Set field H01FLGWK1 using a String value.
  */
  public void setH01FLGWK1(String newvalue)
  {
    fieldH01FLGWK1.setString(newvalue);
  }

  /**
  * Get value of field H01FLGWK1 as a String.
  */
  public String getH01FLGWK1()
  {
    return fieldH01FLGWK1.getString();
  }

  /**
  * Set field H01FLGWK2 using a String value.
  */
  public void setH01FLGWK2(String newvalue)
  {
    fieldH01FLGWK2.setString(newvalue);
  }

  /**
  * Get value of field H01FLGWK2 as a String.
  */
  public String getH01FLGWK2()
  {
    return fieldH01FLGWK2.getString();
  }

  /**
  * Set field H01FLGWK3 using a String value.
  */
  public void setH01FLGWK3(String newvalue)
  {
    fieldH01FLGWK3.setString(newvalue);
  }

  /**
  * Get value of field H01FLGWK3 as a String.
  */
  public String getH01FLGWK3()
  {
    return fieldH01FLGWK3.getString();
  }

  /**
  * Set field E01TRCID using a String value.
  */
  public void setE01TRCID(String newvalue)
  {
    fieldE01TRCID.setString(newvalue);
  }

  /**
  * Get value of field E01TRCID as a String.
  */
  public String getE01TRCID()
  {
    return fieldE01TRCID.getString();
  }

  /**
  * Set field E01RUTORI using a String value.
  */
  public void setE01RUTORI(String newvalue)
  {
    fieldE01RUTORI.setString(newvalue);
  }

  /**
  * Get value of field E01RUTORI as a String.
  */
  public String getE01RUTORI()
  {
    return fieldE01RUTORI.getString();
  }

  /**
  * Set field E01CTAORI using a String value.
  */
  public void setE01CTAORI(String newvalue)
  {
    fieldE01CTAORI.setString(newvalue);
  }

  /**
  * Get value of field E01CTAORI as a String.
  */
  public String getE01CTAORI()
  {
    return fieldE01CTAORI.getString();
  }

  /**
  * Set numeric field E01CTAORI using a BigDecimal value.
  */
  public void setE01CTAORI(BigDecimal newvalue)
  {
    fieldE01CTAORI.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01CTAORI as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01CTAORI()
  {
    return fieldE01CTAORI.getBigDecimal();
  }

  /**
  * Set field E01NARTEF using a String value.
  */
  public void setE01NARTEF(String newvalue)
  {
    fieldE01NARTEF.setString(newvalue);
  }

  /**
  * Get value of field E01NARTEF as a String.
  */
  public String getE01NARTEF()
  {
    return fieldE01NARTEF.getString();
  }

  /**
  * Set field E01BCOORI using a String value.
  */
  public void setE01BCOORI(String newvalue)
  {
    fieldE01BCOORI.setString(newvalue);
  }

  /**
  * Get value of field E01BCOORI as a String.
  */
  public String getE01BCOORI()
  {
    return fieldE01BCOORI.getString();
  }

  /**
  * Set field E01RUTDES using a String value.
  */
  public void setE01RUTDES(String newvalue)
  {
    fieldE01RUTDES.setString(newvalue);
  }

  /**
  * Get value of field E01RUTDES as a String.
  */
  public String getE01RUTDES()
  {
    return fieldE01RUTDES.getString();
  }

  /**
  * Set field E01CTADES using a String value.
  */
  public void setE01CTADES(String newvalue)
  {
    fieldE01CTADES.setString(newvalue);
  }

  /**
  * Get value of field E01CTADES as a String.
  */
  public String getE01CTADES()
  {
    return fieldE01CTADES.getString();
  }

  /**
  * Set numeric field E01CTADES using a BigDecimal value.
  */
  public void setE01CTADES(BigDecimal newvalue)
  {
    fieldE01CTADES.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01CTADES as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01CTADES()
  {
    return fieldE01CTADES.getBigDecimal();
  }

  /**
  * Set field E01NOMDES using a String value.
  */
  public void setE01NOMDES(String newvalue)
  {
    fieldE01NOMDES.setString(newvalue);
  }

  /**
  * Get value of field E01NOMDES as a String.
  */
  public String getE01NOMDES()
  {
    return fieldE01NOMDES.getString();
  }

  /**
  * Set field E01FECDES using a String value.
  */
  public void setE01FECDES(String newvalue)
  {
    fieldE01FECDES.setString(newvalue);
  }

  /**
  * Get value of field E01FECDES as a String.
  */
  public String getE01FECDES()
  {
    return fieldE01FECDES.getString();
  }

  /**
  * Set numeric field E01FECDES using a BigDecimal value.
  */
  public void setE01FECDES(BigDecimal newvalue)
  {
    fieldE01FECDES.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01FECDES as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01FECDES()
  {
    return fieldE01FECDES.getBigDecimal();
  }

  /**
  * Set field E01FECHAS using a String value.
  */
  public void setE01FECHAS(String newvalue)
  {
    fieldE01FECHAS.setString(newvalue);
  }

  /**
  * Get value of field E01FECHAS as a String.
  */
  public String getE01FECHAS()
  {
    return fieldE01FECHAS.getString();
  }

  /**
  * Set numeric field E01FECHAS using a BigDecimal value.
  */
  public void setE01FECHAS(BigDecimal newvalue)
  {
    fieldE01FECHAS.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01FECHAS as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01FECHAS()
  {
    return fieldE01FECHAS.getBigDecimal();
  }

  /**
  * Set field E01HORDES using a String value.
  */
  public void setE01HORDES(String newvalue)
  {
    fieldE01HORDES.setString(newvalue);
  }

  /**
  * Get value of field E01HORDES as a String.
  */
  public String getE01HORDES()
  {
    return fieldE01HORDES.getString();
  }

  /**
  * Set numeric field E01HORDES using a BigDecimal value.
  */
  public void setE01HORDES(BigDecimal newvalue)
  {
    fieldE01HORDES.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01HORDES as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01HORDES()
  {
    return fieldE01HORDES.getBigDecimal();
  }

  /**
  * Set field E01HORHAS using a String value.
  */
  public void setE01HORHAS(String newvalue)
  {
    fieldE01HORHAS.setString(newvalue);
  }

  /**
  * Get value of field E01HORHAS as a String.
  */
  public String getE01HORHAS()
  {
    return fieldE01HORHAS.getString();
  }

  /**
  * Set numeric field E01HORHAS using a BigDecimal value.
  */
  public void setE01HORHAS(BigDecimal newvalue)
  {
    fieldE01HORHAS.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01HORHAS as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01HORHAS()
  {
    return fieldE01HORHAS.getBigDecimal();
  }

  /**
  * Set field E01MONDES using a String value.
  */
  public void setE01MONDES(String newvalue)
  {
    fieldE01MONDES.setString(newvalue);
  }

  /**
  * Get value of field E01MONDES as a String.
  */
  public String getE01MONDES()
  {
    return fieldE01MONDES.getString();
  }

  /**
  * Set numeric field E01MONDES using a BigDecimal value.
  */
  public void setE01MONDES(BigDecimal newvalue)
  {
    fieldE01MONDES.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01MONDES as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01MONDES()
  {
    return fieldE01MONDES.getBigDecimal();
  }

  /**
  * Set field E01MONHAS using a String value.
  */
  public void setE01MONHAS(String newvalue)
  {
    fieldE01MONHAS.setString(newvalue);
  }

  /**
  * Get value of field E01MONHAS as a String.
  */
  public String getE01MONHAS()
  {
    return fieldE01MONHAS.getString();
  }

  /**
  * Set numeric field E01MONHAS using a BigDecimal value.
  */
  public void setE01MONHAS(BigDecimal newvalue)
  {
    fieldE01MONHAS.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01MONHAS as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01MONHAS()
  {
    return fieldE01MONHAS.getBigDecimal();
  }

  /**
  * Set field S01RUTORI using a String value.
  */
  public void setS01RUTORI(String newvalue)
  {
    fieldS01RUTORI.setString(newvalue);
  }

  /**
  * Get value of field S01RUTORI as a String.
  */
  public String getS01RUTORI()
  {
    return fieldS01RUTORI.getString();
  }

  /**
  * Set field S01NOMCLI using a String value.
  */
  public void setS01NOMCLI(String newvalue)
  {
    fieldS01NOMCLI.setString(newvalue);
  }

  /**
  * Get value of field S01NOMCLI as a String.
  */
  public String getS01NOMCLI()
  {
    return fieldS01NOMCLI.getString();
  }

  /**
  * Set field S01CTAORI using a String value.
  */
  public void setS01CTAORI(String newvalue)
  {
    fieldS01CTAORI.setString(newvalue);
  }

  /**
  * Get value of field S01CTAORI as a String.
  */
  public String getS01CTAORI()
  {
    return fieldS01CTAORI.getString();
  }

  /**
  * Set numeric field S01CTAORI using a BigDecimal value.
  */
  public void setS01CTAORI(BigDecimal newvalue)
  {
    fieldS01CTAORI.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field S01CTAORI as a BigDecimal.
  */
  public BigDecimal getBigDecimalS01CTAORI()
  {
    return fieldS01CTAORI.getBigDecimal();
  }

  /**
  * Set field S01FECTEF using a String value.
  */
  public void setS01FECTEF(String newvalue)
  {
    fieldS01FECTEF.setString(newvalue);
  }

  /**
  * Get value of field S01FECTEF as a String.
  */
  public String getS01FECTEF()
  {
    return fieldS01FECTEF.getString();
  }

  /**
  * Set field S01MONTEF using a String value.
  */
  public void setS01MONTEF(String newvalue)
  {
    fieldS01MONTEF.setString(newvalue);
  }

  /**
  * Get value of field S01MONTEF as a String.
  */
  public String getS01MONTEF()
  {
    return fieldS01MONTEF.getString();
  }

  /**
  * Set numeric field S01MONTEF using a BigDecimal value.
  */
  public void setS01MONTEF(BigDecimal newvalue)
  {
    fieldS01MONTEF.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field S01MONTEF as a BigDecimal.
  */
  public BigDecimal getBigDecimalS01MONTEF()
  {
    return fieldS01MONTEF.getBigDecimal();
  }

  /**
  * Set field S01BCODES using a String value.
  */
  public void setS01BCODES(String newvalue)
  {
    fieldS01BCODES.setString(newvalue);
  }

  /**
  * Get value of field S01BCODES as a String.
  */
  public String getS01BCODES()
  {
    return fieldS01BCODES.getString();
  }

  /**
  * Set field S01RUTDES using a String value.
  */
  public void setS01RUTDES(String newvalue)
  {
    fieldS01RUTDES.setString(newvalue);
  }

  /**
  * Get value of field S01RUTDES as a String.
  */
  public String getS01RUTDES()
  {
    return fieldS01RUTDES.getString();
  }

  /**
  * Set field S01NOMDES using a String value.
  */
  public void setS01NOMDES(String newvalue)
  {
    fieldS01NOMDES.setString(newvalue);
  }

  /**
  * Get value of field S01NOMDES as a String.
  */
  public String getS01NOMDES()
  {
    return fieldS01NOMDES.getString();
  }

  /**
  * Set field S01CTADES using a String value.
  */
  public void setS01CTADES(String newvalue)
  {
    fieldS01CTADES.setString(newvalue);
  }

  /**
  * Get value of field S01CTADES as a String.
  */
  public String getS01CTADES()
  {
    return fieldS01CTADES.getString();
  }

  /**
  * Set numeric field S01CTADES using a BigDecimal value.
  */
  public void setS01CTADES(BigDecimal newvalue)
  {
    fieldS01CTADES.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field S01CTADES as a BigDecimal.
  */
  public BigDecimal getBigDecimalS01CTADES()
  {
    return fieldS01CTADES.getBigDecimal();
  }

  /**
  * Set field S01TRCID using a String value.
  */
  public void setS01TRCID(String newvalue)
  {
    fieldS01TRCID.setString(newvalue);
  }

  /**
  * Get value of field S01TRCID as a String.
  */
  public String getS01TRCID()
  {
    return fieldS01TRCID.getString();
  }

  /**
  * Set field S01MOTTEF using a String value.
  */
  public void setS01MOTTEF(String newvalue)
  {
    fieldS01MOTTEF.setString(newvalue);
  }

  /**
  * Get value of field S01MOTTEF as a String.
  */
  public String getS01MOTTEF()
  {
    return fieldS01MOTTEF.getString();
  }

  /**
  * Set field S01GLOSA using a String value.
  */
  public void setS01GLOSA(String newvalue)
  {
    fieldS01GLOSA.setString(newvalue);
  }

  /**
  * Get value of field S01GLOSA as a String.
  */
  public String getS01GLOSA()
  {
    return fieldS01GLOSA.getString();
  }

  /**
  * Set field S01ESTRET using a String value.
  */
  public void setS01ESTRET(String newvalue)
  {
    fieldS01ESTRET.setString(newvalue);
  }

  /**
  * Get value of field S01ESTRET as a String.
  */
  public String getS01ESTRET()
  {
    return fieldS01ESTRET.getString();
  }

}
