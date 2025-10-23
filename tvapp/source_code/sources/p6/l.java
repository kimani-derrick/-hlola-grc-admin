package p6;

import A5.u;
import Z2.AbstractC0156a;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.EdgeEffect;
import com.boxhdo.android.tv.R;
import h6.v;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import k2.w;
import v6.C1336a;
import v6.C1337b;
import v6.D;
import v6.E;
import v6.F;
import v6.H;
import v6.t;
import v6.y;
import v6.z;
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: q  reason: collision with root package name */
    public static Thread f13186q;

    public static float C(EdgeEffect edgeEffect, float f, float f7) {
        if (Build.VERSION.SDK_INT >= 31) {
            return P.f.c(edgeEffect, f, f7);
        }
        P.e.a(edgeEffect, f, f7);
        return f;
    }

    public static final boolean E(String str) {
        M5.g.f(str, "method");
        if (!M5.g.a(str, "GET") && !M5.g.a(str, "HEAD")) {
            return true;
        }
        return false;
    }

    public static void I(Drawable drawable, int i7) {
        E.a.g(drawable, i7);
    }

    public static void J(Drawable drawable, ColorStateList colorStateList) {
        E.a.h(drawable, colorStateList);
    }

    public static void K(Drawable drawable, PorterDuff.Mode mode) {
        E.a.i(drawable, mode);
    }

    public static final C1336a L(Socket socket) {
        Logger logger = t.f15413a;
        E e3 = new E(socket);
        OutputStream outputStream = socket.getOutputStream();
        M5.g.e(outputStream, "getOutputStream()");
        return new C1336a(e3, 0, new C1336a(outputStream, 1, e3));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, v6.H] */
    public static final C1337b M(InputStream inputStream) {
        Logger logger = t.f15413a;
        M5.g.f(inputStream, "<this>");
        return new C1337b(inputStream, (H) new Object());
    }

    public static final C1337b N(Socket socket) {
        Logger logger = t.f15413a;
        E e3 = new E(socket);
        InputStream inputStream = socket.getInputStream();
        M5.g.e(inputStream, "getInputStream()");
        return new C1337b(e3, new C1337b(inputStream, e3));
    }

    public static void Q(byte[] bArr, long j7, int i7) {
        int i8 = 0;
        while (i8 < 4) {
            bArr[i7 + i8] = (byte) (255 & j7);
            i8++;
            j7 >>= 8;
        }
    }

    public static final List R(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(list));
            }
            return Collections.singletonList(A5.k.W(list));
        }
        return A5.t.f135q;
    }

    public static final Map S(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) A5.k.V(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return u.f136q;
    }

    public static String T(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c5 = charArray[i7];
                    if (c5 >= 'A' && c5 <= 'Z') {
                        charArray[i7] = (char) (c5 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String U(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c5 = charArray[i7];
                    if (c5 >= 'a' && c5 <= 'z') {
                        charArray[i7] = (char) (c5 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static final y b(D d) {
        M5.g.f(d, "<this>");
        return new y(d);
    }

    public static final z c(F f) {
        M5.g.f(f, "<this>");
        return new z(f);
    }

    public static B5.i d(B5.i iVar) {
        B5.f fVar = iVar.f314q;
        fVar.b();
        if (fVar.f308y <= 0) {
            return B5.i.f313r;
        }
        return iVar;
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static final void i(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                android.support.v4.media.session.b.a(th, th2);
            }
        }
    }

    public static byte[] j(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            byte b7 = 0;
            long z7 = z(0, bArr) & 67108863;
            long z8 = (z(3, bArr) >> 2) & 67108611;
            long z9 = (z(6, bArr) >> 4) & 67092735;
            long z10 = (z(9, bArr) >> 6) & 66076671;
            long z11 = (z(12, bArr) >> 8) & 1048575;
            long j7 = z8 * 5;
            long j8 = z9 * 5;
            long j9 = z10 * 5;
            long j10 = z11 * 5;
            int i7 = 17;
            byte[] bArr3 = new byte[17];
            long j11 = 0;
            int i8 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            while (i8 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i8);
                System.arraycopy(bArr2, i8, bArr3, b7, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i7, b7);
                }
                long z12 = j15 + (z(b7, bArr3) & 67108863);
                long z13 = j11 + ((z(3, bArr3) >> 2) & 67108863);
                long z14 = j12 + ((z(6, bArr3) >> 4) & 67108863);
                long z15 = j13 + ((z(9, bArr3) >> 6) & 67108863);
                long z16 = j14 + (((z(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
                long j16 = (z16 * j7) + (z15 * j8) + (z14 * j9) + (z13 * j10) + (z12 * z7);
                long j17 = (z16 * j8) + (z15 * j9) + (z14 * j10) + (z13 * z7) + (z12 * z8);
                long j18 = (z16 * j9) + (z15 * j10) + (z14 * z7) + (z13 * z8) + (z12 * z9);
                long j19 = (z15 * z7) + (z14 * z8) + (z13 * z9) + (z12 * z10);
                long j20 = z15 * z8;
                long j21 = z16 * z7;
                long j22 = j17 + (j16 >> 26);
                long j23 = j18 + (j22 >> 26);
                long j24 = (z16 * j10) + j19 + (j23 >> 26);
                long j25 = j21 + j20 + (z14 * z9) + (z13 * z10) + (z12 * z11) + (j24 >> 26);
                long j26 = j25 >> 26;
                j14 = j25 & 67108863;
                long j27 = (j26 * 5) + (j16 & 67108863);
                long j28 = j27 & 67108863;
                j11 = (j22 & 67108863) + (j27 >> 26);
                i8 += 16;
                j12 = j23 & 67108863;
                j13 = j24 & 67108863;
                b7 = 0;
                i7 = 17;
                j15 = j28;
            }
            long j29 = j12 + (j11 >> 26);
            long j30 = j29 & 67108863;
            long j31 = j13 + (j29 >> 26);
            long j32 = j31 & 67108863;
            long j33 = j14 + (j31 >> 26);
            long j34 = j33 & 67108863;
            long j35 = ((j33 >> 26) * 5) + j15;
            long j36 = j35 >> 26;
            long j37 = j35 & 67108863;
            long j38 = (j11 & 67108863) + j36;
            long j39 = j37 + 5;
            long j40 = j39 & 67108863;
            long j41 = j38 + (j39 >> 26);
            long j42 = j30 + (j41 >> 26);
            long j43 = j32 + (j42 >> 26);
            long j44 = (j34 + (j43 >> 26)) - 67108864;
            long j45 = j44 >> 63;
            long j46 = ~j45;
            long j47 = (j38 & j45) | (j41 & 67108863 & j46);
            long j48 = (j30 & j45) | (j42 & 67108863 & j46);
            long j49 = (j32 & j45) | (j43 & 67108863 & j46);
            long z17 = z(16, bArr) + (((j37 & j45) | (j40 & j46) | (j47 << 26)) & 4294967295L);
            long j50 = z17 & 4294967295L;
            long z18 = z(20, bArr) + (((j47 >> 6) | (j48 << 20)) & 4294967295L) + (z17 >> 32);
            long j51 = z18 & 4294967295L;
            long z19 = z(24, bArr) + (((j48 >> 12) | (j49 << 14)) & 4294967295L) + (z18 >> 32);
            long z20 = z(28, bArr);
            byte[] bArr4 = new byte[16];
            Q(bArr4, j50, 0);
            Q(bArr4, j51, 4);
            Q(bArr4, z19 & 4294967295L, 8);
            Q(bArr4, (z20 + (((((j44 & j46) | (j34 & j45)) << 8) | (j49 >> 18)) & 4294967295L) + (z19 >> 32)) & 4294967295L, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    public static void k(long j7, Z2.y yVar, w[] wVarArr) {
        int i7;
        int i8;
        boolean z7;
        while (true) {
            boolean z8 = true;
            if (yVar.a() > 1) {
                int i9 = 0;
                while (true) {
                    if (yVar.a() == 0) {
                        i7 = -1;
                        break;
                    }
                    int u7 = yVar.u();
                    i9 += u7;
                    if (u7 != 255) {
                        i7 = i9;
                        break;
                    }
                }
                int i10 = 0;
                while (true) {
                    if (yVar.a() == 0) {
                        i10 = -1;
                        break;
                    }
                    int u8 = yVar.u();
                    i10 += u8;
                    if (u8 != 255) {
                        break;
                    }
                }
                int i11 = yVar.f4692b + i10;
                if (i10 != -1 && i10 <= yVar.a()) {
                    if (i7 == 4 && i10 >= 8) {
                        int u9 = yVar.u();
                        int z9 = yVar.z();
                        if (z9 == 49) {
                            i8 = yVar.g();
                        } else {
                            i8 = 0;
                        }
                        int u10 = yVar.u();
                        if (z9 == 47) {
                            yVar.G(1);
                        }
                        if (u9 == 181 && ((z9 == 49 || z9 == 47) && u10 == 3)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z9 == 49) {
                            if (i8 != 1195456820) {
                                z8 = false;
                            }
                            z7 &= z8;
                        }
                        if (z7) {
                            l(j7, yVar, wVarArr);
                        }
                    }
                } else {
                    AbstractC0156a.K("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i11 = yVar.f4693c;
                }
                yVar.F(i11);
            } else {
                return;
            }
        }
    }

    public static void l(long j7, Z2.y yVar, w[] wVarArr) {
        int u7 = yVar.u();
        if ((u7 & 64) != 0) {
            yVar.G(1);
            int i7 = (u7 & 31) * 3;
            int i8 = yVar.f4692b;
            for (w wVar : wVarArr) {
                yVar.F(i8);
                wVar.d(i7, yVar);
                if (j7 != -9223372036854775807L) {
                    wVar.c(j7, 1, i7, 0, null);
                }
            }
        }
    }

    public static ObjectAnimator m(View view, TransitionValues transitionValues, int i7, int i8, float f, float f7, float f8, float f9, DecelerateInterpolator decelerateInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(R.id.transitionPosition);
        if (iArr != null) {
            f = (iArr[0] - i7) + translationX;
            f7 = (iArr[1] - i8) + translationY;
        }
        int round = Math.round(f - translationX) + i7;
        int round2 = Math.round(f7 - translationY) + i8;
        view.setTranslationX(f);
        view.setTranslationY(f7);
        if (f == f8 && f7 == f9) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f, f7);
        path.lineTo(f8, f9);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, View.TRANSLATION_Y, path);
        androidx.leanback.transition.h hVar = new androidx.leanback.transition.h(view, transitionValues.view, round, round2, translationX, translationY);
        transition.addListener(hVar);
        ofFloat.addListener(hVar);
        ofFloat.addPauseListener(hVar);
        ofFloat.setInterpolator(decelerateInterpolator);
        return ofFloat;
    }

    public static byte[] o(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i7 = 0; i7 < 16; i7++) {
                byte b7 = (byte) ((bArr[i7] << 1) & 254);
                bArr2[i7] = b7;
                if (i7 < 15) {
                    bArr2[i7] = (byte) (((byte) ((bArr[i7 + 1] >> 7) & 1)) | b7);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static v r(String str) {
        M5.g.f(str, "<this>");
        Matcher matcher = v.d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            M5.g.e(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            M5.g.e(locale, "US");
            String lowerCase = group.toLowerCase(locale);
            M5.g.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            M5.g.e(group2, "typeSubtype.group(2)");
            M5.g.e(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = v.f11212e.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 != null) {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (U5.n.b0(group4, "'", false) && U5.n.V(group4, "'", false) && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            M5.g.e(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    M5.g.e(substring, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new v(str, lowerCase, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    public static final int s(Cursor cursor, String str) {
        String str2;
        M5.g.f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                int i7 = -1;
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    M5.g.e(columnNames, "columnNames");
                    String concat = ".".concat(str);
                    String str3 = "." + str + '`';
                    int length = columnNames.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length) {
                        String str4 = columnNames[i8];
                        int i10 = i9 + 1;
                        if (str4.length() >= str.length() + 2 && (U5.n.V(str4, concat, false) || (str4.charAt(0) == '`' && U5.n.V(str4, str3, false)))) {
                            i7 = i9;
                            break;
                        }
                        i8++;
                        i9 = i10;
                    }
                }
                columnIndex = i7;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            M5.g.e(columnNames2, "c.columnNames");
            str2 = A5.j.X(columnNames2);
        } catch (Exception e3) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e3);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static float t(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return P.f.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void u(Future future) {
        boolean z7 = false;
        if (future.isDone()) {
            while (true) {
                try {
                    future.get();
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                } catch (Throwable th) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z7) {
                Thread.currentThread().interrupt();
                return;
            }
            return;
        }
        throw new IllegalStateException(h4.b.B("Future was expected to be done: %s", future));
    }

    public static final int w(int i7, int i8, int i9) {
        if (i9 > 0) {
            if (i7 < i8) {
                int i10 = i8 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i7 % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i8 - i12;
            }
            return i8;
        } else if (i9 < 0) {
            if (i7 > i8) {
                int i13 = -i9;
                int i14 = i7 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i8 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i8 + i16;
            }
            return i8;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final boolean y(AssertionError assertionError) {
        String message;
        Logger logger = t.f15413a;
        if (assertionError.getCause() != null && (message = assertionError.getMessage()) != null && U5.f.d0(message, "getsockname failed")) {
            return true;
        }
        return false;
    }

    public static long z(int i7, byte[] bArr) {
        return (((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16)) & 4294967295L;
    }

    public abstract View A(int i7);

    public abstract boolean B();

    public abstract Object D(Intent intent, int i7);

    public abstract void G(boolean z7);

    public abstract void H(boolean z7);

    public abstract void O();

    public abstract void P();

    public boolean g() {
        return false;
    }

    public abstract Intent n(androidx.activity.l lVar, Object obj);

    public abstract InputFilter[] v(InputFilter[] inputFilterArr);

    public K3.f x(androidx.activity.l lVar, Object obj) {
        M5.g.f(lVar, "context");
        return null;
    }

    public void F() {
    }
}
