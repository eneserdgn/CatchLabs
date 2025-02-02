package models;

import org.openqa.selenium.By;

public class TransactionsModel {
    public static final By TITLE_TEXT = By.cssSelector("div.r-edyy15 .css-146c3p1.r-1gknse6.r-1b43r93:nth-child(5)");
    public static final By LAST_SENDER_TEXT = By.cssSelector(".css-175oi2r>.css-175oi2r:nth-child(1)>.r-14lw9ot.r-z2wwpe .css-175oi2r.r-13qz1uu>.css-175oi2r.r-18u37iz.r-13qz1uu:nth-child(1)>.r-yv33h5");
    public static final By LAST_RECEIVER_TEXT = By.cssSelector(".css-175oi2r>.css-175oi2r:nth-child(1)>.r-14lw9ot.r-z2wwpe .css-175oi2r.r-13qz1uu>.css-175oi2r.r-18u37iz.r-13qz1uu:nth-child(2)>.r-yv33h5");
    public static final By LAST_TIME_TEXT = By.cssSelector(".css-175oi2r>.css-175oi2r:nth-child(1)>.r-14lw9ot.r-z2wwpe .css-175oi2r.r-13qz1uu>.css-175oi2r.r-18u37iz.r-13qz1uu:nth-child(3)>.r-yv33h5");
    public static final By LAST_AMOUNT_TEXT = By.cssSelector(".css-175oi2r>.css-175oi2r:nth-child(1)>.r-14lw9ot.r-z2wwpe .css-175oi2r.r-13qz1uu>.css-175oi2r.r-18u37iz.r-13qz1uu:nth-child(4) .r-yv33h5");
}
