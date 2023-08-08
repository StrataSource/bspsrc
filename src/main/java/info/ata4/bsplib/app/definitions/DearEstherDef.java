package info.ata4.bsplib.app.definitions;

import info.ata4.bsplib.app.SourceApp;
import info.ata4.bsplib.app.SourceAppBuilder;
import info.ata4.bsplib.app.SourceAppId;

import java.util.regex.Pattern;

public class DearEstherDef {

	public static final SourceApp APP = new SourceAppBuilder()
			.setName("Dear Esther")
			.setAppId(SourceAppId.DEAR_ESTHER)
			.setVersion(21)
			.setFilePattern(Pattern.compile("^donnelley|esther|jakobson|paul$"))
			.setEntities(
					"de_env_wind",
					"de_func_smokevolume"
			)
			.build();
}