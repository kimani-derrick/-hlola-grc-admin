package e4;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0545x;
/* loaded from: classes.dex */
public enum Z implements InterfaceC0545x {
    f10129r("UNKNOWN_STATUS"),
    f10130s("ENABLED"),
    f10131t("DISABLED"),
    f10132u("DESTROYED"),
    f10133v("UNRECOGNIZED");
    

    /* renamed from: q  reason: collision with root package name */
    public final int f10135q;

    Z(String str) {
        this.f10135q = r2;
    }

    public final int a() {
        if (this != f10133v) {
            return this.f10135q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
