package com.crusadecrusade.nonethergold.listeners;

import com.crusadecrusade.nonethergold.NoNetherGold;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class OnBlockBreak implements Listener {

    private static NoNetherGold plugin;

    public OnBlockBreak(NoNetherGold plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        // If the block is either nether gold ore, or gilded blackstone
        if (!((event.getBlock().getType() == Material.NETHER_GOLD_ORE) || (event.getBlock().getType() == Material.GILDED_BLACKSTONE))) return;

        // Get the block and store it in block
        Block block = event.getBlock();

        // Cancel the break event
        event.setCancelled(true);

        // Set the block to air
        block.setType(Material.AIR);

        // Get the location of the block from the event
        Location blockLoc = block.getLocation();

        // Make and drop a piece of netherrack
        ItemStack netherrackDrop = new ItemStack(Material.NETHERRACK);
        event.getPlayer().getWorld().dropItemNaturally(blockLoc, netherrackDrop);

    }

}
