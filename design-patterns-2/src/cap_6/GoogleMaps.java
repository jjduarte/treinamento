package cap_6;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa{

	@Override
	public String devolveMapa(String rua) {
		try {
			String googleMaps = "http://maps.google.com/maps?q=rua-vergueiros";
			URL url;
			url = new URL(googleMaps);
			InputStream openStream = url.openStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "mapa";
	}

}
