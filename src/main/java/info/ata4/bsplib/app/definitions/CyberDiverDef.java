package info.ata4.bsplib.app.definitions;

import info.ata4.bsplib.app.SourceApp;
import info.ata4.bsplib.app.SourceAppBuilder;
import info.ata4.bsplib.app.SourceAppId;

public class CyberDiverDef {

	public static final SourceApp APP = new SourceAppBuilder()
			.setName("Cyber Diver")
			.setAppId(SourceAppId.CYBER_DIVER)
			.setVersion(20)
			.setEntities(
					"bs_ammomachine",
					"bs_cgatecore",
					"bs_cgatemachine",
					"func_player_keepout_bs09",
					"info_player_battle_bs09",
					"info_player_briefing_bs09",
					"info_player_tutorial_bs09",
					"item_cybersoul",
					"logic_tutorial_chapter",
					"trigger_nodelay_bs09",
					"trigger_physics_trap_bs09",
					"trigger_recover_bs09",
					"trigger_teleport_bs09"
			)
			.build();
}