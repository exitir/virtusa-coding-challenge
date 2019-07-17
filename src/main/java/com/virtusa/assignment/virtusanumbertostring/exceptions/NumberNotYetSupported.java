package com.virtusa.assignment.virtusanumbertostring.exceptions;

import com.virtusa.assignment.virtusanumbertostring.constants.Constants;

/**
 * Created by Irfan on 17-Jul-19.
 */
public class NumberNotYetSupported extends RuntimeException {
    public NumberNotYetSupported() {
        super(Constants.EXCEPTION_MESSAGE);
    }
}
