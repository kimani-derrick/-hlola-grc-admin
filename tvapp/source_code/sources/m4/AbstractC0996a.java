package m4;

import O3.AbstractC0072p;
import O3.AbstractC0080y;
import O3.C;
import O3.E;
import O3.H;
import O3.U;
import android.os.Bundle;
import s3.AbstractC1204v0;
/* renamed from: m4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0996a {

    /* renamed from: a  reason: collision with root package name */
    public static final H f12433a = H.u("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b  reason: collision with root package name */
    public static final U f12434b;

    /* renamed from: c  reason: collision with root package name */
    public static final U f12435c;
    public static final U d;

    /* renamed from: e  reason: collision with root package name */
    public static final U f12436e;
    public static final U f;

    /* JADX WARN: Type inference failed for: r0v6, types: [O3.y, O3.B] */
    static {
        C c5 = E.f2597r;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC0072p.b(7, objArr);
        f12434b = E.o(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        AbstractC0072p.b(3, objArr2);
        f12435c = E.o(3, objArr2);
        Object[] objArr3 = {"_r", "_dbg"};
        AbstractC0072p.b(2, objArr3);
        d = E.o(2, objArr3);
        ?? abstractC0080y = new AbstractC0080y();
        abstractC0080y.b(AbstractC1204v0.f14362e);
        abstractC0080y.b(AbstractC1204v0.f);
        f12436e = abstractC0080y.h();
        Object[] objArr4 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        AbstractC0072p.b(2, objArr4);
        f = E.o(2, objArr4);
    }

    public static boolean a(String str, Bundle bundle) {
        if (f12434b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            U u7 = d;
            int size = u7.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = u7.get(i7);
                i7++;
                if (bundle.containsKey((String) obj)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean b(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!(!f12435c.contains(str)) || bundle == null) {
            return false;
        }
        U u7 = d;
        int size = u7.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = u7.get(i7);
            i7++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        char c5 = 65535;
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c5 = 2;
                }
            } else if (str.equals("fdl")) {
                c5 = 1;
            }
        } else if (str.equals("fcm")) {
            c5 = 0;
        }
        if (c5 != 0) {
            if (c5 != 1) {
                if (c5 != 2) {
                    return false;
                }
                str3 = "fiam_integration";
            } else {
                str3 = "fdl_integration";
            }
        } else {
            str3 = "fcm_integration";
        }
        bundle.putString("_cis", str3);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        if (r0.equals("fiam") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
        if (r0.equals("frc") == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(l4.C0973a r8) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.AbstractC0996a.c(l4.a):boolean");
    }
}
