package info.ata4.bsplib.app.definitions;

import info.ata4.bsplib.app.SourceApp;
import info.ata4.bsplib.app.SourceAppBuilder;
import info.ata4.bsplib.app.SourceAppId;

public class StrataSourceDef {
	public static final SourceApp APP = new SourceAppBuilder()
		.setName("Strata Source")
		.setAppId(SourceAppId.STRATA_SOURCE)
		.setVersion(25)
		.build();
}
