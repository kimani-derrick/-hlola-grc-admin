package n0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import o0.AbstractC1055a;
/* loaded from: classes.dex */
public final class y extends v implements Iterable, N5.a {

    /* renamed from: E  reason: collision with root package name */
    public static final /* synthetic */ int f12612E = 0;

    /* renamed from: A  reason: collision with root package name */
    public final o.k f12613A;

    /* renamed from: B  reason: collision with root package name */
    public int f12614B;

    /* renamed from: C  reason: collision with root package name */
    public String f12615C;

    /* renamed from: D  reason: collision with root package name */
    public String f12616D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(N n) {
        super(n);
        M5.g.f(n, "navGraphNavigator");
        this.f12613A = new o.k();
    }

    @Override // n0.v
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        o.k kVar = this.f12613A;
        T5.h<Object> J6 = T5.j.J(o.h.c(kVar));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : J6) {
            arrayList.add(obj2);
        }
        y yVar = (y) obj;
        o.k kVar2 = yVar.f12613A;
        A5.b c5 = o.h.c(kVar2);
        while (c5.hasNext()) {
            arrayList.remove((v) c5.next());
        }
        if (!super.equals(obj) || kVar.k() != kVar2.k() || this.f12614B != yVar.f12614B || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // n0.v
    public final u g(g5.b bVar) {
        u g7 = super.g(bVar);
        ArrayList arrayList = new ArrayList();
        x xVar = new x(this);
        while (xVar.hasNext()) {
            u g8 = ((v) xVar.next()).g(bVar);
            if (g8 != null) {
                arrayList.add(g8);
            }
        }
        return (u) A5.k.d0(A5.j.W(new u[]{g7, (u) A5.k.d0(arrayList)}));
    }

    @Override // n0.v
    public final void h(Context context, AttributeSet attributeSet) {
        String valueOf;
        M5.g.f(context, "context");
        super.h(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC1055a.d);
        M5.g.e(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f12607x) {
            if (this.f12616D != null) {
                this.f12614B = 0;
                this.f12616D = null;
            }
            this.f12614B = resourceId;
            this.f12615C = null;
            if (resourceId <= 16777215) {
                valueOf = String.valueOf(resourceId);
            } else {
                try {
                    valueOf = context.getResources().getResourceName(resourceId);
                } catch (Resources.NotFoundException unused) {
                    valueOf = String.valueOf(resourceId);
                }
                M5.g.e(valueOf, "try {\n                co….toString()\n            }");
            }
            this.f12615C = valueOf;
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
    }

    @Override // n0.v
    public final int hashCode() {
        int i7 = this.f12614B;
        o.k kVar = this.f12613A;
        int k5 = kVar.k();
        for (int i8 = 0; i8 < k5; i8++) {
            i7 = (((i7 * 31) + kVar.g(i8)) * 31) + ((v) kVar.l(i8)).hashCode();
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new x(this);
    }

    public final void l(v vVar) {
        M5.g.f(vVar, "node");
        int i7 = vVar.f12607x;
        String str = vVar.f12608y;
        if (i7 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        String str2 = this.f12608y;
        if (str2 != null && !(!M5.g.a(str, str2))) {
            throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same route as graph " + this).toString());
        } else if (i7 != this.f12607x) {
            o.k kVar = this.f12613A;
            v vVar2 = (v) kVar.e(i7);
            if (vVar2 == vVar) {
                return;
            }
            if (vVar.f12601r == null) {
                if (vVar2 != null) {
                    vVar2.f12601r = null;
                }
                vVar.f12601r = this;
                kVar.i(vVar.f12607x, vVar);
                return;
            }
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        } else {
            throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same id as graph " + this).toString());
        }
    }

    public final v n(int i7, boolean z7) {
        y yVar;
        v vVar = (v) this.f12613A.e(i7);
        if (vVar == null) {
            if (z7 && (yVar = this.f12601r) != null) {
                return yVar.n(i7, true);
            }
            return null;
        }
        return vVar;
    }

    public final v o(String str, boolean z7) {
        y yVar;
        M5.g.f(str, "route");
        v vVar = (v) this.f12613A.e("android-app://androidx.navigation/".concat(str).hashCode());
        if (vVar == null) {
            if (!z7 || (yVar = this.f12601r) == null || U5.n.X(str)) {
                return null;
            }
            return yVar.o(str, true);
        }
        return vVar;
    }

    @Override // n0.v
    public final String toString() {
        v vVar;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str2 = this.f12616D;
        if (str2 != null && !U5.n.X(str2)) {
            vVar = o(str2, true);
        } else {
            vVar = null;
        }
        if (vVar == null) {
            vVar = n(this.f12614B, true);
        }
        sb.append(" startDestination=");
        if (vVar == null) {
            str = this.f12616D;
            if (str == null && (str = this.f12615C) == null) {
                str = "0x" + Integer.toHexString(this.f12614B);
            }
        } else {
            sb.append("{");
            sb.append(vVar.toString());
            str = "}";
        }
        sb.append(str);
        String sb2 = sb.toString();
        M5.g.e(sb2, "sb.toString()");
        return sb2;
    }
}
