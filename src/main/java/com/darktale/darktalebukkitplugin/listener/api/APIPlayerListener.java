package com.darktale.darktalebukkitplugin.listener.api;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktaleapi.data.player.DarktalePlayer;
import com.darktale.darktaleapi.data.world.APILocation;
import com.darktale.darktaleapi.event.player.APIRecivePlayerLocationEvent;
import com.darktale.darktaleapi.event.player.APIRequestPlayerLocationEvent;
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
        Bukkit.getPlayer(UUID.fromString(event.getPlayer().getID())).sendMessage(event.getMessage());
    }

    public void onAPITeleportPlayer(APITeleportPlayerEvent event) {
        APILocation l = event.getLocation();
        Player player = Bukkit.getPlayer(UUID.fromString(event.getPlayer().getID()));

        player.teleport(new Location(player.getWorld(), l.getX(), l.getY(), l.getZ()));
    }

    public void onAPIRequestPlayerLocationEvent(APIRequestPlayerLocationEvent event) {
        Player player = Bukkit.getPlayer(UUID.fromString(event.getPlayer().getID()));
        APILocation location = new APILocation(player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ());
        DarktaleAPI.getAPI().eventHandler().callEvent(new APIRecivePlayerLocationEvent(player.getUniqueId().toString(), player.getName(), location));
    }

}
