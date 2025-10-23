package u;

import java.util.Iterator;
import t.C1215a;
import t.C1218d;
/* loaded from: classes.dex */
public final class i extends m {
    @Override // u.d
    public final void a(d dVar) {
        C1215a c1215a = (C1215a) this.f14636b;
        int i7 = c1215a.f14424f0;
        f fVar = this.f14640h;
        Iterator it = fVar.f14628l.iterator();
        int i8 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((f) it.next()).f14623g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i8 < i10) {
                i8 = i10;
            }
        }
        if (i7 != 0 && i7 != 2) {
            fVar.d(i8 + c1215a.f14426h0);
        } else {
            fVar.d(i9 + c1215a.f14426h0);
        }
    }

    @Override // u.m
    public final void d() {
        m mVar;
        C1218d c1218d = this.f14636b;
        if (c1218d instanceof C1215a) {
            f fVar = this.f14640h;
            fVar.f14620b = true;
            C1215a c1215a = (C1215a) c1218d;
            int i7 = c1215a.f14424f0;
            boolean z7 = c1215a.f14425g0;
            int i8 = 0;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            fVar.f14622e = 7;
                            while (i8 < c1215a.f14423e0) {
                                C1218d c1218d2 = c1215a.f14422d0[i8];
                                if (z7 || c1218d2.f14466V != 8) {
                                    f fVar2 = c1218d2.f14476e.f14641i;
                                    fVar2.f14627k.add(fVar);
                                    fVar.f14628l.add(fVar2);
                                }
                                i8++;
                            }
                        } else {
                            return;
                        }
                    } else {
                        fVar.f14622e = 6;
                        while (i8 < c1215a.f14423e0) {
                            C1218d c1218d3 = c1215a.f14422d0[i8];
                            if (z7 || c1218d3.f14466V != 8) {
                                f fVar3 = c1218d3.f14476e.f14640h;
                                fVar3.f14627k.add(fVar);
                                fVar.f14628l.add(fVar3);
                            }
                            i8++;
                        }
                    }
                    m(this.f14636b.f14476e.f14640h);
                    mVar = this.f14636b.f14476e;
                    m(mVar.f14641i);
                }
                fVar.f14622e = 5;
                while (i8 < c1215a.f14423e0) {
                    C1218d c1218d4 = c1215a.f14422d0[i8];
                    if (z7 || c1218d4.f14466V != 8) {
                        f fVar4 = c1218d4.d.f14641i;
                        fVar4.f14627k.add(fVar);
                        fVar.f14628l.add(fVar4);
                    }
                    i8++;
                }
            } else {
                fVar.f14622e = 4;
                while (i8 < c1215a.f14423e0) {
                    C1218d c1218d5 = c1215a.f14422d0[i8];
                    if (z7 || c1218d5.f14466V != 8) {
                        f fVar5 = c1218d5.d.f14640h;
                        fVar5.f14627k.add(fVar);
                        fVar.f14628l.add(fVar5);
                    }
                    i8++;
                }
            }
            m(this.f14636b.d.f14640h);
            mVar = this.f14636b.d;
            m(mVar.f14641i);
        }
    }

    @Override // u.m
    public final void e() {
        C1218d c1218d = this.f14636b;
        if (c1218d instanceof C1215a) {
            int i7 = ((C1215a) c1218d).f14424f0;
            f fVar = this.f14640h;
            if (i7 != 0 && i7 != 1) {
                c1218d.f14459O = fVar.f14623g;
            } else {
                c1218d.f14458N = fVar.f14623g;
            }
        }
    }

    @Override // u.m
    public final void f() {
        this.f14637c = null;
        this.f14640h.c();
    }

    @Override // u.m
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f14640h;
        fVar2.f14627k.add(fVar);
        fVar.f14628l.add(fVar2);
    }
}
