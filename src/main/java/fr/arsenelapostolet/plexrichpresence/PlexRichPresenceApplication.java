package fr.arsenelapostolet.plexrichpresence;

import javafx.application.Application;
import javafx.application.Platform;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlexRichPresenceApplication {

	public static void main(String[] args) {
		Application.launch(PlexRefresherFX.class, args);
	}
}
