package com.crusadecrusade.nonethergold.listeners;

import com.crusadecrusade.nonethergold.NoNetherGold;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.inventory.ItemStack;

public class OnBlockBreak implements Listener {

    private static NoNetherGold plugin;

    public OnBlockBreak(NoNetherGold plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onNetherGoldOreBreak(BlockBreakEvent event) {
        // If the block is not nether gold ore, stop
        if (!(event.getBlock().getType() == Material.NETHER_GOLD_ORE)) return;

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
        Location locFixed = blockLoc.add(0, 0.5, 0);
        event.getPlayer().getWorld().dropItemNaturally(locFixed, netherrackDrop);
    }

    @EventHandler
    public void onGildedBlackstoneBreak(BlockBreakEvent event) {
        // If the block is not gilded blackstone, stop
        if (!(event.getBlock().getType() == Material.GILDED_BLACKSTONE)) return;

        // Get the block and store it in block
        Block block = event.getBlock();

        // Cancel the break event
        event.setCancelled(true);

        // Set the block to air
        block.setType(Material.AIR);

        // Get the location of the block from the event
        Location blockLoc = block.getLocation();

        // Make and drop a piece of blackstone
        ItemStack blackstoneDrop = new ItemStack(Material.BLACKSTONE);
        Location locFixed = blockLoc.add(0, 0.5, 0);
        event.getPlayer().getWorld().dropItemNaturally(locFixed, blackstoneDrop);
    }

    @EventHandler
    public void onNetherGoldOreEntityExplode(EntityExplodeEvent event) {
        // if ((event.getEntity() instanceof TNTPrimed) || (event.getEntity() instanceof Creeper) || (event.getEntity() instanceof EnderCrystal) || (event.getEntity() instanceof Fireball) || (event.getEntity() instanceof DragonFireball) || (event.getEntity() instanceof LargeFireball) || (event.getEntity() instanceof SizedFireball) || (event.getEntity() instanceof SmallFireball) || (event.getEntity() instanceof Minecart) || (event.getEntity() instanceof Explosive)) {
            for (Block block : event.blockList()) {
                if (block.getType() == Material.NETHER_GOLD_ORE) {
                    event.blockList().remove(block);
                }
            }
        // }
    }

    @EventHandler
    public void onGildedBlackstoneEntityExplode(EntityExplodeEvent event) {
        // if ((event.getEntity() instanceof TNTPrimed) || (event.getEntity() instanceof Creeper) || (event.getEntity() instanceof EnderCrystal) || (event.getEntity() instanceof Fireball) || (event.getEntity() instanceof DragonFireball) || (event.getEntity() instanceof LargeFireball) || (event.getEntity() instanceof SizedFireball) || (event.getEntity() instanceof SmallFireball) || (event.getEntity() instanceof Minecart) || (event.getEntity() instanceof Explosive)) {
            for (Block block : event.blockList()) {
                if (block.getType() == Material.GILDED_BLACKSTONE) {
                    event.blockList().remove(block);
                }
            }
        // }
    }

    @EventHandler
    public void onNetherGoldOreBlockExplode(BlockExplodeEvent event) {
        // if ((event.getBlock().getType() == Material.WHITE_BED) || (event.getBlock().getType() == Material.BLACK_BED) || (event.getBlock().getType() == Material.BLUE_BED) || (event.getBlock().getType() == Material.BROWN_BED) || (event.getBlock().getType() == Material.CYAN_BED) || (event.getBlock().getType() == Material.GRAY_BED) || (event.getBlock().getType() == Material.GREEN_BED) || (event.getBlock().getType() == Material.LIGHT_BLUE_BED) || (event.getBlock().getType() == Material.LIGHT_GRAY_BED) || (event.getBlock().getType() == Material.LIME_BED) || (event.getBlock().getType() == Material.MAGENTA_BED) || (event.getBlock().getType() == Material.ORANGE_BED) || (event.getBlock().getType() == Material.PINK_BED) || (event.getBlock().getType() == Material.PURPLE_BED) || (event.getBlock().getType() == Material.RED_BED) || (event.getBlock().getType() == Material.YELLOW_BED)) {
            for (Block block : event.blockList()) {
                if (block.getType() == Material.NETHER_GOLD_ORE) {
                    event.blockList().remove(block);
                }
            }
        // }
    }

    @EventHandler
    public void onGildedBlackstoneBlockExplode(BlockExplodeEvent event) {
        // if ((event.getBlock().getType() == Material.WHITE_BED) || (event.getBlock().getType() == Material.BLACK_BED) || (event.getBlock().getType() == Material.BLUE_BED) || (event.getBlock().getType() == Material.BROWN_BED) || (event.getBlock().getType() == Material.CYAN_BED) || (event.getBlock().getType() == Material.GRAY_BED) || (event.getBlock().getType() == Material.GREEN_BED) || (event.getBlock().getType() == Material.LIGHT_BLUE_BED) || (event.getBlock().getType() == Material.LIGHT_GRAY_BED) || (event.getBlock().getType() == Material.LIME_BED) || (event.getBlock().getType() == Material.MAGENTA_BED) || (event.getBlock().getType() == Material.ORANGE_BED) || (event.getBlock().getType() == Material.PINK_BED) || (event.getBlock().getType() == Material.PURPLE_BED) || (event.getBlock().getType() == Material.RED_BED) || (event.getBlock().getType() == Material.YELLOW_BED)) {
            for (Block block : event.blockList()) {
                if (block.getType() == Material.GILDED_BLACKSTONE) {
                    event.blockList().remove(block);
                }
            }
        // }
    }

}
