package com.yuan.config.logback;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class LongMessagesConverter extends ClassicConverter {

  private static final int MAX_FORMATTED_MESSAGE_LENGTH = 2560000;
  private static final String TRUNCATION_SUFFIX = "... [truncate]";
  private static final int TRUNCATED_MESSAGE_SIZE =
      TRUNCATION_SUFFIX.length() + MAX_FORMATTED_MESSAGE_LENGTH;

  @Override
  public String convert(ILoggingEvent event) {
    String formattedMessage = event.getFormattedMessage();
    if (formattedMessage == null ||
        formattedMessage.length() < MAX_FORMATTED_MESSAGE_LENGTH) {
      return formattedMessage;
    }
    return new StringBuilder(TRUNCATED_MESSAGE_SIZE)
        .append(formattedMessage.substring(0, MAX_FORMATTED_MESSAGE_LENGTH))
        .append(TRUNCATION_SUFFIX)
        .toString();
  }
}
