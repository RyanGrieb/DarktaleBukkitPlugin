package com.darktale.darktalebukkitplugin.listener.bukkit;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktaleapi.event.player.APIPlayerJoinEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerConnectListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        //Call the API to tell it that the plugin just recived a player join event
        //The plugin then somehow needs to get told what to do after sending the

        //TODO: The called event should return TRUE/FALSE telling us if we need to cancel the event
        DarktaleAPI.getAPI().eventHandler().callEvent(new APIPlayerJoinEvent(event.getPlayer().getUniqueId().toString()));
    }

}
