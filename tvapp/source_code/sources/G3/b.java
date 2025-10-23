package G3;

import android.graphics.Typeface;
/* loaded from: classes.dex */
public final class b extends C.b {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p6.d f751e;
    public final /* synthetic */ d f;

    public b(d dVar, p6.d dVar2) {
        this.f = dVar;
        this.f751e = dVar2;
    }

    @Override // C.b
    public final void h(int i7) {
        this.f.f765m = true;
        this.f751e.v(i7);
    }

    @Override // C.b
    public final void i(Typeface typeface) {
        d dVar = this.f;
        dVar.n = Typeface.create(typeface, dVar.d);
        dVar.f765m = true;
        this.f751e.w(dVar.n, false);
    }
}
