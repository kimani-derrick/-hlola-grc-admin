package n0;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: q  reason: collision with root package name */
    public final v f12594q;

    /* renamed from: r  reason: collision with root package name */
    public final Bundle f12595r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f12596s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f12597t;

    /* renamed from: u  reason: collision with root package name */
    public final int f12598u;

    public u(v vVar, Bundle bundle, boolean z7, boolean z8, int i7) {
        M5.g.f(vVar, "destination");
        this.f12594q = vVar;
        this.f12595r = bundle;
        this.f12596s = z7;
        this.f12597t = z8;
        this.f12598u = i7;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(u uVar) {
        M5.g.f(uVar, "other");
        boolean z7 = uVar.f12596s;
        boolean z8 = this.f12596s;
        if (z8 && !z7) {
            return 1;
        }
        if (!z8 && z7) {
            return -1;
        }
        Bundle bundle = uVar.f12595r;
        Bundle bundle2 = this.f12595r;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            M5.g.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z9 = uVar.f12597t;
        boolean z10 = this.f12597t;
        if (z10 && !z9) {
            return 1;
        }
        if (!z10 && z9) {
            return -1;
        }
        return this.f12598u - uVar.f12598u;
    }
}
