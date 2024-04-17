package domain;

import util.Pattern;

public class Card {
    private String cardNumber;
    private Pattern cardPattern;
    /*
    true  : cardNumber -> A
    false : cardNumber -> 0 ~ 10
     */
    private Boolean isString;
}
