package com.darktale.darktalebukkitplugin.listener;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktaleapi.event.EventPlayerJoin;
import com.darktale.darktalebukkitplugin.DarktalePlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerConnectListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        //Call the API to tell it that the plugin just recived a player join event
        //The plugin then somehow needs to get told what to do after sending the

        String playerName = event.getPlayer().getName();
        DarktaleAPI.getAPI().eventHandler().callEvent(new EventPlayerJoin(playerName));
    }

}
