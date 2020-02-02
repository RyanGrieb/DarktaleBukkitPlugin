package com.darktale.darktalebukkitplugin.listener.bukkit;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktaleapi.event.player.APIPlayerCommandEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

/**
 *
 * @author Ryan
 */
public class PlayerChatListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

    }

    @EventHandler
    public void prePlayerCommand(PlayerCommandPreprocessEvent event) {
        //boolean cancelled = DarktaleAPI.getAPI().eventHandler().callEvent(
        //         new APIPlayerCommandEvent(event.getPlayer().getUniqueId().toString(), event.getMessage()));
        //event.setCancelled(cancelled);
    }

}
