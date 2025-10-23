package L2;

import Y2.F;
import Z2.H;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ c f1921q;

    public a(c cVar) {
        this.f1921q = cVar;
    }

    @Override // L2.q
    public final void b() {
        this.f1921q.f1942u.remove(this);
    }

    @Override // L2.q
    public final boolean c(Uri uri, H.j jVar, boolean z7) {
        HashMap hashMap;
        b bVar;
        int i7;
        c cVar = this.f1921q;
        if (cVar.f1935B == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.f1947z;
            int i8 = H.f4603a;
            List list = lVar.f1994e;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int size = list.size();
                hashMap = cVar.f1941t;
                if (i9 >= size) {
                    break;
                }
                b bVar2 = (b) hashMap.get(((k) list.get(i9)).f1989a);
                if (bVar2 != null && elapsedRealtime < bVar2.f1930x) {
                    i10++;
                }
                i9++;
            }
            int size2 = cVar.f1947z.f1994e.size();
            cVar.f1940s.getClass();
            IOException iOException = (IOException) jVar.f794r;
            Y2.H h7 = null;
            if ((iOException instanceof F) && (((i7 = ((F) iOException).f4325t) == 403 || i7 == 404 || i7 == 410 || i7 == 416 || i7 == 500 || i7 == 503) && size2 - i10 > 1)) {
                h7 = new Y2.H(60000L, 2);
            }
            if (h7 != null && h7.f4329a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, h7.f4330b);
            }
        }
        return false;
    }
}
