package gymmod.gymmod.blocks;

import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Function;

public class CustomModelBlocks extends Block {
    private static final VoxelShape SHAPE= makeShape();
    public CustomModelBlocks(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        return SHAPE;
    }
    public static VoxelShape makeShape(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(-0.25, 0, -0.8125, -0.1875, 0.0625, -0.3125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 0, -0.8125, 1.25, 0.0625, -0.3125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 0.0625, -0.65625, 1.25, 1.25, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 0.0625, -0.65625, -0.1875, 1.25, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.1875, 0, -0.8125, 1.1875, 0.0625, -0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.1875, 0.3125, -0.65625, 1.1875, 0.375, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.1875, 0, -0.375, 1.1875, 0.0625, -0.3125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.1875, 0.5, -0.625, 1.1875, 0.53125, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5, 0.5, -0.59375, 0.5625, 0.5625, 0.90625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.5, -0.59375, 0.5, 0.5625, 0.90625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.46875, 0.6875, 0, 0.53125, 0.75, 0.65625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.9375, 1, 0.0625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5, 0.5625, -0.625, 0.5625, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5625, 0.5625, -0.625, 0.625, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.6875, 0.5625, -0.625, 0.71875, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.5625, -0.625, 0.5, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.5625, -0.625, 0.4375, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.28125, 0.5625, -0.625, 0.3125, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.3125, 0.5625, -0.625, 0.375, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.625, 0.5625, -0.625, 0.6875, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.25, -0.64375, -0.1875, 1.28125, -0.6125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.26875, -0.60625, -0.1875, 1.3, -0.575), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.2875, -0.675, -0.1875, 1.31875, -0.64375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.30625, -0.68125, -0.1875, 1.3375, -0.65), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.2875, -0.5875, -0.1875, 1.31875, -0.55625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.26875, -0.66875, -0.1875, 1.3, -0.6375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.25, -0.625, -0.1875, 1.28125, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.25, -0.64375, 1.25, 1.28125, -0.6125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.26875, -0.60625, 1.25, 1.3, -0.575), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.30625, -0.68125, 1.25, 1.3375, -0.65), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.2875, -0.675, 1.25, 1.31875, -0.64375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.2875, -0.5875, 1.25, 1.31875, -0.55625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.26875, -0.66875, 1.25, 1.3, -0.6375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.25, -0.625, 1.25, 1.28125, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.25, -0.625, 1.25, 1.28125, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.26875, -0.60625, 1.25, 1.3, -0.575), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.25, -0.64375, 1.25, 1.28125, -0.6125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.30625, -0.68125, 1.25, 1.3375, -0.65), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.2875, -0.675, 1.25, 1.31875, -0.64375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.2875, -0.5875, 1.25, 1.31875, -0.55625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 1.26875, -0.66875, 1.25, 1.3, -0.6375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.25, -0.625, -0.1875, 1.28125, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.25, -0.64375, -0.1875, 1.28125, -0.6125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.26875, -0.60625, -0.1875, 1.3, -0.575), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.2875, -0.675, -0.1875, 1.31875, -0.64375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.30625, -0.68125, -0.1875, 1.3375, -0.65), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.2875, -0.5875, -0.1875, 1.31875, -0.55625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 1.26875, -0.66875, -0.1875, 1.3, -0.6375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 0.0625, -0.65625, -0.1875, 1.25, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.5625, -0.625, 0.5, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 0.0625, -0.65625, 1.25, 1.25, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5, 0.5625, -0.625, 0.5625, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.5, -0.59375, 0.5, 0.5625, 0.90625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.1875, 0.5, -0.625, 1.1875, 0.53125, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5625, 0.5625, -0.625, 0.625, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.625, 0.5625, -0.625, 0.6875, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.3125, 0.5625, -0.625, 0.375, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.5625, -0.625, 0.4375, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.28125, 0.5625, -0.625, 0.3125, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.6875, 0.5625, -0.625, 0.71875, 0.59375, 1.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5, 0.5, -0.59375, 0.5625, 0.5625, 0.90625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.25, 0, -0.8125, -0.1875, 0.0625, -0.3125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.1875, 0, -0.8125, 1.25, 0.0625, -0.3125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.1875, 0, -0.8125, 1.1875, 0.0625, -0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.1875, 0, -0.375, 1.1875, 0.0625, -0.3125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.9375, 1, 0.0625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.1875, 0.3125, -0.65625, 1.1875, 0.375, -0.59375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.46875, 0.6875, 0, 0.53125, 0.75, 0.65625), BooleanOp.OR);

        return shape;
    }
}
