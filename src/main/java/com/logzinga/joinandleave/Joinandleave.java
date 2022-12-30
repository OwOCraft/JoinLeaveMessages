package com.logzinga.joinandleave;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Joinandleave extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents((Listener) new JoinLeaveListener(), this);

    }
}
