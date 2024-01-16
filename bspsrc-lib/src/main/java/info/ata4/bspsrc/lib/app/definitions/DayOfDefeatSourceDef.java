package info.ata4.bspsrc.lib.app.definitions;

import info.ata4.bspsrc.lib.app.SourceApp;
import info.ata4.bspsrc.lib.app.SourceAppBuilder;
import info.ata4.bspsrc.lib.app.SourceAppId;

import java.util.regex.Pattern;

public class DayOfDefeatSourceDef {

	public static final SourceApp APP = new SourceAppBuilder()
			.setName("Day of Defeat: Source")
			.setAppId(SourceAppId.DAY_OF_DEFEAT_SOURCE)
			.setVersionRange(19, 20)
			.setFilePattern(Pattern.compile("^dod_"))
			.setEntities(
					"dod_bomb_dispenser",
					"dod_bomb_target",
					"dod_capture_area",
					"dod_control_point",
					"dod_control_point_master",
					"dod_scoring",
					"func_team_wall",
					"func_teamblocker",
					"info_doddetect",
					"info_player_allies",
					"info_player_axis"
			)
			.build();
}