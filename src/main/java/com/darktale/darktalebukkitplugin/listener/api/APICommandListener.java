package com.darktale.darktalebukkitplugin.listener.api;

import com.darktale.darktaleapi.event.command.APIRegisterCommandEvent;
import com.darktale.darktaleapi.listener.APIListener;
import com.darktale.darktalebukkitplugin.DarktalePlugin;
import com.darktale.darktalebukkitplugin.command.BukkitCommand;

/**
 *
 * @author Ryan
 */
public class APICommandListener implements APIListener {

    public void onAPIRegisterCommand(APIRegisterCommandEvent event) {
        //TODO: We'd probally use this in hytale. For now we don't need to have proper bukkit implementation

        // if (DarktalePlugin.getPlugin().getCommand(event.getCommand().getName()) == null) {
        //}
        DarktalePlugin.getPlugin().getCommand(event.getCommand().getName()).setExecutor(new BukkitCommand());
    }

}
