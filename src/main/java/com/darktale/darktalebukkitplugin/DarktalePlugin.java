package com.darktale.darktalebukkitplugin;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktalebukkitplugin.listener.bukkit.PlayerConnectListener;
import com.darktale.darktalebukkitplugin.listener.api.APIPlayerListener;
import com.darktale.darktalebukkitplugin.listener.bukkit.PlayerChatListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DarktalePlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        //Register Custom listeners, TODO: use an enum when this list gets big enough
        DarktaleAPI.getAPI().listenerHandler().registerListener("apiPlayerListener", new APIPlayerListener());

        //Register Bukkit Events
        Bukkit.getPluginManager().registerEvents(new PlayerConnectListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerChatListener(), this);
    }

    @Override
    public void onDisable() {

    }

}
