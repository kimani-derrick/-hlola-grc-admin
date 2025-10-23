package C;

import H2.A;
import H2.C;
import H2.C0016q;
import H2.C0020v;
import H2.D;
import H2.E;
import H2.F;
import H2.G;
import K.O;
import O3.AbstractC0080y;
import Z2.H;
import Z2.y;
import a.AbstractC0189a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.widget.ImageView;
import e.AbstractC0565a;
import e2.K;
import h6.C0761k;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.AbstractC0869T;
import k.C0904o;
import k2.C0939d;
import k2.C0943h;
import k2.C0951p;
import k2.InterfaceC0940e;
import x0.C1449e;
/* loaded from: classes.dex */
public final class d implements InterfaceC0940e {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f323q;

    /* renamed from: r  reason: collision with root package name */
    public int f324r;

    /* renamed from: s  reason: collision with root package name */
    public Object f325s;

    /* renamed from: t  reason: collision with root package name */
    public Object f326t;

    public /* synthetic */ d() {
        this.f323q = 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c8, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C.d d(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.d.d(android.content.res.Resources, int, android.content.res.Resources$Theme):C.d");
    }

    public static void e(String str) {
        int i7;
        boolean z7;
        if (!U5.n.W(str, ":memory:")) {
            int length = str.length() - 1;
            int i8 = 0;
            boolean z8 = false;
            while (i8 <= length) {
                if (!z8) {
                    i7 = i8;
                } else {
                    i7 = length;
                }
                if (M5.g.h(str.charAt(i7), 32) <= 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z8) {
                    if (!z7) {
                        z8 = true;
                    } else {
                        i8++;
                    }
                } else if (!z7) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i8, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e3) {
                    Log.w("SupportSQLite", "delete failed: ", e3);
                }
            }
        }
    }

    public List A(CharSequence charSequence) {
        charSequence.getClass();
        T4.c cVar = (T4.c) this.f326t;
        cVar.getClass();
        N3.k kVar = new N3.k(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (kVar.hasNext()) {
            arrayList.add((String) kVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void B(C0020v c0020v) {
        A a7 = (A) this.f325s;
        a7.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f326t).iterator();
        while (it.hasNext()) {
            G g7 = (G) it.next();
            H.M(g7.f900a, new D(this, g7.f901b, a7, c0020v, 0));
        }
    }

    public void a() {
        C0761k c0761k;
        ImageView imageView = (ImageView) this.f325s;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0869T.a(drawable);
        }
        if (drawable != null && (c0761k = (C0761k) this.f326t) != null) {
            C0904o.d(drawable, c0761k, imageView.getDrawableState());
        }
    }

    public P4.b b() {
        String str;
        if (((Long) this.f326t) == null) {
            str = " tokenExpirationTimestamp";
        } else {
            str = "";
        }
        if (str.isEmpty()) {
            long longValue = ((Long) this.f326t).longValue();
            return new P4.b(this.f324r, longValue, (String) this.f325s);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public O3.Z c() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.d.c():O3.Z");
    }

    public void f(C0020v c0020v) {
        Iterator it = ((CopyOnWriteArrayList) this.f326t).iterator();
        while (it.hasNext()) {
            G g7 = (G) it.next();
            H.M(g7.f900a, new E(this, g7.f901b, c0020v, 0));
        }
    }

    public long g(C0943h c0943h) {
        long j7;
        U4.k kVar;
        C0951p c0951p;
        int k5;
        while (true) {
            long j8 = c0943h.j();
            j7 = c0943h.f12165s;
            int i7 = (j8 > (j7 - 6) ? 1 : (j8 == (j7 - 6) ? 0 : -1));
            kVar = (U4.k) this.f326t;
            c0951p = (C0951p) this.f325s;
            if (i7 >= 0) {
                break;
            }
            long j9 = c0943h.j();
            byte[] bArr = new byte[2];
            c0943h.i(bArr, 0, 2, false);
            int i8 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i9 = this.f324r;
            if (i8 != i9) {
                c0943h.f12168v = 0;
                c0943h.a((int) (j9 - c0943h.f12166t), false);
            } else {
                y yVar = new y(16);
                System.arraycopy(bArr, 0, yVar.f4691a, 0, 2);
                byte[] bArr2 = yVar.f4691a;
                int i10 = 0;
                for (int i11 = 2; i10 < 14 && (k5 = c0943h.k(bArr2, i11 + i10, 14 - i10)) != -1; i11 = 2) {
                    i10 += k5;
                }
                yVar.E(i10);
                c0943h.f12168v = 0;
                c0943h.a((int) (j9 - c0943h.f12166t), false);
                if (AbstractC0189a.l(yVar, c0951p, i9, kVar)) {
                    break;
                }
            }
            c0943h.a(1, false);
        }
        if (c0943h.j() >= j7 - 6) {
            c0943h.a((int) (j7 - c0943h.j()), false);
            return c0951p.f12185j;
        }
        return kVar.f3459a;
    }

    @Override // k2.InterfaceC0940e
    public /* synthetic */ void h() {
    }

    public Object i(int i7) {
        SparseArray sparseArray;
        if (this.f324r == -1) {
            this.f324r = 0;
        }
        while (true) {
            int i8 = this.f324r;
            sparseArray = (SparseArray) this.f325s;
            if (i8 <= 0 || i7 >= sparseArray.keyAt(i8)) {
                break;
            }
            this.f324r--;
        }
        while (this.f324r < sparseArray.size() - 1 && i7 >= sparseArray.keyAt(this.f324r + 1)) {
            this.f324r++;
        }
        return sparseArray.valueAt(this.f324r);
    }

    @Override // k2.InterfaceC0940e
    public C0939d j(C0943h c0943h, long j7) {
        long j8 = c0943h.f12166t;
        long g7 = g(c0943h);
        long j9 = c0943h.j();
        c0943h.a(Math.max(6, ((C0951p) this.f325s).f12180c), false);
        long g8 = g(c0943h);
        long j10 = c0943h.j();
        if (g7 <= j7 && g8 > j7) {
            return new C0939d(0, -9223372036854775807L, j9);
        }
        if (g8 <= j7) {
            return new C0939d(-2, g8, j10);
        }
        return new C0939d(-1, g7, j8);
    }

    public boolean k() {
        ColorStateList colorStateList;
        if (((Shader) this.f325s) == null && (colorStateList = (ColorStateList) this.f326t) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void l(C0016q c0016q, int i7, int i8, K k5, int i9, Object obj, long j7, long j8) {
        m(c0016q, new C0020v(i7, i8, k5, i9, obj, H.S(j7), H.S(j8)));
    }

    public void m(C0016q c0016q, C0020v c0020v) {
        Iterator it = ((CopyOnWriteArrayList) this.f326t).iterator();
        while (it.hasNext()) {
            G g7 = (G) it.next();
            H.M(g7.f900a, new C(this, g7.f901b, c0016q, c0020v, 2));
        }
    }

    public void n(C0016q c0016q, int i7, int i8, K k5, int i9, Object obj, long j7, long j8) {
        o(c0016q, new C0020v(i7, i8, k5, i9, obj, H.S(j7), H.S(j8)));
    }

    public void o(C0016q c0016q, C0020v c0020v) {
        Iterator it = ((CopyOnWriteArrayList) this.f326t).iterator();
        while (it.hasNext()) {
            G g7 = (G) it.next();
            H.M(g7.f900a, new C(this, g7.f901b, c0016q, c0020v, 1));
        }
    }

    public void p(C0016q c0016q, int i7, int i8, K k5, int i9, Object obj, long j7, long j8, IOException iOException, boolean z7) {
        q(c0016q, new C0020v(i7, i8, k5, i9, obj, H.S(j7), H.S(j8)), iOException, z7);
    }

    public void q(C0016q c0016q, C0020v c0020v, IOException iOException, boolean z7) {
        Iterator it = ((CopyOnWriteArrayList) this.f326t).iterator();
        while (it.hasNext()) {
            G g7 = (G) it.next();
            H.M(g7.f900a, new F(this, g7.f901b, c0016q, c0020v, iOException, z7, 0));
        }
    }

    public void r(AttributeSet attributeSet, int i7) {
        int resourceId;
        ImageView imageView = (ImageView) this.f325s;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0565a.f9344e;
        g5.b C3 = g5.b.C(context, attributeSet, iArr, i7, 0);
        O.h(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) C3.f10842s, i7);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) C3.f10842s;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = android.support.v4.media.session.b.i0(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0869T.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                P.g.c(imageView, C3.y(2));
            }
            if (typedArray.hasValue(3)) {
                P.g.d(imageView, AbstractC0869T.b(typedArray.getInt(3, -1), null));
            }
            C3.D();
        } catch (Throwable th) {
            C3.D();
            throw th;
        }
    }

    public void s(C0016q c0016q, int i7, int i8, K k5, int i9, Object obj, long j7, long j8) {
        t(c0016q, new C0020v(i7, i8, k5, i9, obj, H.S(j7), H.S(j8)));
    }

    public void t(C0016q c0016q, C0020v c0020v) {
        Iterator it = ((CopyOnWriteArrayList) this.f326t).iterator();
        while (it.hasNext()) {
            G g7 = (G) it.next();
            H.M(g7.f900a, new C(this, g7.f901b, c0016q, c0020v, 0));
        }
    }

    public String toString() {
        String str;
        switch (this.f323q) {
            case 8:
                StringBuilder sb = new StringBuilder();
                if (((h6.A) this.f325s) == h6.A.f11062r) {
                    str = "HTTP/1.0";
                } else {
                    str = "HTTP/1.1";
                }
                sb.append(str);
                sb.append(' ');
                sb.append(this.f324r);
                sb.append(' ');
                sb.append((String) this.f326t);
                String sb2 = sb.toString();
                M5.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(D0.c r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r0 = r6.O(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L17
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            r1 = 1
            goto L18
        L15:
            r6 = move-exception
            goto L6b
        L17:
            r1 = r2
        L18:
            r3 = 0
            p6.l.i(r0, r3)
            java.lang.Object r0 = r5.f326t
            Z5.n r0 = (Z5.n) r0
            r0.getClass()
            Z5.n.p(r6)
            if (r1 != 0) goto L47
            c3.a r1 = Z5.n.B(r6)
            boolean r4 = r1.f7256b
            if (r4 == 0) goto L31
            goto L47
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f7257c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L47:
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r6.j(r1)
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '80b29c854ef709a36e0c4f4addeb24c6')"
            r6.j(r1)
            java.lang.Object r6 = r0.f4918q
            com.boxhdo.android.data.local.AppDatabase_Impl r6 = (com.boxhdo.android.data.local.AppDatabase_Impl) r6
            java.util.List r0 = r6.f7288g
            if (r0 == 0) goto L6a
            int r0 = r0.size()
            if (r0 > 0) goto L60
            goto L6a
        L60:
            java.util.List r6 = r6.f7288g
            java.lang.Object r6 = r6.get(r2)
            com.google.android.gms.internal.measurement.AbstractC0515y1.v(r6)
            throw r3
        L6a:
            return
        L6b:
            throw r6     // Catch: java.lang.Throwable -> L6c
        L6c:
            r1 = move-exception
            p6.l.i(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C.d.v(D0.c):void");
    }

    public void w(D0.c cVar, int i7, int i8) {
        y(cVar, i7, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(D0.c r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.d.x(D0.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x003f A[EDGE_INSN: B:93:0x003f->B:17:0x003f ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(D0.c r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.d.y(D0.c, int, int):void");
    }

    public void z(Object obj, Object obj2) {
        int i7 = (this.f324r + 1) * 2;
        Object[] objArr = (Object[]) this.f325s;
        if (i7 > objArr.length) {
            this.f325s = Arrays.copyOf(objArr, AbstractC0080y.f(objArr.length, i7));
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = (Object[]) this.f325s;
                int i8 = this.f324r;
                int i9 = i8 * 2;
                objArr2[i9] = obj;
                objArr2[i9 + 1] = obj2;
                this.f324r = i8 + 1;
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("null value in entry: ");
            sb.append(valueOf);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
        sb2.append("null key in entry: null=");
        sb2.append(valueOf2);
        throw new NullPointerException(sb2.toString());
    }

    public d(int i7, int i8) {
        this.f323q = i8;
        switch (i8) {
            case 11:
                this.f324r = i7;
                return;
            default:
                this.f325s = new Object[i7 * 2];
                this.f324r = 0;
                return;
        }
    }

    public d(A4.a aVar) {
        this.f323q = 2;
        this.f325s = new SparseArray();
        this.f326t = aVar;
        this.f324r = -1;
    }

    public d(T4.c cVar) {
        this.f323q = 3;
        this.f326t = cVar;
        this.f325s = N3.d.f2493r;
        this.f324r = Integer.MAX_VALUE;
    }

    public d(Shader shader, ColorStateList colorStateList, int i7) {
        this.f323q = 0;
        this.f325s = shader;
        this.f326t = colorStateList;
        this.f324r = i7;
    }

    public d(ImageView imageView) {
        this.f323q = 7;
        this.f324r = 0;
        this.f325s = imageView;
    }

    public /* synthetic */ d(Object obj, int i7, Serializable serializable, int i8) {
        this.f323q = i8;
        this.f325s = obj;
        this.f324r = i7;
        this.f326t = serializable;
    }

    public d(CopyOnWriteArrayList copyOnWriteArrayList, int i7, A a7) {
        this.f323q = 1;
        this.f326t = copyOnWriteArrayList;
        this.f324r = i7;
        this.f325s = a7;
    }

    public d(C0951p c0951p, int i7) {
        this.f323q = 9;
        this.f325s = c0951p;
        this.f324r = i7;
        this.f326t = new Object();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(C1449e c1449e, Z5.n nVar) {
        this(1, 11);
        this.f323q = 11;
        this.f325s = c1449e;
        this.f326t = nVar;
    }

    public void u(D0.c cVar) {
    }
}
