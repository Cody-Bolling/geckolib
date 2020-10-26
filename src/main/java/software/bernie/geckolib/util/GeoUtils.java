package software.bernie.geckolib.util;

import net.minecraft.client.model.ModelPart;
import software.bernie.geckolib.core.processor.IBone;

public class GeoUtils {
    public static void copyRotations(ModelPart from, IBone to) {
        to.setRotationX(-from.pitch);
        to.setRotationY(-from.yaw);
        to.setRotationZ(from.roll);
    }
}
