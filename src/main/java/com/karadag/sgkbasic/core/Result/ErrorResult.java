package com.karadag.sgkbasic.core.Result;

public class ErrorResult extends Result {
    public ErrorResult(boolean success) {
        super(false);
    }

    public ErrorResult(boolean success, String message) {
        super(false, message);
    }
}
