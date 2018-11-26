package com.modcraft.projectmod.blocks;
import com.modcraft.projectmod.Main;
import com.modcraft.projectmod.gui.GuiHandler;
import com.modcraft.projectmod.init.ModItems;
import com.modcraft.projectmod.tileentity.TeleporterBlockTileEntity;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class TeleporterBlock extends BlockBase implements ITileEntityProvider{

	public TeleporterBlock(String name, Material material) {
		super(name, material);
		
		setHardness(5.0F);
		setResistance(30F);
		setSoundType(SoundType.METAL);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote){
			if(playerIn.getHeldItemMainhand().getItem().equals(ModItems.TELEPORT_BUTTON)){
				this.getTeleporterBlockInRange(worldIn, pos, playerIn, 32);
			}else if(playerIn.getHeldItemMainhand().getItem().equals(ModItems.TABLET)){

			}else{
				playerIn.openGui(Main.instance, GuiHandler.TELEPORTER_BLOCK, worldIn,
						pos.getX(), pos.getY(), pos.getZ());
			}
		}
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TeleporterBlockTileEntity();
	}
	
	public void getTeleporterBlockInRange(World worldIn, BlockPos pos, EntityPlayer playerIn, int range){
		for(int x = pos.getX(); x < pos.getX() + range; x++){
			for(int y = pos.getY(); y < pos.getY() + range; y++){
				for(int z = pos.getZ(); z < pos.getZ() + range; z++){
					 BlockPos otherPos = new BlockPos(x, y, z);
					 if(pos.equals(otherPos)) continue;
					 if(worldIn.getTileEntity(otherPos) instanceof TeleporterBlockTileEntity){
						 if(worldIn.isAirBlock(new BlockPos(x, y+1, z)) && 
								 worldIn.isAirBlock(new BlockPos(x, y+2, z))){
							 playerIn.setPositionAndUpdate(x, y+1, z);
							 playerIn.sendMessage(new TextComponentString
							 (String.format("%s teleported to X: %d, Y: %d, Z: %d", 
							 Minecraft.getMinecraft().player.getName(), x, y, z)));
						 }else{
							 playerIn.sendMessage(new TextComponentString("A solid block placed in top of the other teleporter"
							 		+ " is preventing teleportation..."));
						 }
						 return;
					 }
				}
			}
		}
		for(int x = pos.getX() - range; x < pos.getX(); x++){
			for(int y = pos.getY() - range; y < pos.getY(); y++){
				for(int z = pos.getZ() - range; z < pos.getZ(); z++){
					 BlockPos otherPos = new BlockPos(x, y, z);
					 if(pos.equals(otherPos)) continue;
					 if(worldIn.getTileEntity(otherPos) instanceof TeleporterBlockTileEntity){
						 if(worldIn.isAirBlock(new BlockPos(x, y+1, z)) && 
								 worldIn.isAirBlock(new BlockPos(x, y+2, z))){
							 playerIn.setPositionAndUpdate(x, y+1, z);
							 playerIn.sendMessage(new TextComponentString
							 (String.format("%s teleported to X: %d, Y: %d, Z: %d", 
							 Minecraft.getMinecraft().player.getName(), x, y, z)));
						 }else{
							 playerIn.sendMessage(new TextComponentString("A solid block placed in top of the other teleporter"
							 		+ " is preventing teleportation..."));
						 }
						 return;
					 }
				}
			}
		}
		for(int x = pos.getX(); x < pos.getX() + range; x++){
			for(int y = pos.getY() - range; y < pos.getY(); y++){
				for(int z = pos.getZ(); z < pos.getZ() + range; z++){
					 BlockPos otherPos = new BlockPos(x, y, z);
					 if(pos.equals(otherPos)) continue;
					 if(worldIn.getTileEntity(otherPos) instanceof TeleporterBlockTileEntity){
						 if(worldIn.isAirBlock(new BlockPos(x, y+1, z)) && 
								 worldIn.isAirBlock(new BlockPos(x, y+2, z))){
							 playerIn.setPositionAndUpdate(x, y+1, z);
							 playerIn.sendMessage(new TextComponentString
							 (String.format("%s teleported to X: %d, Y: %d, Z: %d", 
							 Minecraft.getMinecraft().player.getName(), x, y, z)));
						 }else{
							 playerIn.sendMessage(new TextComponentString("A solid block placed in top of the other teleporter"
							 		+ " is preventing teleportation..."));
						 }
						 return;
					 }
				}
			}
		}
		for(int x = pos.getX() - range; x < pos.getX(); x++){
			for(int y = pos.getY(); y < pos.getY() + range; y++){
				for(int z = pos.getZ() - range; z < pos.getZ(); z++){
					 BlockPos otherPos = new BlockPos(x, y, z);
					 if(pos.equals(otherPos)) continue;
					 if(worldIn.getTileEntity(otherPos) instanceof TeleporterBlockTileEntity){
						 if(worldIn.isAirBlock(new BlockPos(x, y+1, z)) && 
								 worldIn.isAirBlock(new BlockPos(x, y+2, z))){
							 playerIn.setPositionAndUpdate(x, y+1, z);
							 playerIn.sendMessage(new TextComponentString
							 (String.format("%s teleported to X: %d, Y: %d, Z: %d", 
							 Minecraft.getMinecraft().player.getName(), x, y, z)));
						 }else{
							 playerIn.sendMessage(new TextComponentString("A solid block placed in top of the other teleporter"
							 		+ " is preventing teleportation..."));
						 }
						 return;
					 }
				}
			}
		}
		for(int x = pos.getX(); x < pos.getX() + range; x++){
			for(int y = pos.getY() - range; y < pos.getY(); y++){
				for(int z = pos.getZ() - range; z < pos.getZ(); z++){
					 BlockPos otherPos = new BlockPos(x, y, z);
					 if(pos.equals(otherPos)) continue;
					 if(worldIn.getTileEntity(otherPos) instanceof TeleporterBlockTileEntity){
						 if(worldIn.isAirBlock(new BlockPos(x, y+1, z)) && 
								 worldIn.isAirBlock(new BlockPos(x, y+2, z))){
							 playerIn.setPositionAndUpdate(x, y+1, z);
							 playerIn.sendMessage(new TextComponentString
							 (String.format("%s teleported to X: %d, Y: %d, Z: %d", 
							 Minecraft.getMinecraft().player.getName(), x, y, z)));
						 }else{
							 playerIn.sendMessage(new TextComponentString("A solid block placed in top of the other teleporter"
							 		+ " is preventing teleportation..."));
						 }
						 return;
					 }
				}
			}
		}
		for(int x = pos.getX(); x < pos.getX() + range; x++){
			for(int y = pos.getY(); y < pos.getY() + range; y++){
				for(int z = pos.getZ() - range; z < pos.getZ(); z++){
					 BlockPos otherPos = new BlockPos(x, y, z);
					 if(pos.equals(otherPos)) continue;
					 if(worldIn.getTileEntity(otherPos) instanceof TeleporterBlockTileEntity){
						 if(worldIn.isAirBlock(new BlockPos(x, y+1, z)) && 
								 worldIn.isAirBlock(new BlockPos(x, y+2, z))){
							 playerIn.setPositionAndUpdate(x, y+1, z);
							 playerIn.sendMessage(new TextComponentString
							 (String.format("%s teleported to X: %d, Y: %d, Z: %d", 
							 Minecraft.getMinecraft().player.getName(), x, y, z)));
						 }else{
							 playerIn.sendMessage(new TextComponentString("A solid block placed in top of the other teleporter"
							 		+ " is preventing teleportation..."));
						 }
						 return;
					 }
				}
			}
		}
		for(int x = pos.getX() - range; x < pos.getX(); x++){
			for(int y = pos.getY(); y < pos.getY() + range; y++){
				for(int z = pos.getZ(); z < pos.getZ() + range; z++){
					 BlockPos otherPos = new BlockPos(x, y, z);
					 if(pos.equals(otherPos)) continue;
					 if(worldIn.getTileEntity(otherPos) instanceof TeleporterBlockTileEntity){
						 if(worldIn.isAirBlock(new BlockPos(x, y+1, z)) && 
								 worldIn.isAirBlock(new BlockPos(x, y+2, z))){
							 playerIn.setPositionAndUpdate(x, y+1, z);
							 playerIn.sendMessage(new TextComponentString
							 (String.format("%s teleported to X: %d, Y: %d, Z: %d", 
							 Minecraft.getMinecraft().player.getName(), x, y, z)));
						 }else{
							 playerIn.sendMessage(new TextComponentString("A solid block placed in top of the other teleporter"
							 		+ " is preventing teleportation..."));
						 }
						 return;
					 }
				}
			}
		}
		for(int x = pos.getX() - range; x < pos.getX(); x++){
			for(int y = pos.getY() - range; y < pos.getY(); y++){
				for(int z = pos.getZ(); z < pos.getZ() + range; z++){
					 BlockPos otherPos = new BlockPos(x, y, z);
					 if(pos.equals(otherPos)) continue;
					 if(worldIn.getTileEntity(otherPos) instanceof TeleporterBlockTileEntity){
						 if(worldIn.isAirBlock(new BlockPos(x, y+1, z)) && 
								 worldIn.isAirBlock(new BlockPos(x, y+2, z))){
							 playerIn.setPositionAndUpdate(x, y+1, z);
							 playerIn.sendMessage(new TextComponentString
							 (String.format("%s teleported to X: %d, Y: %d, Z: %d", 
							 Minecraft.getMinecraft().player.getName(), x, y, z)));
						 }else{
							 playerIn.sendMessage(new TextComponentString("A solid block placed in top of the other teleporter"
							 		+ " is preventing teleportation..."));
						 }
						 return;
					 }
				}
			}
		}
		 playerIn.sendMessage(new TextComponentString("No teleporter block in range"));
	}
}
