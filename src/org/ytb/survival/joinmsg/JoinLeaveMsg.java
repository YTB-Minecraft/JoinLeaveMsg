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
			event.setJoinMessage(ChatColor.YELLOW + "YTB�ͦs>>" + ChatColor.GREEN + "�w��^��!" + event.getPlayer().getDisplayName());
			
		}
		else {
			event.setJoinMessage(ChatColor.YELLOW + "YTB�ͦs>>" + ChatColor.GREEN + "�w��[�J���A��! [�����[�J]" + event.getPlayer().getDisplayName());
			ItemStack sword = new ItemStack(Material.STONE_SWORD);
			ItemMeta swordmeta = sword.getItemMeta();
			swordmeta.setUnbreakable(true);
			swordmeta.setDisplayName(ChatColor.AQUA + "�ۤ��C");
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.DARK_AQUA + "���_���ۤ��C");
			lore.add(ChatColor.RED + "�i�H�q" + ChatColor.YELLOW +"�s��M��" + ChatColor.RED + "�o��!");
			swordmeta.setLore(lore);
			sword.setItemMeta(swordmeta);
			event.getPlayer().getInventory().addItem(sword);
			ItemStack axe = new ItemStack(Material.STONE_SWORD);
			ItemMeta axemeta = axe.getItemMeta();
			axemeta.setUnbreakable(true);
			axemeta.setDisplayName(ChatColor.AQUA + "���u��");
			ArrayList<String> axelore = new ArrayList<String>();
			axelore.add(ChatColor.DARK_AQUA + "���_�����u��");
			axelore.add(ChatColor.RED + "�i�H�q" + ChatColor.YELLOW +"�s��M��" + ChatColor.RED + "�o��!");
			axemeta.setLore(axelore);
			axe.setItemMeta(axemeta);
			event.getPlayer().getInventory().addItem(axe);
			ItemStack pick = new ItemStack(Material.STONE_SWORD);
			ItemMeta pickmeta = pick.getItemMeta();
			pickmeta.setUnbreakable(true);
			pickmeta.setDisplayName(ChatColor.AQUA + "�q�u�u��");
			ArrayList<String> picklore = new ArrayList<String>();
			picklore.add(ChatColor.DARK_AQUA + "���_���q�u�u��");
			picklore.add(ChatColor.RED + "�i�H�q" + ChatColor.YELLOW +"�s��M��" + ChatColor.RED + "�o��!");
			pickmeta.setLore(picklore);
			pick.setItemMeta(pickmeta);
			event.getPlayer().getInventory().addItem(pick);
			ItemStack food = new ItemStack(Material.BREAD);
			food.setAmount(64);
			Enchantment ench = Enchantment.MENDING;
			food.addUnsafeEnchantment(ench, 1);
			event.getPlayer().getInventory().addItem(food);
			event.getPlayer().sendMessage(ChatColor.RED + "[�u���A��ݨ�] " + ChatColor.YELLOW + "YTB�ͦs>>" + ChatColor.GREEN + "�z�{�b�ݨ쪺���~�O�s��M��!");
		}
		
	}
	
	@EventHandler
	public void QuitMessage(PlayerQuitEvent event) {
		event.setQuitMessage(ChatColor.YELLOW + "YTB�ͦs>>" + ChatColor.RED +  event.getPlayer().getDisplayName() + "���}�F");
	}
}
