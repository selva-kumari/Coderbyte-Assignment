package com.finzly.fxtrade.customexception;

public class CurrencyPairNotSpecifiedException extends RuntimeException {

    public CurrencyPairNotSpecifiedException(String message) {
        super(message);
    }

    public CurrencyPairNotSpecifiedException(String message, Throwable cause) {
        super(message, cause);
    }
}
