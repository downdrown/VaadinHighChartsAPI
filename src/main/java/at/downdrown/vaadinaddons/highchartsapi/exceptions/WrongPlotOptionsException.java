/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.exceptions;

public class WrongPlotOptionsException extends HighChartsException {
    public WrongPlotOptionsException(String message) {
        super(message);
    }

    public WrongPlotOptionsException(String message, Throwable cause) {
        super(message, cause);
    }
}
