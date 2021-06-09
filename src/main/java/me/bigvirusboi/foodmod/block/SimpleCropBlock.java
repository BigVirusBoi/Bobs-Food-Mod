package me.bigvirusboi.foodmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.shapes.VoxelShape;

public class SimpleCropBlock extends AbstractCropsBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_3;
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)
    };
    public final Item plantItem;

    public SimpleCropBlock(Item plantItem, Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(AGE, 0));
        this.plantItem = plantItem;
    }

    @Override
    int getMaxAge() {
        return 3;
    }

    @Override
    VoxelShape getShape(BlockState state) {
        return SHAPE_BY_AGE[state.get(AGE)];
    }

    @Override
    Item getPlantItem() {
        return plantItem;
    }

    @Override
    IntegerProperty getAgeProperty() {
        return AGE;
    }
}
