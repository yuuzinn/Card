package controller;


import service.HelpCommandService;

public class HelpPrint implements Controller {

    private final HelpCommandService helpCommandService;

    public HelpPrint(HelpCommandService helpCommandService) {
        this.helpCommandService = helpCommandService;
    }

    @Override
    public String command(String input) {
        helpCommandService.getHelpPrint();
        return "------------------";
    }
}
