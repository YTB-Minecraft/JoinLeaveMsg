package org.ytb.survival.joinmsg;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public void onEnable() {
		System.out.println("\n\nYTB���w��/���}�T���w�g�]�w����!");
		getServer().getPluginManager().registerEvents(new JoinLeaveMsg(), this);
	}
	
}
