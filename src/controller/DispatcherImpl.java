package controller;

import common.exception.CustomException;
import service.HelpCommandService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DispatcherImpl implements Dispatcher{
    Map<String, Controller> controllers;
    public DispatcherImpl() {
        controllers = new HashMap<>();
        HelpCommandService helpCommandService = new HelpCommandService();
        controllers.put("HELP", new HelpPrint(helpCommandService));
    }

    public void isSupported(String controller) throws CustomException {
        if (!controllers.containsKey(controller)) {
            throw new CustomException("명령어가 잘못됐습니다.", 1003);
        }
    }

    public static void replaceAll(StringBuilder builder, String from, String to) {
        int index = builder.indexOf(from);
        while (index != -1) {
            builder.replace(index, index + from.length(), to);
            index += to.length();
            index = builder.indexOf(from, index);
        }
    }
    @Override
    public void run(String input) throws CustomException {
        String[] split = input.split(" ");
        isSupported(split[0]);
        Controller run = controllers.get(split[0]);
        if (input.equals("HELP")) {
            run.command(input);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < split.length; i++) {
            result.append(split[i]);
        }
    }
}
