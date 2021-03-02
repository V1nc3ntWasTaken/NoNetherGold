package com.crusadecrusade.nonethergold;

import com.crusadecrusade.nonethergold.listeners.OnBlockBreak;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoNetherGold extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        new OnBlockBreak(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
