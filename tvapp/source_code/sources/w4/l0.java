package w4;

import W5.AbstractC0092a;
import W5.AbstractC0113u;
import a1.C0197a;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0263q;
import androidx.navigation.fragment.NavHostFragment;
import com.boxhdo.android.data.local.AppDatabase;
import com.boxhdo.android.data.model.response.trakt.TraktLoginResponse;
import com.boxhdo.android.data.model.response.trakt.TraktProfileResponse;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.net.ProtocolException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k3.AbstractC0958a;
import n0.C0999A;
import n5.AbstractC1043D;
import r0.AbstractC1111a;
import v6.C1341f;
import v6.C1344i;
import x0.C1458n;
import z5.C1525g;
import z5.C1530l;
/* loaded from: classes.dex */
public abstract class l0 {
    public static C.d G(String str) {
        int i7;
        String str2;
        M5.g.f(str, "statusLine");
        boolean b02 = U5.n.b0(str, "HTTP/1.", false);
        h6.A a7 = h6.A.f11062r;
        if (b02) {
            i7 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        a7 = h6.A.f11063s;
                    } else {
                        throw new ProtocolException(M5.g.k(str, "Unexpected status line: "));
                    }
                }
            } else {
                throw new ProtocolException(M5.g.k(str, "Unexpected status line: "));
            }
        } else if (U5.n.b0(str, "ICY ", false)) {
            i7 = 4;
        } else {
            throw new ProtocolException(M5.g.k(str, "Unexpected status line: "));
        }
        int i8 = i7 + 3;
        if (str.length() >= i8) {
            try {
                String substring = str.substring(i7, i8);
                M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() > i8) {
                    if (str.charAt(i8) == ' ') {
                        str2 = str.substring(i7 + 4);
                        M5.g.e(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(M5.g.k(str, "Unexpected status line: "));
                    }
                } else {
                    str2 = "";
                }
                return new C.d(a7, parseInt, str2, 8);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(M5.g.k(str, "Unexpected status line: "));
            }
        }
        throw new ProtocolException(M5.g.k(str, "Unexpected status line: "));
    }

    public static final Cursor H(AppDatabase appDatabase, C1458n c1458n) {
        M5.g.f(appDatabase, "db");
        M5.g.f(c1458n, "sqLiteQuery");
        return appDatabase.m(c1458n, null);
    }

    public static boolean I(Parcel parcel, int i7) {
        c0(parcel, i7, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static IBinder J(Parcel parcel, int i7) {
        int M6 = M(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (M6 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + M6);
        return readStrongBinder;
    }

    public static int K(Parcel parcel, int i7) {
        c0(parcel, i7, 4);
        return parcel.readInt();
    }

    public static long L(Parcel parcel, int i7) {
        c0(parcel, i7, 8);
        return parcel.readLong();
    }

    public static int M(Parcel parcel, int i7) {
        if ((i7 & (-65536)) != -65536) {
            return (char) (i7 >> 16);
        }
        return parcel.readInt();
    }

    public static final void N(Object[] objArr, int i7, int i8) {
        M5.g.f(objArr, "<this>");
        while (i7 < i8) {
            objArr[i7] = null;
            i7++;
        }
    }

    public static void O(TextView textView, int i7) {
        int i8;
        android.support.v4.media.session.b.g(i7);
        if (Build.VERSION.SDK_INT >= 28) {
            P.p.d(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i8 = fontMetricsInt.top;
        } else {
            i8 = fontMetricsInt.ascent;
        }
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void P(TextView textView, int i7) {
        int i8;
        android.support.v4.media.session.b.g(i7);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i8 = fontMetricsInt.bottom;
        } else {
            i8 = fontMetricsInt.descent;
        }
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
        }
    }

    public static final void Q(C0197a c0197a, ArrayList arrayList) {
        M5.g.f(c0197a, "<this>");
        SharedPreferences.Editor edit = c0197a.f4980a.edit();
        if (arrayList instanceof String) {
            ((B0.a) edit).putString("PREF_WATCH_LIST", (String) arrayList);
        } else if (arrayList instanceof Float) {
            ((B0.a) edit).putFloat("PREF_WATCH_LIST", ((Number) arrayList).floatValue());
        } else if (arrayList instanceof Integer) {
            ((B0.a) edit).putInt("PREF_WATCH_LIST", ((Number) arrayList).intValue());
        } else if (arrayList instanceof Long) {
            ((B0.a) edit).putLong("PREF_WATCH_LIST", ((Number) arrayList).longValue());
        } else if (arrayList instanceof Boolean) {
            ((B0.a) edit).putBoolean("PREF_WATCH_LIST", ((Boolean) arrayList).booleanValue());
        } else {
            ((B0.a) edit).putString("PREF_WATCH_LIST", c0197a.f4981b.a(List.class).e(arrayList));
        }
        ((B0.a) edit).apply();
    }

    public static final void R(C0197a c0197a, TraktLoginResponse traktLoginResponse) {
        M5.g.f(c0197a, "<this>");
        String A6 = g6.o.f10858a.A();
        SharedPreferences.Editor edit = c0197a.f4980a.edit();
        if (traktLoginResponse instanceof String) {
            ((B0.a) edit).putString(A6, (String) traktLoginResponse);
        } else if (traktLoginResponse instanceof Float) {
            ((B0.a) edit).putFloat(A6, ((Number) traktLoginResponse).floatValue());
        } else if (traktLoginResponse instanceof Integer) {
            ((B0.a) edit).putInt(A6, ((Number) traktLoginResponse).intValue());
        } else if (traktLoginResponse instanceof Long) {
            ((B0.a) edit).putLong(A6, ((Number) traktLoginResponse).longValue());
        } else if (traktLoginResponse instanceof Boolean) {
            ((B0.a) edit).putBoolean(A6, ((Boolean) traktLoginResponse).booleanValue());
        } else {
            ((B0.a) edit).putString(A6, c0197a.f4981b.a(TraktLoginResponse.class).e(traktLoginResponse));
        }
        ((B0.a) edit).apply();
    }

    public static final void S(C0197a c0197a, TraktProfileResponse traktProfileResponse) {
        M5.g.f(c0197a, "<this>");
        String B6 = g6.o.f10858a.B();
        SharedPreferences.Editor edit = c0197a.f4980a.edit();
        if (traktProfileResponse instanceof String) {
            ((B0.a) edit).putString(B6, (String) traktProfileResponse);
        } else if (traktProfileResponse instanceof Float) {
            ((B0.a) edit).putFloat(B6, ((Number) traktProfileResponse).floatValue());
        } else if (traktProfileResponse instanceof Integer) {
            ((B0.a) edit).putInt(B6, ((Number) traktProfileResponse).intValue());
        } else if (traktProfileResponse instanceof Long) {
            ((B0.a) edit).putLong(B6, ((Number) traktProfileResponse).longValue());
        } else if (traktProfileResponse instanceof Boolean) {
            ((B0.a) edit).putBoolean(B6, ((Boolean) traktProfileResponse).booleanValue());
        } else {
            ((B0.a) edit).putString(B6, c0197a.f4981b.a(TraktProfileResponse.class).e(traktProfileResponse));
        }
        ((B0.a) edit).apply();
    }

    public static void T(Parcel parcel, int i7) {
        parcel.setDataPosition(parcel.dataPosition() + M(parcel, i7));
    }

    public static void U(L5.p pVar, AbstractC0092a abstractC0092a, AbstractC0092a abstractC0092a2) {
        try {
            b6.a.i(x(g(abstractC0092a2, pVar, abstractC0092a)), C1530l.f16479a, null);
        } catch (Throwable th) {
            abstractC0092a2.m(AbstractC0958a.m(th));
            throw th;
        }
    }

    public static R5.a V(R5.c cVar, int i7) {
        boolean z7;
        M5.g.f(cVar, "<this>");
        if (i7 > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        Integer valueOf = Integer.valueOf(i7);
        if (z7) {
            if (cVar.f2924s <= 0) {
                i7 = -i7;
            }
            return new R5.a(cVar.f2922q, cVar.f2923r, i7);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R5.a, R5.c] */
    public static R5.c W(int i7, int i8) {
        if (i8 <= Integer.MIN_VALUE) {
            R5.c cVar = R5.c.f2929t;
            return R5.c.f2929t;
        }
        return new R5.a(i7, i8 - 1, 1);
    }

    public static ActionMode.Callback X(ActionMode.Callback callback) {
        if ((callback instanceof P.q) && Build.VERSION.SDK_INT >= 26) {
            return ((P.q) callback).f2758a;
        }
        return callback;
    }

    public static int Y(Parcel parcel) {
        int readInt = parcel.readInt();
        int M6 = M(parcel, readInt);
        char c5 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c5 == 20293) {
            int i7 = M6 + dataPosition;
            if (i7 >= dataPosition && i7 <= parcel.dataSize()) {
                return i7;
            }
            throw new h3.b(AbstractC1111a.m(dataPosition, i7, "Size read is invalid start=", " end="), parcel);
        }
        throw new h3.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static ActionMode.Callback Z(ActionMode.Callback callback, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && i7 <= 27 && !(callback instanceof P.q) && callback != null) {
            return new P.q(callback, textView);
        }
        return callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, v6.f, v6.F] */
    public static void a(long j7, C1341f c1341f, int i7, ArrayList arrayList, int i8, int i9, ArrayList arrayList2) {
        int i10;
        int i11;
        int i12;
        int i13;
        Object obj;
        int i14 = i7;
        if (i8 < i9) {
            for (int i15 = i8; i15 < i9; i15++) {
                if (((C1344i) arrayList.get(i15)).d() < i14) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            C1344i c1344i = (C1344i) arrayList.get(i8);
            C1344i c1344i2 = (C1344i) arrayList.get(i9 - 1);
            int i16 = -1;
            if (i14 == c1344i.d()) {
                int i17 = i8 + 1;
                i10 = i17;
                i11 = ((Number) arrayList2.get(i8)).intValue();
                c1344i = (C1344i) arrayList.get(i17);
            } else {
                i10 = i8;
                i11 = -1;
            }
            if (c1344i.i(i14) != c1344i2.i(i14)) {
                int i18 = 1;
                for (int i19 = i10 + 1; i19 < i9; i19++) {
                    if (((C1344i) arrayList.get(i19 - 1)).i(i14) != ((C1344i) arrayList.get(i19)).i(i14)) {
                        i18++;
                    }
                }
                long j8 = 4;
                long j9 = (c1341f.f15388r / j8) + j7 + 2 + (i18 * 2);
                c1341f.l0(i18);
                c1341f.l0(i11);
                for (int i20 = i10; i20 < i9; i20++) {
                    byte i21 = ((C1344i) arrayList.get(i20)).i(i14);
                    if (i20 == i10 || i21 != ((C1344i) arrayList.get(i20 - 1)).i(i14)) {
                        c1341f.l0(i21 & 255);
                    }
                }
                int i22 = i10;
                C1341f c1341f2 = new Object();
                while (i22 < i9) {
                    byte i23 = ((C1344i) arrayList.get(i22)).i(i14);
                    int i24 = i22 + 1;
                    int i25 = i24;
                    while (true) {
                        if (i25 < i9) {
                            if (i23 != ((C1344i) arrayList.get(i25)).i(i14)) {
                                i12 = i25;
                                break;
                            }
                            i25++;
                        } else {
                            i12 = i9;
                            break;
                        }
                    }
                    if (i24 == i12 && i14 + 1 == ((C1344i) arrayList.get(i22)).d()) {
                        c1341f.l0(((Number) arrayList2.get(i22)).intValue());
                        i13 = i12;
                        obj = c1341f2;
                    } else {
                        c1341f.l0(((int) ((c1341f2.f15388r / j8) + j9)) * i16);
                        i13 = i12;
                        obj = c1341f2;
                        a(j9, c1341f2, i14 + 1, arrayList, i22, i12, arrayList2);
                    }
                    c1341f2 = obj;
                    i22 = i13;
                    i16 = -1;
                }
                c1341f.h0(c1341f2);
                return;
            }
            int min = Math.min(c1344i.d(), c1344i2.d());
            int i26 = 0;
            for (int i27 = i14; i27 < min && c1344i.i(i27) == c1344i2.i(i27); i27++) {
                i26++;
            }
            long j10 = 4;
            long j11 = (c1341f.f15388r / j10) + j7 + 2 + i26 + 1;
            c1341f.l0(-i26);
            c1341f.l0(i11);
            int i28 = i26 + i14;
            while (i14 < i28) {
                c1341f.l0(c1344i.i(i14) & 255);
                i14++;
            }
            if (i10 + 1 == i9) {
                if (i28 == ((C1344i) arrayList.get(i10)).d()) {
                    c1341f.l0(((Number) arrayList2.get(i10)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            ?? obj2 = new Object();
            c1341f.l0(((int) ((obj2.f15388r / j10) + j11)) * (-1));
            a(j11, obj2, i28, arrayList, i10, i9, arrayList2);
            c1341f.h0(obj2);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static int a0(int i7) {
        int[] iArr = {1, 2, 3};
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = iArr[i8];
            int i10 = i9 - 1;
            if (i9 != 0) {
                if (i10 == i7) {
                    return i9;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static void b(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw e2.m0.a(str, null);
    }

    public static void b0(Parcel parcel, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        String hexString = Integer.toHexString(i7);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i8);
        sb.append(" got ");
        sb.append(i7);
        sb.append(" (0x");
        throw new h3.b(AbstractC1111a.t(sb, hexString, ")"), parcel);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R5.a, R5.c] */
    public static void c(int i7) {
        if (new R5.a(2, 36, 1).c(i7)) {
            return;
        }
        StringBuilder o7 = AbstractC0515y1.o(i7, "radix ", " was not in valid range ");
        o7.append(new R5.a(2, 36, 1));
        throw new IllegalArgumentException(o7.toString());
    }

    public static void c0(Parcel parcel, int i7, int i8) {
        int M6 = M(parcel, i7);
        if (M6 == i8) {
            return;
        }
        String hexString = Integer.toHexString(M6);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i8);
        sb.append(" got ");
        sb.append(M6);
        sb.append(" (0x");
        throw new h3.b(AbstractC1111a.t(sb, hexString, ")"), parcel);
    }

    public static long e(long j7, long j8, long j9) {
        if (j8 <= j9) {
            if (j7 < j8) {
                return j8;
            }
            if (j7 > j9) {
                return j9;
            }
            return j7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j9 + " is less than minimum " + j8 + '.');
    }

    public static Bundle f(Parcel parcel, int i7) {
        int M6 = M(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (M6 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + M6);
        return readBundle;
    }

    public static D5.d g(D5.d dVar, L5.p pVar, Object obj) {
        M5.g.f(pVar, "<this>");
        M5.g.f(dVar, "completion");
        if (pVar instanceof F5.a) {
            return ((F5.a) pVar).h(dVar, obj);
        }
        D5.i k5 = dVar.k();
        if (k5 == D5.j.f531q) {
            return new E5.b(dVar, pVar, obj);
        }
        return new E5.c(dVar, k5, pVar, obj);
    }

    public static Parcelable h(Parcel parcel, int i7, Parcelable.Creator creator) {
        int M6 = M(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (M6 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + M6);
        return parcelable;
    }

    public static String i(Parcel parcel, int i7) {
        int M6 = M(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (M6 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + M6);
        return readString;
    }

    public static Object[] j(Parcel parcel, int i7, Parcelable.Creator creator) {
        int M6 = M(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (M6 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + M6);
        return createTypedArray;
    }

    public static final H.e k(ComponentCallbacksC0269x componentCallbacksC0269x, M5.d dVar, L5.a aVar, L5.a aVar2, L5.a aVar3) {
        M5.g.f(componentCallbacksC0269x, "<this>");
        return new H.e(dVar, aVar, aVar3, aVar2);
    }

    public static final void l(L0.e eVar, v6.w wVar) {
        try {
            Iterator it = ((ArrayList) eVar.g(wVar)).iterator();
            IOException iOException = null;
            while (it.hasNext()) {
                v6.w wVar2 = (v6.w) it.next();
                try {
                    if (eVar.h(wVar2).f14614c) {
                        l(eVar, wVar2);
                    }
                    eVar.d(wVar2);
                } catch (IOException e3) {
                    if (iOException == null) {
                        iOException = e3;
                    }
                }
            }
            if (iOException == null) {
                return;
            }
            throw iOException;
        } catch (FileNotFoundException unused) {
        }
    }

    public static void m(Parcel parcel, int i7) {
        if (parcel.dataPosition() == i7) {
            return;
        }
        throw new h3.b(AbstractC0515y1.l("Overread allowed size end=", i7), parcel);
    }

    public static final boolean n(char c5, char c6, boolean z7) {
        if (c5 == c6) {
            return true;
        }
        if (!z7) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static final C0999A o(ComponentCallbacksC0269x componentCallbacksC0269x) {
        DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q;
        Dialog dialog;
        Window window;
        M5.g.f(componentCallbacksC0269x, "<this>");
        for (ComponentCallbacksC0269x componentCallbacksC0269x2 = componentCallbacksC0269x; componentCallbacksC0269x2 != null; componentCallbacksC0269x2 = componentCallbacksC0269x2.f6109M) {
            if (componentCallbacksC0269x2 instanceof NavHostFragment) {
                C0999A c0999a = ((NavHostFragment) componentCallbacksC0269x2).f6849n0;
                if (c0999a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                return c0999a;
            }
            ComponentCallbacksC0269x componentCallbacksC0269x3 = componentCallbacksC0269x2.t().f5944y;
            if (componentCallbacksC0269x3 instanceof NavHostFragment) {
                C0999A c0999a2 = ((NavHostFragment) componentCallbacksC0269x3).f6849n0;
                if (c0999a2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                return c0999a2;
            }
        }
        View view = componentCallbacksC0269x.W;
        if (view != null) {
            return AbstractC0958a.q(view);
        }
        View view2 = null;
        if (componentCallbacksC0269x instanceof DialogInterface$OnCancelListenerC0263q) {
            dialogInterface$OnCancelListenerC0263q = (DialogInterface$OnCancelListenerC0263q) componentCallbacksC0269x;
        } else {
            dialogInterface$OnCancelListenerC0263q = null;
        }
        if (dialogInterface$OnCancelListenerC0263q != null && (dialog = dialogInterface$OnCancelListenerC0263q.y0) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return AbstractC0958a.q(view2);
        }
        throw new IllegalStateException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " does not have a NavController set"));
    }

    public static Object p(Serializable serializable, Serializable serializable2) {
        if (serializable != null) {
            return serializable;
        }
        if (serializable2 != null) {
            return serializable2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static final String q(String str, String str2) {
        String str3;
        M5.g.f(str, "<this>");
        if (U5.n.X(str)) {
            return "N/A";
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2, Locale.getDefault());
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                str3 = "N/A";
            } else {
                str3 = simpleDateFormat2.format(parse);
            }
            M5.g.e(str3, "{\n        val formatter …at(date) else \"N/A\"\n    }");
            return str3;
        } catch (Exception unused) {
            return "N/A";
        }
    }

    public static h6.A r(String str) {
        if (M5.g.a(str, "http/1.0")) {
            return h6.A.f11062r;
        }
        if (M5.g.a(str, "http/1.1")) {
            return h6.A.f11063s;
        }
        if (M5.g.a(str, "h2_prior_knowledge")) {
            return h6.A.f11066v;
        }
        if (M5.g.a(str, "h2")) {
            return h6.A.f11065u;
        }
        if (M5.g.a(str, "spdy/3.1")) {
            return h6.A.f11064t;
        }
        if (M5.g.a(str, "quic")) {
            return h6.A.f11067w;
        }
        throw new IOException(M5.g.k(str, "Unexpected protocol: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String s(a1.C0197a r7) {
        /*
            r0 = 1
            java.lang.String r1 = "<this>"
            M5.g.f(r7, r1)
            g6.o r1 = g6.o.f10858a
            java.lang.String r1 = r1.w()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            M5.d r3 = M5.p.a(r2)
            java.lang.Class r4 = java.lang.Float.TYPE
            M5.d r4 = M5.p.a(r4)
            boolean r4 = M5.g.a(r3, r4)
            B0.b r5 = r7.f4980a
            java.lang.String r6 = ""
            if (r4 == 0) goto L35
            java.lang.Float r6 = (java.lang.Float) r6
            float r7 = r6.floatValue()
            float r7 = r5.getFloat(r1, r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
        L30:
            r6 = r7
            java.lang.String r6 = (java.lang.String) r6
            goto Lc5
        L35:
            java.lang.Class r4 = java.lang.Integer.TYPE
            M5.d r4 = M5.p.a(r4)
            boolean r4 = M5.g.a(r3, r4)
            if (r4 == 0) goto L50
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r6.intValue()
            int r7 = r5.getInt(r1, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L30
        L50:
            java.lang.Class r4 = java.lang.Long.TYPE
            M5.d r4 = M5.p.a(r4)
            boolean r4 = M5.g.a(r3, r4)
            if (r4 == 0) goto L6b
            java.lang.Long r6 = (java.lang.Long) r6
            long r2 = r6.longValue()
            long r1 = r5.getLong(r1, r2)
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            goto L30
        L6b:
            M5.d r4 = M5.p.a(r2)
            boolean r4 = M5.g.a(r3, r4)
            if (r4 == 0) goto L84
            java.lang.String r6 = r5.getString(r1, r6)
            if (r6 == 0) goto L7c
            goto Lc5
        L7c:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            r7.<init>(r0)
            throw r7
        L84:
            java.lang.Class r4 = java.lang.Boolean.TYPE
            M5.d r4 = M5.p.a(r4)
            boolean r3 = M5.g.a(r3, r4)
            if (r3 == 0) goto L9f
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r7 = r6.booleanValue()
            boolean r7 = r5.getBoolean(r1, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L30
        L9f:
            java.lang.String r1 = r5.getString(r1, r6)
            if (r1 == 0) goto Lc5
            int r3 = r1.length()
            if (r3 != 0) goto Lac
            goto Lc5
        Lac:
            n5.y r7 = r7.f4981b     // Catch: java.lang.Throwable -> Lb7
            n5.k r7 = r7.a(r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r7 = r7.a(r1)     // Catch: java.lang.Throwable -> Lb7
            goto Lbc
        Lb7:
            r7 = move-exception
            z5.g r7 = k3.AbstractC0958a.m(r7)
        Lbc:
            boolean r1 = r7 instanceof z5.C1525g
            if (r1 == 0) goto Lc1
            r7 = 0
        Lc1:
            if (r7 != 0) goto Lc4
            goto Lc5
        Lc4:
            r6 = r7
        Lc5:
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = U5.n.X(r6)
            r7 = r7 ^ r0
            if (r7 == 0) goto Le2
            g6.o r7 = g6.o.f10858a
            java.lang.String r7 = r7.g()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r6
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r7 = java.lang.String.format(r7, r0)
            return r7
        Le2:
            g6.o r7 = g6.o.f10858a
            java.lang.String r7 = r7.f()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.l0.s(a1.a):java.lang.String");
    }

    public static final List t(C0197a c0197a) {
        Object m7;
        M5.g.f(c0197a, "<this>");
        String string = c0197a.f4980a.getString("PREF_WATCH_LIST", "");
        o5.c f = AbstractC1043D.f(Long.class);
        A5.t tVar = A5.t.f135q;
        if (string != null && string.length() != 0) {
            Object obj = null;
            try {
                n5.y yVar = c0197a.f4981b;
                yVar.getClass();
                m7 = (List) yVar.c(f, o5.e.f12957a, null).a(string);
            } catch (Throwable th) {
                m7 = AbstractC0958a.m(th);
            }
            if (!(m7 instanceof C1525g)) {
                obj = m7;
            }
            List list = (List) obj;
            if (list != null) {
                return list;
            }
            return tVar;
        }
        return tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r7 != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r5 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static I.e u(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            I.e r0 = new I.e
            android.text.PrecomputedText$Params r7 = P.p.c(r7)
            r0.<init>(r7)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r7.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r3 = P.n.a(r7)
            int r4 = P.n.d(r7)
            android.text.method.TransformationMethod r5 = r7.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L2e
        L2b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L75
        L2e:
            r5 = 1
            r6 = 0
            if (r0 < r1) goto L59
            int r0 = r7.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L59
            java.util.Locale r7 = r7.getTextLocale()
            android.icu.text.DecimalFormatSymbols r7 = P.o.a(r7)
            java.lang.String[] r7 = P.p.b(r7)
            r7 = r7[r6]
            int r7 = r7.codePointAt(r6)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r5) goto L56
            r0 = 2
            if (r7 != r0) goto L2b
        L56:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L75
        L59:
            int r0 = r7.getLayoutDirection()
            if (r0 != r5) goto L60
            goto L61
        L60:
            r5 = r6
        L61:
            int r7 = r7.getTextDirection()
            switch(r7) {
                case 2: goto L73;
                case 3: goto L2b;
                case 4: goto L56;
                case 5: goto L70;
                case 6: goto L6d;
                case 7: goto L6a;
                default: goto L68;
            }
        L68:
            if (r5 == 0) goto L6d
        L6a:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L75
        L6d:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L75
        L70:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L75
        L73:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
        L75:
            I.e r0 = new I.e
            r0.<init>(r2, r7, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.l0.u(android.widget.TextView):I.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
        if ((r7 instanceof z5.C1525g) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.boxhdo.android.data.model.response.trakt.TraktLoginResponse v(a1.C0197a r7) {
        /*
            java.lang.String r0 = "<this>"
            M5.g.f(r7, r0)
            g6.o r0 = g6.o.f10858a
            java.lang.String r0 = r0.A()
            java.lang.Class<com.boxhdo.android.data.model.response.trakt.TraktLoginResponse> r1 = com.boxhdo.android.data.model.response.trakt.TraktLoginResponse.class
            M5.d r2 = M5.p.a(r1)
            java.lang.Class r3 = java.lang.Float.TYPE
            M5.d r3 = M5.p.a(r3)
            boolean r3 = M5.g.a(r2, r3)
            B0.b r4 = r7.f4980a
            if (r3 == 0) goto L2c
            r7 = 0
            float r7 = r4.getFloat(r0, r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
        L28:
            com.boxhdo.android.data.model.response.trakt.TraktLoginResponse r7 = (com.boxhdo.android.data.model.response.trakt.TraktLoginResponse) r7
            goto Lae
        L2c:
            java.lang.Class r3 = java.lang.Integer.TYPE
            M5.d r3 = M5.p.a(r3)
            boolean r3 = M5.g.a(r2, r3)
            r5 = 0
            if (r3 == 0) goto L42
            int r7 = r4.getInt(r0, r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L28
        L42:
            java.lang.Class r3 = java.lang.Long.TYPE
            M5.d r3 = M5.p.a(r3)
            boolean r3 = M5.g.a(r2, r3)
            if (r3 == 0) goto L59
            r1 = 0
            long r0 = r4.getLong(r0, r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            goto L28
        L59:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            M5.d r3 = M5.p.a(r3)
            boolean r3 = M5.g.a(r2, r3)
            java.lang.String r6 = ""
            if (r3 == 0) goto L76
            java.lang.String r7 = r4.getString(r0, r6)
            if (r7 == 0) goto L6e
            goto L28
        L6e:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.boxhdo.android.data.model.response.trakt.TraktLoginResponse"
            r7.<init>(r0)
            throw r7
        L76:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            M5.d r3 = M5.p.a(r3)
            boolean r2 = M5.g.a(r2, r3)
            if (r2 == 0) goto L8b
            boolean r7 = r4.getBoolean(r0, r5)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L28
        L8b:
            java.lang.String r0 = r4.getString(r0, r6)
            r2 = 0
            if (r0 == 0) goto Lad
            int r3 = r0.length()
            if (r3 != 0) goto L99
            goto Lad
        L99:
            n5.y r7 = r7.f4981b     // Catch: java.lang.Throwable -> La4
            n5.k r7 = r7.a(r1)     // Catch: java.lang.Throwable -> La4
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Throwable -> La4
            goto La9
        La4:
            r7 = move-exception
            z5.g r7 = k3.AbstractC0958a.m(r7)
        La9:
            boolean r0 = r7 instanceof z5.C1525g
            if (r0 == 0) goto Lae
        Lad:
            r7 = r2
        Lae:
            com.boxhdo.android.data.model.response.trakt.TraktLoginResponse r7 = (com.boxhdo.android.data.model.response.trakt.TraktLoginResponse) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.l0.v(a1.a):com.boxhdo.android.data.model.response.trakt.TraktLoginResponse");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
        if ((r7 instanceof z5.C1525g) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.boxhdo.android.data.model.response.LoginResponse w(a1.C0197a r7) {
        /*
            java.lang.String r0 = "<this>"
            M5.g.f(r7, r0)
            g6.o r0 = g6.o.f10858a
            java.lang.String r0 = r0.C()
            java.lang.Class<com.boxhdo.android.data.model.response.LoginResponse> r1 = com.boxhdo.android.data.model.response.LoginResponse.class
            M5.d r2 = M5.p.a(r1)
            java.lang.Class r3 = java.lang.Float.TYPE
            M5.d r3 = M5.p.a(r3)
            boolean r3 = M5.g.a(r2, r3)
            B0.b r4 = r7.f4980a
            if (r3 == 0) goto L2c
            r7 = 0
            float r7 = r4.getFloat(r0, r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
        L28:
            com.boxhdo.android.data.model.response.LoginResponse r7 = (com.boxhdo.android.data.model.response.LoginResponse) r7
            goto Lae
        L2c:
            java.lang.Class r3 = java.lang.Integer.TYPE
            M5.d r3 = M5.p.a(r3)
            boolean r3 = M5.g.a(r2, r3)
            r5 = 0
            if (r3 == 0) goto L42
            int r7 = r4.getInt(r0, r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L28
        L42:
            java.lang.Class r3 = java.lang.Long.TYPE
            M5.d r3 = M5.p.a(r3)
            boolean r3 = M5.g.a(r2, r3)
            if (r3 == 0) goto L59
            r1 = 0
            long r0 = r4.getLong(r0, r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            goto L28
        L59:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            M5.d r3 = M5.p.a(r3)
            boolean r3 = M5.g.a(r2, r3)
            java.lang.String r6 = ""
            if (r3 == 0) goto L76
            java.lang.String r7 = r4.getString(r0, r6)
            if (r7 == 0) goto L6e
            goto L28
        L6e:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.boxhdo.android.data.model.response.LoginResponse"
            r7.<init>(r0)
            throw r7
        L76:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            M5.d r3 = M5.p.a(r3)
            boolean r2 = M5.g.a(r2, r3)
            if (r2 == 0) goto L8b
            boolean r7 = r4.getBoolean(r0, r5)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L28
        L8b:
            java.lang.String r0 = r4.getString(r0, r6)
            r2 = 0
            if (r0 == 0) goto Lad
            int r3 = r0.length()
            if (r3 != 0) goto L99
            goto Lad
        L99:
            n5.y r7 = r7.f4981b     // Catch: java.lang.Throwable -> La4
            n5.k r7 = r7.a(r1)     // Catch: java.lang.Throwable -> La4
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Throwable -> La4
            goto La9
        La4:
            r7 = move-exception
            z5.g r7 = k3.AbstractC0958a.m(r7)
        La9:
            boolean r0 = r7 instanceof z5.C1525g
            if (r0 == 0) goto Lae
        Lad:
            r7 = r2
        Lae:
            com.boxhdo.android.data.model.response.LoginResponse r7 = (com.boxhdo.android.data.model.response.LoginResponse) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.l0.w(a1.a):com.boxhdo.android.data.model.response.LoginResponse");
    }

    public static D5.d x(D5.d dVar) {
        F5.c cVar;
        D5.d dVar2;
        M5.g.f(dVar, "<this>");
        if (dVar instanceof F5.c) {
            cVar = (F5.c) dVar;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            D5.d dVar3 = cVar.f732s;
            if (dVar3 == null) {
                D5.f fVar = (D5.f) cVar.k().f(D5.e.f529q);
                if (fVar != null) {
                    dVar2 = new b6.h((AbstractC0113u) fVar, cVar);
                } else {
                    dVar2 = cVar;
                }
                cVar.f732s = dVar2;
                return dVar2;
            }
            return dVar3;
        }
        return dVar;
    }

    public static final boolean y(char c5) {
        if (!Character.isWhitespace(c5) && !Character.isSpaceChar(c5)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0140, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, v6.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v6.u z(v6.C1344i... r14) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.l0.z(v6.i[]):v6.u");
    }

    public abstract void D(androidx.leanback.widget.G g7);

    public abstract List d(String str, List list);

    public void A() {
    }

    public void C() {
    }

    public void B(androidx.leanback.widget.G g7) {
    }

    public void E(androidx.leanback.widget.G g7) {
    }

    public void F(androidx.leanback.widget.G g7) {
    }
}
