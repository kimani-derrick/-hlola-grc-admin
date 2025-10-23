package k6;

import M5.g;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import l6.k;
import l6.l;
import o6.s;
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f12215e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i7) {
        super(str, true);
        this.f12215e = i7;
        this.f = obj;
    }

    @Override // k6.a
    public final long a() {
        switch (this.f12215e) {
            case 0:
                ((L5.a) this.f).b();
                return -1L;
            case 1:
                l lVar = (l) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = lVar.f12360e.iterator();
                int i7 = 0;
                long j7 = Long.MIN_VALUE;
                k kVar = null;
                int i8 = 0;
                while (it.hasNext()) {
                    k kVar2 = (k) it.next();
                    g.e(kVar2, "connection");
                    synchronized (kVar2) {
                        if (lVar.b(kVar2, nanoTime) > 0) {
                            i8++;
                        } else {
                            i7++;
                            long j8 = nanoTime - kVar2.f12356q;
                            if (j8 > j7) {
                                kVar = kVar2;
                                j7 = j8;
                            }
                        }
                    }
                }
                long j9 = lVar.f12358b;
                if (j7 < j9 && i7 <= lVar.f12357a) {
                    if (i7 > 0) {
                        return j9 - j7;
                    }
                    if (i8 <= 0) {
                        return -1L;
                    }
                    return j9;
                }
                g.c(kVar);
                synchronized (kVar) {
                    if (!(!kVar.f12355p.isEmpty()) && kVar.f12356q + j7 == nanoTime) {
                        kVar.f12350j = true;
                        lVar.f12360e.remove(kVar);
                        Socket socket = kVar.d;
                        g.c(socket);
                        i6.b.e(socket);
                        if (!lVar.f12360e.isEmpty()) {
                            return 0L;
                        }
                        lVar.f12359c.a();
                        return 0L;
                    }
                    return 0L;
                }
            default:
                s sVar = (s) this.f;
                sVar.getClass();
                try {
                    sVar.f13052O.n(2, 0, false);
                    return -1L;
                } catch (IOException e3) {
                    sVar.b(e3);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, true);
        this.f12215e = 1;
        this.f = lVar;
    }
}
