package com.program.states;

import com.program.State;

public class GameContext implements State {
    private State gameState;

    public void setState(State state) {
        this.gameState=state;
    }

    public State getState() {
        return this.gameState;
    }

    @Override
    public void startState() {
            this.gameState.startState();
    }

}
