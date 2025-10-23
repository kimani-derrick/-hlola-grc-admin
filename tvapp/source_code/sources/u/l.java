package u;

import t.C1218d;
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: k  reason: collision with root package name */
    public f f14633k;

    /* renamed from: l  reason: collision with root package name */
    public C1254a f14634l;

    @Override // u.d
    public final void a(d dVar) {
        g gVar;
        float f;
        int i7;
        float f7;
        if (s.h.b(this.f14642j) != 3) {
            g gVar2 = this.f14638e;
            if (gVar2.f14621c && !gVar2.f14626j && this.d == 3) {
                C1218d c1218d = this.f14636b;
                int i8 = c1218d.f14481k;
                if (i8 != 2) {
                    if (i8 == 3) {
                        g gVar3 = c1218d.d.f14638e;
                        if (gVar3.f14626j) {
                            int i9 = c1218d.f14457M;
                            if (i9 != -1) {
                                if (i9 != 0) {
                                    if (i9 != 1) {
                                        i7 = 0;
                                    } else {
                                        f7 = gVar3.f14623g;
                                    }
                                } else {
                                    f = gVar3.f14623g * c1218d.f14456L;
                                    i7 = (int) (f + 0.5f);
                                }
                            } else {
                                f7 = gVar3.f14623g;
                            }
                            f = f7 / c1218d.f14456L;
                            i7 = (int) (f + 0.5f);
                        }
                    }
                } else {
                    C1218d c1218d2 = c1218d.f14453I;
                    if (c1218d2 != null) {
                        if (c1218d2.f14476e.f14638e.f14626j) {
                            f = gVar.f14623g * c1218d.f14487r;
                            i7 = (int) (f + 0.5f);
                        }
                    }
                }
                gVar2.d(i7);
            }
            f fVar = this.f14640h;
            if (fVar.f14621c) {
                f fVar2 = this.f14641i;
                if (fVar2.f14621c) {
                    if (fVar.f14626j && fVar2.f14626j && gVar2.f14626j) {
                        return;
                    }
                    if (!gVar2.f14626j && this.d == 3) {
                        C1218d c1218d3 = this.f14636b;
                        if (c1218d3.f14480j == 0 && !c1218d3.p()) {
                            int i10 = ((f) fVar.f14628l.get(0)).f14623g + fVar.f;
                            int i11 = ((f) fVar2.f14628l.get(0)).f14623g + fVar2.f;
                            fVar.d(i10);
                            fVar2.d(i11);
                            gVar2.d(i11 - i10);
                            return;
                        }
                    }
                    if (!gVar2.f14626j && this.d == 3 && this.f14635a == 1 && fVar.f14628l.size() > 0 && fVar2.f14628l.size() > 0) {
                        int i12 = (((f) fVar2.f14628l.get(0)).f14623g + fVar2.f) - (((f) fVar.f14628l.get(0)).f14623g + fVar.f);
                        int i13 = gVar2.f14629m;
                        if (i12 < i13) {
                            gVar2.d(i12);
                        } else {
                            gVar2.d(i13);
                        }
                    }
                    if (gVar2.f14626j && fVar.f14628l.size() > 0 && fVar2.f14628l.size() > 0) {
                        f fVar3 = (f) fVar.f14628l.get(0);
                        f fVar4 = (f) fVar2.f14628l.get(0);
                        int i14 = fVar3.f14623g;
                        int i15 = fVar.f + i14;
                        int i16 = fVar4.f14623g;
                        int i17 = fVar2.f + i16;
                        float f8 = this.f14636b.f14464T;
                        if (fVar3 == fVar4) {
                            f8 = 0.5f;
                        } else {
                            i14 = i15;
                            i16 = i17;
                        }
                        fVar.d((int) ((((i16 - i14) - gVar2.f14623g) * f8) + i14 + 0.5f));
                        fVar2.d(fVar.f14623g + gVar2.f14623g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C1218d c1218d4 = this.f14636b;
        l(c1218d4.f14494y, c1218d4.f14446A, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0253, code lost:
        if (r14.f14636b.f14492w != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0255, code lost:
        c(r7, r3, 1, r14.f14634l);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0290, code lost:
        if (r0.d == 3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b6, code lost:
        if (r14.f14636b.f14492w != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0302, code lost:
        if (r0.d == 3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0304, code lost:
        r0.f14638e.f14627k.add(r2);
        r2.f14628l.add(r14.f14636b.d.f14638e);
        r2.f14619a = r14;
     */
    /* JADX WARN: Type inference failed for: r0v115, types: [u.a, u.g] */
    @Override // u.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.l.d():void");
    }

    @Override // u.m
    public final void e() {
        f fVar = this.f14640h;
        if (fVar.f14626j) {
            this.f14636b.f14459O = fVar.f14623g;
        }
    }

    @Override // u.m
    public final void f() {
        this.f14637c = null;
        this.f14640h.c();
        this.f14641i.c();
        this.f14633k.c();
        this.f14638e.c();
        this.f14639g = false;
    }

    @Override // u.m
    public final boolean k() {
        if (this.d != 3 || this.f14636b.f14481k == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f14639g = false;
        f fVar = this.f14640h;
        fVar.c();
        fVar.f14626j = false;
        f fVar2 = this.f14641i;
        fVar2.c();
        fVar2.f14626j = false;
        f fVar3 = this.f14633k;
        fVar3.c();
        fVar3.f14626j = false;
        this.f14638e.f14626j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f14636b.W;
    }
}
