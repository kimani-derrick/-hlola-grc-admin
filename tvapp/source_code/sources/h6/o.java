package h6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import v6.C1341f;
import v6.InterfaceC1342g;
/* loaded from: classes.dex */
public final class o extends E {

    /* renamed from: c  reason: collision with root package name */
    public static final v f11188c;

    /* renamed from: a  reason: collision with root package name */
    public final List f11189a;

    /* renamed from: b  reason: collision with root package name */
    public final List f11190b;

    static {
        Pattern pattern = v.d;
        f11188c = p6.l.r("application/x-www-form-urlencoded");
    }

    public o(ArrayList arrayList, ArrayList arrayList2) {
        M5.g.f(arrayList, "encodedNames");
        M5.g.f(arrayList2, "encodedValues");
        this.f11189a = i6.b.x(arrayList);
        this.f11190b = i6.b.x(arrayList2);
    }

    @Override // h6.E
    public final long a() {
        return d(null, true);
    }

    @Override // h6.E
    public final v b() {
        return f11188c;
    }

    @Override // h6.E
    public final void c(InterfaceC1342g interfaceC1342g) {
        d(interfaceC1342g, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(InterfaceC1342g interfaceC1342g, boolean z7) {
        C1341f c1341f;
        if (z7) {
            c1341f = new Object();
        } else {
            M5.g.c(interfaceC1342g);
            c1341f = interfaceC1342g.c();
        }
        List list = this.f11189a;
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 1;
            if (i7 > 0) {
                c1341f.i0(38);
            }
            c1341f.o0((String) list.get(i7));
            c1341f.i0(61);
            c1341f.o0((String) this.f11190b.get(i7));
            i7 = i8;
        }
        if (z7) {
            long j7 = c1341f.f15388r;
            c1341f.b();
            return j7;
        }
        return 0L;
    }
}
