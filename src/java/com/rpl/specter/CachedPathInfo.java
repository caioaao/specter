package com.rpl.specter;

public class CachedPathInfo {
    public final boolean is_dynamic;
    public final Object precompiled;

    public CachedPathInfo(boolean is_dynamic, Object precompiled) {
        this.is_dynamic = is_dynamic;
        this.precompiled = precompiled;
    }
}
