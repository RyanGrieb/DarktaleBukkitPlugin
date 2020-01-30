package com.darktale.darktalebukkitplugin.listener.api;

import com.darktale.darktaleapi.event.APIEvent;
import com.darktale.darktaleapi.event.player.APISendPlayerMessageEvent;
import com.darktale.darktaleapi.listener.APIListener;
import java.util.UUID;
import org.bukkit.Bukkit;

/**
 * Listens for API player event calls
 *
 * @author Ryan
 */
public class APIPlayerListener implements APIListener {

    public void onAPISendPlayerMessage(APISendPlayerMessageEvent event) {
        Bukkit.getPlayer(UUID.fromString(event.getPlayerID())).sendMessage(event.getMessage());
    }

}
