package info.ata4.bsplib.app.definitions;

import info.ata4.bsplib.app.SourceApp;
import info.ata4.bsplib.app.SourceAppBuilder;
import info.ata4.bsplib.app.SourceAppId;

import java.util.regex.Pattern;

public class BladeSymphonyDef {

	public static final SourceApp APP = new SourceAppBuilder()
			.setName("Blade Symphony")
			.setAppId(SourceAppId.BLADE_SYMPHONY)
			.setVersion(21)
			.setFilePattern(Pattern.compile("^(duel|ffa|free|tut)_$"))
			.setEntities(
					"berimbau_duel",
					"berimbau_spawn",
					"berimbau_spectator_camera"
			)
			.build();
}