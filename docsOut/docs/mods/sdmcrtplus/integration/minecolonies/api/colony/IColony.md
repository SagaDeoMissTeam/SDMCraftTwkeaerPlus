# IColony

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.integration.api.colony.IColony;
```


## Methods

:::group{name=addFreeBlock}

```zenscript
IColony.addFreeBlock(var1 as Block)
```

| Parameter |               Type                |
|-----------|-----------------------------------|
| var1      | [Block](/vanilla/api/block/Block) |


:::

:::group{name=addFreePosition}

```zenscript
IColony.addFreePosition(var1 as BlockPos)
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| var1      | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=addGuardToAttackers}

```zenscript
IColony.addGuardToAttackers(var1 as invalid, var2 as Player)
```

| Parameter |                       Type                       |
|-----------|--------------------------------------------------|
| var1      | **invalid**                                      |
| var2      | [Player](/vanilla/api/entity/type/player/Player) |


:::

:::group{name=addLoadedChunk}

```zenscript
IColony.addLoadedChunk(var1 as long, var3 as LevelChunk)
```

| Parameter |                            Type                             |
|-----------|-------------------------------------------------------------|
| var1      | long                                                        |
| var3      | [LevelChunk](/mods/sdmcrtplus/world/level/chunk/LevelChunk) |


:::

:::group{name=addVisitingPlayer}

```zenscript
IColony.addVisitingPlayer(var1 as Player)
```

| Parameter |                       Type                       |
|-----------|--------------------------------------------------|
| var1      | [Player](/vanilla/api/entity/type/player/Player) |


:::

:::group{name=addWayPoint}

```zenscript
IColony.addWayPoint(var1 as BlockPos, var2 as BlockState)
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| var1      | [BlockPos](/vanilla/api/util/math/BlockPos) |
| var2      | [BlockState](/vanilla/api/block/BlockState) |


:::

:::group{name=canBeAutoDeleted}

Return Type: boolean

```zenscript
// IColony.canBeAutoDeleted() as boolean

myIColony.canBeAutoDeleted();
```

:::

:::group{name=canMoveIn}

Return Type: boolean

```zenscript
// IColony.canMoveIn() as boolean

myIColony.canMoveIn();
```

:::

:::group{name=getBuildingManager}

Return Type: **invalid**

```zenscript
// IColony.getBuildingManager() as invalid

myIColony.getBuildingManager();
```

:::

:::group{name=getCenter}

Return Type: [BlockPos](/vanilla/api/util/math/BlockPos)

```zenscript
// IColony.getCenter() as BlockPos

myIColony.getCenter();
```

:::

:::group{name=getCitizen}

Return Type: [ICitizen](/mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizen)

```zenscript
IColony.getCitizen(var1 as int) as ICitizen
```

| Parameter | Type |
|-----------|------|
| var1      | int  |


:::

:::group{name=getCitizenManager}

Return Type: **invalid**

```zenscript
// IColony.getCitizenManager() as invalid

myIColony.getCitizenManager();
```

:::

:::group{name=getCitizenNameFile}

Return Type: **invalid**

```zenscript
// IColony.getCitizenNameFile() as invalid

myIColony.getCitizenNameFile();
```

:::

:::group{name=getColonyFlag}

Return Type: **invalid**

```zenscript
// IColony.getColonyFlag() as invalid

myIColony.getColonyFlag();
```

:::

:::group{name=getColonyTag}

Return Type: **invalid**

```zenscript
// IColony.getColonyTag() as invalid

myIColony.getColonyTag();
```

:::

:::group{name=getDay}

Return Type: int

```zenscript
// IColony.getDay() as int

myIColony.getDay();
```

:::

:::group{name=getDimension}

Return Type: **invalid**

```zenscript
// IColony.getDimension() as invalid

myIColony.getDimension();
```

:::

:::group{name=getDistanceSquared}

Return Type: long

```zenscript
IColony.getDistanceSquared(var1 as BlockPos) as long
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| var1      | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=getEventDescriptionManager}

Return Type: **invalid**

```zenscript
// IColony.getEventDescriptionManager() as invalid

myIColony.getEventDescriptionManager();
```

:::

:::group{name=getEventManager}

Return Type: **invalid**

```zenscript
// IColony.getEventManager() as invalid

myIColony.getEventManager();
```

:::

:::group{name=getGraveManager}

Return Type: **invalid**

```zenscript
// IColony.getGraveManager() as invalid

myIColony.getGraveManager();
```

:::

:::group{name=getID}

Return Type: int

```zenscript
// IColony.getID() as int

myIColony.getID();
```

:::

:::group{name=getImportantMessageEntityPlayers}

Return Type: stdlib.List&lt;[Player](/vanilla/api/entity/type/player/Player)&gt;

```zenscript
// IColony.getImportantMessageEntityPlayers() as stdlib.List<Player>

myIColony.getImportantMessageEntityPlayers();
```

:::

:::group{name=getLastContactInHours}

Return Type: int

```zenscript
// IColony.getLastContactInHours() as int

myIColony.getLastContactInHours();
```

:::

:::group{name=getLoadedChunkCount}

Return Type: int

```zenscript
// IColony.getLoadedChunkCount() as int

myIColony.getLoadedChunkCount();
```

:::

:::group{name=getLoadedChunks}

Return Type: Set&lt;long?&gt;

```zenscript
// IColony.getLoadedChunks() as Set<long?>

myIColony.getLoadedChunks();
```

:::

:::group{name=getMercenaryUseTime}

Return Type: long

```zenscript
// IColony.getMercenaryUseTime() as long

myIColony.getMercenaryUseTime();
```

:::

:::group{name=getMessagePlayerEntities}

Return Type: stdlib.List&lt;[Player](/vanilla/api/entity/type/player/Player)&gt;

```zenscript
// IColony.getMessagePlayerEntities() as stdlib.List<Player>

myIColony.getMessagePlayerEntities();
```

:::

:::group{name=getName}

Return Type: string

```zenscript
// IColony.getName() as string

myIColony.getName();
```

:::

:::group{name=getNameStyle}

Return Type: string

```zenscript
// IColony.getNameStyle() as string

myIColony.getNameStyle();
```

:::

:::group{name=getOverallHappiness}

Return Type: double

```zenscript
// IColony.getOverallHappiness() as double

myIColony.getOverallHappiness();
```

:::

:::group{name=getPackageManager}

Return Type: **invalid**

```zenscript
// IColony.getPackageManager() as invalid

myIColony.getPackageManager();
```

:::

:::group{name=getPermissions}

Return Type: [IPermissions](/mods/sdmcrtplus/integration/minecolonies/api/colony/permissions/IPermissions)

```zenscript
// IColony.getPermissions() as IPermissions

myIColony.getPermissions();
```

:::

:::group{name=getProgressManager}

Return Type: **invalid**

```zenscript
// IColony.getProgressManager() as invalid

myIColony.getProgressManager();
```

:::

:::group{name=getQuestManager}

Return Type: **invalid**

```zenscript
// IColony.getQuestManager() as invalid

myIColony.getQuestManager();
```

:::

:::group{name=getRaiderManager}

Return Type: **invalid**

```zenscript
// IColony.getRaiderManager() as invalid

myIColony.getRaiderManager();
```

:::

:::group{name=getReproductionManager}

Return Type: **invalid**

```zenscript
// IColony.getReproductionManager() as invalid

myIColony.getReproductionManager();
```

:::

:::group{name=getRequestManager}

Return Type: **invalid**

```zenscript
// IColony.getRequestManager() as invalid

myIColony.getRequestManager();
```

:::

:::group{name=getRequesterBuildingForPosition}

Return Type: [IRequester](/mods/sdmcrtplus/integration/minecolonies/api/colony/requestsystem/requester/IRequester)

```zenscript
IColony.getRequesterBuildingForPosition(var1 as BlockPos) as IRequester
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| var1      | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=getResearchManager}

Return Type: **invalid**

```zenscript
// IColony.getResearchManager() as invalid

myIColony.getResearchManager();
```

:::

:::group{name=getState}

Return Type: **invalid**

```zenscript
// IColony.getState() as invalid

myIColony.getState();
```

:::

:::group{name=getStatisticsManager}

Return Type: **invalid**

```zenscript
// IColony.getStatisticsManager() as invalid

myIColony.getStatisticsManager();
```

:::

:::group{name=getStructurePack}

Return Type: string

```zenscript
// IColony.getStructurePack() as string

myIColony.getStructurePack();
```

:::

:::group{name=getTeam}

Return Type: **invalid**

```zenscript
// IColony.getTeam() as invalid

myIColony.getTeam();
```

:::

:::group{name=getTeamColonyColor}

Return Type: [ChatFormatting](/vanilla/api/text/ChatFormatting)

```zenscript
// IColony.getTeamColonyColor() as ChatFormatting

myIColony.getTeamColonyColor();
```

:::

:::group{name=getTeamName}

Return Type: string

```zenscript
// IColony.getTeamName() as string

myIColony.getTeamName();
```

:::

:::group{name=getTextureStyleId}

Return Type: string

```zenscript
// IColony.getTextureStyleId() as string

myIColony.getTextureStyleId();
```

:::

:::group{name=getTicketedChunks}

Return Type: Set&lt;long?&gt;

```zenscript
// IColony.getTicketedChunks() as Set<long?>

myIColony.getTicketedChunks();
```

:::

:::group{name=getVisitorManager}

Return Type: **invalid**

```zenscript
// IColony.getVisitorManager() as invalid

myIColony.getVisitorManager();
```

:::

:::group{name=getWayPoints}

Return Type: [BlockState](/vanilla/api/block/BlockState)[[BlockPos](/vanilla/api/util/math/BlockPos)]

```zenscript
// IColony.getWayPoints() as BlockState[BlockPos]

myIColony.getWayPoints();
```

:::

:::group{name=getWayPoints}

Return Type: stdlib.List&lt;[BlockPos](/vanilla/api/util/math/BlockPos)&gt;

```zenscript
IColony.getWayPoints(position as BlockPos, target as BlockPos) as stdlib.List<BlockPos>
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| position  | [BlockPos](/vanilla/api/util/math/BlockPos) |
| target    | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=getWorkManager}

Return Type: [IWorkManager](/mods/sdmcrtplus/integration/minecolonies/api/colony/workorders/IWorkManager)

```zenscript
// IColony.getWorkManager() as IWorkManager

myIColony.getWorkManager();
```

:::

:::group{name=getWorld}

Return Type: [Level](/vanilla/api/world/Level)

```zenscript
// IColony.getWorld() as Level

myIColony.getWorld();
```

:::

:::group{name=hasBuilding}

Return Type: boolean

```zenscript
IColony.hasBuilding(var1 as string, var2 as int, var3 as boolean) as boolean
```

| Parameter |  Type   |
|-----------|---------|
| var1      | string  |
| var2      | int     |
| var3      | boolean |


:::

:::group{name=hasTownHall}

Return Type: boolean

```zenscript
// IColony.hasTownHall() as boolean

myIColony.hasTownHall();
```

:::

:::group{name=hasWarehouse}

Return Type: boolean

```zenscript
// IColony.hasWarehouse() as boolean

myIColony.hasWarehouse();
```

:::

:::group{name=isActive}

Return Type: boolean

```zenscript
// IColony.isActive() as boolean

myIColony.isActive();
```

:::

:::group{name=isColonyUnderAttack}

Return Type: boolean

```zenscript
// IColony.isColonyUnderAttack() as boolean

myIColony.isColonyUnderAttack();
```

:::

:::group{name=isCoordInColony}

Return Type: boolean

```zenscript
IColony.isCoordInColony(var1 as Level, var2 as BlockPos) as boolean
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| var1      | [Level](/vanilla/api/world/Level)           |
| var2      | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=isDay}

Return Type: boolean

```zenscript
// IColony.isDay() as boolean

myIColony.isDay();
```

:::

:::group{name=isManualHiring}

Return Type: boolean

```zenscript
// IColony.isManualHiring() as boolean

myIColony.isManualHiring();
```

:::

:::group{name=isManualHousing}

Return Type: boolean

```zenscript
// IColony.isManualHousing() as boolean

myIColony.isManualHousing();
```

:::

:::group{name=isRemote}

Return Type: boolean

```zenscript
// IColony.isRemote() as boolean

myIColony.isRemote();
```

:::

:::group{name=isValidAttackingGuard}

Return Type: boolean

```zenscript
IColony.isValidAttackingGuard(var1 as invalid) as boolean
```

| Parameter |    Type     |
|-----------|-------------|
| var1      | **invalid** |


:::

:::group{name=isValidAttackingPlayer}

Return Type: boolean

```zenscript
IColony.isValidAttackingPlayer(var1 as Player) as boolean
```

| Parameter |                       Type                       |
|-----------|--------------------------------------------------|
| var1      | [Player](/vanilla/api/entity/type/player/Player) |


:::

:::group{name=markDirty}

```zenscript
// IColony.markDirty()

myIColony.markDirty();
```

:::

:::group{name=removeFreeBlock}

```zenscript
IColony.removeFreeBlock(var1 as Block)
```

| Parameter |               Type                |
|-----------|-----------------------------------|
| var1      | [Block](/vanilla/api/block/Block) |


:::

:::group{name=removeFreePosition}

```zenscript
IColony.removeFreePosition(var1 as BlockPos)
```

| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| var1      | [BlockPos](/vanilla/api/util/math/BlockPos) |


:::

:::group{name=removeLoadedChunk}

```zenscript
IColony.removeLoadedChunk(var1 as long)
```

| Parameter | Type |
|-----------|------|
| var1      | long |


:::

:::group{name=removeVisitingPlayer}

```zenscript
IColony.removeVisitingPlayer(var1 as Player)
```

| Parameter |                       Type                       |
|-----------|--------------------------------------------------|
| var1      | [Player](/vanilla/api/entity/type/player/Player) |


:::

:::group{name=setCanBeAutoDeleted}

```zenscript
IColony.setCanBeAutoDeleted(var1 as boolean)
```

| Parameter |  Type   |
|-----------|---------|
| var1      | boolean |


:::

:::group{name=setColonyColor}

```zenscript
IColony.setColonyColor(var1 as ChatFormatting)
```

| Parameter |                        Type                        |
|-----------|----------------------------------------------------|
| var1      | [ChatFormatting](/vanilla/api/text/ChatFormatting) |


:::

:::group{name=setColonyFlag}

```zenscript
IColony.setColonyFlag(var1 as invalid)
```

| Parameter |    Type     |
|-----------|-------------|
| var1      | **invalid** |


:::

:::group{name=setManualHiring}

```zenscript
IColony.setManualHiring(var1 as boolean)
```

| Parameter |  Type   |
|-----------|---------|
| var1      | boolean |


:::

:::group{name=setManualHousing}

```zenscript
IColony.setManualHousing(var1 as boolean)
```

| Parameter |  Type   |
|-----------|---------|
| var1      | boolean |


:::

:::group{name=setMoveIn}

```zenscript
IColony.setMoveIn(var1 as boolean)
```

| Parameter |  Type   |
|-----------|---------|
| var1      | boolean |


:::

:::group{name=setName}

```zenscript
IColony.setName(var1 as string)
```

| Parameter |  Type  |
|-----------|--------|
| var1      | string |


:::

:::group{name=setNameStyle}

```zenscript
IColony.setNameStyle(var1 as string)
```

| Parameter |  Type  |
|-----------|--------|
| var1      | string |


:::

:::group{name=setStructurePack}

```zenscript
IColony.setStructurePack(var1 as string)
```

| Parameter |  Type  |
|-----------|--------|
| var1      | string |


:::

:::group{name=setTextureStyle}

```zenscript
IColony.setTextureStyle(var1 as string)
```

| Parameter |  Type  |
|-----------|--------|
| var1      | string |


:::

:::group{name=updateHasChilds}

```zenscript
// IColony.updateHasChilds()

myIColony.updateHasChilds();
```

:::

:::group{name=useAdditionalChildTime}

Return Type: boolean

```zenscript
IColony.useAdditionalChildTime(var1 as int) as boolean
```

| Parameter | Type |
|-----------|------|
| var1      | int  |


:::

:::group{name=usedMercenaries}

```zenscript
// IColony.usedMercenaries()

myIColony.usedMercenaries();
```

:::


