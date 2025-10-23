package s3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import r0.AbstractC1111a;
/* renamed from: s3.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153H {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f13791b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference f13792c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final V f13793a;

    public C1153H(V v5) {
        this.f13793a = v5;
    }

    public static String c(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z7;
        String str2;
        g3.n.g(atomicReference);
        if (strArr.length == strArr2.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        g3.n.a(z7);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (Objects.equals(str, strArr[i7])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i7] == null) {
                            strArr3[i7] = strArr2[i7] + "(" + strArr[i7] + ")";
                        }
                        str2 = strArr3[i7];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f13793a.b()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = e((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = e(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f13793a.b()) {
            return str;
        }
        return c(str, AbstractC1204v0.f14361c, AbstractC1204v0.f14359a, f13791b);
    }

    public final String d(C1201u c1201u) {
        String a7;
        V v5 = this.f13793a;
        if (!v5.b()) {
            return c1201u.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c1201u.f14246s);
        sb.append(",name=");
        sb.append(b(c1201u.f14244q));
        sb.append(",params=");
        r rVar = c1201u.f14245r;
        if (rVar == null) {
            a7 = null;
        } else if (!v5.b()) {
            a7 = rVar.f14215q.toString();
        } else {
            a7 = a(rVar.h());
        }
        sb.append(a7);
        return sb.toString();
    }

    public final String e(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = a((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f13793a.b()) {
            return str;
        }
        return c(str, AbstractC1204v0.f14364h, AbstractC1204v0.f14363g, f13792c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f13793a.b()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return AbstractC1111a.r("experiment_id(", str, ")");
        }
        return c(str, AbstractC1204v0.f, AbstractC1204v0.f14362e, d);
    }
}
