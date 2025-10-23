package k3;

import A5.l;
import A5.t;
import K.C0040p;
import K.U;
import M5.g;
import N3.n;
import O3.C;
import O3.a0;
import T5.j;
import U5.f;
import W2.q;
import X.i;
import Y2.H;
import Z2.AbstractC0156a;
import Z2.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.leanback.transition.e;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import e2.m0;
import h6.m;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.C0943h;
import k6.c;
import k6.d;
import n0.C0999A;
import n0.C1012c;
import r0.AbstractC1111a;
import s5.InterfaceC1214a;
import w4.l0;
import z5.C1525g;
/* renamed from: k3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0958a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static Context f12207a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f12208b;

    public static long C(String str, int i7) {
        int o7 = o(0, i7, str, false);
        Matcher matcher = m.f11177m.matcher(str);
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (o7 < i7) {
            int o8 = o(o7 + 1, i7, str, true);
            matcher.region(o7, o8);
            if (i9 == -1 && matcher.usePattern(m.f11177m).matches()) {
                String group = matcher.group(1);
                g.e(group, "matcher.group(1)");
                i9 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                g.e(group2, "matcher.group(2)");
                i12 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                g.e(group3, "matcher.group(3)");
                i13 = Integer.parseInt(group3);
            } else if (i10 == -1 && matcher.usePattern(m.f11176l).matches()) {
                String group4 = matcher.group(1);
                g.e(group4, "matcher.group(1)");
                i10 = Integer.parseInt(group4);
            } else {
                if (i11 == -1) {
                    Pattern pattern = m.f11175k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        g.e(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        g.e(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        g.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        g.e(pattern2, "MONTH_PATTERN.pattern()");
                        i11 = f.j0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i8 == -1 && matcher.usePattern(m.f11174j).matches()) {
                    String group6 = matcher.group(1);
                    g.e(group6, "matcher.group(1)");
                    i8 = Integer.parseInt(group6);
                }
            }
            o7 = o(o8 + 1, i7, str, false);
        }
        if (70 <= i8 && i8 < 100) {
            i8 += 1900;
        }
        if (i8 >= 0 && i8 < 70) {
            i8 += 2000;
        }
        if (i8 >= 1601) {
            if (i11 != -1) {
                if (1 <= i10 && i10 < 32) {
                    if (i9 >= 0 && i9 < 24) {
                        if (i12 >= 0 && i12 < 60) {
                            if (i13 >= 0 && i13 < 60) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(i6.b.f11393e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i8);
                                gregorianCalendar.set(2, i11 - 1);
                                gregorianCalendar.set(5, i10);
                                gregorianCalendar.set(11, i9);
                                gregorianCalendar.set(12, i12);
                                gregorianCalendar.set(13, i13);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static TypedValue D(Context context, int i7) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int E(int i7, Context context, String str) {
        TypedValue D6 = D(context, i7);
        if (D6 != null) {
            return D6.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i7)));
    }

    public static T2.g F(T2.g gVar, String[] strArr, Map map) {
        int i7 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (T2.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                T2.g gVar2 = new T2.g();
                int length = strArr.length;
                while (i7 < length) {
                    gVar2.a((T2.g) map.get(strArr[i7]));
                    i7++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            gVar.a((T2.g) map.get(strArr[0]));
            return gVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i7 < length2) {
                gVar.a((T2.g) map.get(strArr[i7]));
                i7++;
            }
        }
        return gVar;
    }

    public static H G(int i7, C0943h c0943h, y yVar) {
        while (true) {
            H a7 = H.a(c0943h, yVar);
            int i8 = a7.f4329a;
            if (i8 != i7) {
                AbstractC0515y1.q(i8, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j7 = a7.f4330b + 8;
                if (j7 <= 2147483647L) {
                    c0943h.d((int) j7);
                } else {
                    throw m0.c("Chunk is too large (~2GB+) to skip; id: " + i8);
                }
            } else {
                return a7;
            }
        }
    }

    public static final void H(Object obj) {
        if (!(obj instanceof C1525g)) {
            return;
        }
        throw ((C1525g) obj).f16470q;
    }

    public static String I(int i7) {
        Object[] objArr = {Integer.valueOf(Color.red(i7)), Integer.valueOf(Color.green(i7)), Integer.valueOf(Color.blue(i7)), Double.valueOf(Color.alpha(i7) / 255.0d)};
        int i8 = Z2.H.f4603a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final void J(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7) {
        if (i7 >= 0 && byteBuffer2.remaining() >= i7 && byteBuffer3.remaining() >= i7 && byteBuffer.remaining() >= i7) {
            for (int i8 = 0; i8 < i7; i8++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] K(int i7, int i8, int i9, byte[] bArr, byte[] bArr2) {
        if (i9 >= 0 && bArr.length - i9 >= i7 && bArr2.length - i9 >= i8) {
            byte[] bArr3 = new byte[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                bArr3[i10] = (byte) (bArr[i10 + i7] ^ bArr2[i10 + i8]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] L(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return K(0, 0, bArr.length, bArr, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final void d(k6.a aVar, c cVar, String str) {
        Logger logger = d.f12221i;
        logger.fine(cVar.f12217b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f12212a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [D5.d, java.lang.Object, T5.i] */
    public static final void e(View view) {
        g.f(view, "<this>");
        U u7 = new U(view, null);
        ?? obj = new Object();
        obj.f3404t = l0.g(obj, u7, obj);
        while (obj.hasNext()) {
            View view2 = (View) obj.next();
            R.a aVar = (R.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new R.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f2861a;
            int K6 = l.K(arrayList);
            if (-1 < K6) {
                AbstractC0515y1.v(arrayList.get(K6));
                throw null;
            }
        }
    }

    public static boolean f(C0943h c0943h) {
        y yVar = new y(8);
        int i7 = H.a(c0943h, yVar).f4329a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        c0943h.i(yVar.f4691a, 0, 4, false);
        yVar.F(0);
        int g7 = yVar.g();
        if (g7 != 1463899717) {
            AbstractC0156a.q("WavHeaderReader", "Unsupported form type: " + g7);
            return false;
        }
        return true;
    }

    public static void g(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] i(byte[]... bArr) {
        int i7 = 0;
        for (byte[] bArr2 : bArr) {
            if (i7 <= Integer.MAX_VALUE - bArr2.length) {
                i7 += bArr2.length;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i7];
        int i8 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i8, bArr4.length);
            i8 += bArr4.length;
        }
        return bArr3;
    }

    public static final void j(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i8 + ").");
    }

    public static boolean k(File file, Resources resources, int i7) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i7);
            try {
                boolean l7 = l(file, inputStream);
                h(inputStream);
                return l7;
            } catch (Throwable th) {
                th = th;
                h(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean l(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e7) {
            e = e7;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final C1525g m(Throwable th) {
        g.f(th, "exception");
        return new C1525g(th);
    }

    public static C0040p n(q qVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = qVar.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (qVar.o(elapsedRealtime, i8)) {
                i7++;
            }
        }
        return new C0040p(length, i7);
    }

    public static int o(int i7, int i8, String str, boolean z7) {
        boolean z8;
        while (i7 < i8) {
            int i9 = i7 + 1;
            char charAt = str.charAt(i7);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && ((charAt > '9' || '0' > charAt) && ((charAt > 'z' || 'a' > charAt) && ((charAt > 'Z' || 'A' > charAt) && charAt != ':')))) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (z8 == (!z7)) {
                return i7;
            }
            i7 = i9;
        }
        return i8;
    }

    public static String p(AbstractC0530h abstractC0530h) {
        String str;
        StringBuilder sb = new StringBuilder(abstractC0530h.size());
        for (int i7 = 0; i7 < abstractC0530h.size(); i7++) {
            int b7 = abstractC0530h.b(i7);
            if (b7 != 34) {
                if (b7 != 39) {
                    if (b7 != 92) {
                        switch (b7) {
                            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                                str = "\\a";
                                break;
                            case 8:
                                str = "\\b";
                                break;
                            case 9:
                                str = "\\t";
                                break;
                            case 10:
                                str = "\\n";
                                break;
                            case 11:
                                str = "\\v";
                                break;
                            case 12:
                                str = "\\f";
                                break;
                            case 13:
                                str = "\\r";
                                break;
                            default:
                                if (b7 < 32 || b7 > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((b7 >>> 6) & 3) + 48));
                                    sb.append((char) (((b7 >>> 3) & 7) + 48));
                                    b7 = (b7 & 7) + 48;
                                }
                                sb.append((char) b7);
                                continue;
                                break;
                        }
                    } else {
                        str = "\\\\";
                    }
                } else {
                    str = "\\'";
                }
            } else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static final C0999A q(View view) {
        Object next;
        T5.e eVar = new T5.e(new T5.f(new T5.f(2, C1012c.f12529z, j.K(view, C1012c.f12528y))));
        if (!eVar.hasNext()) {
            next = null;
        } else {
            next = eVar.next();
        }
        C0999A c0999a = (C0999A) next;
        if (c0999a != null) {
            return c0999a;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final String r(long j7) {
        StringBuilder sb;
        long j8;
        StringBuilder sb2;
        long j9;
        StringBuilder sb3;
        long j10;
        String s6;
        if (j7 <= -999500000) {
            sb = new StringBuilder();
            j8 = (j7 - 500000000) / 1000000000;
        } else {
            if (j7 <= -999500) {
                sb2 = new StringBuilder();
                j9 = j7 - 500000;
            } else {
                if (j7 <= 0) {
                    sb3 = new StringBuilder();
                    j10 = j7 - 500;
                } else if (j7 < 999500) {
                    sb3 = new StringBuilder();
                    j10 = j7 + 500;
                } else if (j7 < 999500000) {
                    sb2 = new StringBuilder();
                    j9 = j7 + 500000;
                } else {
                    sb = new StringBuilder();
                    j8 = (j7 + 500000000) / 1000000000;
                }
                s6 = AbstractC1111a.s(sb3, j10 / 1000, " µs");
                return String.format("%6s", Arrays.copyOf(new Object[]{s6}, 1));
            }
            s6 = AbstractC1111a.s(sb2, j9 / 1000000, " ms");
            return String.format("%6s", Arrays.copyOf(new Object[]{s6}, 1));
        }
        s6 = AbstractC1111a.s(sb, j8, " s ");
        return String.format("%6s", Arrays.copyOf(new Object[]{s6}, 1));
    }

    public static Calendar s(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public static File t(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean u(ViewGroup viewGroup, View view) {
        while (view != null) {
            if (view == viewGroup) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }

    public static boolean v(Context context) {
        boolean z7;
        g.f(context, "context");
        ((h1.i) ((InterfaceC1214a) android.support.v4.media.session.b.g0(InterfaceC1214a.class, p6.d.l(context.getApplicationContext())))).getClass();
        int i7 = O3.H.f2601s;
        a0 a0Var = a0.f2647z;
        if (a0Var.f2652x <= 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        android.support.v4.media.session.b.p(z7, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (a0Var.isEmpty()) {
            return true;
        }
        return ((Boolean) ((C) a0Var.n()).next()).booleanValue();
    }

    public static synchronized boolean w(Context context) {
        Boolean bool;
        boolean isInstantApp;
        Boolean bool2;
        synchronized (AbstractC0958a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f12207a;
            if (context2 != null && (bool2 = f12208b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f12208b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                bool = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f12208b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f12207a = applicationContext;
                return f12208b.booleanValue();
            }
            f12208b = bool;
            f12207a = applicationContext;
            return f12208b.booleanValue();
        }
    }

    public static List x(J1.l lVar, List list) {
        ArrayList arrayList;
        if (list != null) {
            List<Object> list2 = list;
            arrayList = new ArrayList(A5.m.P(list2));
            for (Object obj : list2) {
                arrayList.add(lVar.s(obj));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return t.f135q;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [N3.n, N3.l, java.lang.Object] */
    public static N3.l y(N3.l lVar) {
        if (!(lVar instanceof n) && !(lVar instanceof N3.m)) {
            if (lVar instanceof Serializable) {
                return new N3.m(lVar);
            }
            ?? obj = new Object();
            obj.f2512q = lVar;
            return obj;
        }
        return lVar;
    }

    public static MappedByteBuffer z(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    public abstract void A(Throwable th);

    public abstract void B(C4.b bVar);

    @Override // androidx.leanback.transition.e
    public float b(View view) {
        return view.getTranslationY();
    }

    @Override // androidx.leanback.transition.e
    public Property c() {
        return View.TRANSLATION_Y;
    }
}
