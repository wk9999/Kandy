package wk.java.kandy.server.state;

public interface BrokerStates {
	
	public static final State NotRunning = new State("NotRunning", 0);
	
	public static final State Starting = new State("Starting", 1);
	
	public static final State RecoveringFromUncleanShutdown = new State("RecoveringFromUncleanShutdown", 2);
	
	public static final State RunningAsBroker = new State("RunningAsBroker", 3);
	
	public static final State RunningAsController = new State("RunningAsController", 4);
	
	public static final State PendingControlledShutdown = new State("PendingControlledShutdown", 6);
	
	public static final State BrokerShuttingDown = new State("BrokerShuttingDown", 7);
	
}
