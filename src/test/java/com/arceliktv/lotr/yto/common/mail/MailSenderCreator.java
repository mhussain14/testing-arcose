package com.arceliktv.lotr.yto.common.mail;

public class MailSenderCreator {

  private MailSenderCreator() {

  }

  public static com.arceliktv.lotr.yto.common.mail.MailSender createMailSender(com.arceliktv.lotr.yto.common.mail.MailSendType mailSendType, String host, int port,
                                                                               String userName, String password, boolean auth) {
    MailSender mailSender = null;
    if (mailSendType == com.arceliktv.lotr.yto.common.mail.MailSendType.BASIC) {
      mailSender = new SimpleMailSender(host, userName, password, port, auth);
    } else if (mailSendType == com.arceliktv.lotr.yto.common.mail.MailSendType.SSL) {
      mailSender = new SslMailSender(host, userName, password, port, auth);
    } else if (mailSendType == MailSendType.TSL) {
      mailSender = new TslMailSender(host, userName, password, port, auth);
    }
    return mailSender;
  }


}
