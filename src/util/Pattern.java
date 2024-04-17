package util;

public enum Pattern {
    DIAMOND("노랑"),
    CLOVER("초록"),
    SPADE("파랑"),
    HEART("빨강");
    private final String color;

    Pattern(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
