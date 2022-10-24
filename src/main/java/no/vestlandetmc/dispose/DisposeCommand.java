package no.vestlandetmc.dispose;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class DisposeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) {
			MessageHandler.sendConsole("You cannot use this command from the console.");
			return true;
		}

		final Player player = (Player) sender;
		final Inventory inv = Bukkit.createInventory(null, 45, MessageHandler.colorize("&4Søppelkassa"));
		player.openInventory(inv);

		return true;
	}

}
