package net.stone_labs.workinggraves.compat;

public enum InventoryExtensions
{
    TRINKETS("trinkets", new TrinketsCompat());

    private final String modId;
    private final InventoryExtension extension;
    private boolean enabled = false;

    InventoryExtensions(String modId, InventoryExtension extension)
    {
        this.modId = modId;
        this.extension = extension;
    }

    public void enable()
    {
        enabled = true;
    }

    public String getId()
    {
        return modId;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public InventoryExtension getExtension()
    {
        return extension;
    }
}
