package wk.java.kandy;

import java.util.Properties;

import wk.java.kandy.metrics.KandyMetricsReporterHelper;
import wk.java.kandy.server.KandyConfig;
import wk.java.kandy.server.KandyServerStartable;
import wk.java.kandy.util.PropertiesUtils;

public class Kandy {

	public static void main(String[] args) {
		System.out.println(Kandy.class.getResource(""));
		if (args.length != 1) {
			System.out.println("-----");
			System.exit(1);
		}
		
		Properties props = PropertiesUtils.loadProps(args[0]);
		
		KandyConfig serverConfig = new KandyConfig(props);
		
		KandyMetricsReporterHelper.startReporters(serverConfig.props);
		
		final KandyServerStartable server = new KandyServerStartable(serverConfig);
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			
			@Override
			public void run() {
				server.shutdown();
			}
			
		});
		
		server.startup();
		server.awaitShutdown();
		
	}
	
}
