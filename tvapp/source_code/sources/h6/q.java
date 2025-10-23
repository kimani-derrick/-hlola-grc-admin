package h6;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11194a;

    public q(int i7) {
        switch (i7) {
            case 1:
                this.f11194a = new ArrayList();
                return;
            default:
                this.f11194a = new ArrayList(20);
                return;
        }
    }

    public void a(String str, String str2) {
        M5.g.f(str, "name");
        M5.g.f(str2, "value");
        p6.d.c(str);
        p6.d.d(str2, str);
        b(str, str2);
    }

    public void b(String str, String str2) {
        M5.g.f(str, "name");
        M5.g.f(str2, "value");
        ArrayList arrayList = this.f11194a;
        arrayList.add(str);
        arrayList.add(U5.f.C0(str2).toString());
    }

    public r c() {
        Object[] array = this.f11194a.toArray(new String[0]);
        if (array != null) {
            return new r((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public void d(String str) {
        M5.g.f(str, "name");
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f11194a;
            if (i7 < arrayList.size()) {
                if (U5.n.W(str, (String) arrayList.get(i7))) {
                    arrayList.remove(i7);
                    arrayList.remove(i7);
                    i7 -= 2;
                }
                i7 += 2;
            } else {
                return;
            }
        }
    }
}
