package com.darktale.darktalebukkitplugin;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktaleapi.data.player.command.APICommandHandler;
import com.darktale.darktaleapi.event.EventHandler;
import com.darktale.darktaleapi.listener.ListenerHandler;
import com.darktale.darktalebukkitplugin.listener.api.APIBroadcastListener;
import com.darktale.darktalebukkitplugin.listener.api.APICommandListener;
import com.darktale.darktalebukkitplugin.listener.bukkit.PlayerConnectListener;
import com.darktale.darktalebukkitplugin.listener.api.APIPlayerListener;
import com.darktale.darktalebukkitplugin.listener.bukkit.PlayerChatListener;
import com.darktale.darktalebukkitplugin.listener.bukkit.PlayerMoveListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DarktalePlugin extends JavaPlugin {

    private static DarktalePlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;

        //Register Custom listeners
        DarktaleAPI.getAPI().setListenerHandler(new ListenerHandler());
        DarktaleAPI.getAPI().listenerHandler().registerListener("apiPlayerListener", new APIPlayerListener());
        DarktaleAPI.getAPI().listenerHandler().registerListener("apiCommandListener", new APICommandListener());
        DarktaleAPI.getAPI().listenerHandler().registerListener("apiBroadcastListener", new APIBroadcastListener());

        //Register the remaining handlers
        DarktaleAPI.getAPI().setEventHandler(new EventHandler());
        DarktaleAPI.getAPI().setCommandHandler(new APICommandHandler());

        //Register Bukkit Events
        Bukkit.getPluginManager().registerEvents(new PlayerConnectListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerChatListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerMoveListener(), this);
    }

    @Override
    public void onDisable() {

    }

    public static DarktalePlugin getPlugin() {
        return plugin;
    }
}
