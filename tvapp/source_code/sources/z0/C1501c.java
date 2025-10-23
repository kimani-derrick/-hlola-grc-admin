package z0;

import M5.g;
/* renamed from: z0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1501c implements Comparable {

    /* renamed from: q  reason: collision with root package name */
    public final int f16390q;

    /* renamed from: r  reason: collision with root package name */
    public final int f16391r;

    /* renamed from: s  reason: collision with root package name */
    public final String f16392s;

    /* renamed from: t  reason: collision with root package name */
    public final String f16393t;

    public C1501c(int i7, int i8, String str, String str2) {
        this.f16390q = i7;
        this.f16391r = i8;
        this.f16392s = str;
        this.f16393t = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1501c c1501c = (C1501c) obj;
        g.f(c1501c, "other");
        int i7 = this.f16390q - c1501c.f16390q;
        if (i7 == 0) {
            return this.f16391r - c1501c.f16391r;
        }
        return i7;
    }
}
