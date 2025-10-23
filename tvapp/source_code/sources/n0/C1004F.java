package n0;

import android.os.Bundle;
import w4.l0;
/* renamed from: n0.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004F extends L {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f12496m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1004F(int i7, boolean z7) {
        super(z7);
        this.f12496m = i7;
    }

    @Override // n0.L
    public final Object a(String str, Bundle bundle) {
        switch (this.f12496m) {
            case 0:
                return (boolean[]) bundle.get(str);
            case 1:
                return (Boolean) bundle.get(str);
            case 2:
                return (float[]) bundle.get(str);
            case 3:
                Object obj = bundle.get(str);
                if (obj != null) {
                    return (Float) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            case 4:
                return (int[]) bundle.get(str);
            case 5:
                Object obj2 = bundle.get(str);
                if (obj2 != null) {
                    return (Integer) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return (long[]) bundle.get(str);
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Object obj3 = bundle.get(str);
                if (obj3 != null) {
                    return (Long) obj3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            case 8:
                Object obj4 = bundle.get(str);
                if (obj4 != null) {
                    return (Integer) obj4;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            case 9:
                return (String[]) bundle.get(str);
            default:
                return (String) bundle.get(str);
        }
    }

    @Override // n0.L
    public final String b() {
        switch (this.f12496m) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "long[]";
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "long";
            case 8:
                return "reference";
            case 9:
                return "string[]";
            default:
                return "string";
        }
    }

    @Override // n0.L
    public final Object c(String str) {
        boolean z7;
        int parseInt;
        String str2;
        long parseLong;
        int parseInt2;
        switch (this.f12496m) {
            case 0:
                M5.g.f(str, "value");
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 1:
                M5.g.f(str, "value");
                if (M5.g.a(str, "true")) {
                    z7 = true;
                } else if (M5.g.a(str, "false")) {
                    z7 = false;
                } else {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                return Boolean.valueOf(z7);
            case 2:
                M5.g.f(str, "value");
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 3:
                M5.g.f(str, "value");
                return Float.valueOf(Float.parseFloat(str));
            case 4:
                M5.g.f(str, "value");
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 5:
                M5.g.f(str, "value");
                if (U5.n.b0(str, "0x", false)) {
                    String substring = str.substring(2);
                    M5.g.e(substring, "this as java.lang.String).substring(startIndex)");
                    l0.c(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                M5.g.f(str, "value");
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                M5.g.f(str, "value");
                if (U5.n.V(str, "L", false)) {
                    str2 = str.substring(0, str.length() - 1);
                    M5.g.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str2 = str;
                }
                if (U5.n.b0(str, "0x", false)) {
                    String substring2 = str2.substring(2);
                    M5.g.e(substring2, "this as java.lang.String).substring(startIndex)");
                    l0.c(16);
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(str2);
                }
                return Long.valueOf(parseLong);
            case 8:
                M5.g.f(str, "value");
                if (U5.n.b0(str, "0x", false)) {
                    String substring3 = str.substring(2);
                    M5.g.e(substring3, "this as java.lang.String).substring(startIndex)");
                    l0.c(16);
                    parseInt2 = Integer.parseInt(substring3, 16);
                } else {
                    parseInt2 = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt2);
            case 9:
                M5.g.f(str, "value");
                throw new UnsupportedOperationException("Arrays don't support default values.");
            default:
                M5.g.f(str, "value");
                return str;
        }
    }

    @Override // n0.L
    public final void d(Bundle bundle, String str, Object obj) {
        switch (this.f12496m) {
            case 0:
                M5.g.f(str, "key");
                bundle.putBooleanArray(str, (boolean[]) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                M5.g.f(str, "key");
                bundle.putBoolean(str, booleanValue);
                return;
            case 2:
                M5.g.f(str, "key");
                bundle.putFloatArray(str, (float[]) obj);
                return;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                M5.g.f(str, "key");
                bundle.putFloat(str, floatValue);
                return;
            case 4:
                M5.g.f(str, "key");
                bundle.putIntArray(str, (int[]) obj);
                return;
            case 5:
                int intValue = ((Number) obj).intValue();
                M5.g.f(str, "key");
                bundle.putInt(str, intValue);
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                M5.g.f(str, "key");
                bundle.putLongArray(str, (long[]) obj);
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                long longValue = ((Number) obj).longValue();
                M5.g.f(str, "key");
                bundle.putLong(str, longValue);
                return;
            case 8:
                int intValue2 = ((Number) obj).intValue();
                M5.g.f(str, "key");
                bundle.putInt(str, intValue2);
                return;
            case 9:
                M5.g.f(str, "key");
                bundle.putStringArray(str, (String[]) obj);
                return;
            default:
                M5.g.f(str, "key");
                bundle.putString(str, (String) obj);
                return;
        }
    }
}
