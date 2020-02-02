package com.darktale.darktalebukkitplugin.command;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktaleapi.event.player.APIPlayerCommandEvent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Ryan
 */
public class BukkitCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }

        Player player = (Player) sender;

        Bukkit.broadcastMessage("We need to send the proper message:");
        Bukkit.broadcastMessage(label);
        Bukkit.broadcastMessage(args.toString());
        System.out.println(args);

        //DarktaleAPI.getAPI().eventHandler().callEvent(
        //        new APIPlayerCommandEvent(player.getUniqueId().toString(), event.getMessage()));
        return false;
    }

}
