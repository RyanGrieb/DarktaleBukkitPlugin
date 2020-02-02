package com.darktale.darktalebukkitplugin.listener.api;

import com.darktale.darktaleapi.event.command.APIRegisterCommandEvent;
import com.darktale.darktaleapi.listener.APIListener;
import com.darktale.darktalebukkitplugin.DarktalePlugin;
import com.darktale.darktalebukkitplugin.command.BukkitCommand;
import org.bukkit.Bukkit;

/**
 *
 * @author Ryan
 */
public class APICommandListener implements APIListener {

    public void onAPIRegisterCommand(APIRegisterCommandEvent event) {
        //TODO: Update commands.yml baseed on this event
        if (DarktalePlugin.getPlugin().getCommand(event.getCommand().getName()) == null) {
            //TODO: update commands.yml
        }
        DarktalePlugin.getPlugin().getCommand(event.getCommand().getName()).setExecutor(new BukkitCommand());
    }

}
