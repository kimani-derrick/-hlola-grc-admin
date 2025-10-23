package R2;

import Z2.AbstractC0156a;
import android.text.TextUtils;
import p6.l;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f2894a;

    /* renamed from: b  reason: collision with root package name */
    public int f2895b;

    /* renamed from: c  reason: collision with root package name */
    public int f2896c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f2897e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v6, types: [R2.b, java.lang.Object] */
    public static b b(String str) {
        char c5;
        AbstractC0156a.f(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < split.length; i11++) {
            String T6 = l.T(split[i11].trim());
            T6.getClass();
            switch (T6.hashCode()) {
                case 100571:
                    if (T6.equals("end")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3556653:
                    if (T6.equals("text")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 109757538:
                    if (T6.equals("start")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 109780401:
                    if (T6.equals("style")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    i8 = i11;
                    break;
                case 1:
                    i9 = i11;
                    break;
                case 2:
                    i7 = i11;
                    break;
                case 3:
                    i10 = i11;
                    break;
            }
        }
        if (i7 != -1 && i8 != -1 && i9 != -1) {
            int length = split.length;
            ?? obj = new Object();
            obj.f2894a = i7;
            obj.f2895b = i8;
            obj.f2896c = i10;
            obj.d = i9;
            obj.f2897e = length;
            return obj;
        }
        return null;
    }

    public boolean a() {
        int i7;
        int i8;
        int i9;
        int i10 = this.f2894a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.d;
            int i13 = this.f2895b;
            if (i12 > i13) {
                i9 = 1;
            } else if (i12 == i13) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            if ((i9 & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.d;
            int i15 = this.f2896c;
            if (i14 > i15) {
                i8 = 1;
            } else if (i14 == i15) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            if (((i8 << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f2897e;
            int i17 = this.f2895b;
            if (i16 > i17) {
                i7 = 1;
            } else if (i16 == i17) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            if (((i7 << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f2897e;
            int i19 = this.f2896c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
