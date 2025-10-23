package s2;

import Z2.y;
import w4.l0;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f13583a;

    /* renamed from: b  reason: collision with root package name */
    public int f13584b;

    /* renamed from: c  reason: collision with root package name */
    public int f13585c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13586e;
    public final y f;

    /* renamed from: g  reason: collision with root package name */
    public final y f13587g;

    /* renamed from: h  reason: collision with root package name */
    public int f13588h;

    /* renamed from: i  reason: collision with root package name */
    public int f13589i;

    public c(y yVar, y yVar2, boolean z7) {
        this.f13587g = yVar;
        this.f = yVar2;
        this.f13586e = z7;
        yVar2.F(12);
        this.f13583a = yVar2.x();
        yVar.F(12);
        this.f13589i = yVar.x();
        l0.b("first_chunk must be 1", yVar.g() == 1);
        this.f13584b = -1;
    }

    public final boolean a() {
        long v5;
        int i7;
        int i8 = this.f13584b + 1;
        this.f13584b = i8;
        if (i8 == this.f13583a) {
            return false;
        }
        boolean z7 = this.f13586e;
        y yVar = this.f;
        if (z7) {
            v5 = yVar.y();
        } else {
            v5 = yVar.v();
        }
        this.d = v5;
        if (this.f13584b == this.f13588h) {
            y yVar2 = this.f13587g;
            this.f13585c = yVar2.x();
            yVar2.G(4);
            int i9 = this.f13589i - 1;
            this.f13589i = i9;
            if (i9 > 0) {
                i7 = yVar2.x() - 1;
            } else {
                i7 = -1;
            }
            this.f13588h = i7;
        }
        return true;
    }
}
