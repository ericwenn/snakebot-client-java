package se.cygni.snake;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by ericwenn on 2017-11-03.
 */
public class TestState {



    public static void main( String[] args) {
        testPossibleActions();
        testStep();
    }


    private static void testPossibleActions() {
        State state = initialState();
        Set<List<State.Action>> myActions = state.myPossibleActions();
        Set<List<State.Action>> othersActions = state.othersPossibleActions();

        System.out.println(myActions.size());
        System.out.println(othersActions.size());

    }


    private static void testStep() {
        State state = initialState();
        Set<List<State.Action>> myActions = state.myPossibleActions();

        System.out.println(state);
        for( List<State.Action> actions : myActions) {
            State s = State.step(state, actions);
            System.out.println(s);
        }


    }



    private static State initialState() {
        int[][] map = {
                {1, 1, 2, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0}
        };

        LinkedList<State.Position> myPositions = new LinkedList<>();
        myPositions.add( new State.Position(0,2));
        myPositions.add( new State.Position(0,1));
        myPositions.add( new State.Position(0,0));
        State.Snake mySnake = new State.Snake(0, myPositions);

        return new State(mySnake, new State.Snake[0], new LinkedList<>(), 5,5);
    }

}
