package net.minheur.tictactoe.grid;

public class BigGridItem {
    private GridState[] gridStates = {
            GridState.EMPTY, GridState.EMPTY, GridState.EMPTY,
            GridState.EMPTY, GridState.EMPTY, GridState.EMPTY,
            GridState.EMPTY, GridState.EMPTY, GridState.EMPTY
    };
    private GridItem[] grids = {
            new GridItem(), new GridItem(), new GridItem(),
            new GridItem(), new GridItem(), new GridItem(),
            new GridItem(), new GridItem(), new GridItem()
    };

    public BigGridItem() {
    }

    public void setGridState(int gridId, GridState gridState) {
        gridStates[gridId] = gridState;
    }

    public GridState getGridState(int gridId) {
        return gridStates[gridId];
    }

    public CaseState getCaseState(int gridId, int caseId) {
        return grids[gridId].getCaseState(caseId);
    }

    public void setCaseState(int gridId, int caseId, CaseState caseState) {
        grids[gridId].setCaseState(caseId, caseState);
    }
}
