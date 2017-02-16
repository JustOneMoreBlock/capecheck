# capecheck
Minecraft Cape Checker

With my recent ban from Mineplex. I've decided to pull all API calls from Cape Mods and check the capes!

# OptiFine
Use your Minecraft username
```
        url = "http://s.optifine.net/capes/" + username + ".png";
```

# LabyMod
Use UUID with dashes.
```
        url = "http://capes.labymod.net/capes/" + player.aK();
```

# MinecraftCapes.co.uk
Use your Minecraft username
```
    String CapeUrl = "https://www.minecraftcapes.co.uk/getCape.php?u=" + username;
```


# 5Zig
Use UUID without dashes.
```
    final MinecraftProfileTexture minecraftProfileTexture = new MinecraftProfileTexture("http://textures.5zig.net/textures/2/" + Utils.getUUIDWithoutDashes(gameProfile.getId()), new HashMap());
```

# Links
OptiFine: http://s.optifine.net/capes/USERNAME.png
LabyMod: http://capes.labymod.net/capes/USE-DASHES-UUID.png
MinecraftCapes.co.uk: https://www.minecraftcapes.co.uk/getCape.php?u=USERNAME
5Zig: http://textures.5zig.net/textures/2/NODASHESUUID
