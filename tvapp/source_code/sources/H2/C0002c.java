package H2;

import Y2.InterfaceC0144m;
import Z2.AbstractC0156a;
import Z4.C0164a;
import Z4.C0165b;
import a4.C0209a;
import a4.C0212d;
import a4.C0213e;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0332j;
import c4.C0392a;
import coil.target.GenericViewTarget;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.K1;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import d4.InterfaceC0554a;
import e4.r0;
import g2.C0722m;
import g2.InterfaceC0724o;
import g4.C0736a;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k2.C0943h;
import k2.InterfaceC0946k;
import k2.InterfaceC0948m;
import k2.InterfaceC0949n;
import k3.AbstractC0958a;
import l0.AbstractC0966b;
import l0.C0965a;
import l0.C0967c;
import r0.AbstractC1111a;
import u3.AbstractC1272a;
import z5.C1530l;
/* renamed from: H2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c implements O.g, R0.e, M2.h, InterfaceC0554a {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f1016q;

    /* renamed from: r  reason: collision with root package name */
    public Object f1017r;

    /* renamed from: s  reason: collision with root package name */
    public Object f1018s;

    /* renamed from: t  reason: collision with root package name */
    public Object f1019t;

    public C0002c() {
        this.f1016q = 22;
        this.f1017r = new androidx.leanback.widget.D(1);
        androidx.leanback.widget.D d = new androidx.leanback.widget.D(0);
        this.f1018s = d;
        this.f1019t = d;
    }

    public static boolean G(S0.g gVar, Bitmap.Config config) {
        if (!p6.d.q(config)) {
            return true;
        }
        if (!gVar.f3029p) {
            return false;
        }
        GenericViewTarget genericViewTarget = gVar.f3019c;
        if (genericViewTarget instanceof GenericViewTarget) {
            ImageView k5 = genericViewTarget.k();
            if (k5.isAttachedToWindow() && !k5.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public static final C0002c J(S3.f fVar, S3.a aVar) {
        byte[] bArr = new byte[0];
        InputStream inputStream = (InputStream) fVar.f3145b;
        try {
            e4.N D6 = e4.N.D(inputStream, C0536n.a());
            inputStream.close();
            if (D6.B().size() != 0) {
                try {
                    e4.g0 H6 = e4.g0.H(aVar.b(D6.B().l(), bArr), C0536n.a());
                    if (H6.C() > 0) {
                        return w(H6);
                    }
                    throw new GeneralSecurityException("empty keyset");
                } catch (com.google.crypto.tink.shaded.protobuf.B unused) {
                    throw new GeneralSecurityException("invalid keyset, corrupted key material");
                }
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public static final void i(C0002c c0002c, Network network, boolean z7) {
        Network[] allNetworks;
        C1530l c1530l;
        boolean z8 = false;
        for (Network network2 : ((ConnectivityManager) c0002c.f1017r).getAllNetworks()) {
            if (M5.g.a(network2, network)) {
                if (z7) {
                    z8 = true;
                    break;
                }
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) c0002c.f1017r).getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z8 = true;
                    break;
                }
            }
        }
        X0.l lVar = (X0.l) c0002c.f1018s;
        if (((J0.j) lVar.f4076r.get()) != null) {
            lVar.f4078t = z8;
            c1530l = C1530l.f16479a;
        } else {
            c1530l = null;
        }
        if (c1530l == null) {
            lVar.a();
        }
    }

    public static final URL j(C0002c c0002c) {
        c0002c.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) c0002c.f1019t).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C0165b c0165b = (C0165b) c0002c.f1017r;
        Uri.Builder appendPath2 = appendPath.appendPath(c0165b.f4808a).appendPath("settings");
        C0164a c0164a = c0165b.d;
        return new URL(appendPath2.appendQueryParameter("build_version", c0164a.f4806c).appendQueryParameter("display_version", c0164a.f4805b).build().toString());
    }

    public static boolean s(Editable editable, KeyEvent keyEvent, boolean z7) {
        androidx.emoji2.text.t[] tVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (tVarArr = (androidx.emoji2.text.t[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.t.class)) != null && tVarArr.length > 0) {
            for (androidx.emoji2.text.t tVar : tVarArr) {
                int spanStart = editable.getSpanStart(tVar);
                int spanEnd = editable.getSpanEnd(tVar);
                if ((z7 && spanStart == selectionStart) || ((!z7 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static S0.c v(S0.g r4, java.lang.Throwable r5) {
        /*
            S0.c r0 = new S0.c
            boolean r1 = r5 instanceof S0.j
            if (r1 == 0) goto L14
            S0.a r1 = r4.f3011H
            android.graphics.drawable.Drawable r1 = r1.f2948l
            android.graphics.drawable.Drawable r2 = r4.F
            java.lang.Integer r3 = r4.f3009E
            android.graphics.drawable.Drawable r1 = X0.c.b(r4, r2, r3, r1)
            if (r1 != 0) goto L20
        L14:
            S0.a r1 = r4.f3011H
            android.graphics.drawable.Drawable r1 = r1.f2947k
            android.graphics.drawable.Drawable r2 = r4.f3008D
            java.lang.Integer r3 = r4.f3007C
            android.graphics.drawable.Drawable r1 = X0.c.b(r4, r2, r3, r1)
        L20:
            r0.<init>(r1, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.C0002c.v(S0.g, java.lang.Throwable):S0.c");
    }

    public static final C0002c w(e4.g0 g0Var) {
        Integer valueOf;
        if (g0Var.C() > 0) {
            ArrayList arrayList = new ArrayList(g0Var.C());
            for (e4.f0 f0Var : g0Var.D()) {
                f0Var.getClass();
                int E4 = f0Var.E();
                if (f0Var.F() == r0.f10139u) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(E4);
                }
                try {
                    try {
                        S3.b a7 = Z3.j.f4712b.a(Z3.q.a(f0Var.D().E(), f0Var.D().F(), f0Var.D().D(), f0Var.F(), valueOf));
                        int ordinal = f0Var.G().ordinal();
                        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                        arrayList.add(new S3.h(a7));
                    } catch (GeneralSecurityException unused) {
                        arrayList.add(null);
                    }
                } catch (GeneralSecurityException e3) {
                    throw new RuntimeException("Creating a protokey serialization failed", e3);
                }
            }
            return new C0002c(g0Var, Collections.unmodifiableList(arrayList));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(java.lang.Class r15) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.C0002c.A(java.lang.Class):java.lang.Object");
    }

    public List B(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f1017r).get(new S3.l(bArr));
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public boolean C(CharSequence charSequence, int i7, int i8, androidx.emoji2.text.m mVar) {
        int i9;
        if (mVar.f5852c == 0) {
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f1019t;
            Z.a c5 = mVar.c();
            int a7 = c5.a(8);
            if (a7 != 0) {
                ((ByteBuffer) c5.f295t).getShort(a7 + c5.f292q);
            }
            androidx.emoji2.text.c cVar = (androidx.emoji2.text.c) gVar;
            cVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.c.f5831b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i7 < i8) {
                sb.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = cVar.f5832a;
            String sb2 = sb.toString();
            int i10 = D.f.f432a;
            if (D.e.a(textPaint, sb2)) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            mVar.f5852c = i9;
        }
        if (mVar.f5852c == 2) {
            return true;
        }
        return false;
    }

    @Override // R0.e
    public boolean D() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1017r;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public boolean E() {
        String trim;
        if (((String) this.f1019t) != null) {
            return true;
        }
        Queue queue = (Queue) this.f1018s;
        if (!queue.isEmpty()) {
            String str = (String) queue.poll();
            str.getClass();
            this.f1019t = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f1017r).readLine();
            this.f1019t = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.f1019t = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    public void F(InterfaceC0144m interfaceC0144m, Uri uri, Map map, long j7, long j8, InterfaceC0948m interfaceC0948m) {
        boolean z7;
        boolean z8 = true;
        C0943h c0943h = new C0943h(interfaceC0144m, j7, j8);
        this.f1019t = c0943h;
        if (((InterfaceC0946k) this.f1018s) != null) {
            return;
        }
        InterfaceC0946k[] a7 = ((InterfaceC0949n) this.f1017r).a(uri, map);
        if (a7.length == 1) {
            this.f1018s = a7[0];
        } else {
            int length = a7.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                InterfaceC0946k interfaceC0946k = a7[i7];
                try {
                } catch (EOFException unused) {
                    if (((InterfaceC0946k) this.f1018s) == null && c0943h.f12166t != j7) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                } catch (Throwable th) {
                    if (((InterfaceC0946k) this.f1018s) == null && c0943h.f12166t != j7) {
                        z8 = false;
                    }
                    AbstractC0156a.k(z8);
                    c0943h.f12168v = 0;
                    throw th;
                }
                if (interfaceC0946k.j(c0943h)) {
                    this.f1018s = interfaceC0946k;
                    c0943h.f12168v = 0;
                    break;
                }
                if (((InterfaceC0946k) this.f1018s) == null && c0943h.f12166t != j7) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                AbstractC0156a.k(z7);
                c0943h.f12168v = 0;
                i7++;
            }
            if (((InterfaceC0946k) this.f1018s) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i8 = Z2.H.f4603a;
                StringBuilder sb2 = new StringBuilder();
                for (int i9 = 0; i9 < a7.length; i9++) {
                    sb2.append(a7[i9].getClass().getSimpleName());
                    if (i9 < a7.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String sb3 = sb.toString();
                uri.getClass();
                throw new e2.m0(sb3, null, false, 1);
            }
        }
        ((InterfaceC0946k) this.f1018s).e(interfaceC0948m);
    }

    public String H() {
        if (E()) {
            String str = (String) this.f1019t;
            this.f1019t = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public S0.k I(S0.g gVar, T0.f fVar) {
        Bitmap.Config config;
        int i7;
        int i8;
        boolean z7;
        if ((gVar.f3025k.isEmpty() || A5.j.N(X0.e.f4059a, gVar.f3021g)) && (!p6.d.q(gVar.f3021g) || (G(gVar, gVar.f3021g) && ((X0.h) this.f1019t).a(fVar)))) {
            config = gVar.f3021g;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config2 = config;
        if (((X0.l) this.f1018s).f4078t) {
            i7 = gVar.f3015L;
        } else {
            i7 = 4;
        }
        int i9 = i7;
        h4.b bVar = fVar.f3207a;
        T0.b bVar2 = T0.b.f3201a;
        if (!M5.g.a(bVar, bVar2) && !M5.g.a(fVar.f3208b, bVar2)) {
            i8 = gVar.f3016M;
        } else {
            i8 = 2;
        }
        int i10 = i8;
        if (gVar.f3030q && gVar.f3025k.isEmpty() && config2 != Bitmap.Config.ALPHA_8) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new S0.k(gVar.f3017a, config2, gVar.f3022h, fVar, i10, X0.c.a(gVar), z7, gVar.f3031r, gVar.f, gVar.f3027m, gVar.n, gVar.f3038y, gVar.f3013J, gVar.f3014K, i9);
    }

    public void K(String str) {
        if (str != null) {
            this.f1017r = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void L(String[] strArr, int[] iArr, int[] iArr2) {
        ((String[][]) this.f1017r)[1] = strArr;
        ((int[][]) this.f1018s)[1] = iArr;
        ((int[][]) this.f1019t)[1] = iArr2;
    }

    public void M(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 * 8)));
        }
        this.f1017r = Integer.valueOf(i7);
    }

    public void N(Q1.c cVar) {
        if (cVar != null) {
            this.f1019t = cVar;
            return;
        }
        throw new NullPointerException("Null priority");
    }

    public void O(int i7) {
        if (i7 >= 10 && 16 >= i7) {
            this.f1018s = Integer.valueOf(i7);
            return;
        }
        throw new GeneralSecurityException(AbstractC0515y1.l("Invalid tag size for AesCmacParameters: ", i7));
    }

    @Override // M2.h
    public int a(long j7) {
        long[] jArr = (long[]) this.f1019t;
        int b7 = Z2.H.b(jArr, j7, false);
        if (b7 >= jArr.length) {
            return -1;
        }
        return b7;
    }

    @Override // O.g
    public Uri c() {
        return (Uri) this.f1019t;
    }

    @Override // d4.InterfaceC0554a
    public byte[] d(int i7, byte[] bArr) {
        byte[] L6;
        if (i7 <= 16) {
            if (AbstractC1111a.e(1)) {
                Cipher cipher = (Cipher) f4.i.f10422b.f10424a.a("AES/ECB/NoPadding");
                cipher.init(1, (SecretKeySpec) this.f1017r);
                int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
                if (max * 16 == bArr.length) {
                    L6 = AbstractC0958a.K((max - 1) * 16, 0, 16, bArr, (byte[]) this.f1018s);
                } else {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
                    if (copyOfRange.length < 16) {
                        byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                        copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                        L6 = AbstractC0958a.L(copyOf, (byte[]) this.f1019t);
                    } else {
                        throw new IllegalArgumentException("x must be smaller than a block.");
                    }
                }
                byte[] bArr2 = new byte[16];
                for (int i8 = 0; i8 < max - 1; i8++) {
                    bArr2 = cipher.doFinal(AbstractC0958a.K(0, i8 * 16, 16, bArr2, bArr));
                }
                return Arrays.copyOf(cipher.doFinal(AbstractC0958a.L(L6, bArr2)), i7);
            }
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    @Override // O.g
    public ClipDescription e() {
        return (ClipDescription) this.f1018s;
    }

    @Override // O.g
    public Object f() {
        return null;
    }

    @Override // O.g
    public Uri g() {
        return (Uri) this.f1017r;
    }

    @Override // M2.h
    public List h(long j7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = (List) this.f1017r;
            if (i7 >= list.size()) {
                break;
            }
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f1018s;
            if (jArr[i8] <= j7 && j7 < jArr[i8 + 1]) {
                V2.c cVar = (V2.c) list.get(i7);
                M2.b bVar = cVar.f3629a;
                if (bVar.f2247u == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new H.b(3));
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            M2.a a7 = ((V2.c) arrayList2.get(i9)).f3629a.a();
            a7.f2208e = (-1) - i9;
            a7.f = 1;
            arrayList.add(a7.a());
        }
        return arrayList;
    }

    @Override // M2.h
    public long k(int i7) {
        boolean z7;
        boolean z8 = false;
        if (i7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        long[] jArr = (long[]) this.f1019t;
        if (i7 < jArr.length) {
            z8 = true;
        }
        AbstractC0156a.f(z8);
        return jArr[i7];
    }

    public T1.i l() {
        String str;
        if (((String) this.f1017r) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((Q1.c) this.f1019t) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new T1.i((String) this.f1017r, (byte[]) this.f1018s, (Q1.c) this.f1019t);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, T3.i] */
    public T3.i m() {
        Z5.n nVar;
        T3.k kVar = (T3.k) this.f1017r;
        if (kVar != null && (nVar = (Z5.n) this.f1018s) != null) {
            if (kVar.f3350b == ((C0736a) nVar.f4918q).f10837a.length) {
                T3.j jVar = T3.j.f3337e;
                T3.j jVar2 = kVar.f3352e;
                if (jVar2 != jVar && ((Integer) this.f1019t) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (jVar2 != jVar || ((Integer) this.f1019t) == null) {
                    if (jVar2 == jVar) {
                        C0736a.a(new byte[0]);
                    } else if (jVar2 == T3.j.d) {
                        C0736a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f1019t).intValue()).array());
                    } else if (jVar2 == T3.j.f3336c) {
                        C0736a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f1019t).intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((T3.k) this.f1017r).f3352e);
                    }
                    return new Object();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T3.m, java.lang.Object] */
    public T3.m n() {
        Z5.n nVar;
        T3.n nVar2 = (T3.n) this.f1017r;
        if (nVar2 != null && (nVar = (Z5.n) this.f1018s) != null) {
            if (nVar2.f3356b == ((C0736a) nVar.f4918q).f10837a.length) {
                T3.j jVar = T3.j.f3339h;
                T3.j jVar2 = nVar2.f3358e;
                if (jVar2 != jVar && ((Integer) this.f1019t) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (jVar2 != jVar || ((Integer) this.f1019t) == null) {
                    if (jVar2 == jVar) {
                        C0736a.a(new byte[0]);
                    } else if (jVar2 == T3.j.f3338g) {
                        C0736a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f1019t).intValue()).array());
                    } else if (jVar2 == T3.j.f) {
                        C0736a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f1019t).intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((T3.n) this.f1017r).f3358e);
                    }
                    return new Object();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T3.p, java.lang.Object] */
    public T3.p o() {
        Z5.n nVar;
        T3.q qVar = (T3.q) this.f1017r;
        if (qVar != null && (nVar = (Z5.n) this.f1018s) != null) {
            if (qVar.f3362b == ((C0736a) nVar.f4918q).f10837a.length) {
                T3.j jVar = T3.j.f3342k;
                T3.j jVar2 = qVar.f3363c;
                if (jVar2 != jVar && ((Integer) this.f1019t) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (jVar2 != jVar || ((Integer) this.f1019t) == null) {
                    if (jVar2 == jVar) {
                        C0736a.a(new byte[0]);
                    } else if (jVar2 == T3.j.f3341j) {
                        C0736a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f1019t).intValue()).array());
                    } else if (jVar2 == T3.j.f3340i) {
                        C0736a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f1019t).intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((T3.q) this.f1017r).f3363c);
                    }
                    return new Object();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public C0209a p() {
        Z5.n nVar;
        C0736a a7;
        C0213e c0213e = (C0213e) this.f1017r;
        if (c0213e != null && (nVar = (Z5.n) this.f1018s) != null) {
            if (c0213e.f5157b == ((C0736a) nVar.f4918q).f10837a.length) {
                C0212d c0212d = C0212d.f;
                C0212d c0212d2 = c0213e.d;
                if (c0212d2 != c0212d && ((Integer) this.f1019t) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (c0212d2 != c0212d || ((Integer) this.f1019t) == null) {
                    if (c0212d2 == c0212d) {
                        a7 = C0736a.a(new byte[0]);
                    } else if (c0212d2 != C0212d.f5146e && c0212d2 != C0212d.d) {
                        if (c0212d2 == C0212d.f5145c) {
                            a7 = C0736a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f1019t).intValue()).array());
                        } else {
                            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((C0213e) this.f1017r).d);
                        }
                    } else {
                        a7 = C0736a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f1019t).intValue()).array());
                    }
                    return new C0209a((C0213e) this.f1017r, a7);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public C0213e q() {
        Integer num = (Integer) this.f1017r;
        if (num != null) {
            if (((Integer) this.f1018s) != null) {
                if (((C0212d) this.f1019t) != null) {
                    return new C0213e(num.intValue(), ((Integer) this.f1018s).intValue(), (C0212d) this.f1019t);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    public a4.k r() {
        Z5.n nVar;
        C0736a a7;
        a4.l lVar = (a4.l) this.f1017r;
        if (lVar != null && (nVar = (Z5.n) this.f1018s) != null) {
            if (lVar.f5166b == ((C0736a) nVar.f4918q).f10837a.length) {
                C0212d c0212d = C0212d.f5154o;
                C0212d c0212d2 = lVar.d;
                if (c0212d2 != c0212d && ((Integer) this.f1019t) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (c0212d2 != c0212d || ((Integer) this.f1019t) == null) {
                    if (c0212d2 == c0212d) {
                        a7 = C0736a.a(new byte[0]);
                    } else if (c0212d2 != C0212d.n && c0212d2 != C0212d.f5153m) {
                        if (c0212d2 == C0212d.f5152l) {
                            a7 = C0736a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f1019t).intValue()).array());
                        } else {
                            throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((a4.l) this.f1017r).d);
                        }
                    } else {
                        a7 = C0736a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f1019t).intValue()).array());
                    }
                    return new a4.k((a4.l) this.f1017r, a7);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    @Override // R0.e
    public void shutdown() {
        ((ConnectivityManager) this.f1017r).unregisterNetworkCallback((R0.f) this.f1019t);
    }

    public void t(W1.a aVar, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.f1017r;
        J4.e eVar = new J4.e(byteArrayOutputStream, map, (Map) this.f1018s, (G4.d) this.f1019t);
        G4.d dVar = (G4.d) map.get(W1.a.class);
        if (dVar != null) {
            dVar.a(aVar, eVar);
            return;
        }
        throw new RuntimeException("No encoder for " + W1.a.class);
    }

    public String toString() {
        switch (this.f1016q) {
            case 5:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f1017r);
                sb.append('{');
                K1 k12 = (K1) ((K1) this.f1018s).f8368s;
                String str = "";
                while (k12 != null) {
                    Object obj = k12.f8367r;
                    sb.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    k12 = (K1) k12.f8368s;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 10:
                return S3.o.a((e4.g0) this.f1017r).toString();
            default:
                return super.toString();
        }
    }

    @Override // M2.h
    public int u() {
        return ((long[]) this.f1019t).length;
    }

    public androidx.lifecycle.V x(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return y(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public androidx.lifecycle.V y(Class cls, String str) {
        androidx.lifecycle.V a7;
        androidx.lifecycle.a0 a0Var;
        M5.g.f(str, "key");
        androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) this.f1017r;
        b0Var.getClass();
        LinkedHashMap linkedHashMap = b0Var.f6808a;
        androidx.lifecycle.V v5 = (androidx.lifecycle.V) linkedHashMap.get(str);
        boolean isInstance = cls.isInstance(v5);
        androidx.lifecycle.Y y3 = (androidx.lifecycle.Y) this.f1018s;
        if (isInstance) {
            if (y3 instanceof androidx.lifecycle.a0) {
                a0Var = (androidx.lifecycle.a0) y3;
            } else {
                a0Var = null;
            }
            if (a0Var != null) {
                M5.g.c(v5);
                a0Var.c(v5);
            }
            M5.g.d(v5, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return v5;
        }
        C0967c c0967c = new C0967c((AbstractC0966b) this.f1019t);
        c0967c.f12233a.put(androidx.lifecycle.W.f6802b, str);
        try {
            a7 = y3.b(cls, c0967c);
        } catch (AbstractMethodError unused) {
            a7 = y3.a(cls);
        }
        M5.g.f(a7, "viewModel");
        androidx.lifecycle.V v7 = (androidx.lifecycle.V) linkedHashMap.put(str, a7);
        if (v7 != null) {
            v7.b();
        }
        return a7;
    }

    public long z() {
        C0943h c0943h = (C0943h) this.f1019t;
        if (c0943h != null) {
            return c0943h.f12166t;
        }
        return -1L;
    }

    public C0002c(int i7) {
        this.f1016q = 20;
        this.f1017r = new String[i7];
        this.f1018s = new int[i7];
        this.f1019t = new int[i7];
    }

    public /* synthetic */ C0002c(int i7, byte b7) {
        this.f1016q = i7;
    }

    public C0002c(C4.b bVar, L4.f fVar, androidx.emoji2.text.c cVar) {
        this.f1016q = 21;
        this.f1017r = fVar;
        this.f1018s = bVar;
        this.f1019t = cVar;
    }

    public C0002c(J0.j jVar, X0.l lVar) {
        Object jVar2;
        this.f1016q = 9;
        this.f1017r = jVar;
        this.f1018s = lVar;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            boolean z7 = X0.a.f4052a;
        } else if (!X0.a.f4052a) {
            jVar2 = (i7 == 26 || i7 == 27) ? new Object() : new X0.j(true);
            this.f1019t = jVar2;
        }
        jVar2 = new X0.j(false);
        this.f1019t = jVar2;
    }

    public C0002c(C0165b c0165b, D5.i iVar) {
        this.f1016q = 24;
        this.f1017r = c0165b;
        this.f1018s = iVar;
        this.f1019t = "firebase-settings.crashlytics.com";
    }

    public C0002c(Context context, int i7) {
        this.f1016q = i7;
        switch (i7) {
            case 25:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0958a.E(R.attr.materialCalendarStyle, context, com.google.android.material.datepicker.j.class.getCanonicalName()), AbstractC1272a.f14957l);
                com.google.android.material.datepicker.c.e(context, obtainStyledAttributes.getResourceId(3, 0));
                this.f1019t = com.google.android.material.datepicker.c.e(context, obtainStyledAttributes.getResourceId(1, 0));
                com.google.android.material.datepicker.c.e(context, obtainStyledAttributes.getResourceId(2, 0));
                com.google.android.material.datepicker.c.e(context, obtainStyledAttributes.getResourceId(4, 0));
                ColorStateList p3 = m3.g.p(context, obtainStyledAttributes, 6);
                this.f1017r = com.google.android.material.datepicker.c.e(context, obtainStyledAttributes.getResourceId(8, 0));
                com.google.android.material.datepicker.c.e(context, obtainStyledAttributes.getResourceId(7, 0));
                this.f1018s = com.google.android.material.datepicker.c.e(context, obtainStyledAttributes.getResourceId(9, 0));
                new Paint().setColor(p3.getDefaultColor());
                obtainStyledAttributes.recycle();
                return;
            default:
                this.f1017r = context.getApplicationContext();
                this.f1018s = X0.c.f4057a;
                this.f1019t = new X0.i();
                return;
        }
    }

    public C0002c(ConnectivityManager connectivityManager, X0.l lVar) {
        this.f1016q = 7;
        this.f1017r = connectivityManager;
        this.f1018s = lVar;
        R0.f fVar = new R0.f(this);
        this.f1019t = fVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), fVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0002c(androidx.lifecycle.b0 b0Var, androidx.lifecycle.Y y3) {
        this(b0Var, y3, 0);
        this.f1016q = 23;
        M5.g.f(b0Var, "store");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0002c(androidx.lifecycle.b0 b0Var, androidx.lifecycle.Y y3, int i7) {
        this(b0Var, y3, C0965a.f12232b);
        this.f1016q = 23;
    }

    public C0002c(androidx.lifecycle.b0 b0Var, androidx.lifecycle.Y y3, AbstractC0966b abstractC0966b) {
        this.f1016q = 23;
        M5.g.f(b0Var, "store");
        M5.g.f(y3, "factory");
        M5.g.f(abstractC0966b, "defaultCreationExtras");
        this.f1017r = b0Var;
        this.f1018s = y3;
        this.f1019t = abstractC0966b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0002c(androidx.lifecycle.c0 c0Var, androidx.lifecycle.Y y3) {
        this(c0Var.p(), y3, c0Var instanceof InterfaceC0332j ? ((InterfaceC0332j) c0Var).a() : C0965a.f12232b);
        this.f1016q = 23;
        M5.g.f(c0Var, "owner");
    }

    public C0002c(e4.g0 g0Var, List list) {
        this.f1016q = 10;
        this.f1017r = g0Var;
        this.f1018s = list;
        this.f1019t = C0392a.f7269b;
    }

    public C0002c(g2.K k5) {
        this.f1016q = 29;
        this.f1019t = k5;
        this.f1017r = new Handler(Looper.myLooper());
        this.f1018s = new g2.J(this);
    }

    public /* synthetic */ C0002c(Object obj, Object obj2, Object obj3, int i7) {
        this.f1016q = i7;
        this.f1017r = obj;
        this.f1018s = obj2;
        this.f1019t = obj3;
    }

    public C0002c(Runnable runnable) {
        this.f1016q = 3;
        this.f1018s = new CopyOnWriteArrayList();
        this.f1019t = new HashMap();
        this.f1017r = runnable;
    }

    public C0002c(String str) {
        this.f1016q = 5;
        K1 k12 = new K1(12, false);
        this.f1018s = k12;
        this.f1019t = k12;
        this.f1017r = str;
    }

    public C0002c(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f1016q = 4;
        this.f1018s = arrayDeque;
        this.f1017r = bufferedReader;
    }

    public C0002c(ArrayList arrayList) {
        this.f1016q = 16;
        this.f1017r = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f1018s = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            V2.c cVar = (V2.c) arrayList.get(i7);
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f1018s;
            jArr[i8] = cVar.f3630b;
            jArr[i8 + 1] = cVar.f3631c;
        }
        long[] jArr2 = (long[]) this.f1018s;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f1019t = copyOf;
        Arrays.sort(copyOf);
    }

    public C0002c(ConcurrentMap concurrentMap, S3.k kVar, C0392a c0392a, Class cls) {
        this.f1016q = 11;
        this.f1017r = concurrentMap;
        this.f1018s = kVar;
        this.f1019t = c0392a;
    }

    public C0002c(InterfaceC0949n interfaceC0949n) {
        this.f1016q = 0;
        this.f1017r = interfaceC0949n;
    }

    public C0002c(byte[] bArr) {
        this.f1016q = 27;
        f4.o.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f1017r = secretKeySpec;
        if (AbstractC1111a.e(1)) {
            Cipher cipher = (Cipher) f4.i.f10422b.f10424a.a("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] o7 = p6.l.o(cipher.doFinal(new byte[16]));
            this.f1018s = o7;
            this.f1019t = p6.l.o(o7);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, g2.T] */
    public C0002c(InterfaceC0724o[] interfaceC0724oArr) {
        this.f1016q = 28;
        g2.Q q5 = new g2.Q();
        ?? obj = new Object();
        obj.f10643c = 1.0f;
        obj.d = 1.0f;
        C0722m c0722m = C0722m.f10702e;
        obj.f10644e = c0722m;
        obj.f = c0722m;
        obj.f10645g = c0722m;
        obj.f10646h = c0722m;
        ByteBuffer byteBuffer = InterfaceC0724o.f10706a;
        obj.f10649k = byteBuffer;
        obj.f10650l = byteBuffer.asShortBuffer();
        obj.f10651m = byteBuffer;
        obj.f10642b = -1;
        InterfaceC0724o[] interfaceC0724oArr2 = new InterfaceC0724o[interfaceC0724oArr.length + 2];
        this.f1017r = interfaceC0724oArr2;
        System.arraycopy(interfaceC0724oArr, 0, interfaceC0724oArr2, 0, interfaceC0724oArr.length);
        this.f1018s = q5;
        this.f1019t = obj;
        interfaceC0724oArr2[interfaceC0724oArr.length] = q5;
        interfaceC0724oArr2[interfaceC0724oArr.length + 1] = obj;
    }

    @Override // O.g
    public void b() {
    }
}
