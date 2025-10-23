package h6;

import java.util.regex.Pattern;
import v6.InterfaceC1343h;
/* loaded from: classes.dex */
public final class H extends I {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f11105q;

    /* renamed from: r  reason: collision with root package name */
    public final long f11106r;

    /* renamed from: s  reason: collision with root package name */
    public final InterfaceC1343h f11107s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f11108t;

    public /* synthetic */ H(Object obj, long j7, InterfaceC1343h interfaceC1343h, int i7) {
        this.f11105q = i7;
        this.f11108t = obj;
        this.f11106r = j7;
        this.f11107s = interfaceC1343h;
    }

    @Override // h6.I
    public final long a() {
        switch (this.f11105q) {
            case 0:
                return this.f11106r;
            default:
                return this.f11106r;
        }
    }

    @Override // h6.I
    public final v b() {
        Object obj = this.f11108t;
        switch (this.f11105q) {
            case 0:
                return (v) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = v.d;
                try {
                    return p6.l.r(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }

    @Override // h6.I
    public final InterfaceC1343h f() {
        switch (this.f11105q) {
            case 0:
                return this.f11107s;
            default:
                return this.f11107s;
        }
    }
}
