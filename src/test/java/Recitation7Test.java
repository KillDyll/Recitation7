import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Recitation7Test {

    @Test
    @DisplayName("[1] test leftRightTriangle")
    void leftRightTriangle() {
        String expected = "*\n";
        String actual = Recitation7.leftRightTriangle(1);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = "*\n**\n";
        actual = Recitation7.leftRightTriangle(2);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = "*\n**\n***\n****\n*****\n******\n*******\n********\n";
        actual = Recitation7.leftRightTriangle(8);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
    }

    @Test
    @DisplayName("[1] test rightRightTriangle")
    void rightRightTriangle() {
        String expected = "*\n";
        String actual = Recitation7.rightRightTriangle(1);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = " *\n**\n";
        actual = Recitation7.rightRightTriangle(2);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = "  *\n **\n***\n";
        actual = Recitation7.rightRightTriangle(3);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = "       *\n      **\n     ***\n    ****\n   *****\n  ******\n *******\n********\n";
        actual = Recitation7.rightRightTriangle(8);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
    }

    @Test
    @DisplayName("[5] test rightRightTriangle")
    void circle() {
        String expected = "  ****\n ******\n ******\n********\n ******\n ******\n  ****\n";
        String actual = Recitation7.circle(4);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = "        ********\n      ************\n     **************\n    ****************\n   ******************\n  ********************\n  ********************\n **********************\n **********************\n **********************\n **********************\n************************\n **********************\n **********************\n **********************\n **********************\n  ********************\n  ********************\n   ******************\n    ****************\n     **************\n      ************\n        ********\n";
        actual = Recitation7.circle(12);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
    }
}