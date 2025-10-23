package p0;

import M5.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import n0.v;
/* loaded from: classes.dex */
public final class d extends v {

    /* renamed from: A  reason: collision with root package name */
    public String f13104A;

    @Override // n0.v
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d) || !super.equals(obj) || !g.a(this.f13104A, ((d) obj).f13104A)) {
            return false;
        }
        return true;
    }

    @Override // n0.v
    public final void h(Context context, AttributeSet attributeSet) {
        g.f(context, "context");
        super.h(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, f.f13108b);
        g.e(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f13104A = string;
        }
        obtainAttributes.recycle();
    }

    @Override // n0.v
    public final int hashCode() {
        int i7;
        int hashCode = super.hashCode() * 31;
        String str = this.f13104A;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }

    @Override // n0.v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f13104A;
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        String sb2 = sb.toString();
        g.e(sb2, "sb.toString()");
        return sb2;
    }
}
