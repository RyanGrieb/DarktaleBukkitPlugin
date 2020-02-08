package com.darktale.darktalebukkitplugin.listener.bukkit;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktaleapi.event.player.APIPlayerCommandEvent;
import org.bukkit.entity.Player;
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
        Player player = event.getPlayer();

        //Note: This is "wrong" implementation on bukkit side. But we don't care since were going to do it right on hytale.
        //boolean cancelled = DarktaleAPI.getAPI().eventHandler().callEvent(
        //        new APIPlayerCommandEvent(player.getUniqueId().toString(), player.getName(), event.getMessage()));
        // event.setCancelled(cancelled);
    }

}
