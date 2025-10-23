package l6;

import Z2.y;
import e2.C0593J;
import e2.K;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u2.C1263A;
import u2.C1264B;
import u2.C1266b;
import u2.C1269e;
import u2.C1270f;
import u2.C1271g;
import u2.G;
import u2.p;
import u2.r;
import u2.s;
import u2.t;
import u2.v;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public int f12363a;

    /* renamed from: b  reason: collision with root package name */
    public final List f12364b;

    public n(int i7, List list) {
        this.f12363a = i7;
        this.f12364b = list;
    }

    public G a(int i7, g5.b bVar) {
        if (i7 != 2) {
            String str = (String) bVar.f10841r;
            if (i7 != 3 && i7 != 4) {
                if (i7 != 21) {
                    if (i7 != 27) {
                        if (i7 != 36) {
                            if (i7 != 89) {
                                if (i7 != 138) {
                                    if (i7 != 172) {
                                        if (i7 != 257) {
                                            if (i7 != 134) {
                                                if (i7 != 135) {
                                                    switch (i7) {
                                                        case 15:
                                                            if (d(2)) {
                                                                return null;
                                                            }
                                                            return new v(new C1269e(false, str));
                                                        case 16:
                                                            return new v(new u2.m(new C1264B(1, b(bVar))));
                                                        case 17:
                                                            if (d(2)) {
                                                                return null;
                                                            }
                                                            return new v(new s(str));
                                                        default:
                                                            switch (i7) {
                                                                case 128:
                                                                    break;
                                                                case 129:
                                                                    break;
                                                                case 130:
                                                                    if (!d(64)) {
                                                                        return null;
                                                                    }
                                                                    break;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                                }
                                                return new v(new C1266b(str, 0));
                                            } else if (d(16)) {
                                                return null;
                                            } else {
                                                return new C1263A(new g5.b("application/x-scte35"));
                                            }
                                        }
                                        return new C1263A(new g5.b("application/vnd.dvb.ait"));
                                    }
                                    return new v(new C1266b(str, 1));
                                }
                                return new v(new C1270f(str));
                            }
                            return new v(new C1271g((List) bVar.f10842s));
                        }
                        return new v(new r(new C1264B(0, b(bVar))));
                    } else if (d(4)) {
                        return null;
                    } else {
                        return new v(new p(new C1264B(0, b(bVar)), d(1), d(8)));
                    }
                }
                return new v(new C1271g());
            }
            return new v(new t(str));
        }
        return new v(new u2.j(new C1264B(1, b(bVar))));
    }

    public List b(g5.b bVar) {
        boolean z7;
        String str;
        int i7;
        List list;
        boolean d = d(32);
        List list2 = this.f12364b;
        if (d) {
            return list2;
        }
        y yVar = new y((byte[]) bVar.f10843t);
        while (yVar.a() > 0) {
            int u7 = yVar.u();
            int u8 = yVar.f4692b + yVar.u();
            if (u7 == 134) {
                ArrayList arrayList = new ArrayList();
                int u9 = yVar.u() & 31;
                for (int i8 = 0; i8 < u9; i8++) {
                    String s6 = yVar.s(3, N3.e.f2497c);
                    int u10 = yVar.u();
                    if ((u10 & 128) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        i7 = u10 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte u11 = (byte) yVar.u();
                    yVar.G(1);
                    if (z7) {
                        list = Collections.singletonList((u11 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C0593J c0593j = new C0593J();
                    c0593j.f9605k = str;
                    c0593j.f9599c = s6;
                    c0593j.f9594C = i7;
                    c0593j.f9607m = list;
                    arrayList.add(new K(c0593j));
                }
                list2 = arrayList;
            }
            yVar.F(u8);
        }
        return list2;
    }

    public boolean c() {
        if (this.f12363a < this.f12364b.size()) {
            return true;
        }
        return false;
    }

    public boolean d(int i7) {
        if ((i7 & this.f12363a) != 0) {
            return true;
        }
        return false;
    }

    public n(ArrayList arrayList) {
        this.f12364b = arrayList;
    }
}
