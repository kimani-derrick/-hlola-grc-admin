package u;

import java.util.Iterator;
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f14629m;

    public g(m mVar) {
        super(mVar);
        int i7;
        if (mVar instanceof j) {
            i7 = 2;
        } else {
            i7 = 3;
        }
        this.f14622e = i7;
    }

    @Override // u.f
    public final void d(int i7) {
        if (this.f14626j) {
            return;
        }
        this.f14626j = true;
        this.f14623g = i7;
        Iterator it = this.f14627k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
