package net.minheur.tictactoe.grid;

public class GridWinFinder {
    public static void smallGridFinder(GridItem grid) {
        boolean[] redOwned = {
                false, false, false,
                false, false, false,
                false, false, false
        };
        boolean[] blueOwned = {
                false, false, false,
                false, false, false,
                false, false, false
        };
        for (int i = 0; i < 9; i++) {
            if (grid.getCaseState(i) == CaseState.RED) {
                redOwned[i] = true;
            } else if (grid.getCaseState(i) == CaseState.BLUE) {
                blueOwned[i] = true;
            }
        }
        if (
                // red horizontal
                (redOwned[0] && redOwned[1] && redOwned[2]) ||
                (redOwned[3] && redOwned[4] && redOwned[5]) ||
                (redOwned[6] && redOwned[7] && redOwned[8]) ||
                // red vertical
                (redOwned[0] && redOwned[3] && redOwned[6]) ||
                (redOwned[1] && redOwned[4] && redOwned[7]) ||
                (redOwned[2] && redOwned[5] && redOwned[8]) ||
                // diagonal
                (redOwned[0] && redOwned[4] && redOwned[7]) ||
                (redOwned[2] && redOwned[4] && redOwned[6])
        ) {
            System.out.println("Red won !! (o)");
        }
        // blue
        if (
                // red horizontal
                (blueOwned[0] && blueOwned[1] && redOwned[2]) ||
                (blueOwned[3] && blueOwned[4] && redOwned[5]) ||
                (blueOwned[6] && blueOwned[7] && redOwned[8]) ||
                // red vertical
                (blueOwned[0] && blueOwned[3] && redOwned[6]) ||
                (blueOwned[1] && blueOwned[4] && redOwned[7]) ||
                (blueOwned[2] && blueOwned[5] && redOwned[8]) ||
                // diagonal
                (blueOwned[0] && blueOwned[4] && redOwned[7]) ||
                (blueOwned[2] && blueOwned[4] && redOwned[6])
        ) {
            System.out.println("Red won !! (o)");
        }
    }
}
