package l2;

import N3.e;
import Z2.H;
import e2.m0;
import java.nio.charset.Charset;
import java.util.Arrays;
import k2.C0942g;
import k2.C0943h;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import k2.InterfaceC0955t;
import k2.w;
/* renamed from: l2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969a implements InterfaceC0946k {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f12236p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f12237q;

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f12238r;

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f12239s;

    /* renamed from: t  reason: collision with root package name */
    public static final int f12240t;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12243c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public int f12244e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12245g;

    /* renamed from: h  reason: collision with root package name */
    public long f12246h;

    /* renamed from: j  reason: collision with root package name */
    public int f12248j;

    /* renamed from: k  reason: collision with root package name */
    public long f12249k;

    /* renamed from: l  reason: collision with root package name */
    public InterfaceC0948m f12250l;

    /* renamed from: m  reason: collision with root package name */
    public w f12251m;
    public InterfaceC0955t n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12252o;

    /* renamed from: b  reason: collision with root package name */
    public final int f12242b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12241a = new byte[1];

    /* renamed from: i  reason: collision with root package name */
    public int f12247i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f12237q = iArr;
        int i7 = H.f4603a;
        Charset charset = e.f2497c;
        f12238r = "#!AMR\n".getBytes(charset);
        f12239s = "#!AMR-WB\n".getBytes(charset);
        f12240t = iArr[8];
    }

    public final int b(C0943h c0943h) {
        String str;
        boolean z7;
        c0943h.f12168v = 0;
        byte[] bArr = this.f12241a;
        c0943h.i(bArr, 0, 1, false);
        byte b7 = bArr[0];
        if ((b7 & 131) <= 0) {
            int i7 = (b7 >> 3) & 15;
            if (i7 >= 0 && i7 <= 15 && (((z7 = this.f12243c) && (i7 < 10 || i7 > 13)) || (!z7 && (i7 < 12 || i7 > 14)))) {
                if (z7) {
                    return f12237q[i7];
                }
                return f12236p[i7];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.f12243c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i7);
            throw m0.a(sb.toString(), null);
        }
        throw m0.a("Invalid padding bits for frame header " + ((int) b7), null);
    }

    public final boolean c(C0943h c0943h) {
        int length;
        c0943h.f12168v = 0;
        byte[] bArr = f12238r;
        byte[] bArr2 = new byte[bArr.length];
        c0943h.i(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f12243c = false;
            length = bArr.length;
        } else {
            c0943h.f12168v = 0;
            byte[] bArr3 = f12239s;
            byte[] bArr4 = new byte[bArr3.length];
            c0943h.i(bArr4, 0, bArr3.length, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f12243c = true;
            length = bArr3.length;
        }
        c0943h.d(length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r20, U4.k r21) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.C0969a.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f12250l = interfaceC0948m;
        this.f12251m = interfaceC0948m.q(0, 1);
        interfaceC0948m.l();
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        this.d = 0L;
        this.f12244e = 0;
        this.f = 0;
        if (j7 != 0) {
            InterfaceC0955t interfaceC0955t = this.n;
            if (interfaceC0955t instanceof C0942g) {
                C0942g c0942g = (C0942g) interfaceC0955t;
                this.f12249k = (Math.max(0L, j7 - c0942g.f12159b) * 8000000) / c0942g.f12161e;
                return;
            }
        }
        this.f12249k = 0L;
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        return c((C0943h) interfaceC0947l);
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
