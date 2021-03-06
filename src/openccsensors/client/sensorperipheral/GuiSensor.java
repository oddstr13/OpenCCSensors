package openccsensors.client.sensorperipheral;

import org.lwjgl.opengl.GL11;

import openccsensors.common.sensorperipheral.ContainerSensor;
import openccsensors.common.sensorperipheral.TileEntitySensor;
import net.minecraft.src.Container;
import net.minecraft.src.GuiContainer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.StatCollector;

public class GuiSensor extends GuiContainer 
{

	public GuiSensor(InventoryPlayer inventory, TileEntitySensor sensor)
	{
		super(new ContainerSensor(inventory, sensor));
	}
	
	@Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
		String sensorGuiName = StatCollector.translateToLocal("openccsensors.gui.sensor");
        fontRenderer.drawString(sensorGuiName, this.xSize / 2 - (fontRenderer.getStringWidth(sensorGuiName) / 2), 6, 4210752);
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
	{
        int var4 = this.mc.renderEngine.getTexture("/openccsensors/resources/images/sensor.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(var4);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
	}

}
