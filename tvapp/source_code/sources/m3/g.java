package m3;

import J3.u;
import T1.r;
import W5.AbstractC0117y;
import W5.G;
import W5.q0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.transition.Scene;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import e2.X;
import g3.n;
import h6.q;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.C0852F;
import l4.ExecutorC0976d;
import n0.M;
import n0.O;
import o4.C1069a;
import t3.AbstractC1245i;
import t3.C1246j;
import t3.C1251o;
import t3.RunnableC1249m;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static ClassLoader f12429a;

    /* renamed from: b  reason: collision with root package name */
    public static Thread f12430b;

    public static void A(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static void B(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Animator animator = (Animator) arrayList.get(i7);
            j7 = Math.max(j7, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j7);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static X.b C(String str, T4.c cVar) {
        X.a aVar = X.a.f4046r;
        d6.c cVar2 = G.f3946b;
        q0 b7 = AbstractC0117y.b();
        cVar2.getClass();
        b6.e a7 = AbstractC0117y.a(p6.d.A(cVar2, b7));
        M5.g.f(str, "name");
        return new X.b(str, cVar, aVar, a7);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [B5.e, Z.b] */
    public static Z.b D(MappedByteBuffer mappedByteBuffer) {
        long j7;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i7 = duplicate.getShort() & 65535;
        if (i7 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    int i9 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j7 = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i9) {
                        break;
                    }
                    i8++;
                } else {
                    j7 = -1;
                    break;
                }
            }
            if (j7 != -1) {
                duplicate.position(duplicate.position() + ((int) (j7 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j8 = duplicate.getInt() & 4294967295L;
                for (int i10 = 0; i10 < j8; i10++) {
                    int i11 = duplicate.getInt();
                    long j9 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i11 || 1701669481 == i11) {
                        duplicate.position((int) (j9 + j7));
                        ?? eVar = new B5.e(2);
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        eVar.f295t = duplicate;
                        eVar.f292q = position;
                        int i12 = position - duplicate.getInt(position);
                        eVar.f293r = i12;
                        eVar.f294s = ((ByteBuffer) eVar.f295t).getShort(i12);
                        return eVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void E(M2.a aVar) {
        Object[] spans;
        aVar.f2213k = -3.4028235E38f;
        aVar.f2212j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f2205a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f2205a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f2205a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float F(float f, int i7, int i8, int i9) {
        float f7;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f7 = i8;
        } else {
            f7 = i9;
        }
        return f * f7;
    }

    public static C1251o G(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C1251o) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            C1251o c1251o = new C1251o();
            C1246j c1246j = new C1246j(list.size(), c1251o);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1251o c1251o2 = (C1251o) it2.next();
                ExecutorC0976d executorC0976d = AbstractC1245i.f14575b;
                c1251o2.c(executorC0976d, c1246j);
                c1251o2.b(executorC0976d, c1246j);
                c1251o2.a(executorC0976d, c1246j);
            }
            return c1251o;
        }
        return m(null);
    }

    public static C1251o H(C1251o... c1251oArr) {
        if (c1251oArr.length == 0) {
            return m(Collections.emptyList());
        }
        List asList = Arrays.asList(c1251oArr);
        r rVar = AbstractC1245i.f14574a;
        if (asList != null && !asList.isEmpty()) {
            List list = asList;
            return G(list).e(rVar, new C0852F(20, list));
        }
        return m(Collections.emptyList());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader I() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.g.I():java.lang.ClassLoader");
    }

    public static Object J(C1251o c1251o) {
        if (c1251o.i()) {
            return c1251o.g();
        }
        if (c1251o.d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c1251o.f());
    }

    public static Object a(C1251o c1251o) {
        n.f("Must not be called on the main application thread");
        n.e();
        if (c1251o.h()) {
            return J(c1251o);
        }
        V4.d dVar = new V4.d(1);
        Executor executor = AbstractC1245i.f14575b;
        c1251o.c(executor, dVar);
        c1251o.b(executor, dVar);
        c1251o.a(executor, dVar);
        dVar.f3668r.await();
        return J(c1251o);
    }

    public static Object b(C1251o c1251o, TimeUnit timeUnit) {
        n.f("Must not be called on the main application thread");
        n.e();
        n.h(c1251o, "Task must not be null");
        n.h(timeUnit, "TimeUnit must not be null");
        if (c1251o.h()) {
            return J(c1251o);
        }
        V4.d dVar = new V4.d(1);
        Executor executor = AbstractC1245i.f14575b;
        c1251o.c(executor, dVar);
        c1251o.b(executor, dVar);
        c1251o.a(executor, dVar);
        if (dVar.f3668r.await(30000L, timeUnit)) {
            return J(c1251o);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static B5.b c(B5.b bVar) {
        if (bVar.f287u == null) {
            bVar.n();
            bVar.f286t = true;
            if (bVar.f285s <= 0) {
                return B5.b.f282w;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i7])));
        }
        return sb.toString();
    }

    public static C1251o e(Executor executor, Callable callable) {
        n.h(executor, "Executor must not be null");
        C1251o c1251o = new C1251o();
        executor.execute(new RunnableC1249m(c1251o, callable, 1, false));
        return c1251o;
    }

    public static h6.r f(h6.r rVar, h6.r rVar2) {
        q qVar = new q(0);
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            String f = rVar.f(i7);
            String h7 = rVar.h(i7);
            if ((!U5.n.W("Warning", f) || !U5.n.b0(h7, "1", false)) && (U5.n.W("Content-Length", f) || U5.n.W("Content-Encoding", f) || U5.n.W("Content-Type", f) || !w(f) || rVar2.b(f) == null)) {
                qVar.a(f, h7);
            }
        }
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            String f7 = rVar2.f(i8);
            if (!U5.n.W("Content-Length", f7) && !U5.n.W("Content-Encoding", f7) && !U5.n.W("Content-Type", f7) && w(f7)) {
                qVar.a(f7, rVar2.h(i8));
            }
        }
        return qVar.c();
    }

    public static long[] g(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i7 = 0; i7 < iArr.length; i7++) {
                jArr[i7] = iArr[i7];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static C1069a h(String str, String str2) {
        T4.a aVar = new T4.a(str, str2);
        X a7 = C1069a.a(T4.a.class);
        a7.f9778c = 1;
        a7.f = new f2.c(aVar);
        return a7.c();
    }

    public static Scene i(ViewGroup viewGroup, Runnable runnable) {
        Scene scene = new Scene(viewGroup);
        scene.setEnterAction(runnable);
        return scene;
    }

    public static byte[] j(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = i7 * 2;
                int digit = Character.digit(str.charAt(i8), 16);
                int digit2 = Character.digit(str.charAt(i8 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i7] = (byte) ((digit * 16) + digit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static String k(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            int i7 = b7 & 255;
            sb.append("0123456789abcdef".charAt(i7 / 16));
            sb.append("0123456789abcdef".charAt(i7 % 16));
        }
        return sb.toString();
    }

    public static C1251o l(Exception exc) {
        C1251o c1251o = new C1251o();
        c1251o.k(exc);
        return c1251o;
    }

    public static C1251o m(Object obj) {
        C1251o c1251o = new C1251o();
        c1251o.l(obj);
        return c1251o;
    }

    public static C1069a n(String str, f2.d dVar) {
        X a7 = C1069a.a(T4.a.class);
        a7.f9778c = 1;
        a7.b(o4.g.a(Context.class));
        a7.f = new T4.d(str, 0, dVar);
        return a7.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h6.p o(javax.net.ssl.SSLSession r6) {
        /*
            A5.t r0 = A5.t.f135q
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L7d
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = M5.g.a(r1, r2)
            if (r2 != 0) goto L71
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = M5.g.a(r1, r2)
            if (r2 != 0) goto L71
            h6.n r2 = h6.C0760j.f11150b
            h6.j r1 = r2.c(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L65
            java.lang.String r3 = "NONE"
            boolean r3 = M5.g.a(r3, r2)
            if (r3 != 0) goto L5d
            h6.K r2 = a.AbstractC0189a.s(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L40
            if (r3 == 0) goto L40
            int r4 = r3.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L40
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L40
            java.util.List r3 = i6.b.l(r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L40
            goto L41
        L40:
            r3 = r0
        L41:
            h6.p r4 = new h6.p
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L52
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.util.List r0 = i6.b.l(r6)
        L52:
            D0.h r6 = new D0.h
            r5 = 8
            r6.<init>(r5, r3)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L5d:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L65:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L71:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = M5.g.k(r1, r0)
            r6.<init>(r0)
            throw r6
        L7d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.g.o(javax.net.ssl.SSLSession):h6.p");
    }

    public static ColorStateList p(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        ColorStateList h02;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0 && (h02 = android.support.v4.media.session.b.h0(context, resourceId)) != null) {
            return h02;
        }
        return typedArray.getColorStateList(i7);
    }

    public static ColorStateList q(Context context, g5.b bVar, int i7) {
        int resourceId;
        ColorStateList h02;
        TypedArray typedArray = (TypedArray) bVar.f10842s;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0 && (h02 = android.support.v4.media.session.b.h0(context, resourceId)) != null) {
            return h02;
        }
        return bVar.y(i7);
    }

    public static Drawable s(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        Drawable i02;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0 && (i02 = android.support.v4.media.session.b.i0(context, resourceId)) != null) {
            return i02;
        }
        return typedArray.getDrawable(i7);
    }

    public static final Class t(S5.b bVar) {
        M5.g.f(bVar, "<this>");
        Class a7 = ((M5.c) bVar).a();
        if (!a7.isPrimitive()) {
            return a7;
        }
        String name = a7.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a7;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a7;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a7;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a7;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a7;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a7;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a7;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a7;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a7;
            default:
                return a7;
        }
    }

    public static String u(Class cls) {
        LinkedHashMap linkedHashMap = O.f12513b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            M m7 = (M) cls.getAnnotation(M.class);
            if (m7 != null) {
                str = m7.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
        }
        M5.g.c(str);
        return str;
    }

    public static D0.c v(D0.d dVar, SQLiteDatabase sQLiteDatabase) {
        M5.g.f(dVar, "refHolder");
        M5.g.f(sQLiteDatabase, "sqLiteDatabase");
        D0.c cVar = dVar.f455a;
        if (cVar == null || !M5.g.a(cVar.f454q, sQLiteDatabase)) {
            D0.c cVar2 = new D0.c(sQLiteDatabase);
            dVar.f455a = cVar2;
            return cVar2;
        }
        return cVar;
    }

    public static boolean w(String str) {
        if (!U5.n.W("Connection", str) && !U5.n.W("Keep-Alive", str) && !U5.n.W("Proxy-Authenticate", str) && !U5.n.W("Proxy-Authorization", str) && !U5.n.W("TE", str) && !U5.n.W("Trailers", str) && !U5.n.W("Transfer-Encoding", str) && !U5.n.W("Upgrade", str)) {
            return true;
        }
        return false;
    }

    public static boolean x(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean y(byte b7) {
        if (b7 > -65) {
            return true;
        }
        return false;
    }

    public static List z(Object obj) {
        List singletonList = Collections.singletonList(obj);
        M5.g.e(singletonList, "singletonList(...)");
        return singletonList;
    }

    public abstract void r(u uVar, float f, float f7);
}
