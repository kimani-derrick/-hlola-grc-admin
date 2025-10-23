package s3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.j4;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import k3.C0959b;
import q0.C1096a;
import r0.AbstractC1111a;
import s0.C1125d;
import t0.C1222c;
/* loaded from: classes.dex */
public final class x1 extends AbstractC1195q0 {

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f14381y = {"firebase_", "google_", "ga_"};

    /* renamed from: z  reason: collision with root package name */
    public static final String[] f14382z = {"_err"};

    /* renamed from: s  reason: collision with root package name */
    public SecureRandom f14383s;

    /* renamed from: t  reason: collision with root package name */
    public final AtomicLong f14384t;

    /* renamed from: u  reason: collision with root package name */
    public int f14385u;

    /* renamed from: v  reason: collision with root package name */
    public C1125d f14386v;

    /* renamed from: w  reason: collision with root package name */
    public Boolean f14387w;

    /* renamed from: x  reason: collision with root package name */
    public Integer f14388x;

    public x1(C1175g0 c1175g0) {
        super(c1175g0);
        this.f14388x = null;
        this.f14384t = new AtomicLong(0L);
    }

    public static boolean A0(int i7, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i7);
        return true;
    }

    public static boolean E0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean I0(String str) {
        String str2 = (String) AbstractC1203v.f14353w0.a(null);
        if (!str2.equals("*") && !Arrays.asList(str2.split(",")).contains(str)) {
            return false;
        }
        return true;
    }

    public static long K(r rVar) {
        long j7 = 0;
        if (rVar == null) {
            return 0L;
        }
        Bundle bundle = rVar.f14215q;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Parcelable[]) {
                j7 += ((Parcelable[]) obj).length;
            }
        }
        return j7;
    }

    public static boolean K0(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static long L(byte[] bArr) {
        g3.n.g(bArr);
        if (bArr.length > 0) {
            int i7 = 0;
            long j7 = 0;
            for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
                j7 += (bArr[length] & 255) << i7;
                i7 += 8;
            }
            return j7;
        }
        throw new IllegalStateException();
    }

    public static boolean M0(String str) {
        g3.n.c(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static int O0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if ("_lgclid".equals(str) || "_gbraid".equals(str) || "_dl_gbraid".equals(str) || "_mr_gbraid".equals(str)) {
            return 100;
        }
        return 36;
    }

    public static Bundle P(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u1 u1Var = (u1) it.next();
            String str = u1Var.f14257u;
            String str2 = u1Var.f14254r;
            if (str != null) {
                bundle.putString(str2, str);
            } else {
                Long l7 = u1Var.f14256t;
                if (l7 != null) {
                    bundle.putLong(str2, l7.longValue());
                } else {
                    Double d = u1Var.f14259w;
                    if (d != null) {
                        bundle.putDouble(str2, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static String R(int i7, String str, boolean z7) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i7) {
            if (!z7) {
                return null;
            }
            return AbstractC0515y1.m(str.substring(0, str.offsetByCodePoints(0, i7)), "...");
        }
        return str;
    }

    public static MessageDigest S0() {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void T(Bundle bundle, int i7, String str, Object obj) {
        if (A0(i7, bundle)) {
            bundle.putString("_ev", R(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void g0(O0 o02, Bundle bundle, boolean z7) {
        if (bundle != null && o02 != null && (!bundle.containsKey("_sc") || z7)) {
            String str = o02.f13847a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = o02.f13848b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", o02.f13849c);
        } else if (bundle != null && o02 == null && z7) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void h0(w1 w1Var, String str, int i7, String str2, String str3, int i8) {
        Bundle bundle = new Bundle();
        A0(i7, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i7 == 6 || i7 == 7 || i7 == 2) {
            bundle.putLong("_el", i8);
        }
        w1Var.c(str, "_err", bundle);
    }

    public static boolean k0(Context context) {
        ActivityInfo receiverInfo;
        g3.n.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean l0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
            return false;
        }
        return true;
    }

    public static boolean m0(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static boolean q0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            g3.n.g(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (!TextUtils.isEmpty(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (!isEmpty && isEmpty2) {
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean r0(String str, String[] strArr) {
        g3.n.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] t0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static boolean v0(Context context) {
        String str;
        g3.n.g(context);
        if (Build.VERSION.SDK_INT >= 24) {
            str = "com.google.android.gms.measurement.AppMeasurementJobService";
        } else {
            str = "com.google.android.gms.measurement.AppMeasurementService";
        }
        return E0(context, str);
    }

    public static ArrayList z0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1168d c1168d = (C1168d) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c1168d.f13984q);
            bundle.putString("origin", c1168d.f13985r);
            bundle.putLong("creation_timestamp", c1168d.f13987t);
            bundle.putString("name", c1168d.f13986s.f14254r);
            Object a7 = c1168d.f13986s.a();
            g3.n.g(a7);
            AbstractC1204v0.e(bundle, a7);
            bundle.putBoolean("active", c1168d.f13988u);
            String str = c1168d.f13989v;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C1201u c1201u = c1168d.f13990w;
            if (c1201u != null) {
                bundle.putString("timed_out_event_name", c1201u.f14244q);
                r rVar = c1201u.f14245r;
                if (rVar != null) {
                    bundle.putBundle("timed_out_event_params", rVar.h());
                }
            }
            bundle.putLong("trigger_timeout", c1168d.f13991x);
            C1201u c1201u2 = c1168d.f13992y;
            if (c1201u2 != null) {
                bundle.putString("triggered_event_name", c1201u2.f14244q);
                r rVar2 = c1201u2.f14245r;
                if (rVar2 != null) {
                    bundle.putBundle("triggered_event_params", rVar2.h());
                }
            }
            bundle.putLong("triggered_timestamp", c1168d.f13986s.f14255s);
            bundle.putLong("time_to_live", c1168d.f13993z);
            C1201u c1201u3 = c1168d.f13983A;
            if (c1201u3 != null) {
                bundle.putString("expired_event_name", c1201u3.f14244q);
                r rVar3 = c1201u3.f14245r;
                if (rVar3 != null) {
                    bundle.putBundle("expired_event_params", rVar3.h());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final boolean B0(Context context, String str) {
        C1154I b7;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo c5 = C0959b.a(context).c(str, 64);
            if (c5 != null && (signatureArr = c5.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            b7 = b();
            str2 = "Package name not found";
            b7.f13807v.c(e, str2);
            return true;
        } catch (CertificateException e7) {
            e = e7;
            b7 = b();
            str2 = "Error obtaining certificate";
            b7.f13807v.c(e, str2);
            return true;
        }
    }

    public final boolean C0(String str, String str2) {
        if (str2 == null) {
            b().f13809x.c(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            b().f13809x.c(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt) && codePointAt != 95) {
                b().f13809x.b(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    b().f13809x.b(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final Object D0(Object obj, String str) {
        boolean equals = "_ldl".equals(str);
        int O02 = O0(str);
        if (equals) {
            return Q(O02, obj, true, false);
        }
        return Q(O02, obj, false, false);
    }

    public final boolean F0(String str, String str2) {
        if (str2 == null) {
            b().f13809x.c(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            b().f13809x.c(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                b().f13809x.b(str, str2, "Name must start with a letter. Type, name");
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    b().f13809x.b(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    @Override // s3.AbstractC1195q0
    public final boolean G() {
        return true;
    }

    public final boolean G0(String str, String str2) {
        j4.a();
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (c1175g0.f14062w.O(null, AbstractC1203v.f14351v0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return c1175g0.f14062w.G("debug.firebase.analytics.app").equals(str);
    }

    public final int H(Object obj, String str) {
        String str2;
        if ("_ldl".equals(str)) {
            str2 = "user property referrer";
        } else {
            str2 = "user property";
        }
        if (p0(str2, str, O0(str), obj)) {
            return 0;
        }
        return 7;
    }

    public final boolean H0(String str) {
        D();
        if (C0959b.a(((C1175g0) this.f2765q).f14056q).f3243a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        b().f13802C.c(str, "Permission not granted");
        return false;
    }

    public final int I(String str) {
        if (!C0("event", str)) {
            return 2;
        }
        if (!s0("event", AbstractC1204v0.f14359a, AbstractC1204v0.f14360b, str)) {
            return 13;
        }
        if (!j0(40, "event", str)) {
            return 2;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int J(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.x1.J(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int J0() {
        if (this.f14388x == null) {
            d3.d dVar = d3.d.f9227b;
            Context context = ((C1175g0) this.f2765q).f14056q;
            dVar.getClass();
            boolean z7 = d3.f.f9228a;
            int i7 = 0;
            try {
                i7 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f14388x = Integer.valueOf(i7 / 1000);
        }
        return this.f14388x.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00db, code lost:
        if (r12.f14387w.booleanValue() != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L0() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.x1.L0():long");
    }

    public final Bundle M(Uri uri, boolean z7) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                if (z7) {
                    str5 = uri.getQueryParameter("gbraid");
                } else {
                    str5 = null;
                }
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z7 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z7 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (z7 && !TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e3) {
            b().f13810y.c(e3, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final Bundle N(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object y0 = y0(bundle.get(str), str);
                if (y0 == null) {
                    C1154I b7 = b();
                    b7.f13800A.c(((C1175g0) this.f2765q).f14036C.f(str), "Param value can't be null");
                } else {
                    W(bundle2, str, y0);
                }
            }
        }
        return bundle2;
    }

    public final boolean N0(String str) {
        List<ResolveInfo> queryIntentActivities;
        if (TextUtils.isEmpty(str) || (queryIntentActivities = ((C1175g0) this.f2765q).f14056q.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r8.j0(40, "event param", r6) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle O(java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.x1.O(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final long P0() {
        long andIncrement;
        long j7;
        if (this.f14384t.get() == 0) {
            synchronized (this.f14384t) {
                long nanoTime = System.nanoTime();
                ((C1175g0) this.f2765q).f14037D.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i7 = this.f14385u + 1;
                this.f14385u = i7;
                j7 = nextLong + i7;
            }
            return j7;
        }
        synchronized (this.f14384t) {
            this.f14384t.compareAndSet(-1L, 1L);
            andIncrement = this.f14384t.getAndIncrement();
        }
        return andIncrement;
    }

    public final Object Q(int i7, Object obj, boolean z7, boolean z8) {
        Parcelable[] parcelableArr;
        long j7;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j7 = 1;
                } else {
                    j7 = 0;
                }
                return Long.valueOf(j7);
            } else if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            } else {
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (!z8 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (parcelable instanceof Bundle) {
                            Bundle N6 = N((Bundle) parcelable);
                            if (!N6.isEmpty()) {
                                arrayList.add(N6);
                            }
                        }
                    }
                    return arrayList.toArray(new Bundle[arrayList.size()]);
                }
                return R(i7, String.valueOf(obj), z7);
            }
        }
        return obj;
    }

    public final C1125d Q0() {
        int i7;
        C1222c c1222c;
        if (this.f14386v == null) {
            Context context = ((C1175g0) this.f2765q).f14056q;
            M5.g.f(context, "context");
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i8 = Build.VERSION.SDK_INT;
            C1096a c1096a = C1096a.f13219a;
            if (i8 >= 30) {
                i7 = c1096a.a();
            } else {
                i7 = 0;
            }
            sb.append(i7);
            Log.d("MeasurementManager", sb.toString());
            C1125d c1125d = null;
            if (i8 >= 30 && c1096a.a() >= 5) {
                c1222c = new C1222c(context);
            } else {
                c1222c = null;
            }
            if (c1222c != null) {
                c1125d = new C1125d(c1222c);
            }
            this.f14386v = c1125d;
        }
        return this.f14386v;
    }

    public final String R0() {
        byte[] bArr = new byte[16];
        T0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final C1201u S(String str, Bundle bundle, String str2, long j7, boolean z7) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (I(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle O5 = O(str, bundle2, Collections.singletonList("_o"), true);
            if (z7) {
                O5 = N(O5);
            }
            g3.n.g(O5);
            return new C1201u(str, new r(O5), str2, j7);
        }
        C1154I b7 = b();
        b7.f13807v.c(((C1175g0) this.f2765q).f14036C.g(str), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    public final SecureRandom T0() {
        D();
        if (this.f14383s == null) {
            this.f14383s = new SecureRandom();
        }
        return this.f14383s;
    }

    public final void U(Bundle bundle, long j7) {
        long j8 = bundle.getLong("_et");
        if (j8 != 0) {
            C1154I b7 = b();
            b7.f13810y.c(Long.valueOf(j8), "Params already contained engagement");
        }
        bundle.putLong("_et", j7 + j8);
    }

    public final void V(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                C().W(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void W(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            C1154I b7 = b();
            b7.f13800A.b(((C1175g0) this.f2765q).f14036C.f(str), str2, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final void X(com.google.android.gms.internal.measurement.W w7, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i7);
        try {
            w7.d(bundle);
        } catch (RemoteException e3) {
            C1154I c1154i = ((C1175g0) this.f2765q).f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.c(e3, "Error returning int value to wrapper");
        }
    }

    public final void Y(com.google.android.gms.internal.measurement.W w7, long j7) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j7);
        try {
            w7.d(bundle);
        } catch (RemoteException e3) {
            C1154I c1154i = ((C1175g0) this.f2765q).f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.c(e3, "Error returning long value to wrapper");
        }
    }

    public final void Z(com.google.android.gms.internal.measurement.W w7, Bundle bundle) {
        try {
            w7.d(bundle);
        } catch (RemoteException e3) {
            C1154I c1154i = ((C1175g0) this.f2765q).f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.c(e3, "Error returning bundle value to wrapper");
        }
    }

    public final void a0(com.google.android.gms.internal.measurement.W w7, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            w7.d(bundle);
        } catch (RemoteException e3) {
            C1154I c1154i = ((C1175g0) this.f2765q).f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.c(e3, "Error returning bundle list to wrapper");
        }
    }

    public final void b0(com.google.android.gms.internal.measurement.W w7, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z7);
        try {
            w7.d(bundle);
        } catch (RemoteException e3) {
            C1154I c1154i = ((C1175g0) this.f2765q).f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.c(e3, "Error returning boolean value to wrapper");
        }
    }

    public final void c0(com.google.android.gms.internal.measurement.W w7, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            w7.d(bundle);
        } catch (RemoteException e3) {
            C1154I c1154i = ((C1175g0) this.f2765q).f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.c(e3, "Error returning byte array to wrapper");
        }
    }

    public final void d0(String str, com.google.android.gms.internal.measurement.W w7) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            w7.d(bundle);
        } catch (RemoteException e3) {
            C1154I c1154i = ((C1175g0) this.f2765q).f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.c(e3, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (j0(40, "event param", r6) == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.x1.e0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final void f0(C1158M c1158m, int i7) {
        Iterator it = new TreeSet(c1158m.d.keySet()).iterator();
        int i8 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (M0(str) && (i8 = i8 + 1) > i7) {
                String n = AbstractC1111a.n(i7, "Event can't contain more than ", " params");
                C1154I b7 = b();
                C1175g0 c1175g0 = (C1175g0) this.f2765q;
                String b8 = c1175g0.f14036C.b(c1158m.f13827a);
                Bundle bundle = c1158m.d;
                b7.f13809x.b(b8, c1175g0.f14036C.a(bundle), n);
                A0(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void i0(Parcelable[] parcelableArr, int i7, boolean z7) {
        int i8;
        g3.n.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i9 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (M0(str) && !r0(str, AbstractC1204v0.f14366j) && (i9 = i9 + 1) > i7) {
                    C1175g0 c1175g0 = (C1175g0) this.f2765q;
                    if (z7) {
                        b().f13809x.b(c1175g0.f14036C.f(str), c1175g0.f14036C.a(bundle), AbstractC1111a.n(i7, "Param can't contain more than ", " item-scoped custom parameters"));
                        i8 = 28;
                    } else {
                        b().f13809x.b(c1175g0.f14036C.f(str), c1175g0.f14036C.a(bundle), "Param cannot contain item-scoped custom parameters");
                        i8 = 23;
                    }
                    A0(i8, bundle);
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean j0(int i7, String str, String str2) {
        if (str2 == null) {
            b().f13809x.c(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i7) {
            C1154I b7 = b();
            b7.f13809x.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i7), str2);
            return false;
        } else {
            return true;
        }
    }

    public final boolean n0(String str, double d) {
        try {
            SharedPreferences.Editor edit = ((C1175g0) this.f2765q).f14056q.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (RuntimeException e3) {
            b().f13807v.c(e3, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    public final boolean o0(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (!isEmpty) {
            g3.n.g(str);
            if (!str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                if (TextUtils.isEmpty(c1175g0.f14057r)) {
                    C1154I b7 = b();
                    b7.f13809x.c(C1154I.J(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                }
                return false;
            }
            return true;
        } else if (!TextUtils.isEmpty(str2)) {
            g3.n.g(str2);
            if (!str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                C1154I b8 = b();
                b8.f13809x.c(C1154I.J(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            return true;
        } else {
            if (TextUtils.isEmpty(c1175g0.f14057r)) {
                b().f13809x.d("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    public final boolean p0(String str, String str2, int i7, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i7) {
                C1154I b7 = b();
                b7.f13800A.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean s0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            b().f13809x.c(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f14381y;
        for (int i7 = 0; i7 < 3; i7++) {
            if (str2.startsWith(strArr3[i7])) {
                b().f13809x.b(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr != null && r0(str2, strArr)) {
            if (strArr2 == null || !r0(str2, strArr2)) {
                b().f13809x.b(str, str2, "Name is reserved. Type, name");
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean u0(int i7) {
        Boolean bool = ((C1175g0) this.f2765q).r().f13867u;
        if (J0() < i7 / 1000) {
            if (bool == null || bool.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void w0() {
        D();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                b().f13810y.d("Utils falling back to Random for random id");
            }
        }
        this.f14384t.set(nextLong);
    }

    public final int x0(String str) {
        if (!C0("user property", str)) {
            return 6;
        }
        if (!s0("user property", AbstractC1204v0.f14362e, null, str)) {
            return 15;
        }
        if (!j0(24, "user property", str)) {
            return 6;
        }
        return 0;
    }

    public final Object y0(Object obj, String str) {
        int F;
        boolean equals = "_ev".equals(str);
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (equals) {
            return Q(Math.max(c1175g0.f14062w.F(null, false), 256), obj, true, true);
        }
        if (K0(str)) {
            F = Math.max(c1175g0.f14062w.F(null, false), 256);
        } else {
            F = c1175g0.f14062w.F(null, false);
        }
        return Q(F, obj, false, true);
    }
}
