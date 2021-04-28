package me.apeiros.magicxpansion.listeners;

import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.apeiros.magicxpansion.MagicXpansion;
import me.apeiros.magicxpansion.setup.MagicXpansionItems;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import java.util.concurrent.ThreadLocalRandom;

public class CrossbowListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onCrossbowShoot(EntityShootBowEvent e) {
        if (e.getEntity() instanceof Player && e.getProjectile().getType() == EntityType.ARROW) {
            Player p = (Player) e.getEntity();

            if (SlimefunUtils.isItemSimilar(e.getBow(), MagicXpansionItems.INFINITY_CROSSBOW, false, false)) {
                Inventory inv = p.getInventory();

                if (p.getGameMode() != GameMode.CREATIVE) {
                    if (MagicXpansion.doesInvHaveSpace(inv, new ItemStack(Material.ARROW), 1)) {
                        inv.addItem(new ItemStack(Material.ARROW));
                    }
                }
            } else if (SlimefunUtils.isItemSimilar(e.getBow(), MagicXpansionItems.NETHER_CROSSBOW, false, false)) {
                ThreadLocalRandom r = ThreadLocalRandom.current();
                Projectile projectile = (Projectile) e.getProjectile();
                int rNum = r.nextInt(3);

                if (rNum == 0) {
                    World world = projectile.getWorld();
                    Location loc = projectile.getLocation();
                    Vector v = projectile.getVelocity();

                    Entity fireballProjectile = world.spawnEntity(loc, EntityType.SMALL_FIREBALL);
                    fireballProjectile.setFireTicks(32767);
                    fireballProjectile.setGravity(true);
                    fireballProjectile.teleport(loc);
                    fireballProjectile.setVelocity(v);
                } else {
                    projectile.setFireTicks(32767);
                }
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onCrossbowHit(ProjectileHitEvent e) {
        if (e.getEntity().getShooter() instanceof Player && e.getEntityType() == EntityType.ARROW) {
            Player shooter = (Player) e.getEntity().getShooter();

            if (SlimefunUtils.isItemSimilar(shooter.getInventory().getItemInMainHand(), MagicXpansionItems.INFINITY_CROSSBOW, false, false)) {
                Arrow arrow = (Arrow) e.getEntity();

                if (e.getHitEntity() == null) {
                    arrow.remove();
                }
            }
        }
    }
}
