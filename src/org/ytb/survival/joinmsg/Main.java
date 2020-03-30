package org.ytb.survival.joinmsg;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public void onEnable() {
		System.out.println("\n\nYTB的歡迎/離開訊息已經設定完成!");
		getServer().getPluginManager().registerEvents(new JoinLeaveMsg(), this);
	}
	
}
