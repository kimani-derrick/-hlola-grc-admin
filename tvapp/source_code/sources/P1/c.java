package P1;

import M5.g;
import Z2.H;
import a.AbstractC0189a;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import androidx.fragment.app.e0;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0341t;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.crypto.tink.shaded.protobuf.AbstractC0523a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import e2.C0585B;
import e2.I0;
import e2.J0;
import e2.v0;
import g3.n;
import j3.C0837a;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m3.i;
import r0.AbstractC1111a;
import s3.C1154I;
import s3.C1169d0;
import s3.C1175g0;
import s3.InterfaceC1193p0;
import s3.T;
import s3.x1;
/* loaded from: classes.dex */
public abstract class c implements v0, InterfaceC1193p0 {

    /* renamed from: q  reason: collision with root package name */
    public final Object f2765q;

    public c(int i7) {
        switch (i7) {
            case 3:
                this.f2765q = new AtomicReference();
                return;
            case 4:
                this.f2765q = new I0();
                return;
            default:
                this.f2765q = new d();
                return;
        }
    }

    public abstract void A(AbstractC0523a abstractC0523a);

    public T B() {
        T t5 = ((C1175g0) this.f2765q).f14063x;
        C1175g0.h(t5);
        return t5;
    }

    public x1 C() {
        x1 x1Var = ((C1175g0) this.f2765q).f14035B;
        C1175g0.h(x1Var);
        return x1Var;
    }

    public void D() {
        C1169d0 c1169d0 = ((C1175g0) this.f2765q).f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
    }

    @Override // s3.InterfaceC1193p0
    public Context a() {
        return ((C1175g0) this.f2765q).f14056q;
    }

    @Override // s3.InterfaceC1193p0
    public C1154I b() {
        C1154I c1154i = ((C1175g0) this.f2765q).f14064y;
        C1175g0.i(c1154i);
        return c1154i;
    }

    @Override // s3.InterfaceC1193p0
    public i c() {
        return ((C1175g0) this.f2765q).f14061v;
    }

    @Override // s3.InterfaceC1193p0
    public C1169d0 d() {
        C1169d0 c1169d0 = ((C1175g0) this.f2765q).f14065z;
        C1175g0.i(c1169d0);
        return c1169d0;
    }

    @Override // s3.InterfaceC1193p0
    public C0837a f() {
        return ((C1175g0) this.f2765q).f14037D;
    }

    public abstract void g(InterfaceC0341t interfaceC0341t);

    public d h() {
        d dVar = (d) this.f2765q;
        int i7 = dVar.f;
        int[] iArr = dVar.f2767b;
        if (i7 != 1) {
            int i8 = dVar.f2769e;
            iArr[0] = i8;
            int i9 = dVar.d;
            iArr[1] = i9;
            iArr[2] = i9;
            iArr[3] = i8;
        } else {
            int i10 = dVar.d;
            iArr[0] = i10;
            iArr[1] = i10;
            int i11 = dVar.f2769e;
            iArr[2] = i11;
            iArr[3] = i11;
        }
        float[] fArr = dVar.f2766a;
        if (i7 != 1) {
            fArr[0] = Math.max(((1.0f - dVar.f2774k) - dVar.f2775l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - dVar.f2774k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((dVar.f2774k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((dVar.f2774k + 1.0f) + dVar.f2775l) / 2.0f, 1.0f);
        } else {
            fArr[0] = 0.0f;
            fArr[1] = Math.min(dVar.f2774k, 1.0f);
            fArr[2] = Math.min(dVar.f2774k + dVar.f2775l, 1.0f);
            fArr[3] = 1.0f;
        }
        return dVar;
    }

    public c i(TypedArray typedArray) {
        boolean hasValue = typedArray.hasValue(3);
        d dVar = (d) this.f2765q;
        if (hasValue) {
            dVar.n = typedArray.getBoolean(3, dVar.n);
        }
        if (typedArray.hasValue(0)) {
            dVar.f2777o = typedArray.getBoolean(0, dVar.f2777o);
        }
        if (typedArray.hasValue(1)) {
            dVar.f2769e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (dVar.f2769e & 16777215);
        }
        if (typedArray.hasValue(11)) {
            dVar.d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (dVar.d & 16777215);
        }
        if (typedArray.hasValue(7)) {
            long j7 = typedArray.getInt(7, (int) dVar.f2781s);
            if (j7 >= 0) {
                dVar.f2781s = j7;
            } else {
                throw new IllegalArgumentException(AbstractC1111a.o(j7, "Given a negative duration: "));
            }
        }
        if (typedArray.hasValue(14)) {
            dVar.f2779q = typedArray.getInt(14, dVar.f2779q);
        }
        if (typedArray.hasValue(15)) {
            long j8 = typedArray.getInt(15, (int) dVar.f2782t);
            if (j8 >= 0) {
                dVar.f2782t = j8;
            } else {
                throw new IllegalArgumentException(AbstractC1111a.o(j8, "Given a negative repeat delay: "));
            }
        }
        if (typedArray.hasValue(16)) {
            dVar.f2780r = typedArray.getInt(16, dVar.f2780r);
        }
        if (typedArray.hasValue(5)) {
            int i7 = typedArray.getInt(5, dVar.f2768c);
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        dVar.f2768c = 0;
                    } else {
                        dVar.f2768c = 3;
                    }
                } else {
                    dVar.f2768c = 2;
                }
            } else {
                dVar.f2768c = 1;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, dVar.f) != 1) {
                dVar.f = 0;
            } else {
                dVar.f = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            float f = typedArray.getFloat(6, dVar.f2775l);
            if (f >= 0.0f) {
                dVar.f2775l = f;
            } else {
                throw new IllegalArgumentException("Given invalid dropoff value: " + f);
            }
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, dVar.f2770g);
            if (dimensionPixelSize >= 0) {
                dVar.f2770g = dimensionPixelSize;
            } else {
                throw new IllegalArgumentException(AbstractC0515y1.l("Given invalid width: ", dimensionPixelSize));
            }
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, dVar.f2771h);
            if (dimensionPixelSize2 >= 0) {
                dVar.f2771h = dimensionPixelSize2;
            } else {
                throw new IllegalArgumentException(AbstractC0515y1.l("Given invalid height: ", dimensionPixelSize2));
            }
        }
        if (typedArray.hasValue(13)) {
            float f7 = typedArray.getFloat(13, dVar.f2774k);
            if (f7 >= 0.0f) {
                dVar.f2774k = f7;
            } else {
                throw new IllegalArgumentException("Given invalid intensity value: " + f7);
            }
        }
        if (typedArray.hasValue(19)) {
            float f8 = typedArray.getFloat(19, dVar.f2772i);
            if (f8 >= 0.0f) {
                dVar.f2772i = f8;
            } else {
                throw new IllegalArgumentException("Given invalid width ratio: " + f8);
            }
        }
        if (typedArray.hasValue(10)) {
            float f9 = typedArray.getFloat(10, dVar.f2773j);
            if (f9 >= 0.0f) {
                dVar.f2773j = f9;
            } else {
                throw new IllegalArgumentException("Given invalid height ratio: " + f9);
            }
        }
        if (typedArray.hasValue(18)) {
            dVar.f2776m = typedArray.getFloat(18, dVar.f2776m);
        }
        return m();
    }

    public abstract AbstractC0523a j(AbstractC0523a abstractC0523a);

    public long k() {
        C0585B c0585b = (C0585B) this;
        J0 O5 = c0585b.O();
        if (O5.q()) {
            return -9223372036854775807L;
        }
        return H.S(O5.n(c0585b.K(), (I0) this.f2765q, 0L).f9579D);
    }

    public abstract EnumC0337o l();

    public abstract c m();

    public boolean n(int i7) {
        C0585B c0585b = (C0585B) this;
        c0585b.q0();
        return c0585b.f9446c0.f10068q.f4633a.get(i7);
    }

    public boolean o() {
        C0585B c0585b = (C0585B) this;
        J0 O5 = c0585b.O();
        if (!O5.q() && O5.n(c0585b.K(), (I0) this.f2765q, 0L).f9590y) {
            return true;
        }
        return false;
    }

    public boolean p() {
        C0585B c0585b = (C0585B) this;
        J0 O5 = c0585b.O();
        if (!O5.q() && O5.n(c0585b.K(), (I0) this.f2765q, 0L).a()) {
            return true;
        }
        return false;
    }

    public boolean q() {
        C0585B c0585b = (C0585B) this;
        J0 O5 = c0585b.O();
        if (!O5.q() && O5.n(c0585b.K(), (I0) this.f2765q, 0L).f9589x) {
            return true;
        }
        return false;
    }

    public boolean r() {
        C0585B c0585b = (C0585B) this;
        if (c0585b.T() == 3 && c0585b.S()) {
            c0585b.q0();
            if (c0585b.f9472w0.f10053m == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean s() {
        int i7;
        e0 e0Var = (e0) this.f2765q;
        View view = e0Var.f6038c.W;
        if (view != null) {
            i7 = AbstractC0189a.d(view);
        } else {
            i7 = 0;
        }
        int i8 = e0Var.f6036a;
        if (i7 != i8 && (i7 == 2 || i8 == 2)) {
            return false;
        }
        return true;
    }

    public Map t() {
        return Collections.emptyMap();
    }

    public abstract AbstractC0523a u(AbstractC0530h abstractC0530h);

    public abstract void v(InterfaceC0341t interfaceC0341t);

    public abstract void w(int i7, long j7, boolean z7);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x() {
        /*
            r10 = this;
            r0 = r10
            e2.B r0 = (e2.C0585B) r0
            e2.J0 r1 = r0.O()
            boolean r1 = r1.q()
            if (r1 != 0) goto L8d
            boolean r1 = r0.W()
            if (r1 == 0) goto L15
            goto L8d
        L15:
            e2.J0 r1 = r0.O()
            boolean r2 = r1.q()
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            goto L3c
        L23:
            int r2 = r0.K()
            r0.q0()
            int r6 = r0.f9439U
            if (r6 != r4) goto L2f
            r6 = r5
        L2f:
            r0.q0()
            boolean r7 = r0.f9440V
            int r1 = r1.e(r2, r6, r7)
            if (r1 == r3) goto L3c
            r1 = r4
            goto L3d
        L3c:
            r1 = r5
        L3d:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L7a
            e2.J0 r1 = r0.O()
            boolean r2 = r1.q()
            if (r2 == 0) goto L50
            r1 = r3
            goto L65
        L50:
            int r2 = r0.K()
            r0.q0()
            int r8 = r0.f9439U
            if (r8 != r4) goto L5c
            r8 = r5
        L5c:
            r0.q0()
            boolean r9 = r0.f9440V
            int r1 = r1.e(r2, r8, r9)
        L65:
            if (r1 != r3) goto L68
            goto L8d
        L68:
            int r2 = r0.K()
            if (r1 != r2) goto L76
            int r0 = r0.K()
            r10.w(r0, r6, r4)
            goto L8d
        L76:
            r10.w(r1, r6, r5)
            goto L8d
        L7a:
            boolean r1 = r10.p()
            if (r1 == 0) goto L8d
            boolean r1 = r10.o()
            if (r1 == 0) goto L8d
            int r0 = r0.K()
            r10.w(r0, r6, r5)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.c.x():void");
    }

    public void y(long j7, int i7) {
        C0585B c0585b = (C0585B) this;
        long M6 = c0585b.M() + j7;
        long R6 = c0585b.R();
        if (R6 != -9223372036854775807L) {
            M6 = Math.min(M6, R6);
        }
        w(c0585b.K(), Math.max(M6, 0L), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            r10 = this;
            r0 = r10
            e2.B r0 = (e2.C0585B) r0
            e2.J0 r1 = r0.O()
            boolean r1 = r1.q()
            if (r1 != 0) goto Ld4
            boolean r1 = r0.W()
            if (r1 == 0) goto L15
            goto Ld4
        L15:
            e2.J0 r1 = r0.O()
            boolean r2 = r1.q()
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            goto L3c
        L23:
            int r2 = r0.K()
            r0.q0()
            int r6 = r0.f9439U
            if (r6 != r4) goto L2f
            r6 = r5
        L2f:
            r0.q0()
            boolean r7 = r0.f9440V
            int r1 = r1.l(r2, r6, r7)
            if (r1 == r3) goto L3c
            r1 = r4
            goto L3d
        L3c:
            r1 = r5
        L3d:
            boolean r2 = r10.p()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L86
            boolean r2 = r10.q()
            if (r2 != 0) goto L86
            if (r1 == 0) goto Ld4
            e2.J0 r1 = r0.O()
            boolean r2 = r1.q()
            if (r2 == 0) goto L5c
            r1 = r3
            goto L71
        L5c:
            int r2 = r0.K()
            r0.q0()
            int r8 = r0.f9439U
            if (r8 != r4) goto L68
            r8 = r5
        L68:
            r0.q0()
            boolean r9 = r0.f9440V
            int r1 = r1.l(r2, r8, r9)
        L71:
            if (r1 != r3) goto L74
            goto Ld4
        L74:
            int r2 = r0.K()
            if (r1 != r2) goto L82
            int r0 = r0.K()
            r10.w(r0, r6, r4)
            goto Ld4
        L82:
            r10.w(r1, r6, r5)
            goto Ld4
        L86:
            if (r1 == 0) goto Lcb
            long r1 = r0.M()
            r0.q0()
            r8 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 > 0) goto Lcb
            e2.J0 r1 = r0.O()
            boolean r2 = r1.q()
            if (r2 == 0) goto La1
            r1 = r3
            goto Lb6
        La1:
            int r2 = r0.K()
            r0.q0()
            int r8 = r0.f9439U
            if (r8 != r4) goto Lad
            r8 = r5
        Lad:
            r0.q0()
            boolean r9 = r0.f9440V
            int r1 = r1.l(r2, r8, r9)
        Lb6:
            if (r1 != r3) goto Lb9
            goto Ld4
        Lb9:
            int r2 = r0.K()
            if (r1 != r2) goto Lc7
            int r0 = r0.K()
            r10.w(r0, r6, r4)
            goto Ld4
        Lc7:
            r10.w(r1, r6, r5)
            goto Ld4
        Lcb:
            int r0 = r0.K()
            r1 = 0
            r10.w(r0, r1, r5)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.c.z():void");
    }

    public c(e0 e0Var) {
        g.f(e0Var, "operation");
        this.f2765q = e0Var;
    }

    public c(C1175g0 c1175g0) {
        n.g(c1175g0);
        this.f2765q = c1175g0;
    }
}
