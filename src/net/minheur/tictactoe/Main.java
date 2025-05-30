package net.minheur.tictactoe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import net.minheur.tictactoe.grid.CaseState;
import net.minheur.tictactoe.util.CommandHandler;
import net.minheur.tictactoe.util.GridFunctions;
import net.minheur.tictactoe.grid.GridItem;

import java.util.Scanner;

//TIP Press <shortcut actionId="Debug"/> to start debugging your code or
// click the <icon src="AllIcons.Actions.StartDebugger"/> icon in the getter.
public class Main {
    public static boolean isPlaying = true;
    public static GridItem myGrid = new GridItem();
    public static void main(String[] args) {

        System.out.println("Hello ! The game is setting up...");
        Scanner scanner = new Scanner(System.in);


        myGrid.setCaseState(5, CaseState.RED);
        myGrid.setCaseState(3, CaseState.BLUE);

        GridFunctions.printSmallGrid(myGrid);

        while(isPlaying) {
            System.out.print("Type a command (help to see all) : ");
            String consoleInput = scanner.nextLine();
            CommandHandler.handleCommand(consoleInput);
        }
        scanner.close();
    }
}