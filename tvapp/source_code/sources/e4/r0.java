package e4;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0545x;
/* loaded from: classes.dex */
public enum r0 implements InterfaceC0545x {
    f10136r("UNKNOWN_PREFIX"),
    f10137s("TINK"),
    f10138t("LEGACY"),
    f10139u("RAW"),
    f10140v("CRUNCHY"),
    f10141w("UNRECOGNIZED");
    

    /* renamed from: q  reason: collision with root package name */
    public final int f10143q;

    r0(String str) {
        this.f10143q = r2;
    }

    public static r0 a(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            return null;
                        }
                        return f10140v;
                    }
                    return f10139u;
                }
                return f10138t;
            }
            return f10137s;
        }
        return f10136r;
    }

    public final int b() {
        if (this != f10141w) {
            return this.f10143q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
