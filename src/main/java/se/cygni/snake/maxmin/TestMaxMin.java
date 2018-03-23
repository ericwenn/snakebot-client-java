package se.cygni.snake.maxmin;

import se.cygni.snake.State;

/**
 * Created by ericwenn on 2017-11-01.
 */
public class TestMaxMin {

    public static void main(String[] args) {
        testUtility();
    }


    private static void testUtility() {
        State[] initialStates = new State[]{
                initialState(),
                initialState2(),
                initialState3(),
                initialState4()
        };

        int[] expected = new int[]{
                -2,
                0,
                0,
                -32
        };


        int[] actual = new int[4];
        for( int i = 0; i < initialStates.length; i++) {
            actual[i] = MaxMin.utility(initialStates[i], 100);
        }

        for( int i = 0; i < initialStates.length; i++) {
            if( expected[i] != actual[i]) {
                System.out.println("Utility incorrect for state "+i+", expected "+expected[i]+" but got "+actual[i]);
            }
        }

    }

    private static State initialState() {
        int[][] map = {
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0}
        };
        State.Snake[] otherSnakes = new State.Snake[]{
                new State.Snake(1, 2, 2),
                new State.Snake(2, 4, 2),
        };

        State.Snake mySnake = new State.Snake(0, 0, 2);

        return null;
//        return new State(map, otherSnakes, mySnake, 5, 5);
    }

    private static State initialState2() {
        int[][] map = {
                {0, 0, 1},
                {0, 0, 0},
                {0, 0, 1},
        };
        State.Snake[] otherSnakes = new State.Snake[]{
                new State.Snake(1, 2, 2),
        };

        State.Snake mySnake = new State.Snake(0, 0, 2);

        return null;
//        return new State(map, otherSnakes, mySnake, 3, 3);
    }

    private static State initialState3() {
        int[][] map = {
                {0, 0, 1},
                {0, 0, 0},
                {1, 0, 1},
        };
        State.Snake[] otherSnakes = new State.Snake[]{
                new State.Snake(1, 2, 2),
                new State.Snake(2, 2, 0)
        };

        State.Snake mySnake = new State.Snake(0, 0, 2);
        return null;

//        return new State(map, otherSnakes, mySnake, 3, 3);
    }

    private static State initialState4() {
        int[][] map = {
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
        };
        State.Snake[] otherSnakes = new State.Snake[]{
                new State.Snake(1, 0, 3),
        };

        State.Snake mySnake = new State.Snake(0, 7, 0);
        return null;
//        return new State(map, otherSnakes, mySnake, 8, 8);

    }
}
