package net.minheur.tictactoe.util;

import net.minheur.tictactoe.grid.CaseState;
import net.minheur.tictactoe.grid.GridItem;

public class GridFunctions {

    public static void printSmallGrid(GridItem grid) {
        String upLine = "| " + translateGridStateToString(grid.getCaseState(0)) +
                " | " + translateGridStateToString(grid.getCaseState(1)) +
                " | " + translateGridStateToString(grid.getCaseState(2)) + " |";
        String middleLine = "| " + translateGridStateToString(grid.getCaseState(3)) +
                " | " + translateGridStateToString(grid.getCaseState(4)) +
                " | " + translateGridStateToString(grid.getCaseState(5)) + " |";
        String downLine = "| " + translateGridStateToString(grid.getCaseState(6)) +
                " | " + translateGridStateToString(grid.getCaseState(7)) +
                " | " + translateGridStateToString(grid.getCaseState(8)) + " |";
        System.out.println("|-----------|");
        System.out.println(upLine);
        System.out.println("|-----------|");
        System.out.println(middleLine);
        System.out.println("|-----------|");
        System.out.println(downLine);
        System.out.println("|-----------|");
    }

    public static String translateGridStateToString(CaseState caseState) {
        return switch (caseState) {
            case RED -> "o";
            case BLUE -> "x";
            default -> " ";
        };
    }

    public static CaseState translateGridStateToState(String caseState) {
        return switch (caseState) {
            case "o" -> CaseState.RED;
            case "x" -> CaseState.BLUE;
            default -> CaseState.EMPTY;
        };
    }
}
