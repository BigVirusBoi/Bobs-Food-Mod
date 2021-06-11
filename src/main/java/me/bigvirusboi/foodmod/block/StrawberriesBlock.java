package me.bigvirusboi.foodmod.block;

import me.bigvirusboi.foodmod.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.shapes.VoxelShape;

public class StrawberriesBlock extends AbstractCropsBlock {
    private static final VoxelShape[] SHAPES = new VoxelShape[]{
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D)
    };

    public StrawberriesBlock(Properties builder) {
        super(builder);
    }

    @Override
    Item getPlantItem() {
        return ItemInit.STRAWBERRY.get();
    }

    @Override
    Item getSeedItem() {
        return ItemInit.STRAWBERRY_SEEDS.get();
    }

    @Override
    VoxelShape getShape(BlockState state) {
        return SHAPES[state.get(AGE)];
    }
}
