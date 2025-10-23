package u;

import t.C1217c;
import t.C1218d;
/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f14635a;

    /* renamed from: b  reason: collision with root package name */
    public C1218d f14636b;

    /* renamed from: c  reason: collision with root package name */
    public k f14637c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public final g f14638e = new g(this);
    public int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14639g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f14640h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public final f f14641i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f14642j = 1;

    public m(C1218d c1218d) {
        this.f14636b = c1218d;
    }

    public static void b(f fVar, f fVar2, int i7) {
        fVar.f14628l.add(fVar2);
        fVar.f = i7;
        fVar2.f14627k.add(fVar);
    }

    public static f h(C1217c c1217c) {
        m mVar;
        m mVar2;
        C1217c c1217c2 = c1217c.d;
        if (c1217c2 == null) {
            return null;
        }
        int b7 = s.h.b(c1217c2.f14443c);
        C1218d c1218d = c1217c2.f14442b;
        if (b7 != 1) {
            if (b7 != 2) {
                if (b7 != 3) {
                    if (b7 != 4) {
                        if (b7 != 5) {
                            return null;
                        }
                        return c1218d.f14476e.f14633k;
                    }
                    mVar2 = c1218d.f14476e;
                } else {
                    mVar2 = c1218d.d;
                }
                return mVar2.f14641i;
            }
            mVar = c1218d.f14476e;
        } else {
            mVar = c1218d.d;
        }
        return mVar.f14640h;
    }

    public static f i(C1217c c1217c, int i7) {
        m mVar;
        C1217c c1217c2 = c1217c.d;
        if (c1217c2 == null) {
            return null;
        }
        C1218d c1218d = c1217c2.f14442b;
        if (i7 == 0) {
            mVar = c1218d.d;
        } else {
            mVar = c1218d.f14476e;
        }
        int b7 = s.h.b(c1217c2.f14443c);
        if (b7 != 1 && b7 != 2) {
            if (b7 != 3 && b7 != 4) {
                return null;
            }
            return mVar.f14641i;
        }
        return mVar.f14640h;
    }

    public final void c(f fVar, f fVar2, int i7, g gVar) {
        fVar.f14628l.add(fVar2);
        fVar.f14628l.add(this.f14638e);
        fVar.f14624h = i7;
        fVar.f14625i = gVar;
        fVar2.f14627k.add(fVar);
        gVar.f14627k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i7, int i8) {
        int max;
        if (i8 == 0) {
            C1218d c1218d = this.f14636b;
            int i9 = c1218d.n;
            max = Math.max(c1218d.f14483m, i7);
            if (i9 > 0) {
                max = Math.min(i9, i7);
            }
            if (max == i7) {
                return i7;
            }
        } else {
            C1218d c1218d2 = this.f14636b;
            int i10 = c1218d2.f14486q;
            max = Math.max(c1218d2.f14485p, i7);
            if (i10 > 0) {
                max = Math.min(i10, i7);
            }
            if (max == i7) {
                return i7;
            }
        }
        return max;
    }

    public long j() {
        g gVar = this.f14638e;
        if (gVar.f14626j) {
            return gVar.f14623g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(C1217c c1217c, C1217c c1217c2, int i7) {
        float f;
        int g7;
        m mVar;
        g gVar;
        float f7;
        f h7 = h(c1217c);
        f h8 = h(c1217c2);
        if (h7.f14626j && h8.f14626j) {
            int b7 = c1217c.b() + h7.f14623g;
            int b8 = h8.f14623g - c1217c2.b();
            int i8 = b8 - b7;
            g gVar2 = this.f14638e;
            if (!gVar2.f14626j && this.d == 3) {
                int i9 = this.f14635a;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 == 3) {
                                C1218d c1218d = this.f14636b;
                                m mVar2 = c1218d.d;
                                int i10 = mVar2.d;
                                m mVar3 = c1218d.f14476e;
                                if (i10 != 3 || mVar2.f14635a != 3 || mVar3.d != 3 || mVar3.f14635a != 3) {
                                    if (i7 == 0) {
                                        mVar2 = mVar3;
                                    }
                                    g gVar3 = mVar2.f14638e;
                                    if (gVar3.f14626j) {
                                        float f8 = c1218d.f14456L;
                                        float f9 = gVar3.f14623g;
                                        if (i7 == 1) {
                                            g7 = (int) ((f9 / f8) + 0.5f);
                                        } else {
                                            g7 = (int) ((f8 * f9) + 0.5f);
                                        }
                                    }
                                }
                            }
                        } else {
                            C1218d c1218d2 = this.f14636b;
                            C1218d c1218d3 = c1218d2.f14453I;
                            if (c1218d3 != null) {
                                if (i7 == 0) {
                                    mVar = c1218d3.d;
                                } else {
                                    mVar = c1218d3.f14476e;
                                }
                                if (mVar.f14638e.f14626j) {
                                    if (i7 == 0) {
                                        f7 = c1218d2.f14484o;
                                    } else {
                                        f7 = c1218d2.f14487r;
                                    }
                                    g7 = g((int) ((gVar.f14623g * f7) + 0.5f), i7);
                                }
                            }
                        }
                    } else {
                        g7 = Math.min(g(gVar2.f14629m, i7), i8);
                    }
                } else {
                    g7 = g(i8, i7);
                }
                gVar2.d(g7);
            }
            if (!gVar2.f14626j) {
                return;
            }
            int i11 = gVar2.f14623g;
            f fVar = this.f14641i;
            f fVar2 = this.f14640h;
            if (i11 == i8) {
                fVar2.d(b7);
                fVar.d(b8);
                return;
            }
            C1218d c1218d4 = this.f14636b;
            if (i7 == 0) {
                f = c1218d4.f14463S;
            } else {
                f = c1218d4.f14464T;
            }
            if (h7 == h8) {
                b7 = h7.f14623g;
                b8 = h8.f14623g;
                f = 0.5f;
            }
            fVar2.d((int) ((((b8 - b7) - i11) * f) + b7 + 0.5f));
            fVar.d(fVar2.f14623g + gVar2.f14623g);
        }
    }
}
