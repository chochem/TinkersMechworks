package tmechworks.lib.player;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import net.minecraftforge.common.FakePlayer;
import tconstruct.library.blocks.InventoryLogic;

public class FakePlayerLogic extends FakePlayer
{
    InventoryLogic logic;

    @SideOnly(Side.SERVER)
    public FakePlayerLogic(World world, String name, InventoryLogic logic)
    {
        super(world, name);
        this.logic = logic;
    }

    public ChunkCoordinates getPlayerCoordinates ()
    {
        return new ChunkCoordinates(logic.xCoord, logic.yCoord, logic.zCoord);
    }
}
