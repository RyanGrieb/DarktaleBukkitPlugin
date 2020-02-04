package com.darktale.darktalebukkitplugin.listener.api;

import com.darktale.darktaleapi.data.file.FileManager;
import com.darktale.darktaleapi.event.command.APIRegisterCommandEvent;
import com.darktale.darktaleapi.listener.APIListener;
import com.darktale.darktalebukkitplugin.DarktalePlugin;
import com.darktale.darktalebukkitplugin.command.BukkitCommand;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ryan
 */
public class APICommandListener implements APIListener {

    public void onAPIRegisterCommand(APIRegisterCommandEvent event) {
        //TODO: Update commands.yml based on this event

        String commandsPath = DarktalePlugin.getPlugin().getDataFolder().getPath() + "/plugin.yml";

        if (DarktalePlugin.getPlugin().getCommand(event.getCommand().getName()) == null) {
            System.out.println("Warning: Unable to load commands into bukkit. We'll just override everything then.");
            return;
        }
    }

}
