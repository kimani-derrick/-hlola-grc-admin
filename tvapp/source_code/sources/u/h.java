package u;

import t.C1218d;
/* loaded from: classes.dex */
public final class h extends m {
    @Override // u.d
    public final void a(d dVar) {
        f fVar = this.f14640h;
        if (!fVar.f14621c || fVar.f14626j) {
            return;
        }
        fVar.d((int) ((((f) fVar.f14628l.get(0)).f14623g * ((t.f) this.f14636b).f14511d0) + 0.5f));
    }

    @Override // u.m
    public final void d() {
        m mVar;
        C1218d c1218d = this.f14636b;
        t.f fVar = (t.f) c1218d;
        int i7 = fVar.f14512e0;
        int i8 = fVar.f14513f0;
        int i9 = fVar.f14515h0;
        f fVar2 = this.f14640h;
        if (i9 == 1) {
            if (i7 != -1) {
                fVar2.f14628l.add(c1218d.f14453I.d.f14640h);
                this.f14636b.f14453I.d.f14640h.f14627k.add(fVar2);
                fVar2.f = i7;
            } else if (i8 != -1) {
                fVar2.f14628l.add(c1218d.f14453I.d.f14641i);
                this.f14636b.f14453I.d.f14641i.f14627k.add(fVar2);
                fVar2.f = -i8;
            } else {
                fVar2.f14620b = true;
                fVar2.f14628l.add(c1218d.f14453I.d.f14641i);
                this.f14636b.f14453I.d.f14641i.f14627k.add(fVar2);
            }
            m(this.f14636b.d.f14640h);
            mVar = this.f14636b.d;
        } else {
            if (i7 != -1) {
                fVar2.f14628l.add(c1218d.f14453I.f14476e.f14640h);
                this.f14636b.f14453I.f14476e.f14640h.f14627k.add(fVar2);
                fVar2.f = i7;
            } else if (i8 != -1) {
                fVar2.f14628l.add(c1218d.f14453I.f14476e.f14641i);
                this.f14636b.f14453I.f14476e.f14641i.f14627k.add(fVar2);
                fVar2.f = -i8;
            } else {
                fVar2.f14620b = true;
                fVar2.f14628l.add(c1218d.f14453I.f14476e.f14641i);
                this.f14636b.f14453I.f14476e.f14641i.f14627k.add(fVar2);
            }
            m(this.f14636b.f14476e.f14640h);
            mVar = this.f14636b.f14476e;
        }
        m(mVar.f14641i);
    }

    @Override // u.m
    public final void e() {
        C1218d c1218d = this.f14636b;
        int i7 = ((t.f) c1218d).f14515h0;
        f fVar = this.f14640h;
        if (i7 == 1) {
            c1218d.f14458N = fVar.f14623g;
        } else {
            c1218d.f14459O = fVar.f14623g;
        }
    }

    @Override // u.m
    public final void f() {
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
