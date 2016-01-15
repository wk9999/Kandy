package wk.java.kandy.server;

import wk.java.kandy.common.AppInfo;

public class KandyServerStartable {
	
	private final KandyServer server;

	public KandyServerStartable(KandyConfig config) {
		this.server = new KandyServer(config);
	}

	public void startup() {
		server.startup();
		AppInfo.registerInfo();
	}
	
	public void awaitShutdown() {
		server.awaitShutdown();
	}
	
	public void shutdown() {
		server.shutdown();
	}

}
