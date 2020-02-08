package com.darktale.darktalebukkitplugin.command;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktaleapi.event.player.APIPlayerCommandEvent;
import java.util.Arrays;
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

        StringBuilder sBuilder = new StringBuilder();

        if (args.length > 0) {
            sBuilder.append(label + " ");
        } else {
            sBuilder.append(label);
        }

        for (int i = 0; i < args.length; i++) {
            if (i == args.length - 1) {
                sBuilder.append(args[i]);
            } else {
                sBuilder.append(args[i] + " ");
            }

        }

        DarktaleAPI.getAPI().eventHandler().callEvent(
                new APIPlayerCommandEvent(player.getUniqueId().toString(), player.getName(), sBuilder.toString()));
        return false;
    }

}
