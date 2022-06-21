package dev.bence.testing.instance.hats;

import org.bukkit.ChatColor;

import java.util.Arrays;
import java.util.List;

public enum HatType {

    TOP_HAT
            (ChatColor.RED + "Top hat",
                    Arrays.asList(ChatColor.GRAY + "Fancy"),
                    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDA3MjYyODRiOGMxMmExYTM3NjhiZGMzMjE4NWMxNTVlMTkxOTZkYzA4MGYwNGQ1YTY3ZDUwZTQ5MmQ1NjNiYiJ9fX0="),
    TIGER_HAT
            (ChatColor.GOLD + "Tiger hat",
                    Arrays.asList(ChatColor.GRAY + "Keep away"),
                    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTA5NWZjYzFlM2Q3Y2JkMzUwZjE5YjM4OTQ5OGFiOGJiOTZjNjVhZDE4NWQzNDU5MjA2N2E3ZDAzM2FjNDhkZSJ9fX0="),
    DOG_HAT
            (ChatColor.YELLOW + "Dog hat",
                    Arrays.asList(ChatColor.GRAY + "Carefull i bite"),
                    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzMyM2EwMDBkOGI5ODg4YzY5MzgxZTQwNzQ2MGZlMDhkZDUzMzFkYjQxZTk1NzU2Nzk2NzJiYTdkYTExMjFlMCJ9fX0=");

    private String display, headTexture;
    private List<String> description;

    HatType(String display, List<String> description, String headTexture) {
        this.display = display;
        this.description = description;
        this.headTexture = headTexture;
    }

    public String getDisplay() { return display; }
    public List<String> getDescription() { return description; }
    public String getHeadTexture() { return headTexture; }
}
