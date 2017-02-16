```
public void downloadCape(String username)
  {
    String CapeUrl = "https://www.minecraftcapes.co.uk/getCape.php?u=" + username;
    if ((username != null) && (!username.isEmpty()))
    {
      final kn rl = new kn("capes/" + username);
```

```
 public void downloadElytra(String username)
  {
    String ElytraUrl = "https://www.minecraftelytra.com/getElytra.php?u=" + username;
    if ((username != null) && (!username.isEmpty()))
    {
      final kn rl = new kn("elytras/" + username);
```