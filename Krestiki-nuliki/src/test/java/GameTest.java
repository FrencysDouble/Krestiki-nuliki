import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @org.junit.jupiter.api.Test
    void placePiece() {
        char[][] gameBoard = {{' ','|',' ', '|', ' '},
                {'-','+','-', '+', '-'},
                {' ','|',' ', '|', ' '},
                {'-','+','-', '+', '-'},
                {' ','|',' ', '|', ' '}};
        assertEquals('X', Game.placePiece(gameBoard, 2, "player"));
        assertEquals('O', Game.placePiece(gameBoard, 2, "cpu"));
    }

    @org.junit.jupiter.api.Test
    void checkWinner() {
        String c = Game.checkWinner();
        assertEquals(c,"");
    }
}