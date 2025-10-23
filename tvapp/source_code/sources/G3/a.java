package G3;

import android.graphics.Typeface;
/* loaded from: classes.dex */
public final class a extends p6.d {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f748a;

    /* renamed from: b  reason: collision with root package name */
    public final T4.c f749b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f750c;

    public a(T4.c cVar, Typeface typeface) {
        this.f748a = typeface;
        this.f749b = cVar;
    }

    @Override // p6.d
    public final void v(int i7) {
        if (!this.f750c) {
            F3.b bVar = (F3.b) this.f749b.f3382r;
            a aVar = bVar.f693v;
            if (aVar != null) {
                aVar.f750c = true;
            }
            Typeface typeface = bVar.f690s;
            Typeface typeface2 = this.f748a;
            if (typeface != typeface2) {
                bVar.f690s = typeface2;
                bVar.g();
            }
        }
    }

    @Override // p6.d
    public final void w(Typeface typeface, boolean z7) {
        if (!this.f750c) {
            F3.b bVar = (F3.b) this.f749b.f3382r;
            a aVar = bVar.f693v;
            if (aVar != null) {
                aVar.f750c = true;
            }
            if (bVar.f690s != typeface) {
                bVar.f690s = typeface;
                bVar.g();
            }
        }
    }
}
