/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.exceptions;

public class WrongSeriesException extends HighChartsException {

    public WrongSeriesException(String message) {
        super(message);
    }

    public WrongSeriesException(String message, Throwable cause) {
        super(message, cause);
    }
}
