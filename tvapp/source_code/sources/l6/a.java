package l6;

import f5.C0700a;
import h6.G;
import h6.u;
import h6.z;
import java.io.IOException;
/* loaded from: classes.dex */
public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12298a = new Object();

    @Override // h6.u
    public final G a(m6.e eVar) {
        i iVar = eVar.f12447a;
        iVar.getClass();
        synchronized (iVar) {
            try {
                if (iVar.f12330E) {
                    if (!iVar.f12329D) {
                        if (!(!iVar.f12328C)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("released".toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar2 = iVar.f12341y;
        M5.g.c(eVar2);
        z zVar = iVar.f12333q;
        M5.g.f(zVar, "client");
        try {
            C0700a c0700a = new C0700a(iVar, iVar.f12337u, eVar2, eVar2.a(eVar.f, eVar.f12451g, eVar.f12452h, zVar.f11269v, !M5.g.a(eVar.f12450e.f11071b, "GET")).k(zVar, eVar));
            iVar.f12327B = c0700a;
            iVar.f12331G = c0700a;
            synchronized (iVar) {
                iVar.f12328C = true;
                iVar.f12329D = true;
            }
            if (!iVar.F) {
                return m6.e.a(eVar, 0, c0700a, null, 61).b(eVar.f12450e);
            }
            throw new IOException("Canceled");
        } catch (IOException e3) {
            eVar2.c(e3);
            throw new m(e3);
        } catch (m e7) {
            eVar2.c(e7.f12362r);
            throw e7;
        }
    }
}
