package no.vestlandetmc.dispose;

import org.bukkit.plugin.java.JavaPlugin;

public class Dispose extends JavaPlugin {

	public static Dispose instance;

	public static Dispose getInstance() {
		return instance;
	}

	@Override
	public void onEnable() {
		instance = this;

		this.getCommand("dispose").setExecutor(new StonadCommand());
	}

}