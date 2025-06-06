package net.minheur.tictactoe.util;

public enum Commands {
    QUIT("quit", 0, "Ends the game."),
    PRINT_GRID("prnt_grid", 0, "This will show you the actual grid."),
    HELP("help", 0, "Show this list."),
    RESET_GRID("reset", 0, "Reset the grid to empty."),
    PLAY("play", 1, "Allow you to play. Arg is the case nb.");

    private final String id;
    private final int argAmount;
    private final String description;

    Commands(String id, int argAmount, String description) {
        this.id = id;
        this.argAmount = argAmount;
        this.description = description;
    }

    public String getCommandId() {
        return id;
    }

    public int getArgAmount() {
        return argAmount;
    }

    public String getDescription() {
        return description;
    }
}
