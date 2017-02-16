    if ((username != null) && (!username.isEmpty()) && (player.aK() != null))
    {
      String url = null;
      if (optifine)
      {
        url = "http://s.optifine.net/capes/" + username + ".png";
      }
      else if (isWhitelisted(player.aK()))
      {
        url = "http://capes.labymod.net/capes/" + player.aK();
      }
      else
      {