package me.noodles.tntthrow;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {	
	getServer().getPluginManager().registerEvents(new Command(), this);
	getServer().getConsoleSender().sendMessage("ThrowTNT has been enabled!");
	}
	
	@Override
	public void onDisable() {
	getServer().getConsoleSender().sendMessage("ThrowTNT has been disabled!");
	}
	
	
}
