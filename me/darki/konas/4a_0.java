/*
 * Decompiled with CFR 0.151.
 */
package me.darki.konas;

/*
 * Renamed from me.darki.konas.4a
 * Duplicate member names - consider using --renamedupmembers true
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 4a_0
extends Enum {
    public static /* enum */ 4a_0 c = new 4a_0("OFF", 0);
    public static /* enum */ 4a_0 0 = new 4a_0("NORMAL", 1);
    public static /* enum */ 4a_0 1 = new 4a_0("SILENT", 2);
    public static 4a_0[] c = new 4a_0[]{c, 0, 1};

    public static 4a_0 c(String string) {
        return Enum.valueOf(4a_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public 4a_0() {
        void var2_-1;
        void var1_-1;
    }

    public static 4a_0[] values() {
        return (4a_0[])c.clone();
    }
}

