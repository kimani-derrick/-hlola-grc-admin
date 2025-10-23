package T0;

import W5.C0100g;
import android.view.View;
import android.view.ViewTreeObserver;
import r0.AbstractC1111a;
import w4.l0;
/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public final View f3204a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3205b;

    public e(View view, boolean z7) {
        this.f3204a = view;
        this.f3205b = z7;
    }

    @Override // T0.g
    public final Object a(J0.g gVar) {
        f b7 = AbstractC1111a.b(this);
        if (b7 == null) {
            C0100g c0100g = new C0100g(1, l0.x(gVar));
            c0100g.w();
            ViewTreeObserver viewTreeObserver = this.f3204a.getViewTreeObserver();
            i iVar = new i(this, viewTreeObserver, c0100g);
            viewTreeObserver.addOnPreDrawListener(iVar);
            c0100g.y(new h(this, viewTreeObserver, iVar, 0));
            return c0100g.v();
        }
        return b7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (M5.g.a(this.f3204a, eVar.f3204a)) {
                if (this.f3205b == eVar.f3205b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f3204a.hashCode() * 31;
        if (this.f3205b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }
}
