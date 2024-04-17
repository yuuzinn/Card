package controller;

public class GameController implements Controller{
    @Override
    public String command(String input) {
        return null;
    }
    // TODO : GameController는 다른 Game에 관련된 Controller들의 앞단에서 받아야한다.(주입)
}
