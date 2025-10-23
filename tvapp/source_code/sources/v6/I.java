package v6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class I extends k {

    /* renamed from: e  reason: collision with root package name */
    public static final w f15368e;

    /* renamed from: b  reason: collision with root package name */
    public final w f15369b;

    /* renamed from: c  reason: collision with root package name */
    public final k f15370c;
    public final Map d;

    static {
        String str = w.f15416r;
        f15368e = u0.j.j("/", false);
    }

    public I(w wVar, r rVar, LinkedHashMap linkedHashMap) {
        this.f15369b = wVar;
        this.f15370c = rVar;
        this.d = linkedHashMap;
    }

    @Override // v6.k
    public final D a(w wVar) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // v6.k
    public final void b(w wVar, w wVar2) {
        M5.g.f(wVar, "source");
        M5.g.f(wVar2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // v6.k
    public final void c(w wVar) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // v6.k
    public final void d(w wVar) {
        M5.g.f(wVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // v6.k
    public final List g(w wVar) {
        M5.g.f(wVar, "dir");
        w wVar2 = f15368e;
        wVar2.getClass();
        w6.d dVar = (w6.d) this.d.get(w6.i.b(wVar2, wVar, true));
        if (dVar != null) {
            return A5.k.l0(dVar.f16111h);
        }
        throw new IOException("not a directory: " + wVar);
    }

    @Override // v6.k
    public final u.e i(w wVar) {
        Long valueOf;
        z zVar;
        M5.g.f(wVar, "path");
        w wVar2 = f15368e;
        wVar2.getClass();
        w6.d dVar = (w6.d) this.d.get(w6.i.b(wVar2, wVar, true));
        Throwable th = null;
        if (dVar == null) {
            return null;
        }
        boolean z7 = dVar.f16107b;
        boolean z8 = !z7;
        if (z7) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(dVar.d);
        }
        u.e eVar = new u.e(z8, z7, null, valueOf, null, dVar.f, null);
        long j7 = dVar.f16110g;
        if (j7 == -1) {
            return eVar;
        }
        q j8 = this.f15370c.j(this.f15369b);
        try {
            zVar = p6.l.c(j8.b(j7));
            try {
                j8.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (j8 != null) {
                try {
                    j8.close();
                } catch (Throwable th4) {
                    android.support.v4.media.session.b.a(th3, th4);
                }
            }
            zVar = null;
            th = th3;
        }
        if (th == null) {
            M5.g.c(zVar);
            u.e f = w6.h.f(zVar, eVar);
            M5.g.c(f);
            return f;
        }
        throw th;
    }

    @Override // v6.k
    public final q j(w wVar) {
        M5.g.f(wVar, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // v6.k
    public final D k(w wVar) {
        M5.g.f(wVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // v6.k
    public final F l(w wVar) {
        Throwable th;
        z zVar;
        M5.g.f(wVar, "file");
        w wVar2 = f15368e;
        wVar2.getClass();
        w6.d dVar = (w6.d) this.d.get(w6.i.b(wVar2, wVar, true));
        if (dVar != null) {
            q j7 = this.f15370c.j(this.f15369b);
            try {
                zVar = p6.l.c(j7.b(dVar.f16110g));
                try {
                    j7.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (j7 != null) {
                    try {
                        j7.close();
                    } catch (Throwable th4) {
                        android.support.v4.media.session.b.a(th3, th4);
                    }
                }
                th = th3;
                zVar = null;
            }
            if (th == null) {
                M5.g.c(zVar);
                w6.h.f(zVar, null);
                int i7 = dVar.f16109e;
                long j8 = dVar.d;
                if (i7 == 0) {
                    return new w6.b(zVar, j8, true);
                }
                return new w6.b(new p(p6.l.c(new w6.b(zVar, dVar.f16108c, true)), new Inflater(true)), j8, false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + wVar);
    }
}
