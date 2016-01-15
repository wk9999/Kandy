package wk.java.kandy.server;

import java.util.concurrent.CountDownLatch;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class KandyServer {
	
	private static final Log log = LogFactory.getLog(KandyServer.class);
	
	private CountDownLatch shutdownLatch;

	public KandyServer(KandyConfig config) {
		// TODO Auto-generated constructor stub
	}

	public void startup() {
		log.info("starting");
		
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
