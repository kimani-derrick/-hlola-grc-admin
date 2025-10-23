package p0;

import M5.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import n0.InterfaceC1014e;
import n0.v;
/* loaded from: classes.dex */
public final class b extends v implements InterfaceC1014e {

    /* renamed from: A  reason: collision with root package name */
    public String f13101A;

    @Override // n0.v
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b) || !super.equals(obj) || !g.a(this.f13101A, ((b) obj).f13101A)) {
            return false;
        }
        return true;
    }

    @Override // n0.v
    public final void h(Context context, AttributeSet attributeSet) {
        g.f(context, "context");
        super.h(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, f.f13107a);
        g.e(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f13101A = string;
        }
        obtainAttributes.recycle();
    }

    @Override // n0.v
    public final int hashCode() {
        int i7;
        int hashCode = super.hashCode() * 31;
        String str = this.f13101A;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
