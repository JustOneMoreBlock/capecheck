  private PlayerResource loadPlayerResource(final GameProfile gameProfile)
  {
    final MinecraftProfileTexture minecraftProfileTexture = new MinecraftProfileTexture("http://textures.5zig.net/textures/2/" + Utils.getUUIDWithoutDashes(gameProfile.getId()), new HashMap());
    final PlayerResource playerResource = new PlayerResource();
    
    final ResourceLocation capeLocation = new ResourceLocation("the5zigmod", "capes/" + gameProfile.getId());
    
    bzb texture = ((Variables)MinecraftFactory.getVars()).getTextureManager().b(capeLocation);
    final SimpleTickingTexture capeTexture;
    if ((texture instanceof SimpleTickingTexture))
    {
      SimpleTickingTexture capeTexture = (SimpleTickingTexture)texture;
      capeTexture.setBufferedImage(null);
    }