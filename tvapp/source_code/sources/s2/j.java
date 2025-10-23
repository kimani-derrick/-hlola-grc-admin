package s2;

import Z2.AbstractC0156a;
import Z2.E;
import Z2.H;
import Z2.y;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.C0593J;
import e2.K;
import e2.m0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import k2.w;
/* loaded from: classes.dex */
public final class j implements InterfaceC0946k {

    /* renamed from: G  reason: collision with root package name */
    public static final byte[] f13611G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: H  reason: collision with root package name */
    public static final K f13612H;

    /* renamed from: A  reason: collision with root package name */
    public int f13613A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f13614B;
    public boolean F;

    /* renamed from: a  reason: collision with root package name */
    public final int f13618a;

    /* renamed from: b  reason: collision with root package name */
    public final List f13619b;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f13622g;

    /* renamed from: h  reason: collision with root package name */
    public final y f13623h;

    /* renamed from: i  reason: collision with root package name */
    public final E f13624i;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f13629o;

    /* renamed from: p  reason: collision with root package name */
    public long f13630p;

    /* renamed from: q  reason: collision with root package name */
    public int f13631q;

    /* renamed from: r  reason: collision with root package name */
    public y f13632r;

    /* renamed from: s  reason: collision with root package name */
    public long f13633s;

    /* renamed from: t  reason: collision with root package name */
    public int f13634t;

    /* renamed from: x  reason: collision with root package name */
    public i f13638x;

    /* renamed from: y  reason: collision with root package name */
    public int f13639y;

    /* renamed from: z  reason: collision with root package name */
    public int f13640z;

    /* renamed from: j  reason: collision with root package name */
    public final t2.i f13625j = new t2.i(18, (byte) 0);

    /* renamed from: k  reason: collision with root package name */
    public final y f13626k = new y(16);
    public final y d = new y(AbstractC0156a.d);

    /* renamed from: e  reason: collision with root package name */
    public final y f13621e = new y(5);
    public final y f = new y();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayDeque f13627l = new ArrayDeque();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayDeque f13628m = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray f13620c = new SparseArray();

    /* renamed from: v  reason: collision with root package name */
    public long f13636v = -9223372036854775807L;

    /* renamed from: u  reason: collision with root package name */
    public long f13635u = -9223372036854775807L;

    /* renamed from: w  reason: collision with root package name */
    public long f13637w = -9223372036854775807L;

    /* renamed from: C  reason: collision with root package name */
    public InterfaceC0948m f13615C = InterfaceC0948m.f12174p;

    /* renamed from: D  reason: collision with root package name */
    public w[] f13616D = new w[0];

    /* renamed from: E  reason: collision with root package name */
    public w[] f13617E = new w[0];

    static {
        C0593J c0593j = new C0593J();
        c0593j.f9605k = "application/x-emsg";
        f13612H = c0593j.a();
    }

    public j(int i7, E e3, List list) {
        this.f13618a = i7;
        this.f13624i = e3;
        this.f13619b = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f13622g = bArr;
        this.f13623h = new y(bArr);
    }

    public static j2.i b(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) arrayList.get(i7);
            if (bVar.f11331r == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f13582s.f4691a;
                C.d e3 = k.e(bArr);
                if (e3 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) e3.f325s;
                }
                if (uuid == null) {
                    AbstractC0156a.K("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new j2.h(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new j2.i(null, false, (j2.h[]) arrayList2.toArray(new j2.h[0]));
    }

    public static void c(y yVar, int i7, s sVar) {
        boolean z7;
        yVar.F(i7 + 8);
        int g7 = yVar.g();
        if ((g7 & 1) == 0) {
            if ((g7 & 2) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int x7 = yVar.x();
            if (x7 == 0) {
                Arrays.fill(sVar.f13695l, 0, sVar.f13689e, false);
                return;
            } else if (x7 == sVar.f13689e) {
                Arrays.fill(sVar.f13695l, 0, x7, z7);
                int a7 = yVar.a();
                y yVar2 = sVar.n;
                yVar2.C(a7);
                sVar.f13694k = true;
                sVar.f13697o = true;
                yVar.e(yVar2.f4691a, 0, yVar2.f4693c);
                yVar2.F(0);
                sVar.f13697o = false;
                return;
            } else {
                StringBuilder o7 = AbstractC0515y1.o(x7, "Senc sample count ", " is different from fragment sample count");
                o7.append(sVar.f13689e);
                throw m0.a(o7.toString(), null);
            }
        }
        throw m0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ec, code lost:
        if ("video/hevc".equals(r4) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f4, code lost:
        if (((r13 & 126) >> 1) != 39) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f6, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f8, code lost:
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fb, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fc, code lost:
        r31.f13614B = r4;
        r31.f13640z += 5;
        r31.f13639y += r3;
        r7 = r19;
        r10 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020d, code lost:
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0218, code lost:
        throw e2.m0.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0219, code lost:
        r19 = r7;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0220, code lost:
        if (r31.f13614B == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0222, code lost:
        r7 = r31.f;
        r7.C(r4);
        r22 = r3;
        r23 = r14;
        ((k2.C0943h) r32).e(r7.f4691a, 0, r31.f13613A, false);
        r11.d(r31.f13613A, r7);
        r3 = r31.f13613A;
        r4 = Z2.AbstractC0156a.J(r7.f4693c, r7.f4691a);
        r7.F("video/hevc".equals(r13.f9655B) ? 1 : 0);
        r7.E(r4);
        p6.l.k(r8, r7, r31.f13617E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0257, code lost:
        r22 = r3;
        r23 = r14;
        r3 = r11.a(r32, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0261, code lost:
        r31.f13640z += r3;
        r31.f13613A -= r3;
        r7 = r19;
        r10 = r21;
        r3 = r22;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0274, code lost:
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0277, code lost:
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0279, code lost:
        r3 = r31.f13640z;
        r4 = r31.f13639y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x027d, code lost:
        if (r3 >= r4) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x027f, code lost:
        r31.f13640z += r11.a(r32, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x028d, code lost:
        if (r2.f13610l != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028f, code lost:
        r5 = r2.d.f13704g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029e, code lost:
        if (r5.f13693j[r2.f] == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a0, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a2, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a7, code lost:
        if (r2.a() == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a9, code lost:
        r24 = 1073741824 | r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02af, code lost:
        r24 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b1, code lost:
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b5, code lost:
        if (r0 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b7, code lost:
        r27 = r0.f13684c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02bc, code lost:
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02be, code lost:
        r11.c(r8, r24, r31.f13639y, 0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cf, code lost:
        if (r12.isEmpty() != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d1, code lost:
        r0 = (s2.h) r12.removeFirst();
        r31.f13634t -= r0.f13600c;
        r3 = r0.f13599b;
        r4 = r0.f13598a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e2, code lost:
        if (r3 == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e4, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e5, code lost:
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e7, code lost:
        if (r28 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e9, code lost:
        r4 = r6.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ed, code lost:
        r3 = r31.f13616D;
        r7 = r3.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f1, code lost:
        if (r10 >= r7) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f3, code lost:
        r3[r10].c(r4, 1, r0.f13600c, r31.f13634t, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0309, code lost:
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0310, code lost:
        if (r2.b() != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0312, code lost:
        r31.f13638x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0315, code lost:
        r31.n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0319, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
        r3 = r31.n;
        r5 = r2.f13602b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
        if (r3 != 3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
        if (r2.f13610l != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
        r3 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
        r3 = r5.f13691h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
        r31.f13639y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
        if (r2.f >= r2.f13607i) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
        ((k2.C0943h) r32).d(r3);
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
        if (r0 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
        r3 = r5.n;
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
        if (r0 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ea, code lost:
        r3.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
        r0 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
        if (r5.f13694k == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f7, code lost:
        if (r5.f13695l[r0] == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r3.G(r3.z() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
        if (r2.b() != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0107, code lost:
        r31.f13638x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
        r31.n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0116, code lost:
        if (r2.d.f13700a.f13677g != 1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
        r31.f13639y = r3 - 8;
        ((k2.C0943h) r32).d(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0131, code lost:
        if ("audio/ac4".equals(r2.d.f13700a.f.f9655B) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0133, code lost:
        r31.f13640z = r2.c(r31.f13639y, 7);
        r3 = r31.f13639y;
        r8 = r31.f13623h;
        g2.AbstractC0710a.c(r3, r8);
        r2.f13601a.d(7, r8);
        r3 = r31.f13640z + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014b, code lost:
        r31.f13640z = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014e, code lost:
        r3 = r2.c(r31.f13639y, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0155, code lost:
        r31.f13639y += r31.f13640z;
        r31.n = 4;
        r31.f13613A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0161, code lost:
        r3 = r2.d;
        r7 = r3.f13700a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0167, code lost:
        if (r2.f13610l != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0169, code lost:
        r8 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0170, code lost:
        r8 = r5.f13692i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0177, code lost:
        if (r13 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0179, code lost:
        r8 = r13.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017d, code lost:
        r3 = r7.f13680j;
        r11 = r2.f13601a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0181, code lost:
        if (r3 == 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0183, code lost:
        r14 = r31.f13621e;
        r15 = r14.f4691a;
        r15[0] = 0;
        r15[1] = 0;
        r15[2] = 0;
        r10 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019b, code lost:
        if (r31.f13640z >= r31.f13639y) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019d, code lost:
        r4 = r31.f13613A;
        r28 = r13;
        r13 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a5, code lost:
        if (r4 != 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a7, code lost:
        r19 = r7;
        ((k2.C0943h) r32).e(r15, r3, r10, false);
        r14.F(0);
        r4 = r14.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b8, code lost:
        if (r4 < 1) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ba, code lost:
        r31.f13613A = r4 - 1;
        r4 = r31.d;
        r4.F(0);
        r11.d(4, r4);
        r11.d(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cf, code lost:
        if (r31.f13617E.length <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d1, code lost:
        r4 = r13.f9655B;
        r13 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01db, code lost:
        if ("video/avc".equals(r4) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dd, code lost:
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e2, code lost:
        if ((r13 & 31) == 6) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e5, code lost:
        r21 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x079e A[SYNTHETIC] */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r32, U4.k r33) {
        /*
            Method dump skipped, instructions count: 1957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.j.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        int i7;
        this.f13615C = interfaceC0948m;
        int i8 = 0;
        this.n = 0;
        this.f13631q = 0;
        w[] wVarArr = new w[2];
        this.f13616D = wVarArr;
        int i9 = 100;
        if ((this.f13618a & 4) != 0) {
            wVarArr[0] = interfaceC0948m.q(100, 5);
            i7 = 1;
            i9 = 101;
        } else {
            i7 = 0;
        }
        w[] wVarArr2 = (w[]) H.L(i7, this.f13616D);
        this.f13616D = wVarArr2;
        for (w wVar : wVarArr2) {
            wVar.e(f13612H);
        }
        List list = this.f13619b;
        this.f13617E = new w[list.size()];
        while (i8 < this.f13617E.length) {
            w q5 = this.f13615C.q(i9, 3);
            q5.e((K) list.get(i8));
            this.f13617E[i8] = q5;
            i8++;
            i9++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:348:0x07b0, code lost:
        r7 = r0;
        r7.n = 0;
        r7.f13631q = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x07b6, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r52) {
        /*
            Method dump skipped, instructions count: 1975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.j.f(long):void");
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        SparseArray sparseArray = this.f13620c;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((i) sparseArray.valueAt(i7)).d();
        }
        this.f13628m.clear();
        this.f13634t = 0;
        this.f13635u = j8;
        this.f13627l.clear();
        this.n = 0;
        this.f13631q = 0;
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        return k.j(interfaceC0947l, true, false);
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
