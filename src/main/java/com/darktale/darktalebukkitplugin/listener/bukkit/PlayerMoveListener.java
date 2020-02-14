package com.darktale.darktalebukkitplugin.listener.bukkit;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktaleapi.data.world.APILocation;
import com.darktale.darktaleapi.event.player.APIRecivePlayerLocationEvent;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 *
 * @author Ryan
 */
public class PlayerMoveListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        APILocation location = new APILocation(player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ());
        boolean canceled = DarktaleAPI.getAPI().eventHandler().callEvent(new APIRecivePlayerLocationEvent(player.getUniqueId().toString(), player.getName(), location));
        event.setCancelled(canceled);
    }

}
