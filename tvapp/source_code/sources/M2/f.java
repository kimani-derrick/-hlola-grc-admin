package M2;

import Z2.AbstractC0156a;
import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public int f2262a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2263b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2264c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2265e;

    public f() {
        this.f2264c = new Object();
        this.d = new i2.g(1);
        this.f2265e = new ArrayDeque();
        for (int i7 = 0; i7 < 2; i7++) {
            ((ArrayDeque) this.f2265e).addFirst(new d(this, 0));
        }
        this.f2262a = 0;
    }

    @Override // i2.d
    public void a() {
        this.f2263b = true;
    }

    @Override // i2.d
    public void c(l lVar) {
        boolean z7;
        boolean z8 = true;
        AbstractC0156a.k(!this.f2263b);
        if (this.f2262a == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        if (((l) this.d) != lVar) {
            z8 = false;
        }
        AbstractC0156a.f(z8);
        this.f2262a = 2;
    }

    @Override // i2.d
    public Object d() {
        AbstractC0156a.k(!this.f2263b);
        if (this.f2262a == 2) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f2265e;
            if (!arrayDeque.isEmpty()) {
                d dVar = (d) arrayDeque.removeFirst();
                l lVar = (l) this.d;
                if (lVar.d(4)) {
                    dVar.b(4);
                } else {
                    long j7 = lVar.f11353v;
                    ByteBuffer byteBuffer = lVar.f11351t;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    ((k) this.f2264c).getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    dVar.g(lVar.f11353v, new e(0, j7, AbstractC0156a.u(b.f2236Z, parcelableArrayList)), 0L);
                }
                lVar.f();
                this.f2262a = 0;
                return dVar;
            }
        }
        return null;
    }

    @Override // i2.d
    public Object e() {
        AbstractC0156a.k(!this.f2263b);
        if (this.f2262a != 0) {
            return null;
        }
        this.f2262a = 1;
        return (l) this.d;
    }

    @Override // i2.d
    public void flush() {
        AbstractC0156a.k(!this.f2263b);
        ((l) this.d).f();
        this.f2262a = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r10) {
        /*
            r9 = this;
            r9.<init>()
            if (r10 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            android.content.Context r0 = r10.getApplicationContext()
        Lb:
            r9.f2264c = r0
            int r0 = Z2.H.f4603a
            if (r10 == 0) goto L2a
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10
            if (r10 == 0) goto L2a
            java.lang.String r10 = r10.getNetworkCountryIso()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L2a
        L25:
            java.lang.String r10 = p6.l.U(r10)
            goto L33
        L2a:
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r10 = r10.getCountry()
            goto L25
        L33:
            int[] r10 = Y2.C0150t.a(r10)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 8
            r0.<init>(r1)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r2, r3)
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            O3.U r4 = Y2.C0150t.n
            r5 = r10[r1]
            java.lang.Object r5 = r4.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r0.put(r3, r5)
            r3 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            O3.U r6 = Y2.C0150t.f4435o
            r7 = 1
            r8 = r10[r7]
            java.lang.Object r6 = r6.get(r8)
            java.lang.Long r6 = (java.lang.Long) r6
            r0.put(r5, r6)
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            O3.U r8 = Y2.C0150t.f4436p
            r2 = r10[r2]
            java.lang.Object r2 = r8.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r0.put(r6, r2)
            r2 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            O3.U r8 = Y2.C0150t.f4437q
            r3 = r10[r3]
            java.lang.Object r3 = r8.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            r0.put(r6, r3)
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            O3.U r6 = Y2.C0150t.f4438r
            r5 = r10[r5]
            java.lang.Object r5 = r6.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r0.put(r3, r5)
            r3 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            O3.U r5 = Y2.C0150t.f4439s
            r2 = r10[r2]
            java.lang.Object r2 = r5.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r0.put(r3, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10 = r10[r1]
            java.lang.Object r10 = r4.get(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            r0.put(r2, r10)
            r9.d = r0
            r10 = 2000(0x7d0, float:2.803E-42)
            r9.f2262a = r10
            Z2.B r10 = Z2.B.f4594a
            r9.f2265e = r10
            r9.f2263b = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.f.<init>(android.content.Context):void");
    }

    @Override // M2.i
    public void b(long j7) {
    }
}
