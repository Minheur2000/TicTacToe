package net.minheur.tictactoe.util;

import net.minheur.tictactoe.Main;
import net.minheur.tictactoe.grid.CaseState;

import java.util.List;
import java.util.Scanner;

public class CommandHandler {

    public static void handleCommand(String input) {
        String[] parts = input.split("\\s+");
        for (Commands command : Commands.values()) {
            if (command.getCommandId().equals(parts[0])) {
                if (command.getArgAmount() == parts.length-1) {
                    executeCommand(command, parts);
                }
            }
        }
    }

    private static void executeCommand(Commands command, String[] args) {
        switch (command) {
            case QUIT -> Main.isPlaying = false;
            case PRINT_GRID -> GridFunctions.printSmallGrid(Main.myGrid);
            case PLAY -> {
                if (Main.myGrid.getCaseState(Integer.parseInt(args[1])) == CaseState.EMPTY) {
                    Main.myGrid.setCaseState(Integer.parseInt(args[1]), Main.myGrid.getPlayerToPlay());
                    Main.myGrid.switchPlayerToPlay();
                    GridFunctions.printSmallGrid(Main.myGrid);
                } else {
                    System.out.println("This case is already full !");
                }
            }
            case RESET_GRID -> {
                Main.myGrid.resetGrid();
                System.out.println("Grid reseted.");
            }
            case HELP -> {
                System.out.println("Here is the List :");
                for (Commands commands : Commands.values()) {
                    System.out.println("- " +commands.getCommandId() + " : " + commands.getDescription());
                }
            }
            default -> System.out.println("An error append.");
        }
    }

}
