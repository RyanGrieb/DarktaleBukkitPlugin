package com.darktale.darktalebukkitplugin.listener;

import com.darktale.darktaleapi.listener.Listener;
import org.bukkit.Bukkit;

/**
 * Listens for DarktaleAPI calls
 *
 * @author Ryan
 */
public class APIExecuteListener extends Listener {

    public APIExecuteListener(String name) {
        super(name);
    }

    public void onCall() {
        Bukkit.broadcastMessage("I think we have something going for us.");
    }

}
