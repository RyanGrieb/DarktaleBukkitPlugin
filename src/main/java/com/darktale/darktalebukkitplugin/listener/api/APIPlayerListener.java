package com.darktale.darktalebukkitplugin.listener.api;

import com.darktale.darktaleapi.data.world.APILocation;
import com.darktale.darktaleapi.event.APIEvent;
import com.darktale.darktaleapi.event.player.APISendPlayerMessageEvent;
import com.darktale.darktaleapi.event.player.APITeleportPlayerEvent;
import com.darktale.darktaleapi.listener.APIListener;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * Listens for API player event calls
 *
 * @author Ryan
 */
public class APIPlayerListener implements APIListener {

    public void onAPISendPlayerMessage(APISendPlayerMessageEvent event) {
        Bukkit.getPlayer(UUID.fromString(event.getPlayerID())).sendMessage(event.getMessage());
    }

    public void onAPITeleportPlayer(APITeleportPlayerEvent event) {
        APILocation l = event.getLocation();
        Player player = Bukkit.getPlayer(UUID.fromString(event.getPlayerID()));

        player.teleport(new Location(player.getWorld(), l.getX(), l.getY(), l.getZ()));
    }
}
