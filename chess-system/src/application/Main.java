package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessmatch = new ChessMatch();

        UI.printBoard(chessmatch.getPieces());

    }
}