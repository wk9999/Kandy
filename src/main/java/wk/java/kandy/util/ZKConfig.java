package wk.java.kandy.util;

import java.util.Properties;

public class ZKConfig {
	
	public final VerifiableProperties props;

	public ZKConfig(Properties props) {
		this.props = new VerifiableProperties(props);
	}

}
