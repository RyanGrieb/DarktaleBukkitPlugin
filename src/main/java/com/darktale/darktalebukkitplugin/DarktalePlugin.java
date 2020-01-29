package com.darktale.darktalebukkitplugin;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktalebukkitplugin.listener.PlayerConnectListener;
import com.darktale.darktalebukkitplugin.listener.api.SendPlayerMessage;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DarktalePlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        //Register Custom listeners, TODO: use an enum when this list gets big enough
        DarktaleAPI.getAPI().apiListener().registerListener(new SendPlayerMessage("apiSendPlayerMessage"));

        //Register Bukkit Events
        Bukkit.getPluginManager().registerEvents(new PlayerConnectListener(), this);
    }

    @Override
    public void onDisable() {

    }

}
