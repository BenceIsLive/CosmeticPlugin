package dev.bence.testing.navigation;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class CosmeticsUI {

    public CosmeticsUI(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "Cosmetics");

        ItemStack hats = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta hatsMeta = hats.getItemMeta();
        hatsMeta.setDisplayName("Hats");
        hatsMeta.setLore(Arrays.asList("Puts a custom skull on youre hat"));
        hats.setItemMeta(hatsMeta);

        inv.addItem(hats);


        player.openInventory(inv);
    }
}
