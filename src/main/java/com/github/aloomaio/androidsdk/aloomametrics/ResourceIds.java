package com.github.aloomaio.androidsdk.aloomametrics;

public interface ResourceIds {
    public boolean knownIdName(String name);
    public int idFromName(String name);
    public String nameForId(int id);
}
