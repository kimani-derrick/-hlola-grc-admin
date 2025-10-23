package j2;

import Z2.H;
import i2.InterfaceC0770b;
import java.util.UUID;
/* loaded from: classes.dex */
public final class y implements InterfaceC0770b {
    public static final boolean d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f11842a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f11843b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11844c;

    static {
        boolean z7;
        if ("Amazon".equals(H.f4605c)) {
            String str = H.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z7 = true;
                d = z7;
            }
        }
        z7 = false;
        d = z7;
    }

    public y(UUID uuid, byte[] bArr, boolean z7) {
        this.f11842a = uuid;
        this.f11843b = bArr;
        this.f11844c = z7;
    }
}
