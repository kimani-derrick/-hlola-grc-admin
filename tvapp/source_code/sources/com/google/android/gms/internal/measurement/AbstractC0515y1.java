package com.google.android.gms.internal.measurement;

import Z2.AbstractC0156a;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.C0533k;
import java.util.HashMap;
import x5.C1467a;
import y5.InterfaceC1496a;
/* renamed from: com.google.android.gms.internal.measurement.y1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0515y1 {
    public static /* synthetic */ String A(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE";
    }

    public static /* synthetic */ String B(int i7) {
        switch (i7) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case 4:
                return "LEFT";
            case 5:
                return "RIGHT";
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "TOP";
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }

    public static int a(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 3;
        }
        if (i7 == 3) {
            return 4;
        }
        if (i7 != 4) {
            return 0;
        }
        return 5;
    }

    public static int b(int i7, int i8, int i9) {
        return i7 | i8 | i9 | 128;
    }

    public static int c(int i7) {
        return i7 & 384;
    }

    public static int d(int i7) {
        return i7 & 64;
    }

    public static /* synthetic */ int e(int i7) {
        int i8 = 1;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2) {
                i8 = 3;
                if (i7 != 3) {
                    if (i7 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i8;
    }

    public static /* synthetic */ long f(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 == 5) {
                            return 4L;
                        }
                        throw null;
                    }
                    return 3L;
                }
                return 2L;
            }
            return 1L;
        }
        return 0L;
    }

    public static float g(float f, float f7, float f8, float f9) {
        return ((f - f7) * f8) + f9;
    }

    public static int h(int i7, int i8, int i9, int i10) {
        return C0533k.d0(i7) + i8 + i9 + i10;
    }

    public static int i(int i7, int i8, String str) {
        return (str.hashCode() + i7) * i8;
    }

    public static String j(int i7, String str, String str2) {
        StringBuilder sb = new StringBuilder(i7);
        sb.append(str);
        String sb2 = sb.toString();
        M5.g.e(sb2, str2);
        return sb2;
    }

    public static String k(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.A());
        return sb.toString();
    }

    public static String l(String str, int i7) {
        return str + i7;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(StringBuilder sb, int i7, String str) {
        sb.append(i7);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder o(int i7, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i7);
        sb.append(str2);
        return sb;
    }

    public static InterfaceC1496a p(h1.i iVar, int i7) {
        return C1467a.a(new h1.h(iVar, i7));
    }

    public static void q(int i7, String str, String str2) {
        AbstractC0156a.K(str2, str + i7);
    }

    public static void r(int i7, HashMap hashMap, String str, int i8, String str2) {
        hashMap.put(str, Integer.valueOf(i7));
        hashMap.put(str2, Integer.valueOf(i8));
    }

    public static /* synthetic */ void s(D5.g gVar) {
        if (gVar != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void t(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void u(InterfaceC0481r2 interfaceC0481r2) {
        if (interfaceC0481r2 != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void v(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void w(String str, String str2, String str3) {
        AbstractC0156a.K(str3, str + str2);
    }

    public static String x(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String y(int i7) {
        switch (i7) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BASELINE";
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String z(int i7) {
        switch (i7) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "STRING";
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
