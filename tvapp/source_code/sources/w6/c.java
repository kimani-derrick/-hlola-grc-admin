package w6;

import A5.m;
import A5.q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import u0.j;
import v6.C1344i;
import v6.D;
import v6.F;
import v6.k;
import v6.w;
import z5.C1524f;
import z5.C1527i;
/* loaded from: classes.dex */
public final class c extends k {

    /* renamed from: c  reason: collision with root package name */
    public static final w f16104c;

    /* renamed from: b  reason: collision with root package name */
    public final C1527i f16105b;

    static {
        String str = w.f15416r;
        f16104c = j.j("/", false);
    }

    public c(ClassLoader classLoader) {
        this.f16105b = new C1527i(new D0.h(17, classLoader));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, v6.f] */
    public static String m(w wVar) {
        w wVar2;
        w d;
        w wVar3 = f16104c;
        wVar3.getClass();
        M5.g.f(wVar, "child");
        w b7 = i.b(wVar3, wVar, true);
        int a7 = i.a(b7);
        w wVar4 = null;
        C1344i c1344i = b7.f15417q;
        if (a7 == -1) {
            wVar2 = null;
        } else {
            wVar2 = new w(c1344i.n(0, a7));
        }
        int a8 = i.a(wVar3);
        C1344i c1344i2 = wVar3.f15417q;
        if (a8 != -1) {
            wVar4 = new w(c1344i2.n(0, a8));
        }
        if (M5.g.a(wVar2, wVar4)) {
            ArrayList a9 = b7.a();
            ArrayList a10 = wVar3.a();
            int min = Math.min(a9.size(), a10.size());
            int i7 = 0;
            while (i7 < min && M5.g.a(a9.get(i7), a10.get(i7))) {
                i7++;
            }
            if (i7 == min && c1344i.d() == c1344i2.d()) {
                String str = w.f15416r;
                d = j.j(".", false);
            } else if (a10.subList(i7, a10.size()).indexOf(i.f16127e) == -1) {
                ?? obj = new Object();
                C1344i c5 = i.c(wVar3);
                if (c5 == null && (c5 = i.c(b7)) == null) {
                    c5 = i.f(w.f15416r);
                }
                int size = a10.size();
                for (int i8 = i7; i8 < size; i8++) {
                    obj.f0(i.f16127e);
                    obj.f0(c5);
                }
                int size2 = a9.size();
                while (i7 < size2) {
                    obj.f0((C1344i) a9.get(i7));
                    obj.f0(c5);
                    i7++;
                }
                d = i.d(obj, false);
            } else {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + b7 + " and " + wVar3).toString());
            }
            return d.f15417q.q();
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + b7 + " and " + wVar3).toString());
    }

    @Override // v6.k
    public final D a(w wVar) {
        throw new IOException(this + " is read-only");
    }

    @Override // v6.k
    public final void b(w wVar, w wVar2) {
        M5.g.f(wVar, "source");
        M5.g.f(wVar2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // v6.k
    public final void c(w wVar) {
        throw new IOException(this + " is read-only");
    }

    @Override // v6.k
    public final void d(w wVar) {
        M5.g.f(wVar, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // v6.k
    public final List g(w wVar) {
        M5.g.f(wVar, "dir");
        String m7 = m(wVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z7 = false;
        for (C1524f c1524f : (List) this.f16105b.getValue()) {
            k kVar = (k) c1524f.f16468q;
            w wVar2 = (w) c1524f.f16469r;
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : kVar.g(wVar2.c(m7))) {
                    if (j.i((w) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(m.P(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w wVar3 = (w) it.next();
                    M5.g.f(wVar3, "<this>");
                    String q5 = wVar2.f15417q.q();
                    w wVar4 = f16104c;
                    String replace = U5.f.q0(wVar3.f15417q.q(), q5).replace('\\', '/');
                    M5.g.e(replace, "replace(...)");
                    arrayList2.add(wVar4.c(replace));
                }
                q.R(arrayList2, linkedHashSet);
                z7 = true;
            } catch (IOException unused) {
            }
        }
        if (z7) {
            return A5.k.l0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }

    @Override // v6.k
    public final u.e i(w wVar) {
        M5.g.f(wVar, "path");
        if (!j.i(wVar)) {
            return null;
        }
        String m7 = m(wVar);
        for (C1524f c1524f : (List) this.f16105b.getValue()) {
            u.e i7 = ((k) c1524f.f16468q).i(((w) c1524f.f16469r).c(m7));
            if (i7 != null) {
                return i7;
            }
        }
        return null;
    }

    @Override // v6.k
    public final v6.q j(w wVar) {
        M5.g.f(wVar, "file");
        if (j.i(wVar)) {
            String m7 = m(wVar);
            for (C1524f c1524f : (List) this.f16105b.getValue()) {
                try {
                    return ((k) c1524f.f16468q).j(((w) c1524f.f16469r).c(m7));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + wVar);
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }

    @Override // v6.k
    public final D k(w wVar) {
        M5.g.f(wVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // v6.k
    public final F l(w wVar) {
        M5.g.f(wVar, "file");
        if (j.i(wVar)) {
            String m7 = m(wVar);
            for (C1524f c1524f : (List) this.f16105b.getValue()) {
                try {
                    return ((k) c1524f.f16468q).l(((w) c1524f.f16469r).c(m7));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + wVar);
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }
}
