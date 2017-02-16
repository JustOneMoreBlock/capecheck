 if ((username != null) && (!username.isEmpty()))
    {
      String ofCapeUrl = "http://s.optifine.net/capes/" + username + ".png";
      
      String mptHash = FilenameUtils.getBaseName(ofCapeUrl);
      final kq rl = new kq("capeof/" + mptHash);
      bza textureManager = bes.z().N();