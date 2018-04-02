package me.noodles.tntthrow;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Command implements Listener {

	
	  @EventHandler
	  public void onInterace(PlayerInteractEvent event)
	  {
	    Player player = event.getPlayer();
	    World world = player.getWorld();
	    ItemStack item = player.getInventory().getItemInHand();
	    if ((player.hasPermission("throwtnt.use")) && ((event.getAction() == Action.LEFT_CLICK_AIR) || (event.getAction() == Action.LEFT_CLICK_BLOCK)) &&   (item.getType() == Material.TNT))
	    {
	      event.setCancelled(true);
	      if (item.getAmount() == 1) {
	        player.getInventory().remove(item);
	      } else {
	        item.setAmount(item.getAmount() - 1);
	      }
	      TNTPrimed tnt = (TNTPrimed)world.spawn(player.getLocation(), TNTPrimed.class);
	      tnt.setVelocity(event.getPlayer().getLocation().getDirection().multiply(1.5D));
	    }
	  }
	}
	
