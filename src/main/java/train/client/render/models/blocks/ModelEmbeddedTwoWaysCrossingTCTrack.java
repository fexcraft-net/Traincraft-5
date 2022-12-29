package train.client.render.models.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;

@SideOnly(Side.CLIENT)
public class ModelEmbeddedTwoWaysCrossingTCTrack extends ModelBase {
	private IModelCustom modelEmbeddedTwoWaysCrossing;

	public ModelEmbeddedTwoWaysCrossingTCTrack() {
		modelEmbeddedTwoWaysCrossing = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_x.obj"));}

	public void render() {
		modelEmbeddedTwoWaysCrossing.renderAll();
	}


	public void render(double x, double y, double z) {
		render(x, y, z, 1, 1, 1, 1);
	}

	public void render(double x, double y, double z, float r, float g, float b, float a) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		GL11.glColor4f(r, g, b, a);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		this.render();
		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}