package net.minheur.tictactoe.grid;

public class GridItem {
    private CaseState[] caseStates = {
            CaseState.EMPTY, CaseState.EMPTY, CaseState.EMPTY,
            CaseState.EMPTY, CaseState.EMPTY, CaseState.EMPTY,
            CaseState.EMPTY, CaseState.EMPTY, CaseState.EMPTY
    };
    private String playerToPlay = "red";

    public GridItem() {
    }

    public void setCaseState(int caseId, CaseState caseState) {
        caseStates[caseId] = caseState;
    }

    public CaseState getCaseState(int caseId) {
        return caseStates[caseId];
    }

    public CaseState getPlayerToPlay() {
        switch (playerToPlay) {
            case "red" -> {
                return CaseState.RED;
            }
            case "blue" -> {
                return CaseState.BLUE;
            }
            default -> {
                return CaseState.EMPTY;
            }
        }
    }

    public void switchPlayerToPlay() {
        if (playerToPlay.equals("red")) {
            playerToPlay = "blue";
        } else {
            playerToPlay = "red";
        }
    }

    public void resetGrid() {
        caseStates[0] = CaseState.EMPTY;
        caseStates[1] = CaseState.EMPTY;
        caseStates[2] = CaseState.EMPTY;
        caseStates[3] = CaseState.EMPTY;
        caseStates[4] = CaseState.EMPTY;
        caseStates[5] = CaseState.EMPTY;
        caseStates[6] = CaseState.EMPTY;
        caseStates[7] = CaseState.EMPTY;
        caseStates[8] = CaseState.EMPTY;
    }

}
