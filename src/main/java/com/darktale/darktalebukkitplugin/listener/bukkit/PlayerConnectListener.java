package com.darktale.darktalebukkitplugin.listener.bukkit;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktaleapi.event.player.APIPlayerJoinEvent;
import com.darktale.darktaleapi.event.player.APIPlayerLeaveEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerConnectListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        //Call the API to tell it that the plugin just recived a player join event
        //The plugin then somehow needs to get told what to do after sending the

        //TODO: The called event should return TRUE/FALSE telling us if we need to cancel the event
        DarktaleAPI.getAPI().eventHandler().callEvent(new APIPlayerJoinEvent(player.getUniqueId().toString(), player.getName()));
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        DarktaleAPI.getAPI().eventHandler().callEvent(new APIPlayerLeaveEvent(player.getUniqueId().toString(), player.getName()));
    }

}
