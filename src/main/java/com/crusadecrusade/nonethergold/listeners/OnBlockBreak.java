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
        Entity entity = event.getEntity();

        if (entity.getType().equals(EntityType.CREEPER) || entity.getType().equals(EntityType.PRIMED_TNT) || entity.getType().equals(EntityType.MINECART_TNT) || entity.getType().equals(EntityType.ENDER_CRYSTAL) || entity.getType().equals(EntityType.FIREBALL) || entity.getType().equals(EntityType.SMALL_FIREBALL) || entity.getType().equals(EntityType.DRAGON_FIREBALL) || entity.getType().equals(EntityType.CREEPER) || entity.getType().equals(EntityType.PLAYER)) {
            for (Block block : event.blockList().toArray(new Block[event.blockList().size()])) {
                if (block.getType().equals(Material.NETHER_GOLD_ORE)) {
                    event.blockList().remove(block);
                }
            }
        }
    }

    @EventHandler
    public void onGildedBlackstoneEntityExplode(EntityExplodeEvent event) {
        Entity entity = event.getEntity();

        if (entity.getType().equals(EntityType.CREEPER) || entity.getType().equals(EntityType.PRIMED_TNT) || entity.getType().equals(EntityType.MINECART_TNT) || entity.getType().equals(EntityType.ENDER_CRYSTAL) || entity.getType().equals(EntityType.FIREBALL) || entity.getType().equals(EntityType.SMALL_FIREBALL) || entity.getType().equals(EntityType.DRAGON_FIREBALL) || entity.getType().equals(EntityType.CREEPER) || entity.getType().equals(EntityType.PLAYER)) {
            for (Block block : event.blockList().toArray(new Block[event.blockList().size()])) {
                if (block.getType().equals(Material.GILDED_BLACKSTONE)) {
                    event.blockList().remove(block);
                }
            }
        }
    }

    @EventHandler
    public void onNetherGoldOreBlockExplode(BlockExplodeEvent event) {
        if (event.getBlock().getType().equals(Material.AIR) || event.getBlock().getType().equals(Material.WHITE_BED) || event.getBlock().getType().equals(Material.BLACK_BED) || event.getBlock().getType().equals(Material.BLUE_BED) || event.getBlock().getType().equals(Material.BROWN_BED) || event.getBlock().getType().equals(Material.CYAN_BED) || event.getBlock().getType().equals(Material.GRAY_BED) || event.getBlock().getType().equals(Material.GREEN_BED) || event.getBlock().getType().equals(Material.LIGHT_BLUE_BED) || event.getBlock().getType().equals(Material.LIGHT_GRAY_BED) || event.getBlock().getType().equals(Material.LIME_BED) || event.getBlock().getType().equals(Material.MAGENTA_BED) || event.getBlock().getType().equals(Material.ORANGE_BED) || event.getBlock().getType().equals(Material.PINK_BED) || event.getBlock().getType().equals(Material.PURPLE_BED) || event.getBlock().getType().equals(Material.RED_BED) || event.getBlock().getType().equals(Material.YELLOW_BED)) {
            for (Block block : event.blockList().toArray(new Block[event.blockList().size()])) {
                if (block.getType().equals(Material.NETHER_GOLD_ORE)) {
                    event.blockList().remove(block);
                }
            }
        }
    }

    @EventHandler
    public void onGildedBlackstoneBlockExplode(BlockExplodeEvent event) {
        if (event.getBlock().getType().equals(Material.AIR) || event.getBlock().getType().equals(Material.WHITE_BED) || event.getBlock().getType().equals(Material.BLACK_BED) || event.getBlock().getType().equals(Material.BLUE_BED) || event.getBlock().getType().equals(Material.BROWN_BED) || event.getBlock().getType().equals(Material.CYAN_BED) || event.getBlock().getType().equals(Material.GRAY_BED) || event.getBlock().getType().equals(Material.GREEN_BED) || event.getBlock().getType().equals(Material.LIGHT_BLUE_BED) || event.getBlock().getType().equals(Material.LIGHT_GRAY_BED) || event.getBlock().getType().equals(Material.LIME_BED) || event.getBlock().getType().equals(Material.MAGENTA_BED) || event.getBlock().getType().equals(Material.ORANGE_BED) || event.getBlock().getType().equals(Material.PINK_BED) || event.getBlock().getType().equals(Material.PURPLE_BED) || event.getBlock().getType().equals(Material.RED_BED) || event.getBlock().getType().equals(Material.YELLOW_BED)/* || event.getBlock().getType().equals(Material.LEGACY_BED) */) {
            for (Block block : event.blockList().toArray(new Block[event.blockList().size()])) {
                if (block.getType().equals(Material.GILDED_BLACKSTONE)) {
                    event.blockList().remove(block);
                }
            }
        }
    }

}
