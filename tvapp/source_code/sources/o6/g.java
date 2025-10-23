package o6;

import u4.C1288l;
import v6.C1344i;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final C1344i f13014a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f13015b;

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f13016c;
    public static final String[] d;

    static {
        int i7 = 0;
        C1344i c1344i = C1344i.f15389t;
        f13014a = C1288l.e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f13015b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f13016c = new String[64];
        String[] strArr = new String[256];
        for (int i8 = 0; i8 < 256; i8++) {
            String binaryString = Integer.toBinaryString(i8);
            M5.g.e(binaryString, "toBinaryString(it)");
            String replace = i6.b.i("%8s", binaryString).replace(' ', '0');
            M5.g.e(replace, "replace(...)");
            strArr[i8] = replace;
        }
        d = strArr;
        String[] strArr2 = f13016c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i9 = iArr[0];
        strArr2[i9 | 8] = M5.g.k("|PADDED", strArr2[i9]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i10 = 0;
        while (i10 < 3) {
            int i11 = iArr2[i10];
            i10++;
            int i12 = iArr[0];
            String[] strArr3 = f13016c;
            int i13 = i12 | i11;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i12]);
            sb.append('|');
            sb.append((Object) strArr3[i11]);
            strArr3[i13] = sb.toString();
            strArr3[i13 | 8] = ((Object) strArr3[i12]) + '|' + ((Object) strArr3[i11]) + "|PADDED";
        }
        int length = f13016c.length;
        while (i7 < length) {
            int i14 = i7 + 1;
            String[] strArr4 = f13016c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
            i7 = i14;
        }
    }

    public static String a(boolean z7, int i7, int i8, int i9, int i10) {
        String i11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String[] strArr = f13015b;
        if (i9 < strArr.length) {
            i11 = strArr[i9];
        } else {
            i11 = i6.b.i("0x%02x", Integer.valueOf(i9));
        }
        if (i10 == 0) {
            str = "";
        } else {
            String[] strArr2 = d;
            if (i9 != 2 && i9 != 3) {
                if (i9 != 4 && i9 != 6) {
                    if (i9 != 7 && i9 != 8) {
                        String[] strArr3 = f13016c;
                        if (i10 < strArr3.length) {
                            str2 = strArr3[i10];
                            M5.g.c(str2);
                        } else {
                            str2 = strArr2[i10];
                        }
                        if (i9 == 5 && (i10 & 4) != 0) {
                            str3 = "PUSH_PROMISE";
                            str4 = "HEADERS";
                        } else if (i9 == 0 && (i10 & 32) != 0) {
                            str3 = "COMPRESSED";
                            str4 = "PRIORITY";
                        } else {
                            str = str2;
                        }
                        str = U5.n.Z(str2, str4, str3);
                    }
                } else if (i10 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[i10];
                }
            }
            str = strArr2[i10];
        }
        if (z7) {
            str5 = "<<";
        } else {
            str5 = ">>";
        }
        return i6.b.i("%s 0x%08x %5d %-13s %s", str5, Integer.valueOf(i7), Integer.valueOf(i8), i11, str);
    }
}
