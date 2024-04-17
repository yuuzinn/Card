package controller;

import common.exception.CustomException;

public interface Dispatcher {
    void run(String input) throws CustomException;
}
