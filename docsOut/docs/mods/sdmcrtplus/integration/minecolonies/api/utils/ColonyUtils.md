# ColonyUtils

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.integration.api.utils.ColonyUtils;
```


## Static Methods

:::group{name=getAllColonies}

Return Type: stdlib.List&lt;[IColony](/mods/sdmcrtplus/integration/minecolonies/api/colony/IColony)&gt;

```zenscript
// ColonyUtils.getAllColonies() as stdlib.List<IColony>

ColonyUtils.getAllColonies();
```

:::

:::group{name=getAllColonies}

Return Type: stdlib.List&lt;[IColony](/mods/sdmcrtplus/integration/minecolonies/api/colony/IColony)&gt;

```zenscript
ColonyUtils.getAllColonies(level as Level) as stdlib.List<IColony>
```

| Parameter |               Type                |
|-----------|-----------------------------------|
| level     | [Level](/vanilla/api/world/Level) |


:::

:::group{name=getBuilding}

Return Type: [IBuildingView](/mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/views/IBuildingView)

```zenscript
ColonyUtils.getBuilding(dimension as ResourceKey<Level>, pos as BlockPos) as IBuildingView
```

| Parameter |                                             Type                                              |
|-----------|-----------------------------------------------------------------------------------------------|
| dimension | [ResourceKey](/mods/sdmcrtplus/resource/ResourceKey)&lt;[Level](/vanilla/api/world/Level)&gt; |
| pos       | [BlockPos](/vanilla/api/util/math/BlockPos)                                                   |


:::

:::group{name=getBuilding}

Return Type: [IBuilding](/mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/IBuilding)

```zenscript
ColonyUtils.getBuilding(w as Level, pos as BlockPos) as IBuilding
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| w         | [Level](/vanilla/api/world/Level)           |
| pos       | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=getClosestColony}

Return Type: [IColony](/mods/sdmcrtplus/integration/minecolonies/api/colony/IColony)

```zenscript
ColonyUtils.getClosestColony(w as Level, pos as BlockPos) as IColony
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| w         | [Level](/vanilla/api/world/Level)           |
| pos       | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=getClosestColonyView}

Return Type: [IColony](/mods/sdmcrtplus/integration/minecolonies/api/colony/IColony)

```zenscript
ColonyUtils.getClosestColonyView(w as Level, pos as BlockPos) as IColony
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| w         | [Level](/vanilla/api/world/Level)           |
| pos       | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=getColoniesAbandonedSince}

Return Type: stdlib.List&lt;[IColony](/mods/sdmcrtplus/integration/minecolonies/api/colony/IColony)&gt;

```zenscript
ColonyUtils.getColoniesAbandonedSince(abandonedSince as int) as stdlib.List<IColony>
```

|   Parameter    | Type |
|----------------|------|
| abandonedSince | int  |


:::

:::group{name=getColonyByDimension}

Return Type: [IColony](/mods/sdmcrtplus/integration/minecolonies/api/colony/IColony)

```zenscript
ColonyUtils.getColonyByDimension(id as int, registryKey as ResourceKey<Level>) as IColony
```

|  Parameter  |                                             Type                                              |
|-------------|-----------------------------------------------------------------------------------------------|
| id          | int                                                                                           |
| registryKey | [ResourceKey](/mods/sdmcrtplus/resource/ResourceKey)&lt;[Level](/vanilla/api/world/Level)&gt; |


:::

:::group{name=getIColony}

Return Type: [IColony](/mods/sdmcrtplus/integration/minecolonies/api/colony/IColony)?

```zenscript
ColonyUtils.getIColony(w as Level, pos as BlockPos) as IColony?
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| w         | [Level](/vanilla/api/world/Level)           |
| pos       | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=getIColonyByOwner}

Return Type: [IColony](/mods/sdmcrtplus/integration/minecolonies/api/colony/IColony)?

```zenscript
ColonyUtils.getIColonyByOwner(var1 as Level, uuid as string) as IColony?
```

| Parameter |               Type                |
|-----------|-----------------------------------|
| var1      | [Level](/vanilla/api/world/Level) |
| uuid      | string                            |


:::

:::group{name=getIColonyByOwner}

Return Type: [IColony](/mods/sdmcrtplus/integration/minecolonies/api/colony/IColony)?

```zenscript
ColonyUtils.getIColonyByOwner(var1 as Level, var2 as Player) as IColony?
```

| Parameter |                       Type                       |
|-----------|--------------------------------------------------|
| var1      | [Level](/vanilla/api/world/Level)                |
| var2      | [Player](/vanilla/api/entity/type/player/Player) |


:::

:::group{name=getMinimumDistanceBetweenTownHalls}

Return Type: int

```zenscript
// ColonyUtils.getMinimumDistanceBetweenTownHalls() as int

ColonyUtils.getMinimumDistanceBetweenTownHalls();
```

:::

:::group{name=getRecipeManager}

Return Type: **invalid**

```zenscript
// ColonyUtils.getRecipeManager() as invalid

ColonyUtils.getRecipeManager();
```

:::

:::group{name=getServerUUID}

Return Type: string

```zenscript
// ColonyUtils.getServerUUID() as string

ColonyUtils.getServerUUID();
```

:::

:::group{name=getTopColonyId}

Return Type: int

```zenscript
// ColonyUtils.getTopColonyId() as int

ColonyUtils.getTopColonyId();
```

:::

:::group{name=isCoordinateInAnyColony}

Return Type: boolean

```zenscript
ColonyUtils.isCoordinateInAnyColony(world as Level, pos as BlockPos) as boolean
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| world     | [Level](/vanilla/api/world/Level)           |
| pos       | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=isFarEnoughFromColonies}

Return Type: boolean

```zenscript
ColonyUtils.isFarEnoughFromColonies(w as Level, pos as BlockPos) as boolean
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| w         | [Level](/vanilla/api/world/Level)           |
| pos       | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=isSchematicDownloaded}

Return Type: boolean

```zenscript
// ColonyUtils.isSchematicDownloaded() as boolean

ColonyUtils.isSchematicDownloaded();
```

:::

:::group{name=setCapLoaded}

```zenscript
// ColonyUtils.setCapLoaded()

ColonyUtils.setCapLoaded();
```

:::

:::group{name=setCapLoaded}

```zenscript
ColonyUtils.setCapLoaded(uuid as string)
```

| Parameter |  Type  |
|-----------|--------|
| uuid      | string |


:::

:::group{name=setSchematicDownloaded}

```zenscript
ColonyUtils.setSchematicDownloaded(b as boolean)
```

| Parameter |  Type   |
|-----------|---------|
| b         | boolean |


:::

