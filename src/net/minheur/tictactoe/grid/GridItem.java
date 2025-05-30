package net.minheur.tictactoe.grid;

public class GridItem {
    private CaseState[] caseStates = {
            CaseState.EMPTY, CaseState.EMPTY, CaseState.EMPTY,
            CaseState.EMPTY, CaseState.EMPTY, CaseState.EMPTY,
            CaseState.EMPTY, CaseState.EMPTY, CaseState.EMPTY
    };

    public GridItem() {
    }

    public void setCaseState(int caseId, CaseState caseState) {
        caseStates[caseId] = caseState;
    }

    public CaseState getCaseState(int caseId) {
        return caseStates[caseId];
    }

}
