package s3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.L3;
import java.lang.reflect.InvocationTargetException;
import k3.C0959b;
/* renamed from: s3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1170e extends P1.c {

    /* renamed from: r  reason: collision with root package name */
    public Boolean f14003r;

    /* renamed from: s  reason: collision with root package name */
    public String f14004s;

    /* renamed from: t  reason: collision with root package name */
    public InterfaceC1172f f14005t;

    /* renamed from: u  reason: collision with root package name */
    public Boolean f14006u;

    public static long Q() {
        return ((Long) AbstractC1203v.f14268E.a(null)).longValue();
    }

    public final double E(String str, C1148C c1148c) {
        if (str == null) {
            return ((Double) c1148c.a(null)).doubleValue();
        }
        String e3 = this.f14005t.e(str, c1148c.f13754a);
        if (TextUtils.isEmpty(e3)) {
            return ((Double) c1148c.a(null)).doubleValue();
        }
        try {
            return ((Double) c1148c.a(Double.valueOf(Double.parseDouble(e3)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c1148c.a(null)).doubleValue();
        }
    }

    public final int F(String str, boolean z7) {
        ((K3) L3.f8372r.get()).getClass();
        if (!((C1175g0) this.f2765q).f14062w.O(null, AbstractC1203v.f14293R0)) {
            return 100;
        }
        if (!z7) {
            return 500;
        }
        return Math.max(Math.min(I(str, AbstractC1203v.f14294S), 500), 100);
    }

    public final String G(String str) {
        C1154I b7;
        String str2;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            g3.n.g(str3);
            return str3;
        } catch (ClassNotFoundException e3) {
            e = e3;
            b7 = b();
            str2 = "Could not find SystemProperties class";
            b7.f13807v.c(e, str2);
            return "";
        } catch (IllegalAccessException e7) {
            e = e7;
            b7 = b();
            str2 = "Could not access SystemProperties.get()";
            b7.f13807v.c(e, str2);
            return "";
        } catch (NoSuchMethodException e8) {
            e = e8;
            b7 = b();
            str2 = "Could not find SystemProperties.get() method";
            b7.f13807v.c(e, str2);
            return "";
        } catch (InvocationTargetException e9) {
            e = e9;
            b7 = b();
            str2 = "SystemProperties.get() threw an exception";
            b7.f13807v.c(e, str2);
            return "";
        }
    }

    public final boolean H(C1148C c1148c) {
        return O(null, c1148c);
    }

    public final int I(String str, C1148C c1148c) {
        if (str == null) {
            return ((Integer) c1148c.a(null)).intValue();
        }
        String e3 = this.f14005t.e(str, c1148c.f13754a);
        if (TextUtils.isEmpty(e3)) {
            return ((Integer) c1148c.a(null)).intValue();
        }
        try {
            return ((Integer) c1148c.a(Integer.valueOf(Integer.parseInt(e3)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c1148c.a(null)).intValue();
        }
    }

    public final long J(String str, C1148C c1148c) {
        if (str == null) {
            return ((Long) c1148c.a(null)).longValue();
        }
        String e3 = this.f14005t.e(str, c1148c.f13754a);
        if (TextUtils.isEmpty(e3)) {
            return ((Long) c1148c.a(null)).longValue();
        }
        try {
            return ((Long) c1148c.a(Long.valueOf(Long.parseLong(e3)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c1148c.a(null)).longValue();
        }
    }

    public final String K(String str, C1148C c1148c) {
        if (str == null) {
            return (String) c1148c.a(null);
        }
        return (String) c1148c.a(this.f14005t.e(str, c1148c.f13754a));
    }

    public final EnumC1202u0 L(String str) {
        Object obj;
        g3.n.c(str);
        Bundle T6 = T();
        if (T6 == null) {
            b().f13807v.d("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = T6.get(str);
        }
        EnumC1202u0 enumC1202u0 = EnumC1202u0.f14248q;
        if (obj == null) {
            return enumC1202u0;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC1202u0.f14251t;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC1202u0.f14250s;
        }
        if ("default".equals(obj)) {
            return EnumC1202u0.f14249r;
        }
        b().f13810y.c(str, "Invalid manifest metadata for");
        return enumC1202u0;
    }

    public final boolean M(String str, C1148C c1148c) {
        return O(str, c1148c);
    }

    public final Boolean N(String str) {
        g3.n.c(str);
        Bundle T6 = T();
        if (T6 == null) {
            b().f13807v.d("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!T6.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(T6.getBoolean(str));
        }
    }

    public final boolean O(String str, C1148C c1148c) {
        if (str == null) {
            return ((Boolean) c1148c.a(null)).booleanValue();
        }
        String e3 = this.f14005t.e(str, c1148c.f13754a);
        if (TextUtils.isEmpty(e3)) {
            return ((Boolean) c1148c.a(null)).booleanValue();
        }
        return ((Boolean) c1148c.a(Boolean.valueOf("1".equals(e3)))).booleanValue();
    }

    public final boolean P(String str) {
        return "1".equals(this.f14005t.e(str, "measurement.event_sampling_enabled"));
    }

    public final boolean R() {
        Boolean N6 = N("google_analytics_automatic_screen_reporting_enabled");
        if (N6 != null && !N6.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean S() {
        if (this.f14003r == null) {
            Boolean N6 = N("app_measurement_lite");
            this.f14003r = N6;
            if (N6 == null) {
                this.f14003r = Boolean.FALSE;
            }
        }
        if (!this.f14003r.booleanValue() && ((C1175g0) this.f2765q).f14060u) {
            return false;
        }
        return true;
    }

    public final Bundle T() {
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        try {
            Context context = c1175g0.f14056q;
            Context context2 = c1175g0.f14056q;
            if (context.getPackageManager() == null) {
                b().f13807v.d("Failed to load metadata: PackageManager is null");
                return null;
            }
            T1.j a7 = C0959b.a(context2);
            ApplicationInfo applicationInfo = a7.f3243a.getPackageManager().getApplicationInfo(context2.getPackageName(), 128);
            if (applicationInfo == null) {
                b().f13807v.d("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e3) {
            b().f13807v.c(e3, "Failed to load metadata: Package name not found");
            return null;
        }
    }
}
