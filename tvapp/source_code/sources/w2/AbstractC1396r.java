package w2;

import H2.d0;
import Y2.C0152v;
import Z2.AbstractC0156a;
import Z2.H;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.D;
import e2.AbstractC0600d;
import e2.C0616l;
import e2.K;
import g2.AbstractC0710a;
import g2.InterfaceC0724o;
import g2.P;
import i2.InterfaceC0770b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import u4.C1288l;
/* renamed from: w2.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1396r extends AbstractC0600d {
    public static final byte[] U0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0  reason: collision with root package name */
    public boolean f15794A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f15795B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f15796C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f15797D0;

    /* renamed from: E  reason: collision with root package name */
    public final InterfaceC1388j f15798E;

    /* renamed from: E0  reason: collision with root package name */
    public int f15799E0;
    public final C1397s F;

    /* renamed from: F0  reason: collision with root package name */
    public int f15800F0;

    /* renamed from: G  reason: collision with root package name */
    public final boolean f15801G;
    public boolean G0;

    /* renamed from: H  reason: collision with root package name */
    public final float f15802H;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f15803H0;

    /* renamed from: I  reason: collision with root package name */
    public final i2.g f15804I;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f15805I0;

    /* renamed from: J  reason: collision with root package name */
    public final i2.g f15806J;

    /* renamed from: J0  reason: collision with root package name */
    public long f15807J0;

    /* renamed from: K  reason: collision with root package name */
    public final i2.g f15808K;

    /* renamed from: K0  reason: collision with root package name */
    public long f15809K0;

    /* renamed from: L  reason: collision with root package name */
    public final C1385g f15810L;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f15811L0;

    /* renamed from: M  reason: collision with root package name */
    public final ArrayList f15812M;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f15813M0;

    /* renamed from: N  reason: collision with root package name */
    public final MediaCodec.BufferInfo f15814N;

    /* renamed from: N0  reason: collision with root package name */
    public boolean f15815N0;

    /* renamed from: O  reason: collision with root package name */
    public final ArrayDeque f15816O;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f15817O0;

    /* renamed from: P  reason: collision with root package name */
    public final P f15818P;

    /* renamed from: P0  reason: collision with root package name */
    public C0616l f15819P0;

    /* renamed from: Q  reason: collision with root package name */
    public K f15820Q;

    /* renamed from: Q0  reason: collision with root package name */
    public i2.e f15821Q0;

    /* renamed from: R  reason: collision with root package name */
    public K f15822R;

    /* renamed from: R0  reason: collision with root package name */
    public C1395q f15823R0;

    /* renamed from: S  reason: collision with root package name */
    public j2.k f15824S;

    /* renamed from: S0  reason: collision with root package name */
    public long f15825S0;

    /* renamed from: T  reason: collision with root package name */
    public j2.k f15826T;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f15827T0;

    /* renamed from: U  reason: collision with root package name */
    public MediaCrypto f15828U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f15829V;
    public final long W;

    /* renamed from: X  reason: collision with root package name */
    public float f15830X;

    /* renamed from: Y  reason: collision with root package name */
    public float f15831Y;

    /* renamed from: Z  reason: collision with root package name */
    public InterfaceC1389k f15832Z;

    /* renamed from: a0  reason: collision with root package name */
    public K f15833a0;

    /* renamed from: b0  reason: collision with root package name */
    public MediaFormat f15834b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f15835c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f15836d0;

    /* renamed from: e0  reason: collision with root package name */
    public ArrayDeque f15837e0;

    /* renamed from: f0  reason: collision with root package name */
    public C1394p f15838f0;

    /* renamed from: g0  reason: collision with root package name */
    public C1392n f15839g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f15840h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f15841i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f15842j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f15843k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f15844l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f15845m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f15846n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f15847o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f15848p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f15849q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f15850r0;

    /* renamed from: s0  reason: collision with root package name */
    public C1386h f15851s0;

    /* renamed from: t0  reason: collision with root package name */
    public long f15852t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f15853u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f15854v0;

    /* renamed from: w0  reason: collision with root package name */
    public ByteBuffer f15855w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f15856x0;
    public boolean y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f15857z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v4, types: [i2.g, w2.g] */
    /* JADX WARN: Type inference failed for: r5v6, types: [g2.P, java.lang.Object] */
    public AbstractC1396r(int i7, C1288l c1288l, float f) {
        super(i7);
        C1397s c1397s = C1397s.f15858r;
        this.f15798E = c1288l;
        this.F = c1397s;
        this.f15801G = false;
        this.f15802H = f;
        this.f15804I = new i2.g(0);
        this.f15806J = new i2.g(0);
        this.f15808K = new i2.g(2);
        ?? gVar = new i2.g(2);
        gVar.f15771B = 32;
        this.f15810L = gVar;
        this.f15812M = new ArrayList();
        this.f15814N = new MediaCodec.BufferInfo();
        this.f15830X = 1.0f;
        this.f15831Y = 1.0f;
        this.W = -9223372036854775807L;
        this.f15816O = new ArrayDeque();
        k0(C1395q.d);
        gVar.i(0);
        gVar.f11351t.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f10611c = InterfaceC0724o.f10706a;
        obj.f10610b = 0;
        obj.f10609a = 2;
        this.f15818P = obj;
        this.f15836d0 = -1.0f;
        this.f15840h0 = 0;
        this.f15797D0 = 0;
        this.f15853u0 = -1;
        this.f15854v0 = -1;
        this.f15852t0 = -9223372036854775807L;
        this.f15807J0 = -9223372036854775807L;
        this.f15809K0 = -9223372036854775807L;
        this.f15825S0 = -9223372036854775807L;
        this.f15799E0 = 0;
        this.f15800F0 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0289 A[LOOP:0: B:30:0x0090->B:109:0x0289, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.AbstractC1396r.A(long, long):boolean");
    }

    public abstract i2.i B(C1392n c1392n, K k5, K k7);

    public C1390l C(IllegalStateException illegalStateException, C1392n c1392n) {
        return new C1390l(illegalStateException, c1392n);
    }

    public final void D() {
        this.f15795B0 = false;
        this.f15810L.f();
        this.f15808K.f();
        this.f15794A0 = false;
        this.f15857z0 = false;
        P p3 = this.f15818P;
        p3.getClass();
        p3.f10611c = InterfaceC0724o.f10706a;
        p3.f10610b = 0;
        p3.f10609a = 2;
    }

    public final boolean E() {
        if (this.G0) {
            this.f15799E0 = 1;
            if (!this.f15842j0 && !this.f15844l0) {
                this.f15800F0 = 2;
            } else {
                this.f15800F0 = 3;
                return false;
            }
        } else {
            p0();
        }
        return true;
    }

    public final boolean F(long j7, long j8) {
        boolean z7;
        boolean z8;
        boolean z9;
        MediaCodec.BufferInfo bufferInfo;
        boolean d02;
        boolean z10;
        int d;
        boolean z11;
        boolean z12;
        if (this.f15854v0 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.f15814N;
        if (!z7) {
            if (this.f15845m0 && this.f15803H0) {
                try {
                    d = this.f15832Z.d(bufferInfo2);
                } catch (IllegalStateException unused) {
                    c0();
                    if (this.f15813M0) {
                        f0();
                    }
                    return false;
                }
            } else {
                d = this.f15832Z.d(bufferInfo2);
            }
            if (d < 0) {
                if (d == -2) {
                    this.f15805I0 = true;
                    MediaFormat o7 = this.f15832Z.o();
                    if (this.f15840h0 != 0 && o7.getInteger("width") == 32 && o7.getInteger("height") == 32) {
                        this.f15849q0 = true;
                    } else {
                        if (this.f15847o0) {
                            o7.setInteger("channel-count", 1);
                        }
                        this.f15834b0 = o7;
                        this.f15835c0 = true;
                    }
                    return true;
                }
                if (this.f15850r0 && (this.f15811L0 || this.f15799E0 == 2)) {
                    c0();
                }
                return false;
            } else if (this.f15849q0) {
                this.f15849q0 = false;
                this.f15832Z.j(d, false);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                c0();
                return false;
            } else {
                this.f15854v0 = d;
                ByteBuffer k5 = this.f15832Z.k(d);
                this.f15855w0 = k5;
                if (k5 != null) {
                    k5.position(bufferInfo2.offset);
                    this.f15855w0.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.f15846n0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                    long j9 = this.f15807J0;
                    if (j9 != -9223372036854775807L) {
                        bufferInfo2.presentationTimeUs = j9;
                    }
                }
                long j10 = bufferInfo2.presentationTimeUs;
                ArrayList arrayList = this.f15812M;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        if (((Long) arrayList.get(i7)).longValue() == j10) {
                            arrayList.remove(i7);
                            z11 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                this.f15856x0 = z11;
                long j11 = this.f15809K0;
                long j12 = bufferInfo2.presentationTimeUs;
                if (j11 == j12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.y0 = z12;
                q0(j12);
            }
        }
        if (this.f15845m0 && this.f15803H0) {
            try {
                z8 = true;
                z9 = false;
            } catch (IllegalStateException unused2) {
                z9 = false;
            }
            try {
                d02 = d0(j7, j8, this.f15832Z, this.f15855w0, this.f15854v0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f15856x0, this.y0, this.f15822R);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                c0();
                if (this.f15813M0) {
                    f0();
                }
                return z9;
            }
        } else {
            z8 = true;
            z9 = false;
            bufferInfo = bufferInfo2;
            d02 = d0(j7, j8, this.f15832Z, this.f15855w0, this.f15854v0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f15856x0, this.y0, this.f15822R);
        }
        if (d02) {
            Y(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z10 = z8;
            } else {
                z10 = z9;
            }
            this.f15854v0 = -1;
            this.f15855w0 = null;
            if (!z10) {
                return z8;
            }
            c0();
        }
        return z9;
    }

    public final boolean G() {
        boolean z7;
        i2.c cVar;
        C1395q c1395q;
        InterfaceC1389k interfaceC1389k = this.f15832Z;
        if (interfaceC1389k == null || this.f15799E0 == 2 || this.f15811L0) {
            return false;
        }
        int i7 = this.f15853u0;
        i2.g gVar = this.f15806J;
        if (i7 < 0) {
            int m7 = interfaceC1389k.m();
            this.f15853u0 = m7;
            if (m7 < 0) {
                return false;
            }
            gVar.f11351t = this.f15832Z.g(m7);
            gVar.f();
        }
        if (this.f15799E0 == 1) {
            if (!this.f15850r0) {
                this.f15803H0 = true;
                this.f15832Z.p(this.f15853u0, 0, 0L, 4);
                this.f15853u0 = -1;
                gVar.f11351t = null;
            }
            this.f15799E0 = 2;
            return false;
        } else if (this.f15848p0) {
            this.f15848p0 = false;
            gVar.f11351t.put(U0);
            this.f15832Z.p(this.f15853u0, 38, 0L, 0);
            this.f15853u0 = -1;
            gVar.f11351t = null;
            this.G0 = true;
            return true;
        } else {
            if (this.f15797D0 == 1) {
                for (int i8 = 0; i8 < this.f15833a0.f9657D.size(); i8++) {
                    gVar.f11351t.put((byte[]) this.f15833a0.f9657D.get(i8));
                }
                this.f15797D0 = 2;
            }
            int position = gVar.f11351t.position();
            D d = this.f9933s;
            d.d();
            try {
                int t5 = t(d, gVar, 0);
                if (i() || gVar.d(536870912)) {
                    this.f15809K0 = this.f15807J0;
                }
                if (t5 == -3) {
                    return false;
                }
                if (t5 == -5) {
                    if (this.f15797D0 == 2) {
                        gVar.f();
                        this.f15797D0 = 1;
                    }
                    V(d);
                    return true;
                }
                if (gVar.d(4)) {
                    if (this.f15797D0 == 2) {
                        gVar.f();
                        this.f15797D0 = 1;
                    }
                    this.f15811L0 = true;
                    if (!this.G0) {
                        c0();
                        return false;
                    }
                    try {
                        if (!this.f15850r0) {
                            this.f15803H0 = true;
                            this.f15832Z.p(this.f15853u0, 0, 0L, 4);
                            this.f15853u0 = -1;
                            gVar.f11351t = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e3) {
                        throw e(e3, this.f15820Q, false, H.t(e3.getErrorCode()));
                    }
                } else if (!this.G0 && !gVar.d(1)) {
                    gVar.f();
                    if (this.f15797D0 == 2) {
                        this.f15797D0 = 1;
                    }
                    return true;
                } else {
                    boolean d7 = gVar.d(1073741824);
                    i2.c cVar2 = gVar.f11350s;
                    if (d7) {
                        if (position == 0) {
                            cVar2.getClass();
                        } else {
                            if (cVar2.d == null) {
                                int[] iArr = new int[1];
                                cVar2.d = iArr;
                                cVar2.f11338i.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = cVar2.d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.f15841i0 && !d7) {
                        ByteBuffer byteBuffer = gVar.f11351t;
                        int position2 = byteBuffer.position();
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            int i11 = i9 + 1;
                            if (i11 < position2) {
                                int i12 = byteBuffer.get(i9) & 255;
                                if (i10 == 3) {
                                    if (i12 == 1 && (byteBuffer.get(i11) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i9 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                } else if (i12 == 0) {
                                    i10++;
                                }
                                if (i12 != 0) {
                                    i10 = 0;
                                }
                                i9 = i11;
                            } else {
                                byteBuffer.clear();
                                break;
                            }
                        }
                        if (gVar.f11351t.position() == 0) {
                            return true;
                        }
                        this.f15841i0 = false;
                    }
                    long j7 = gVar.f11353v;
                    C1386h c1386h = this.f15851s0;
                    if (c1386h != null) {
                        K k5 = this.f15820Q;
                        if (c1386h.f15774b == 0) {
                            c1386h.f15773a = j7;
                        }
                        if (!c1386h.f15775c) {
                            ByteBuffer byteBuffer2 = gVar.f11351t;
                            byteBuffer2.getClass();
                            int i13 = 0;
                            int i14 = 0;
                            for (int i15 = 4; i13 < i15; i15 = 4) {
                                i14 = (i14 << 8) | (byteBuffer2.get(i13) & 255);
                                i13++;
                            }
                            int i16 = AbstractC0710a.i(i14);
                            if (i16 == -1) {
                                c1386h.f15775c = true;
                                c1386h.f15774b = 0L;
                                c1386h.f15773a = gVar.f11353v;
                                AbstractC0156a.K("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                j7 = gVar.f11353v;
                            } else {
                                z7 = d7;
                                j7 = Math.max(0L, ((c1386h.f15774b - 529) * 1000000) / k5.f9668P) + c1386h.f15773a;
                                c1386h.f15774b += i16;
                                long j8 = this.f15807J0;
                                C1386h c1386h2 = this.f15851s0;
                                K k7 = this.f15820Q;
                                c1386h2.getClass();
                                cVar = cVar2;
                                this.f15807J0 = Math.max(j8, Math.max(0L, ((c1386h2.f15774b - 529) * 1000000) / k7.f9668P) + c1386h2.f15773a);
                            }
                        }
                        z7 = d7;
                        long j82 = this.f15807J0;
                        C1386h c1386h22 = this.f15851s0;
                        K k72 = this.f15820Q;
                        c1386h22.getClass();
                        cVar = cVar2;
                        this.f15807J0 = Math.max(j82, Math.max(0L, ((c1386h22.f15774b - 529) * 1000000) / k72.f9668P) + c1386h22.f15773a);
                    } else {
                        z7 = d7;
                        cVar = cVar2;
                    }
                    if (gVar.d(Integer.MIN_VALUE)) {
                        this.f15812M.add(Long.valueOf(j7));
                    }
                    if (this.f15815N0) {
                        ArrayDeque arrayDeque = this.f15816O;
                        if (!arrayDeque.isEmpty()) {
                            c1395q = (C1395q) arrayDeque.peekLast();
                        } else {
                            c1395q = this.f15823R0;
                        }
                        c1395q.f15793c.a(j7, this.f15820Q);
                        this.f15815N0 = false;
                    }
                    this.f15807J0 = Math.max(this.f15807J0, j7);
                    gVar.j();
                    if (gVar.d(268435456)) {
                        O(gVar);
                    }
                    a0(gVar);
                    try {
                        if (z7) {
                            this.f15832Z.q(this.f15853u0, cVar, j7);
                        } else {
                            this.f15832Z.p(this.f15853u0, gVar.f11351t.limit(), j7, 0);
                        }
                        this.f15853u0 = -1;
                        gVar.f11351t = null;
                        this.G0 = true;
                        this.f15797D0 = 0;
                        this.f15821Q0.f11342c++;
                        return true;
                    } catch (MediaCodec.CryptoException e7) {
                        throw e(e7, this.f15820Q, false, H.t(e7.getErrorCode()));
                    }
                }
            } catch (i2.f e8) {
                S(e8);
                e0(0);
                H();
                return true;
            }
        }
    }

    public final void H() {
        try {
            this.f15832Z.flush();
        } finally {
            h0();
        }
    }

    public final boolean I() {
        boolean z7;
        if (this.f15832Z == null) {
            return false;
        }
        int i7 = this.f15800F0;
        if (i7 != 3 && !this.f15842j0 && ((!this.f15843k0 || this.f15805I0) && (!this.f15844l0 || !this.f15803H0))) {
            if (i7 == 2) {
                int i8 = H.f4603a;
                if (i8 >= 23) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.k(z7);
                if (i8 >= 23) {
                    try {
                        p0();
                    } catch (C0616l e3) {
                        AbstractC0156a.L("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e3);
                        f0();
                        return true;
                    }
                }
            }
            H();
            return false;
        }
        f0();
        return true;
    }

    public final List J(boolean z7) {
        K k5 = this.f15820Q;
        C1397s c1397s = this.F;
        ArrayList M6 = M(c1397s, k5, z7);
        if (M6.isEmpty() && z7) {
            M6 = M(c1397s, this.f15820Q, false);
            if (!M6.isEmpty()) {
                AbstractC0156a.K("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f15820Q.f9655B + ", but no secure decoder available. Trying to proceed with " + M6 + ".");
            }
        }
        return M6;
    }

    public boolean K() {
        return false;
    }

    public abstract float L(float f, K[] kArr);

    public abstract ArrayList M(C1397s c1397s, K k5, boolean z7);

    public abstract C1387i N(C1392n c1392n, K k5, MediaCrypto mediaCrypto, float f);

    /* JADX WARN: Code restructure failed: missing block: B:236:0x03f5, code lost:
        if ("stvm8".equals(r8) == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0405, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r6) == false) goto L296;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0394 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0503  */
    /* JADX WARN: Type inference failed for: r0v11, types: [w2.h, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(w2.C1392n r18, android.media.MediaCrypto r19) {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.AbstractC1396r.P(w2.n, android.media.MediaCrypto):void");
    }

    public final void Q() {
        K k5;
        boolean z7;
        boolean z8;
        if (this.f15832Z == null && !this.f15857z0 && (k5 = this.f15820Q) != null) {
            if (this.f15826T == null && m0(k5)) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                K k7 = this.f15820Q;
                D();
                String str = k7.f9655B;
                boolean equals = "audio/mp4a-latm".equals(str);
                C1385g c1385g = this.f15810L;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    c1385g.getClass();
                    c1385g.f15771B = 1;
                } else {
                    c1385g.getClass();
                    c1385g.f15771B = 32;
                }
                this.f15857z0 = true;
                return;
            }
            j0(this.f15826T);
            String str2 = this.f15820Q.f9655B;
            j2.k kVar = this.f15824S;
            if (kVar != null) {
                InterfaceC0770b g7 = kVar.g();
                if (this.f15828U == null) {
                    if (g7 == null) {
                        if (this.f15824S.f() == null) {
                            return;
                        }
                    } else if (g7 instanceof j2.y) {
                        j2.y yVar = (j2.y) g7;
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(yVar.f11842a, yVar.f11843b);
                            this.f15828U = mediaCrypto;
                            if (!yVar.f11844c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            this.f15829V = z8;
                        } catch (MediaCryptoException e3) {
                            throw e(e3, this.f15820Q, false, 6006);
                        }
                    }
                }
                if (j2.y.d && (g7 instanceof j2.y)) {
                    int state = this.f15824S.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        j2.j f = this.f15824S.f();
                        f.getClass();
                        throw e(f, this.f15820Q, false, f.f11827q);
                    }
                }
            }
            try {
                R(this.f15828U, this.f15829V);
            } catch (C1394p e7) {
                throw e(e7, this.f15820Q, false, 4001);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(android.media.MediaCrypto r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.AbstractC1396r.R(android.media.MediaCrypto, boolean):void");
    }

    public abstract void S(Exception exc);

    public abstract void T(long j7, long j8, String str);

    public abstract void U(String str);

    /* JADX WARN: Code restructure failed: missing block: B:104:0x012e, code lost:
        if (E() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ad, code lost:
        if (r14 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e9, code lost:
        if (E() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010e, code lost:
        if (r5.f9660H == r6.f9660H) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011c, code lost:
        if (E() == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i2.i V(androidx.fragment.app.D r14) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.AbstractC1396r.V(androidx.fragment.app.D):i2.i");
    }

    public abstract void W(K k5, MediaFormat mediaFormat);

    public void Y(long j7) {
        this.f15825S0 = j7;
        while (true) {
            ArrayDeque arrayDeque = this.f15816O;
            if (!arrayDeque.isEmpty() && j7 >= ((C1395q) arrayDeque.peek()).f15791a) {
                k0((C1395q) arrayDeque.poll());
                Z();
            } else {
                return;
            }
        }
    }

    public abstract void Z();

    public abstract void a0(i2.g gVar);

    public final void c0() {
        int i7 = this.f15800F0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    this.f15813M0 = true;
                    g0();
                    return;
                }
                f0();
                Q();
                return;
            }
            H();
            p0();
            return;
        }
        H();
    }

    public abstract boolean d0(long j7, long j8, InterfaceC1389k interfaceC1389k, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, K k5);

    public final boolean e0(int i7) {
        D d = this.f9933s;
        d.d();
        i2.g gVar = this.f15804I;
        gVar.f();
        int t5 = t(d, gVar, i7 | 4);
        if (t5 == -5) {
            V(d);
            return true;
        } else if (t5 == -4 && gVar.d(4)) {
            this.f15811L0 = true;
            c0();
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j2.k, android.media.MediaCrypto] */
    public final void f0() {
        try {
            InterfaceC1389k interfaceC1389k = this.f15832Z;
            if (interfaceC1389k != null) {
                interfaceC1389k.a();
                this.f15821Q0.f11341b++;
                U(this.f15839g0.f15781a);
            }
            this.f15832Z = null;
            try {
                MediaCrypto mediaCrypto = this.f15828U;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f15832Z = null;
            try {
                MediaCrypto mediaCrypto2 = this.f15828U;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void h0() {
        this.f15853u0 = -1;
        this.f15806J.f11351t = null;
        this.f15854v0 = -1;
        this.f15855w0 = null;
        this.f15852t0 = -9223372036854775807L;
        this.f15803H0 = false;
        this.G0 = false;
        this.f15848p0 = false;
        this.f15849q0 = false;
        this.f15856x0 = false;
        this.y0 = false;
        this.f15812M.clear();
        this.f15807J0 = -9223372036854775807L;
        this.f15809K0 = -9223372036854775807L;
        this.f15825S0 = -9223372036854775807L;
        C1386h c1386h = this.f15851s0;
        if (c1386h != null) {
            c1386h.f15773a = 0L;
            c1386h.f15774b = 0L;
            c1386h.f15775c = false;
        }
        this.f15799E0 = 0;
        this.f15800F0 = 0;
        this.f15797D0 = this.f15796C0 ? 1 : 0;
    }

    public final void i0() {
        h0();
        this.f15819P0 = null;
        this.f15851s0 = null;
        this.f15837e0 = null;
        this.f15839g0 = null;
        this.f15833a0 = null;
        this.f15834b0 = null;
        this.f15835c0 = false;
        this.f15805I0 = false;
        this.f15836d0 = -1.0f;
        this.f15840h0 = 0;
        this.f15841i0 = false;
        this.f15842j0 = false;
        this.f15843k0 = false;
        this.f15844l0 = false;
        this.f15845m0 = false;
        this.f15846n0 = false;
        this.f15847o0 = false;
        this.f15850r0 = false;
        this.f15796C0 = false;
        this.f15797D0 = 0;
        this.f15829V = false;
    }

    public final void j0(j2.k kVar) {
        j2.k kVar2 = this.f15824S;
        if (kVar2 != kVar) {
            if (kVar != null) {
                kVar.c(null);
            }
            if (kVar2 != null) {
                kVar2.a(null);
            }
        }
        this.f15824S = kVar;
    }

    @Override // e2.AbstractC0600d
    public boolean k() {
        boolean g7;
        if (this.f15820Q != null) {
            if (i()) {
                g7 = this.f9928B;
            } else {
                d0 d0Var = this.f9938x;
                d0Var.getClass();
                g7 = d0Var.g();
            }
            if (g7 || this.f15854v0 >= 0 || (this.f15852t0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f15852t0)) {
                return true;
            }
        }
        return false;
    }

    public final void k0(C1395q c1395q) {
        this.f15823R0 = c1395q;
        if (c1395q.f15792b != -9223372036854775807L) {
            this.f15827T0 = true;
            X();
        }
    }

    @Override // e2.AbstractC0600d
    public void l() {
        this.f15820Q = null;
        k0(C1395q.d);
        this.f15816O.clear();
        I();
    }

    public boolean l0(C1392n c1392n) {
        return true;
    }

    public boolean m0(K k5) {
        return false;
    }

    @Override // e2.AbstractC0600d
    public void n(boolean z7, long j7) {
        int i7;
        this.f15811L0 = false;
        this.f15813M0 = false;
        this.f15817O0 = false;
        if (this.f15857z0) {
            this.f15810L.f();
            this.f15808K.f();
            this.f15794A0 = false;
            P p3 = this.f15818P;
            p3.getClass();
            p3.f10611c = InterfaceC0724o.f10706a;
            p3.f10610b = 0;
            p3.f10609a = 2;
        } else if (I()) {
            Q();
        }
        C0152v c0152v = this.f15823R0.f15793c;
        synchronized (c0152v) {
            i7 = c0152v.f4464r;
        }
        if (i7 > 0) {
            this.f15815N0 = true;
        }
        this.f15823R0.f15793c.b();
        this.f15816O.clear();
    }

    public abstract int n0(C1397s c1397s, K k5);

    public final boolean o0(K k5) {
        if (H.f4603a >= 23 && this.f15832Z != null && this.f15800F0 != 3 && this.f9937w != 0) {
            float f = this.f15831Y;
            K[] kArr = this.f9939y;
            kArr.getClass();
            float L6 = L(f, kArr);
            float f7 = this.f15836d0;
            if (f7 == L6) {
                return true;
            }
            if (L6 == -1.0f) {
                if (this.G0) {
                    this.f15799E0 = 1;
                    this.f15800F0 = 3;
                    return false;
                }
                f0();
                Q();
                return false;
            } else if (f7 == -1.0f && L6 <= this.f15802H) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", L6);
                this.f15832Z.i(bundle);
                this.f15836d0 = L6;
            }
        }
        return true;
    }

    public final void p0() {
        InterfaceC0770b g7 = this.f15826T.g();
        if (g7 instanceof j2.y) {
            try {
                this.f15828U.setMediaDrmSession(((j2.y) g7).f11843b);
            } catch (MediaCryptoException e3) {
                throw e(e3, this.f15820Q, false, 6006);
            }
        }
        j0(this.f15826T);
        this.f15799E0 = 0;
        this.f15800F0 = 0;
    }

    public final void q0(long j7) {
        K k5;
        K k7 = (K) this.f15823R0.f15793c.e(j7);
        if (k7 == null && this.f15827T0 && this.f15834b0 != null) {
            C0152v c0152v = this.f15823R0.f15793c;
            synchronized (c0152v) {
                if (c0152v.f4464r == 0) {
                    k5 = null;
                } else {
                    k5 = c0152v.g();
                }
            }
            k7 = k5;
        }
        if (k7 != null) {
            this.f15822R = k7;
        } else if (!this.f15835c0 || this.f15822R == null) {
            return;
        }
        W(this.f15822R, this.f15834b0);
        this.f15835c0 = false;
        this.f15827T0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r2 >= r7) goto L14;
     */
    @Override // e2.AbstractC0600d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(e2.K[] r6, long r7, long r9) {
        /*
            r5 = this;
            w2.q r6 = r5.f15823R0
            long r6 = r6.f15792b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L16
            w2.q r6 = new w2.q
            r6.<init>(r0, r9)
            r5.k0(r6)
            goto L4c
        L16:
            java.util.ArrayDeque r6 = r5.f15816O
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            long r7 = r5.f15807J0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            long r2 = r5.f15825S0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L42
        L2e:
            w2.q r6 = new w2.q
            r6.<init>(r0, r9)
            r5.k0(r6)
            w2.q r6 = r5.f15823R0
            long r6 = r6.f15792b
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L4c
            r5.Z()
            goto L4c
        L42:
            w2.q r7 = new w2.q
            long r0 = r5.f15807J0
            r7.<init>(r0, r9)
            r6.add(r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.AbstractC1396r.s(e2.K[], long, long):void");
    }

    @Override // e2.AbstractC0600d
    public void u(long j7, long j8) {
        boolean z7 = false;
        if (this.f15817O0) {
            this.f15817O0 = false;
            c0();
        }
        C0616l c0616l = this.f15819P0;
        if (c0616l == null) {
            try {
                if (this.f15813M0) {
                    g0();
                    return;
                } else if (this.f15820Q == null && !e0(2)) {
                    return;
                } else {
                    Q();
                    if (this.f15857z0) {
                        AbstractC0156a.b("bypassRender");
                        while (A(j7, j8)) {
                        }
                        AbstractC0156a.s();
                    } else if (this.f15832Z != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        AbstractC0156a.b("drainAndFeed");
                        while (F(j7, j8)) {
                            long j9 = this.W;
                            if (j9 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j9) {
                                break;
                            }
                        }
                        while (G()) {
                            long j10 = this.W;
                            if (j10 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j10) {
                                break;
                            }
                        }
                        AbstractC0156a.s();
                    } else {
                        i2.e eVar = this.f15821Q0;
                        int i7 = eVar.d;
                        d0 d0Var = this.f9938x;
                        d0Var.getClass();
                        eVar.d = i7 + d0Var.x(j7 - this.f9940z);
                        e0(1);
                    }
                    synchronized (this.f15821Q0) {
                    }
                    return;
                }
            } catch (IllegalStateException e3) {
                int i8 = H.f4603a;
                if (i8 < 21 || !(e3 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e3.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e3;
                    }
                }
                S(e3);
                if (i8 >= 21 && (e3 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e3).isRecoverable()) {
                    z7 = true;
                }
                if (z7) {
                    f0();
                }
                throw e(C(e3, this.f15839g0), this.f15820Q, z7, 4003);
            }
        }
        this.f15819P0 = null;
        throw c0616l;
    }

    @Override // e2.AbstractC0600d
    public void x(float f, float f7) {
        this.f15830X = f;
        this.f15831Y = f7;
        o0(this.f15833a0);
    }

    @Override // e2.AbstractC0600d
    public final int y(K k5) {
        try {
            return n0(this.F, k5);
        } catch (C1400v e3) {
            throw f(e3, k5);
        }
    }

    @Override // e2.AbstractC0600d
    public final int z() {
        return 8;
    }

    public void X() {
    }

    public void g0() {
    }

    public void O(i2.g gVar) {
    }

    public void b0(K k5) {
    }
}
