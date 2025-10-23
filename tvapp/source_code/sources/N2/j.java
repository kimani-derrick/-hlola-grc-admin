package N2;

import Z2.AbstractC0156a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class j implements M2.h {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2489q;

    /* renamed from: r  reason: collision with root package name */
    public final List f2490r;

    public /* synthetic */ j(int i7, List list) {
        this.f2489q = i7;
        this.f2490r = list;
    }

    @Override // M2.h
    public final int a(long j7) {
        switch (this.f2489q) {
            case 0:
                return j7 < 0 ? 0 : -1;
            case 1:
                return -1;
            case 2:
                return -1;
            default:
                return j7 < 0 ? 0 : -1;
        }
    }

    @Override // M2.h
    public final List h(long j7) {
        switch (this.f2489q) {
            case 0:
                if (j7 >= 0) {
                    return this.f2490r;
                }
                return Collections.emptyList();
            case 1:
                return this.f2490r;
            case 2:
                return this.f2490r;
            default:
                if (j7 >= 0) {
                    return this.f2490r;
                }
                return Collections.emptyList();
        }
    }

    @Override // M2.h
    public final long k(int i7) {
        boolean z7;
        boolean z8;
        switch (this.f2489q) {
            case 0:
                if (i7 == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.f(z7);
                return 0L;
            case 1:
                return 0L;
            case 2:
                return 0L;
            default:
                if (i7 == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC0156a.f(z8);
                return 0L;
        }
    }

    @Override // M2.h
    public final int u() {
        switch (this.f2489q) {
            case 0:
                return 1;
            case 1:
                return 1;
            case 2:
                return 1;
            default:
                return 1;
        }
    }

    public j(ArrayList arrayList) {
        this.f2489q = 3;
        this.f2490r = Collections.unmodifiableList(arrayList);
    }
}
