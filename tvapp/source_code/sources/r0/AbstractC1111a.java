package r0;

import M5.g;
import T0.e;
import T0.f;
import X.i;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.datastore.preferences.protobuf.C0232k;
import androidx.fragment.app.ComponentCallbacksC0269x;
import h4.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import s.h;
/* renamed from: r0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1111a {
    public static /* synthetic */ String A(int i7) {
        switch (i7) {
            case 1:
                return "UNKNOWN_MATCH_TYPE";
            case 2:
                return "REGEXP";
            case 3:
                return "BEGINS_WITH";
            case 4:
                return "ENDS_WITH";
            case 5:
                return "PARTIAL";
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "EXACT";
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "IN_LIST";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String B(int i7) {
        switch (i7) {
            case 1:
                return "STRING";
            case 2:
                return "STRING_SET";
            case 3:
                return "INT";
            case 4:
                return "LONG";
            case 5:
                return "FLOAT";
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BOOLEAN";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String C(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION";
    }

    public static /* synthetic */ String D(int i7) {
        return i7 != 1 ? i7 != 2 ? "null" : "BAD_CONFIG" : "OK";
    }

    public static /* synthetic */ String E(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK";
    }

    public static /* synthetic */ String F(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK";
    }

    public static /* synthetic */ String G(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static /* synthetic */ String H(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String I(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static b a(int i7, int i8, int i9) {
        if (i7 == -2) {
            return T0.b.f3201a;
        }
        int i10 = i7 - i9;
        if (i10 > 0) {
            return new T0.a(i10);
        }
        int i11 = i8 - i9;
        if (i11 > 0) {
            return new T0.a(i11);
        }
        return null;
    }

    public static f b(e eVar) {
        int i7;
        int i8;
        ViewGroup.LayoutParams layoutParams = eVar.f3204a.getLayoutParams();
        int i9 = -1;
        if (layoutParams != null) {
            i7 = layoutParams.width;
        } else {
            i7 = -1;
        }
        View view = eVar.f3204a;
        int width = view.getWidth();
        int i10 = 0;
        boolean z7 = eVar.f3205b;
        if (z7) {
            i8 = view.getPaddingRight() + view.getPaddingLeft();
        } else {
            i8 = 0;
        }
        b a7 = a(i7, width, i8);
        if (a7 == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            i9 = layoutParams2.height;
        }
        int height = view.getHeight();
        if (z7) {
            i10 = view.getPaddingBottom() + view.getPaddingTop();
        }
        b a8 = a(i9, height, i10);
        if (a8 == null) {
            return null;
        }
        return new f(a7, a8);
    }

    public static final void c(int i7, View view, ViewGroup viewGroup) {
        int i8;
        g.f(viewGroup, "container");
        int b7 = h.b(i7);
        ViewGroup viewGroup2 = null;
        if (b7 != 0) {
            if (b7 != 1) {
                if (b7 != 2) {
                    if (b7 == 3) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        i8 = 4;
                    } else {
                        return;
                    }
                } else {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i8 = 8;
                }
            } else {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) parent;
                }
                if (viewGroup2 == null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                    }
                    viewGroup.addView(view);
                }
                i8 = 0;
            }
            view.setVisibility(i8);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent2;
        }
        if (viewGroup2 != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
            }
            viewGroup2.removeView(view);
        }
    }

    public static /* synthetic */ boolean d(int i7) {
        if (i7 != 1) {
            return f(i7);
        }
        return e(i7);
    }

    public static final boolean e(int i7) {
        return !W3.a.f3937b.get();
    }

    public static final boolean f(int i7) {
        Boolean bool;
        if (W3.a.f3937b.get()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                W3.a.f3936a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int g(int i7) {
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

    public static int h(int i7) {
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

    public static /* synthetic */ boolean i(int i7) {
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        if (i7 == 3 || i7 == 4) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ String j(int i7) {
        if (i7 != 1) {
            if (i7 == 2) {
                return "REALTIME";
            }
            throw null;
        }
        return "BASE";
    }

    public static /* synthetic */ boolean k(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return false;
                    }
                    throw null;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static int l(int i7, int i8, int i9, int i10) {
        return C0232k.M(i7) + i8 + i9 + i10;
    }

    public static String m(int i7, int i8, String str, String str2) {
        return str + i7 + str2 + i8;
    }

    public static String n(int i7, String str, String str2) {
        return str + i7 + str2;
    }

    public static String o(long j7, String str) {
        return str + j7;
    }

    public static String p(Object obj, String str) {
        return str + obj;
    }

    public static String q(String str, ComponentCallbacksC0269x componentCallbacksC0269x, String str2) {
        return str + componentCallbacksC0269x + str2;
    }

    public static String r(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String s(StringBuilder sb, long j7, String str) {
        sb.append(j7);
        sb.append(str);
        return sb.toString();
    }

    public static String t(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ Iterator v() {
        try {
            return Arrays.asList(new X5.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void w(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void x(String str, int i7) {
        if (i7 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(g.i(str));
        g.j(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Iterator y() {
        try {
            return Arrays.asList(new Object()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ String z(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 == 5) {
                            return "BETWEEN";
                        }
                        throw null;
                    }
                    return "EQUAL";
                }
                return "GREATER_THAN";
            }
            return "LESS_THAN";
        }
        return "UNKNOWN_COMPARISON_TYPE";
    }
}
