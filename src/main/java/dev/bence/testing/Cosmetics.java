package dev.bence.testing;

import dev.bence.testing.instance.Cosmetic;
import dev.bence.testing.navigation.CosmeticListener;
import dev.bence.testing.navigation.CosmeticsCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public final class Cosmetics extends JavaPlugin {

    private HashMap<UUID, List<Cosmetic>> activeCosmetics = new HashMap<>();


    @Override
    public void onEnable() {
        getCommand("cosmetics").setExecutor(new CosmeticsCommand());

        Bukkit.getPluginManager().registerEvents(new CosmeticListener(this), this);

    }

    public HashMap<UUID, List<Cosmetic>> getActiveCosmetics() { return activeCosmetics; }
}

