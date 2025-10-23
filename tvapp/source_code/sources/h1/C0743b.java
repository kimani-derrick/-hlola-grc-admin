package h1;

import com.boxhdo.android.tv.App;
import t3.AbstractC1245i;
import t3.C1248l;
import t3.C1251o;
/* renamed from: h1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743b implements U4.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U4.f f10868a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ App f10869b;

    public C0743b(U4.f fVar, App app) {
        this.f10868a = fVar;
        this.f10869b = app;
    }

    @Override // U4.b
    public final void a(U4.a aVar) {
        U4.f fVar = this.f10868a;
        C1251o b7 = fVar.f3453c.b();
        C1251o b8 = fVar.d.b();
        C1251o e3 = m3.g.H(b7, b8).e(fVar.f3452b, new U4.e(fVar, b7, b8, 0));
        e3.f14596b.m(new C1248l(AbstractC1245i.f14574a, new C0742a(this.f10869b, fVar, 1)));
        e3.o();
    }

    @Override // U4.b
    public final void b(U4.h hVar) {
    }
}
