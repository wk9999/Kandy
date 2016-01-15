package wk.java.kandy.server;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import wk.java.kandy.server.state.BrokerState;
import wk.java.kandy.server.state.BrokerStates;

public class KandyServer {
	
	private static final Log log = LogFactory.getLog(KandyServer.class);
	
	private final BrokerState brokerState = new BrokerState();
	
	private CountDownLatch shutdownLatch;

	public KandyServer(KandyConfig config) {
		// TODO Auto-generated constructor stub
	}

	public void startup() {
		log.info("starting");
		brokerState.setNewBrokerState(BrokerStates.Starting);
		
		// TODO isShuttingDown = new AtomicBoolean(false);
		
		shutdownLatch = new CountDownLatch(1);
		
		log.info("started");
	}

	public void awaitShutdown() {
		log.trace("await shutdown");
		try {
			shutdownLatch.await();
		} catch (InterruptedException e) {
			log.error(e);
		}
	}

	public void shutdown() {
		log.info("shutting down");
		
		log.info("shut down completed");
	}

}
