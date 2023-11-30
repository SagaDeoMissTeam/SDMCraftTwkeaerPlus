# BlockSkillBase

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.block.BlockSkillBase;
```


## Constructors


```zenscript
new BlockSkillBase(block as BlockState, property as BlockPropertyBase[]) as BlockSkillBase
```
| Parameter |                                               Type                                                |
|-----------|---------------------------------------------------------------------------------------------------|
| block     | [BlockState](/vanilla/api/block/BlockState)                                                       |
| property  | [BlockPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/block/BlockPropertyBase)[] |



## Methods

:::group{name=getBlock}

Return Type: [BlockState](/vanilla/api/block/BlockState)

```zenscript
// BlockSkillBase.getBlock() as BlockState

myBlockSkillBase.getBlock();
```

:::

:::group{name=getProperty}

Return Type: [BlockPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/block/BlockPropertyBase)[]

```zenscript
// BlockSkillBase.getProperty() as BlockPropertyBase[]

myBlockSkillBase.getProperty();
```

:::


