package n0;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import r0.AbstractC1111a;
@M("navigation")
/* loaded from: classes.dex */
public class z extends N {

    /* renamed from: c  reason: collision with root package name */
    public final O f12617c;

    public z(O o7) {
        this.f12617c = o7;
    }

    @Override // n0.N
    public final v a() {
        return new y(this);
    }

    @Override // n0.N
    public final void d(List list, C1002D c1002d) {
        v n;
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1019j c1019j = (C1019j) it.next();
            y yVar = (y) c1019j.f12543r;
            int i7 = yVar.f12614B;
            String str2 = yVar.f12616D;
            if (i7 == 0 && str2 == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i8 = yVar.f12607x;
                if (i8 != 0) {
                    str = yVar.f12602s;
                    if (str == null) {
                        str = String.valueOf(i8);
                    }
                } else {
                    str = "the root navigation";
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (str2 != null) {
                n = yVar.o(str2, false);
            } else {
                n = yVar.n(i7, false);
            }
            if (n == null) {
                if (yVar.f12615C == null) {
                    String str3 = yVar.f12616D;
                    if (str3 == null) {
                        str3 = String.valueOf(yVar.f12614B);
                    }
                    yVar.f12615C = str3;
                }
                String str4 = yVar.f12615C;
                M5.g.c(str4);
                throw new IllegalArgumentException(AbstractC1111a.r("navigation destination ", str4, " is not a direct child of this NavGraph"));
            }
            N b7 = this.f12617c.b(n.f12600q);
            C1021l b8 = b();
            Bundle c5 = n.c(c1019j.f12544s);
            C0999A c0999a = b8.f12561h;
            b7.d(m3.g.z(m3.i.d(c0999a.f12457a, n, c5, c0999a.f(), c0999a.f12468o)), c1002d);
        }
    }
}
