package com.darktale.darktalebukkitplugin;

import com.darktale.darktaleapi.DarktaleAPI;
import com.darktale.darktalebukkitplugin.listener.APIExecuteListener;
import com.darktale.darktalebukkitplugin.listener.PlayerConnectListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DarktalePlugin extends JavaPlugin {

    private APIExecuteListener apiExecuteListener;

    @Override
    public void onEnable() {

        //Register Custom EventListeners
        DarktaleAPI.getAPI().apiListener().registerListener(new APIExecuteListener("apiExecuteListener"));

        //Register Bukkit EventListeners
        Bukkit.getPluginManager().registerEvents(new PlayerConnectListener(), this);
    }

    @Override
    public void onDisable() {

    }

}
