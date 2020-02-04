package com.darktale.darktalebukkitplugin.listener.api;

import com.darktale.darktaleapi.event.misc.APIBroadcastEvent;
import com.darktale.darktaleapi.listener.APIListener;
import org.bukkit.Bukkit;

/**
 *
 * @author Ryan
 */
public class APIBroadcastListener implements APIListener {

    public void onAPIBroadcastEvent(APIBroadcastEvent event) {
        Bukkit.broadcastMessage(event.getMessage());
    }

}
