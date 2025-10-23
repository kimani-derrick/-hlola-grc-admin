package h4;

import A5.t;
import H2.C0002c;
import J0.j;
import L5.l;
import U5.n;
import W5.C;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.util.Property;
import android.view.View;
import androidx.leanback.widget.w0;
import androidx.leanback.widget.x0;
import androidx.leanback.widget.y0;
import e2.m0;
import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.C0852F;
import k3.AbstractC0958a;
import n0.C1001C;
import n0.C1002D;
import n0.C1003E;
import q.k;
import r0.AbstractC1111a;
import u4.C1288l;
import v6.C1341f;
import v6.C1344i;
import x2.C1461c;
import x2.C1463e;
import z5.C1527i;
import z5.C1529k;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public abstract class b implements androidx.leanback.transition.e {
    public b() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [z5.m, z5.d, java.lang.Object] */
    public static InterfaceC1522d A(L5.a aVar) {
        C1529k c1529k = C1529k.f16478a;
        ?? obj = new Object();
        obj.f16480q = aVar;
        obj.f16481r = c1529k;
        return obj;
    }

    public static String B(String str, Object... objArr) {
        int indexOf;
        String str2;
        String sb;
        int i7 = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e3) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    if (valueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e3);
                    String name2 = e3.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + String.valueOf(sb3).length() + 9);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i8] = sb;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i9 = 0;
        while (i7 < objArr.length && (indexOf = str.indexOf("%s", i9)) != -1) {
            sb5.append((CharSequence) str, i9, indexOf);
            sb5.append(objArr[i7]);
            i9 = indexOf + 2;
            i7++;
        }
        sb5.append((CharSequence) str, i9, str.length());
        if (i7 < objArr.length) {
            sb5.append(" [");
            sb5.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb5.append(", ");
                sb5.append(objArr[i10]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static final C1002D C(l lVar) {
        C1003E c1003e = new C1003E();
        lVar.c(c1003e);
        boolean z7 = c1003e.f12494b;
        C1001C c1001c = c1003e.f12493a;
        c1001c.getClass();
        c1001c.getClass();
        int i7 = c1003e.f12495c;
        boolean z8 = c1003e.d;
        c1001c.getClass();
        c1001c.getClass();
        c1001c.getClass();
        c1001c.getClass();
        return new C1002D(z7, false, i7, false, z8, c1001c.f12483a, c1001c.f12484b, c1001c.f12485c, c1001c.d);
    }

    public static C1461c D(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            int i8 = H.f4603a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                AbstractC0156a.K("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(A2.b.a(new y(Base64.decode(split[1], 0))));
                } catch (RuntimeException e3) {
                    AbstractC0156a.L("VorbisUtil", "Failed to parse vorbis picture", e3);
                }
            } else {
                arrayList.add(new A2.c(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1461c(arrayList);
    }

    public static String E(X509Certificate x509Certificate) {
        M5.g.f(x509Certificate, "certificate");
        return M5.g.k(G(x509Certificate).a(), "sha256/");
    }

    public static C0852F F(y yVar, boolean z7, boolean z8) {
        if (z7) {
            I(3, yVar, false);
        }
        yVar.s((int) yVar.l(), N3.e.f2497c);
        long l7 = yVar.l();
        String[] strArr = new String[(int) l7];
        for (int i7 = 0; i7 < l7; i7++) {
            strArr[i7] = yVar.s((int) yVar.l(), N3.e.f2497c);
        }
        if (z8 && (yVar.u() & 1) == 0) {
            throw m0.a("framing bit expected to be set", null);
        }
        return new C0852F(2, strArr);
    }

    public static C1344i G(X509Certificate x509Certificate) {
        M5.g.f(x509Certificate, "<this>");
        C1344i c1344i = C1344i.f15389t;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        M5.g.e(encoded, "publicKey.encoded");
        return C1288l.f(encoded).c("SHA-256");
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, v6.f] */
    public static final String H(String str) {
        InetAddress r3;
        M5.g.f(str, "<this>");
        int i7 = 0;
        int i8 = -1;
        if (U5.f.d0(str, ":")) {
            if (n.b0(str, "[", false) && n.V(str, "]", false)) {
                r3 = r(1, str.length() - 1, str);
            } else {
                r3 = r(0, str.length(), str);
            }
            if (r3 == null) {
                return null;
            }
            byte[] address = r3.getAddress();
            if (address.length == 16) {
                int i9 = 0;
                int i10 = 0;
                while (i9 < address.length) {
                    int i11 = i9;
                    while (i11 < 16 && address[i11] == 0 && address[i11 + 1] == 0) {
                        i11 += 2;
                    }
                    int i12 = i11 - i9;
                    if (i12 > i10 && i12 >= 4) {
                        i8 = i9;
                        i10 = i12;
                    }
                    i9 = i11 + 2;
                }
                ?? obj = new Object();
                while (i7 < address.length) {
                    if (i7 == i8) {
                        obj.i0(58);
                        i7 += i10;
                        if (i7 == 16) {
                            obj.i0(58);
                        }
                    } else {
                        if (i7 > 0) {
                            obj.i0(58);
                        }
                        byte b7 = address[i7];
                        byte[] bArr = i6.b.f11390a;
                        obj.k0(((b7 & 255) << 8) | (address[i7 + 1] & 255));
                        i7 += 2;
                    }
                }
                return obj.b0();
            } else if (address.length == 4) {
                return r3.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        }
        try {
            String ascii = IDN.toASCII(str);
            M5.g.e(ascii, "toASCII(host)");
            Locale locale = Locale.US;
            M5.g.e(locale, "US");
            String lowerCase = ascii.toLowerCase(locale);
            M5.g.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                return null;
            }
            int length = lowerCase.length();
            int i13 = 0;
            while (i13 < length) {
                int i14 = i13 + 1;
                char charAt = lowerCase.charAt(i13);
                if (M5.g.h(charAt, 31) <= 0 || M5.g.h(charAt, 127) >= 0 || U5.f.i0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                    return null;
                }
                i13 = i14;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static boolean I(int i7, y yVar, boolean z7) {
        if (yVar.a() < 7) {
            if (z7) {
                return false;
            }
            throw m0.a("too short header: " + yVar.a(), null);
        } else if (yVar.u() != i7) {
            if (z7) {
                return false;
            }
            throw m0.a("expected header type " + Integer.toHexString(i7), null);
        } else if (yVar.u() == 118 && yVar.u() == 111 && yVar.u() == 114 && yVar.u() == 98 && yVar.u() == 105 && yVar.u() == 115) {
            return true;
        } else {
            if (z7) {
                return false;
            }
            throw m0.a("expected characters 'vorbis'", null);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.leanback.widget.x0, java.lang.Object] */
    public static x0 d(View view, float f, float f7, int i7) {
        if (i7 > 0) {
            w0 w0Var = y0.f6713a;
            android.support.v4.media.session.b.A0(view, i7);
        } else {
            view.setOutlineProvider(y0.f6713a);
        }
        ?? obj = new Object();
        obj.f6666a = view;
        obj.f6667b = f;
        obj.f6668c = f7;
        view.setZ(f);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, q.i] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, q.l] */
    public static k e(C c5) {
        ?? obj = new Object();
        obj.f13215c = new Object();
        k kVar = new k(obj);
        obj.f13214b = kVar;
        obj.f13213a = AbstractC1111a.class;
        try {
            c5.P(false, true, new X5.d(obj, 4, c5));
            obj.f13213a = "Deferred.asListenableFuture";
        } catch (Exception e3) {
            kVar.f13218r.j(e3);
        }
        return kVar;
    }

    public static void f(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 <= i8) {
                return;
            }
            throw new IllegalArgumentException(AbstractC1111a.m(i7, i8, "fromIndex: ", " > toIndex: "));
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
    }

    public static final double g(int i7, int i8, int i9, int i10, int i11) {
        double d = i9 / i7;
        double d7 = i10 / i8;
        int b7 = s.h.b(i11);
        if (b7 != 0) {
            if (b7 == 1) {
                return Math.min(d, d7);
            }
            throw new RuntimeException();
        }
        return Math.max(d, d7);
    }

    public static final long h(long j7, V5.c cVar, V5.c cVar2) {
        M5.g.f(cVar, "sourceUnit");
        M5.g.f(cVar2, "targetUnit");
        return cVar2.f3741q.convert(j7, cVar.f3741q);
    }

    public static final j i(Context context) {
        C0002c c0002c = new C0002c(context, 1);
        C1527i c1527i = new C1527i(new J0.d(c0002c, 0));
        C1527i c1527i2 = new C1527i(new J0.d(c0002c, 1));
        C1527i c1527i3 = new C1527i(J0.e.f1279r);
        t tVar = t.f135q;
        return new j((Context) c0002c.f1017r, (S0.a) c0002c.f1018s, c1527i, c1527i2, c1527i3, new J0.b(tVar, tVar, tVar, tVar, tVar), (X0.i) c0002c.f1019t);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.emoji2.text.f, androidx.emoji2.text.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.emoji2.text.p j(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            androidx.emoji2.text.b r0 = new androidx.emoji2.text.b
            r1 = 16
            r0.<init>(r1)
            goto L15
        Le:
            J3.e r0 = new J3.e
            r1 = 16
            r0.<init>(r1)
        L15:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            android.support.v4.media.session.b.j(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2e
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r1 = r5
            goto L7e
        L4f:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.pm.Signature[] r0 = r0.w(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
        L5d:
            if (r3 >= r6) goto L6b
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r3 = r3 + 1
            goto L5d
        L6b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            H.e r1 = new H.e     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L4d
        L7e:
            if (r1 != 0) goto L81
            goto L8b
        L81:
            androidx.emoji2.text.p r5 = new androidx.emoji2.text.p
            androidx.emoji2.text.o r0 = new androidx.emoji2.text.o
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.b.j(android.content.Context):androidx.emoji2.text.p");
    }

    public static void o(String str, String str2, Object obj) {
        String w7 = w(str);
        if (Log.isLoggable(w7, 3)) {
            Log.d(w7, String.format(str2, obj));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d6, code lost:
        if (r7 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d8, code lost:
        if (r8 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00db, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ed, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress r(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.b.r(int, int, java.lang.String):java.net.InetAddress");
    }

    public static void s(String str, String str2, Exception exc) {
        String w7 = w(str);
        if (Log.isLoggable(w7, 6)) {
            Log.e(w7, str2, exc);
        }
    }

    public static Object t(Object[] objArr, int i7, J3.e eVar) {
        int i8;
        boolean z7;
        int i9;
        if ((i7 & 1) == 0) {
            i8 = 400;
        } else {
            i8 = 700;
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        Object obj = null;
        int i10 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(eVar.x(obj2) - i8) * 2;
            if (eVar.z(obj2) == z7) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            int i11 = abs + i9;
            if (obj == null || i10 > i11) {
                obj = obj2;
                i10 = i11;
            }
        }
        return obj;
    }

    public static final String v(long j7) {
        long j8 = j7 / 1000;
        long j9 = 60;
        long j10 = j8 % j9;
        long j11 = j8 / j9;
        long j12 = j11 % j9;
        long j13 = j11 / j9;
        if (j13 > 0) {
            return String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j10)}, 3));
        }
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j12), Long.valueOf(j10)}, 2));
    }

    public static String w(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static int x(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static int y(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i8++;
            i7 >>>= 1;
        }
        return i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, v6.f] */
    public static final boolean z(C1341f c1341f) {
        long j7;
        M5.g.f(c1341f, "<this>");
        try {
            ?? obj = new Object();
            long j8 = c1341f.f15388r;
            if (j8 > 64) {
                j7 = 64;
            } else {
                j7 = j8;
            }
            c1341f.x(obj, 0L, j7);
            int i7 = 0;
            while (i7 < 16) {
                i7++;
                if (!obj.M()) {
                    int c02 = obj.c0();
                    if (Character.isISOControl(c02) && !Character.isWhitespace(c02)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // androidx.leanback.transition.e
    public float b(View view) {
        return view.getTranslationX();
    }

    @Override // androidx.leanback.transition.e
    public Property c() {
        return View.TRANSLATION_X;
    }

    public abstract Typeface k(Context context, C.g gVar, Resources resources, int i7);

    public abstract Typeface l(Context context, H.k[] kVarArr, int i7);

    public Typeface m(Context context, InputStream inputStream) {
        File t5 = AbstractC0958a.t(context);
        if (t5 == null) {
            return null;
        }
        try {
            if (!AbstractC0958a.l(t5, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(t5.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            t5.delete();
        }
    }

    public Typeface n(Context context, Resources resources, int i7, String str, int i8) {
        File t5 = AbstractC0958a.t(context);
        if (t5 == null) {
            return null;
        }
        try {
            if (!AbstractC0958a.k(t5, resources, i7)) {
                return null;
            }
            return Typeface.createFromFile(t5.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            t5.delete();
        }
    }

    public C1461c p(C1463e c1463e) {
        boolean z7;
        ByteBuffer byteBuffer = c1463e.f11351t;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        if (c1463e.d(Integer.MIN_VALUE)) {
            return null;
        }
        return q(c1463e, byteBuffer);
    }

    public abstract C1461c q(C1463e c1463e, ByteBuffer byteBuffer);

    public H.k u(H.k[] kVarArr, int i7) {
        return (H.k) t(kVarArr, i7, new J3.e(3));
    }
}
