package s2;

import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import java.util.ArrayDeque;
import java.util.ArrayList;
import k2.C0954s;
import k2.C0956u;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import k2.InterfaceC0955t;
import k2.x;
/* loaded from: classes.dex */
public final class n implements InterfaceC0946k, InterfaceC0955t {

    /* renamed from: i  reason: collision with root package name */
    public int f13654i;

    /* renamed from: j  reason: collision with root package name */
    public long f13655j;

    /* renamed from: k  reason: collision with root package name */
    public int f13656k;

    /* renamed from: l  reason: collision with root package name */
    public y f13657l;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f13659o;

    /* renamed from: p  reason: collision with root package name */
    public int f13660p;

    /* renamed from: s  reason: collision with root package name */
    public long[][] f13663s;

    /* renamed from: t  reason: collision with root package name */
    public int f13664t;

    /* renamed from: u  reason: collision with root package name */
    public long f13665u;

    /* renamed from: v  reason: collision with root package name */
    public int f13666v;

    /* renamed from: h  reason: collision with root package name */
    public int f13653h = 0;
    public final p f = new p();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f13652g = new ArrayList();
    public final y d = new y(16);

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f13651e = new ArrayDeque();

    /* renamed from: a  reason: collision with root package name */
    public final y f13648a = new y(AbstractC0156a.d);

    /* renamed from: b  reason: collision with root package name */
    public final y f13649b = new y(4);

    /* renamed from: c  reason: collision with root package name */
    public final y f13650c = new y();

    /* renamed from: m  reason: collision with root package name */
    public int f13658m = -1;

    /* renamed from: q  reason: collision with root package name */
    public InterfaceC0948m f13661q = InterfaceC0948m.f12174p;

    /* renamed from: r  reason: collision with root package name */
    public m[] f13662r = new m[0];

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0625 A[SYNTHETIC] */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r35, U4.k r36) {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.n.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f13661q = interfaceC0948m;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        long j8;
        long j9;
        long j10;
        long j11;
        boolean z7;
        int[] iArr;
        long j12;
        int a7;
        n nVar = this;
        long j13 = j7;
        m[] mVarArr = nVar.f13662r;
        int length = mVarArr.length;
        C0956u c0956u = C0956u.f12196c;
        if (length == 0) {
            return new C0954s(c0956u, c0956u);
        }
        int i7 = nVar.f13664t;
        boolean z8 = false;
        if (i7 != -1) {
            t tVar = mVarArr[i7].f13645b;
            int f = H.f(tVar.f, j13, false);
            while (true) {
                if (f >= 0) {
                    if ((tVar.f13704g[f] & 1) != 0) {
                        break;
                    }
                    f--;
                } else {
                    f = -1;
                    break;
                }
            }
            if (f == -1) {
                f = tVar.a(j13);
            }
            if (f == -1) {
                return new C0954s(c0956u, c0956u);
            }
            long[] jArr = tVar.f;
            long j14 = jArr[f];
            long[] jArr2 = tVar.f13702c;
            j8 = jArr2[f];
            if (j14 < j13 && f < tVar.f13701b - 1 && (a7 = tVar.a(j13)) != -1 && a7 != f) {
                j12 = jArr[a7];
                j10 = jArr2[a7];
            } else {
                j12 = -9223372036854775807L;
                j10 = -1;
            }
            j9 = j12;
            j13 = j14;
        } else {
            j8 = Long.MAX_VALUE;
            j9 = -9223372036854775807L;
            j10 = -1;
        }
        int i8 = 0;
        long j15 = j8;
        while (true) {
            m[] mVarArr2 = nVar.f13662r;
            if (i8 >= mVarArr2.length) {
                break;
            }
            if (i8 != nVar.f13664t) {
                t tVar2 = mVarArr2[i8].f13645b;
                int f7 = H.f(tVar2.f, j13, z8);
                while (true) {
                    iArr = tVar2.f13704g;
                    if (f7 >= 0) {
                        if ((iArr[f7] & 1) != 0) {
                            break;
                        }
                        f7--;
                    } else {
                        f7 = -1;
                        break;
                    }
                }
                if (f7 == -1) {
                    f7 = tVar2.a(j13);
                }
                long[] jArr3 = tVar2.f13702c;
                j11 = j13;
                if (f7 != -1) {
                    j15 = Math.min(jArr3[f7], j15);
                }
                if (j9 != -9223372036854775807L) {
                    z7 = false;
                    int f8 = H.f(tVar2.f, j9, false);
                    while (true) {
                        if (f8 >= 0) {
                            if ((iArr[f8] & 1) != 0) {
                                break;
                            }
                            f8--;
                        } else {
                            f8 = -1;
                            break;
                        }
                    }
                    if (f8 == -1) {
                        f8 = tVar2.a(j9);
                    }
                    if (f8 != -1) {
                        j10 = Math.min(jArr3[f8], j10);
                    }
                } else {
                    z7 = false;
                }
            } else {
                j11 = j13;
                z7 = z8;
            }
            i8++;
            nVar = this;
            z8 = z7;
            j13 = j11;
        }
        C0956u c0956u2 = new C0956u(j13, j15);
        if (j9 == -9223372036854775807L) {
            return new C0954s(c0956u2, c0956u2);
        }
        return new C0954s(c0956u2, new C0956u(j9, j10));
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        m[] mVarArr;
        this.f13651e.clear();
        this.f13656k = 0;
        this.f13658m = -1;
        this.n = 0;
        this.f13659o = 0;
        this.f13660p = 0;
        if (j7 == 0) {
            if (this.f13653h != 3) {
                this.f13653h = 0;
                this.f13656k = 0;
                return;
            }
            p pVar = this.f;
            pVar.f13670a.clear();
            pVar.f13671b = 0;
            this.f13652g.clear();
            return;
        }
        for (m mVar : this.f13662r) {
            t tVar = mVar.f13645b;
            int f = H.f(tVar.f, j8, false);
            while (true) {
                if (f >= 0) {
                    if ((tVar.f13704g[f] & 1) != 0) {
                        break;
                    }
                    f--;
                } else {
                    f = -1;
                    break;
                }
            }
            if (f == -1) {
                f = tVar.a(j8);
            }
            mVar.f13647e = f;
            x xVar = mVar.d;
            if (xVar != null) {
                xVar.f12203b = false;
                xVar.f12204c = 0;
            }
        }
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.f13665u;
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        return k.j(interfaceC0947l, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018e, code lost:
        r2 = "TVSHOW";
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0194, code lost:
        if (r13 != 757935405) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0196, code lost:
        r2 = null;
        r12 = null;
        r3 = -1;
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019a, code lost:
        r13 = r10.f4692b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019c, code lost:
        if (r13 >= r11) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019e, code lost:
        r25 = r10.g();
        r0 = r10.g();
        r10.G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01af, code lost:
        if (r0 != 1835360622) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b1, code lost:
        r12 = r10.q(r25 - 12);
        r28 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bd, code lost:
        r28 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c4, code lost:
        if (r0 != 1851878757) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c6, code lost:
        r2 = r10.q(r25 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d1, code lost:
        if (r0 != 1684108385) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d3, code lost:
        r6 = r25;
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d7, code lost:
        r10.G(r25 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01dc, code lost:
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e0, code lost:
        r28 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e2, code lost:
        if (r12 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e4, code lost:
        if (r2 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e7, code lost:
        if (r3 != (-1)) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ea, code lost:
        r10.F(r3);
        r10.G(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01fc, code lost:
        r12 = new C2.k(r12, r2, r10.q(r6 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01ff, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0200, code lost:
        r10.F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0205, code lost:
        r28 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x020a, code lost:
        r2 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0211, code lost:
        if (r2 != 6516084) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0213, code lost:
        r12 = s2.k.b(r13, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x021b, code lost:
        if (r2 == 7233901) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0220, code lost:
        if (r2 != 7631467) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0227, code lost:
        if (r2 == 6516589) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x022c, code lost:
        if (r2 != 7828084) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0232, code lost:
        if (r2 != 6578553) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0234, code lost:
        r2 = "TDRC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0236, code lost:
        r12 = s2.k.g(r13, r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x023e, code lost:
        if (r2 != 4280916) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0240, code lost:
        r2 = "TPE1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0246, code lost:
        if (r2 != 7630703) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0248, code lost:
        r2 = "TSSE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x024e, code lost:
        if (r2 != 6384738) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0250, code lost:
        r2 = "TALB";
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0256, code lost:
        if (r2 != 7108978) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0258, code lost:
        r2 = "USLT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x025e, code lost:
        if (r2 != 6776174) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0260, code lost:
        r12 = s2.k.g(r13, "TCON", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0268, code lost:
        if (r2 != 6779504) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x026a, code lost:
        r2 = "TIT1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x026d, code lost:
        Z2.AbstractC0156a.p("MetadataUtil", "Skipped unknown metadata entry: " + i2.AbstractC0769a.c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0280, code lost:
        r10.F(r11);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0285, code lost:
        r2 = "TCOM";
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0288, code lost:
        r2 = "TIT2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x028b, code lost:
        if (r12 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x028d, code lost:
        r5.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0290, code lost:
        r3 = r19;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x029d, code lost:
        r10.F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02a0, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02a1, code lost:
        r28 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02a8, code lost:
        if (r5.isEmpty() == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02aa, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02ac, code lost:
        r12 = new x2.C1461c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02b1, code lost:
        r19 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        r10.F(r3);
        r3 = r3 + r12;
        r10.G(r13);
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        r11 = r10.f4692b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        if (r11 >= r3) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
        r11 = r10.g() + r11;
        r13 = r10.g();
        r0 = (r13 >> 24) & 255;
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
        if (r0 == 169) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r0 != 253) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
        r28 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (r13 != 1735291493) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
        r0 = s2.k.i(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
        if (r0 <= 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
        if (r0 > 192) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
        r0 = s2.k.f13641a[r0 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
        if (r0 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
        r2 = new C2.n("TCON", null, O3.E.x(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
        Z2.AbstractC0156a.K("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
        r10.F(r11);
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
        r28 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
        if (r13 != 1684632427) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
        r2 = "TPOS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
        r12 = s2.k.d(r13, r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0102, code lost:
        r10.F(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0106, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
        if (r13 != 1953655662) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
        r2 = "TRCK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
        if (r13 != 1953329263) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
        r12 = s2.k.h(r13, "TBPM", r10, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0122, code lost:
        if (r13 != 1668311404) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0124, code lost:
        r2 = "TCMP";
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
        r12 = s2.k.h(r13, r2, r10, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012f, code lost:
        if (r13 != 1668249202) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
        r12 = s2.k.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0139, code lost:
        if (r13 != 1631670868) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013b, code lost:
        r2 = "TPE2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013d, code lost:
        r12 = s2.k.g(r13, r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0145, code lost:
        if (r13 != 1936682605) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0147, code lost:
        r2 = "TSOT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
        if (r13 != 1936679276) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
        r2 = "TSO2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0155, code lost:
        if (r13 != 1936679282) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
        r2 = "TSOA";
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015d, code lost:
        if (r13 != 1936679265) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015f, code lost:
        r2 = "TSOP";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0165, code lost:
        if (r13 != 1936679791) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0167, code lost:
        r2 = "TSOC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016d, code lost:
        if (r13 != 1920233063) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016f, code lost:
        r2 = "ITUNESADVISORY";
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0176, code lost:
        if (r13 != 1885823344) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0178, code lost:
        r12 = s2.k.h(r13, "ITUNESGAPLESS", r10, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0184, code lost:
        if (r13 != 1936683886) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
        r2 = "TVSHOWSORT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018c, code lost:
        if (r13 != 1953919848) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(long r30) {
        /*
            Method dump skipped, instructions count: 1731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.n.k(long):void");
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
