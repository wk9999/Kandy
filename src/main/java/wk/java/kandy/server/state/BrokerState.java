package wk.java.kandy.server.state;

public class BrokerState {
	
	private volatile State currentBrokerState = BrokerStates.NotRunning;
	
	public void setNewBrokerState(State state) {
		currentBrokerState = state;
	}
	
	public void setNewBrokerState(String name, int state) {
		currentBrokerState = new State(name, state);
	}
	
	public State getCurrentBrokerState() {
		return currentBrokerState;
	}

}
