package org.ytb.survival.joinmsg;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinLeaveMsg implements Listener {
	@EventHandler
	public void Join(PlayerJoinEvent event) {
		if(event.getPlayer().hasPlayedBefore()) {
			event.setJoinMessage(ChatColor.YELLOW + "YTB生存>>" + ChatColor.GREEN + "歡迎回來!" + event.getPlayer().getDisplayName());
			
		}
		else {
			event.setJoinMessage(ChatColor.YELLOW + "YTB生存>>" + ChatColor.GREEN + "歡迎加入伺服器! [首次加入]" + event.getPlayer().getDisplayName());
			ItemStack sword = new ItemStack(Material.STONE_SWORD);
			ItemMeta swordmeta = sword.getItemMeta();
			swordmeta.setUnbreakable(true);
			swordmeta.setDisplayName(ChatColor.AQUA + "石中劍");
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.DARK_AQUA + "神奇的石中劍");
			lore.add(ChatColor.RED + "可以從" + ChatColor.YELLOW +"新手套裝" + ChatColor.RED + "得到!");
			swordmeta.setLore(lore);
			sword.setItemMeta(swordmeta);
			event.getPlayer().getInventory().addItem(sword);
			ItemStack axe = new ItemStack(Material.STONE_SWORD);
			ItemMeta axemeta = axe.getItemMeta();
			axemeta.setUnbreakable(true);
			axemeta.setDisplayName(ChatColor.AQUA + "伐木工具");
			ArrayList<String> axelore = new ArrayList<String>();
			axelore.add(ChatColor.DARK_AQUA + "神奇的伐木工具");
			axelore.add(ChatColor.RED + "可以從" + ChatColor.YELLOW +"新手套裝" + ChatColor.RED + "得到!");
			axemeta.setLore(axelore);
			axe.setItemMeta(axemeta);
			event.getPlayer().getInventory().addItem(axe);
			ItemStack pick = new ItemStack(Material.STONE_SWORD);
			ItemMeta pickmeta = pick.getItemMeta();
			pickmeta.setUnbreakable(true);
			pickmeta.setDisplayName(ChatColor.AQUA + "礦工工具");
			ArrayList<String> picklore = new ArrayList<String>();
			picklore.add(ChatColor.DARK_AQUA + "神奇的礦工工具");
			picklore.add(ChatColor.RED + "可以從" + ChatColor.YELLOW +"新手套裝" + ChatColor.RED + "得到!");
			pickmeta.setLore(picklore);
			pick.setItemMeta(pickmeta);
			event.getPlayer().getInventory().addItem(pick);
			ItemStack food = new ItemStack(Material.BREAD);
			food.setAmount(64);
			Enchantment ench = Enchantment.MENDING;
			food.addUnsafeEnchantment(ench, 1);
			event.getPlayer().getInventory().addItem(food);
			event.getPlayer().sendMessage(ChatColor.RED + "[只有你能看到] " + ChatColor.YELLOW + "YTB生存>>" + ChatColor.GREEN + "您現在看到的物品是新手套裝!");
		}
		
	}
	
	@EventHandler
	public void QuitMessage(PlayerQuitEvent event) {
		event.setQuitMessage(ChatColor.YELLOW + "YTB生存>>" + ChatColor.RED +  event.getPlayer().getDisplayName() + "離開了");
	}
}
